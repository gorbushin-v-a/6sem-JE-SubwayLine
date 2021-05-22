package subwayLine.repository;

import subwayLine.model.TrainFactory;

import java.util.List;

public interface TrainFactoryRepository {

    List<TrainFactory> findAll();

    TrainFactory getByName(String name);
}
