package cc.hiknomore.gym_progress.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import cc.hiknomore.gym_progress.model.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {
    
    List<Record> findByPersonId(Long personId);
    
    //TODO 
    @Query("select r from Record r where r.person.id =:id and r.date between :from and :to")
    List<Record> findByDateBetween(Long id, LocalDate from, LocalDate to);
}