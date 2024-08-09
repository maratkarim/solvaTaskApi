package solva.TaskApi.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountFrom;
    private String accountTo;
    private String currency;
    private BigDecimal amount;
    private boolean limitExceeded;
    private LocalDateTime dateTime;

    @Enumerated(EnumType.STRING)
    private Limits.Category category;

    @ManyToOne
    @JoinColumn(name = "limit_id")
    private Limits limit;
}
