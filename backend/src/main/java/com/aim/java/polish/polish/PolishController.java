package com.aim.java.polish.polish;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/polishes")
public class PolishController {

    @Autowired
    private PolishRepository polishRepository;

    @GetMapping(path = "")
    public Iterable<Polish> getAllPolishes() {
        return polishRepository.findAll();
    }
    
    @GetMapping(path = "/{id}")
    public Polish getPolish(@PathVariable(value = "id") Integer id) {
        Optional<Polish> polish = polishRepository.findById(id);
        return polish.get();
    }

    @PostMapping(path = "/")
    public String createPolish(@RequestBody Polish polish) {
        polishRepository.save(polish);
        return "Saved";
    }

    @PutMapping(path = "/{id}")
    public String updatePolish(@PathVariable(value = "id") Integer id, @RequestBody Polish polishDetails) {
        Optional<Polish> optionalPolish = polishRepository.findById(id);
        Polish polish = optionalPolish.get();
        polish.setBrandName(polishDetails.getBrandName());
        polish.setPolishName(polishDetails.getPolishName());
        polish.setColor1(polishDetails.getColor1());
        polish.setColor2(polishDetails.getColor2());
        polish.setColor3(polishDetails.getColor3());
        polish.setFinish1(polishDetails.getFinish1());
        polish.setFinish2(polishDetails.getFinish2());
        polish.setFinish3(polishDetails.getFinish3());
        
        polishRepository.save(polishDetails);
        return "Updated";
    }

    @DeleteMapping(path = "/{id}")
    public String deletePolish(@PathVariable(value = "id") Integer id) {
        polishRepository.deleteById(id);
        return "Deleted";
    }
}
