package org.fatalzio.repository;

import org.fatalzio.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Jayme");
        speaker.setLastName("Desrosiers");
        speakers.add(speaker);

        return speakers;
    }
}
