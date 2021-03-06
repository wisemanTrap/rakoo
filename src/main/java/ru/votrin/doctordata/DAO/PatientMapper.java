package ru.votrin.doctordata.DAO;

import org.springframework.jdbc.core.RowMapper;
import ru.votrin.doctordata.model.Patient;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by wiseman on 08.04.17.
 */
public class PatientMapper implements RowMapper<Patient>{
    @Override
    public Patient mapRow(ResultSet rs,
                          int rowNum) throws SQLException {
        return new Patient(rs.getLong("ptnt_id"),
                            rs.getString("first_name"),
                            rs.getString("second_name"),
                            rs.getString("patronic"),
                            rs.getDate("birth"),
                            rs.getString("sex"),
                            rs.getDate("incoming_date"),
                            rs.getDate("outcoming_date"),
                            rs.getString("diagnos"),
                            rs.getDate("operation_date"),
                            rs.getString("hist_num"),
                            rs.getLong("loc_loc_id"));
    }
}
