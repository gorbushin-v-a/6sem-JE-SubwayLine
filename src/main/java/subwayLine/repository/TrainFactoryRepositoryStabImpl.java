package subwayLine.repository;

import org.springframework.stereotype.Repository;
import subwayLine.model.TrainFactory;

import java.util.Arrays;
import java.util.List;

@Repository
public class TrainFactoryRepositoryStabImpl implements TrainFactoryRepository {

    private List<TrainFactory> data = Arrays.asList(new TrainFactory("FactoryOnMilkStation"), new TrainFactory("FactoryOnBananaStation"));

    public List<TrainFactory> findAll() {
        return data;
    }

    public TrainFactory getByName(String name) {
        return null;
    }
}
