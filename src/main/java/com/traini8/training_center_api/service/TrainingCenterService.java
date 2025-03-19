package com.traini8.training_center_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.traini8.training_center_api.model.TrainingCenter;
import com.traini8.training_center_api.repository.TrainingCenterRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class TrainingCenterService {

    private final TrainingCenterRepository trainingCenterRepository;

    public TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter) {
        trainingCenter.setCreatedOn(System.currentTimeMillis());
        TrainingCenter savedCenter = trainingCenterRepository.save(trainingCenter);
        log.info("New Training Center created: {}", savedCenter);
        return savedCenter;
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        List<TrainingCenter> centers = trainingCenterRepository.findAll();
        log.info("Retrieved {} training centers", centers.size());
        return centers;
    }
}
