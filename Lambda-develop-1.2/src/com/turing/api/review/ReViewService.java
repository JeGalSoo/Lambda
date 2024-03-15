package com.turing.api.review;

import java.sql.SQLException;
import java.util.List;

public interface ReViewService {
    List<?> showall() throws SQLException;
}
