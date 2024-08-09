package solva.TaskApi.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import solva.TaskApi.config.AlphaVantageFeignClient;
import solva.TaskApi.dto.ExchangerDto;
import solva.TaskApi.entites.Exchange;
import solva.TaskApi.mapper.ExchangerMapper;
import solva.TaskApi.repository.ExchangeRep;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class ExchangeService {
    private final AlphaVantageFeignClient alphaVantageFeignClient;
    private final ExchangerMapper exchangerMapper;
    private final ExchangeRep exchangeRep;

    public void updatePair(String fromSymbol, String toSymbol){
        try {
            String result = alphaVantageFeignClient.fetchDailyFXData(fromSymbol, toSymbol);
            System.out.println("Received JSON: " + result);

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(result);
            JsonNode dailyFX = jsonNode.get("Time Series FX (Daily)");

            String firstData = dailyFX.fieldNames().next();
            JsonNode fistDataJson = dailyFX.get(firstData);
            System.out.println("First Data JSON: " + fistDataJson);

            String closeValue = fistDataJson.get("4. close").asText();
            System.out.println("Close Value: " + closeValue);

            BigDecimal rate = new BigDecimal(closeValue);
            System.out.println("Parsed Rate: " + rate);

            ExchangerDto exchangeDto = new ExchangerDto(fromSymbol, toSymbol, LocalDate.now(), rate);
            Exchange exchanger = exchangerMapper.toEntity(exchangeDto);
            exchangeRep.save(exchanger);
        }catch (JsonProcessingException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public void updateDaily(){
        updatePair("KZT", "USD");
        updatePair("RUB", "USD");
    }
}
