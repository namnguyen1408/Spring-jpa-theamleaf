package com.sample.responsitory;

import java.util.List;

public interface Responsitory<T> {
    List<T> findAll();
    T findById(Long id);

    void save(T model);
    void remove(Long id);
    void update(Long id, T model);
}
