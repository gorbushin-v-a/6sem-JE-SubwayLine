package subwayLine.component;

import subwayLine.model.Station;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class StationRowMapper implements RowMapper<Station> {

    @Override
    public Station mapRow(ResultSet resultSet, int i) throws SQLException {
        Station station = new Station();
        station.setId(resultSet.getInt("id"));
        station.setName(resultSet.getString("name"));
        return station;
    }
}
