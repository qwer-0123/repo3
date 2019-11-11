package cn.ccf.temlate;

import cn.ccf.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTeplate {
//    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "UPDATE emp SET sal = sal * 1.1 WHERE (SELECT YEAR(NOW())) > ?;";
        int count = template.update(sql, 35);
        System.out.println(count);
    }
}
