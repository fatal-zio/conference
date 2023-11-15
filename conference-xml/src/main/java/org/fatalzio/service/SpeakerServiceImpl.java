package org.fatalzio.service;

import org.fatalzio.model.Speaker;
import org.fatalzio.repository.HibernateSpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private HibernateSpeakerRepository repository;

    public SpeakerServiceImpl() {
    }

    public SpeakerServiceImpl(HibernateSpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setSpeakerRepository(HibernateSpeakerRepository repository) {
        this.repository = repository;
    }
}
