package subwayLine.repository;

import subwayLine.model.Station;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StationRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Station> findAll() {
        Session session = sessionFactory.openSession();
        Query<Station> studentQuery = session.createQuery("from Station", Station.class);
        List<Station> stations = studentQuery.getResultList();
        session.close();
        return stations;
    }

    public List<Station> findByName(String name) {
        Session session = sessionFactory.openSession();
        Query<Station> studentQuery = session.createQuery("from Station st where st.name = :name", Station.class);
        studentQuery.setParameter("name", name);
        List<Station> stations = studentQuery.getResultList();
        session.close();
        return stations;
    }

    public Station findById(Integer id) {
        Session session = sessionFactory.openSession();
        Station result = session.get(Station.class, id);
        session.close();
        return result;
    }

    public void insert(Station newStation) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.persist(newStation);
        transaction.commit();
        session.close();
    }

    public void update(Station station) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.merge(station);
        transaction.commit();
        session.close();
    }
}


