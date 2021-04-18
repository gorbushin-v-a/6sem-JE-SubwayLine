package di2.repository;

import di2.model.TrainFactory;

import java.util.List;

public interface TrainFactoryRepository {

    List<TrainFactory> findAll();

    TrainFactory getByName(String name);
}
