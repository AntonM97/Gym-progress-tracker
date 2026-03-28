package cc.hiknomore.gym_progress.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import cc.hiknomore.gym_progress.model.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {
    List<Record> findByPersonId(Long personId);
}