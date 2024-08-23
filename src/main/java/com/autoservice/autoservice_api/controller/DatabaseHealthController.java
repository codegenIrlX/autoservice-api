package com.autoservice.autoservice_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/database")
public class DatabaseHealthController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Проверяет статус соединения с базой данных и возвращает количество таблиц и их названия.
     *
     * @return JSON с информацией о статусе соединения, количестве таблиц и их названиях
     */
    @GetMapping("/status")
    public Map<String, Object> getDatabaseStatus() {
        try {
            // Проверка соединения с базой данных
            jdbcTemplate.execute("SELECT 1");

            // Получение списка таблиц
            List<String> tables = new ArrayList<>();
            jdbcTemplate.query("SELECT table_name FROM information_schema.tables WHERE table_schema = 'public'",
                    (ResultSet rs) -> {
                        while (rs.next()) {
                            tables.add(rs.getString("table_name"));
                        }
                    });

            return Map.of(
                    "status", "connected",
                    "table_count", tables.size(),
                    "tables", tables
            );
        } catch (Exception e) {
            return Map.of(
                    "status", "disconnected",
                    "error", e.getMessage()
            );
        }
    }
}