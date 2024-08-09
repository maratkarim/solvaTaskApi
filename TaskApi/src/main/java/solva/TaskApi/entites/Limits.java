package solva.TaskApi.entites;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Limits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime localDateTime;
    private BigDecimal monthLimit;

    @Enumerated(EnumType.STRING)
    private Category category;

    public enum Category {
        PRODUCTS,
        SERVICES
    }
}
