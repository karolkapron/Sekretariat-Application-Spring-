package com.example.demo.DAO;

import com.example.demo.Components.Sekretariat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository

public class SekretariatDAO{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public SekretariatDAO(JdbcTemplate jdbcTemplate){
        super();
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Sekretariat> list(){
        String sql = "Select * FROM Sekretariaty ORDER BY ID_SEKRETARIATU";
        return jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Sekretariat.class));
        }
    public void save(Sekretariat sekretariat){
        //wstawienie nowego wiersza do tabeli
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("Sekretariaty").usingColumns("ID_SEKRETARIATU","NAZWA_SZKOLY","ID_ADRES");
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sekretariat);
        insertActor.execute(param);
    }
    public void delete(int id_sekretariat){
        //usuniecie danego adresu po id
        String SQL = "DELETE FROM SEKRETARIATY WHERE ID_SEKRETARIATU = ?";
        jdbcTemplate.update(SQL, id_sekretariat);
    }
    //odczytanie bazt danych
    public Sekretariat get(int id){return null;}
}
