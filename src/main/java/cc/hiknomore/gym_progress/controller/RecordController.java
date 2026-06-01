package cc.hiknomore.gym_progress.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cc.hiknomore.gym_progress.service.RecordService;
import cc.hiknomore.gym_progress.model.Record;

@Controller
@RequestMapping("/gym-progress/records")
public class RecordController {

    private RecordService recordService;

    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping("/{id}")
    public String showRecords(@PathVariable Long id, Model model) {//TODO add empty record object
        List<Record> records = recordService.getWeeklyRecords(id.longValue());

        Record record = new Record();
        
        Map<LocalDate, List<Record>> notesByDate = records.stream()
                .collect(Collectors.groupingBy(
                        Record::getDate, 
                        TreeMap::new, 
                        Collectors.toList()));
        model.addAttribute("notesByDate", notesByDate);
        
        return "user-records";
    }
//    @PostMapping("/save")
//    public void saveRecord( ) {
//        recordService.save(record);
 //   }
}
