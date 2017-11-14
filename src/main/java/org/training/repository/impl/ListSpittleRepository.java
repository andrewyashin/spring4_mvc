package org.training.repository.impl;

import org.springframework.stereotype.Repository;
import org.training.domain.Spittle;
import org.training.repository.SpittleRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository("spittleRepository")
class ListSpittleRepository implements SpittleRepository {
    private List<Spittle> spittles;

    @PostConstruct
    private void setUp(){
        spittles = new ArrayList<Spittle>();
        spittles.add(new Spittle(0l, "Andrew", "Hi"));
        spittles.add(new Spittle(1l, "Mike", "Hi, Andrew"));
        spittles.add(new Spittle(2l,"John", "Hi, Andrew and Mike"));
    }

    public List<Spittle> findSpittles(int count) {
        return spittles;
    }
}
