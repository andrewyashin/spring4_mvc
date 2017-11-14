package org.training.repository;

import org.training.domain.Spittle;

import java.util.List;

public interface SpittleRepository {
    List<Spittle> findSpittles(int count);
}
