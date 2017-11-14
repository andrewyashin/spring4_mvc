package org.training.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.training.domain.Spittle;
import org.training.repository.SpittleRepository;
import org.training.service.SpittleService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("spittleService")
class SpittleServiceImpl implements SpittleService {

    @Autowired
    private SpittleRepository spittleRepository;

    public List<Spittle> getSpittles(int count) {
        return spittleRepository.findSpittles(count);
    }

    public Spittle getLatestSpittle() {
        return spittleRepository.findSpittles(1).get(0);
    }
}
