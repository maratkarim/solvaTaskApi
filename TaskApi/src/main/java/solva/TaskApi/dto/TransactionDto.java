package solva.TaskApi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import solva.TaskApi.entites.Limits;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {
    private Long id;
    private String accountFrom;
    private String accountTo;
    private String currency;
    private BigDecimal amount;
    private boolean limitExceeded;
    private LocalDateTime dateTime;
    private Limits.Category category;
    private Limits limit;
}
