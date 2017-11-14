package org.training.service;

import org.training.domain.Spittle;

import java.util.List;

public interface SpittleService {
    List<Spittle> getSpittles(int count);
    Spittle getLatestSpittle();
}
