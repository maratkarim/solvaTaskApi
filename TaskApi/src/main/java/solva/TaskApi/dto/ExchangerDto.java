package solva.TaskApi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExchangerDto {
    private Long id;
    private BigDecimal rate;
    private LocalDate date;
    private String baseCurrency;
    private String counterCurrency;

    public ExchangerDto(String baseCurrency, String counterCurrency, LocalDate date, BigDecimal rate) {
        this.baseCurrency = baseCurrency;
        this.counterCurrency = counterCurrency;
        this.date = date;
        this.rate = rate;
    }
}
