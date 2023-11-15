package org.fatalzio.repository;

import org.fatalzio.model.Speaker;

import java.util.List;

public interface HibernateSpeakerRepository {
    List<Speaker> findAll();
}
