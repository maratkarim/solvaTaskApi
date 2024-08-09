package solva.TaskApi.config;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import solva.TaskApi.feign.FeignClients;
@Service
@RequiredArgsConstructor
public class AlphaVantageFeignClient {

    private final FeignClients feignClients;

    public String fetchDailyFXData(String fromSymbol, String toSymbol){
        String function = "FX_DAILY";
        String apiKey = "8N7N2AKWJ89FDG8D";
        return feignClients.fetchDailyFXData(function, fromSymbol, toSymbol, apiKey);
    }
}
