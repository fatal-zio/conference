package org.fatalzio.service;

import org.fatalzio.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
