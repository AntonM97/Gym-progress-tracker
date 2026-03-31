package cc.hiknomore.gym_progress.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
import cc.hiknomore.gym_progress.model.Record;

import cc.hiknomore.gym_progress.repository.RecordRepository;

@Service
public class RecordService {

    RecordRepository recordRepository;

    public RecordService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public List<Record> getWeeklyRecords(Long id) {
        LocalDate from = LocalDate.now().minusDays(7);
        LocalDate to = LocalDate.now();
        return recordRepository.findByDateBetween(id, from, to);
    }

}