package subwayLine.service;

import subwayLine.component.StationRowMapper;
import subwayLine.model.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Service
public class JdbcService {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private StationRowMapper stationRowMapper;

    public void test() throws SQLException {
        try (Connection connection = dataSource.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from station");
            List<Station> stations = new ArrayList<>();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                stations.add(new Station(id, name));
            }

            stations.forEach(System.out::println);
        }
    }

    public void testTemplate() {
        List<Station> stations = jdbcTemplate.query("select * from station", stationRowMapper);
        stations.forEach(System.out::println);
    }
}
