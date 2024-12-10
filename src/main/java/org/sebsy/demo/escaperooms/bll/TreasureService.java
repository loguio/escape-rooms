package org.sebsy.demo.escaperooms.bll;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("treasure")
@Service
public interface TreasureService {

    public String ouvrir();

}
