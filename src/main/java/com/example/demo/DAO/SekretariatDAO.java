package com.example.demo.DAO;

import com.example.demo.Components.Sekretariat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

    @Repository
    public class SekretariatDAO {

        @Autowired
        private JdbcTemplate jdbcTemplate;

        public SekretariatDAO(JdbcTemplate jdbcTemplate){
            super();
            this.jdbcTemplate = jdbcTemplate;
        }

        public List<Sekretariat> list(){
            String sql = "Select * FROM SEKRETARIATY";

            return jdbcTemplate.query(sql,
                    BeanPropertyRowMapper.newInstance(Sekretariat.class));
        }
        public void save(Sekretariat sekretariat){
//        wstawienie nowego wiersza do tabeli
        }

        //odczytanie bazt danych
        public Sekretariat get(int id){
            return null;
        }

        public void delete(int id){
            //usuniecie danego adresu po id
        }
    }
