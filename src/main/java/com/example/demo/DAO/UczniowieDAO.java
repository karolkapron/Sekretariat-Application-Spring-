package com.example.demo.DAO;
import com.example.demo.Components.Sekretariat;
import com.example.demo.Components.Uczniowie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
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
        String sql = "Select * FROM Uczniowie";

        return jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Uczniowie.class));
    }
    public void save(Uczniowie uczen){
//        wstawienie nowego wiersza do tabeli
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("Uczniowie").usingColumns("ID_UCZNIA","IMIE","NAZWISKO","PESEL","DATA_URODZENIA","PLEC","ID_SEKRETARIATU","ID_ADRES");
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(uczen);
        insertActor.execute(param);
    }

    //odczytanie bazt danych
    public Uczniowie get(int id){
        return null;
    }

    public void delete(int id){
        //usuniecie danego adresu po id
    }
}

