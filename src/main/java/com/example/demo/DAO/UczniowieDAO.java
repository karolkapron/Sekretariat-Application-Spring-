package com.example.demo.DAO;
import com.example.demo.Components.Sekretariat;
import com.example.demo.Components.Uczniowie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class UczniowieDAO{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public UczniowieDAO(JdbcTemplate jdbcTemplate){
        super();
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Uczniowie> list(){
        String sql = "Select * FROM SEKRETARIATY";

        return jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Uczniowie.class));
    }
    public void save(Uczniowie uczen){
//        wstawienie nowego wiersza do tabeli
    }

    //odczytanie bazt danych
    public Uczniowie get(int id){
        return null;
    }

    public void delete(int id){
        //usuniecie danego adresu po id
    }
}

