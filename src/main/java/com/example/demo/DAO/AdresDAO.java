package com.example.demo.DAO;

import com.example.demo.Components.Adresy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
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

    public List<Adresy> list(){
        String sql = "SELECT * FROM ADRESY";
        List<Adresy> Adresy = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Adresy.class));
        return Adresy;
    }
    public void save(Adresy adresy){
//        wstawienie nowego wiersza do tabeli
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("Adresy").usingColumns("ID_ADRES","MIASTO","ULICA","KOD_POCZTOWY");
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(adresy);
        insertActor.execute(param);
    }
    //odczytanie bazt danych
    public Adresy get(int id){
        return null;
    }
    public void delete(int id){
        //usuniecie danego adresu po id
    }
}
