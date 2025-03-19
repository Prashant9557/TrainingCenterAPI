package com.traini8.training_center_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traini8.training_center_api.model.TrainingCenter;
import com.traini8.training_center_api.service.TrainingCenterService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/trainingcenter")
@RequiredArgsConstructor
public class TrainingCenterController {

    private final TrainingCenterService trainingCenterService;

    @PostMapping
    public TrainingCenter createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
        return trainingCenterService.saveTrainingCenter(trainingCenter);
    }

    @GetMapping
    public List<TrainingCenter> getAllTrainingCenters() {
        return trainingCenterService.getAllTrainingCenters();
    }
}
