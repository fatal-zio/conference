package org.fatalzio.service;

import org.fatalzio.model.Speaker;
import org.fatalzio.repository.HibernateSpeakerRepository;
import org.fatalzio.repository.HibernateSpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private final HibernateSpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
