package com.fun.graphql.repository;

import com.fun.graphql.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        var user = new User();
        user.setUserID(rs.getString("user_id"));
        user.setUserName(rs.getString("user_name"));
        user.setFirstName(rs.getString("first_name"));

        return user;
    }
}
