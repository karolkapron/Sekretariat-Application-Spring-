package com.example.demo.DAO;

import com.example.demo.Components.Adres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdresDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public AdresDAO(JdbcTemplate jdbcTemplate){
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Adres> list(){
        String sql = "SELECT * FROM ADRESY;";
        List<Adres> listAdres = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Adres.class));

        return listAdres;
    }
    public void save(Adres adres){
//        wstawienie nowego wiersza do tabeli
    }
    //odczytanie bazt danych
    public Adres get(int id){
        return null;
    }
    public void delete(int id){
        //usuniecie danego adresu po id
    }
}
