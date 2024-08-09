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
public class LimitDto {
    private Long id;
    private LocalDateTime localDateTime;
    private BigDecimal monthLimit;
    private Limits.Category category;
}
