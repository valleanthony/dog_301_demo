package com.example.dog_301_demo;

import org.springframework.data.repository.CrudRepository;

public interface DogRepo extends CrudRepository <Dog,Long> {
}
