package org.fatalzio.repository;

import org.fatalzio.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
