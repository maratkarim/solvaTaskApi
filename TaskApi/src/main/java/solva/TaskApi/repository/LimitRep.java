package solva.TaskApi.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import solva.TaskApi.entites.Limits;
@Repository
@Transactional
public interface LimitRep extends JpaRepository<Limits, Long> {
}
