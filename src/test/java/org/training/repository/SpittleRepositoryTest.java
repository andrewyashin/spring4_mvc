package org.training.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.training.configuration.RootConfig;
import org.training.domain.Spittle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class SpittleRepositoryTest {
    private List<Spittle> spittles;

    @Autowired
    private SpittleRepository spittleRepository;

    @Before
    public void setUp(){
        spittles = new ArrayList<Spittle>();
        spittles.add(new Spittle(0l, "Andrew", "Hi"));
        spittles.add(new Spittle(1l, "Mike", "Hi, Andrew"));
        spittles.add(new Spittle(2l,"John", "Hi, Andrew and Mike"));
    }

    @Test
    public void shouldReturnSameSetWhenGetSpittlesFromRepository(){
        List<Spittle> actualSet = spittleRepository.findSpittles(200);

        assertEquals(spittles, actualSet);
    }
}
