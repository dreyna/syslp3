package com.syslp3.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Repository;

import com.syslp3.dao.RolDao;
import com.syslp3.entity.Rol;
@Repository
public class RolDaoImpl implements RolDao{
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "SELECT *FROM rol";
		return jdbcTemplate.queryForList(SQL);
	}
	@Override
	public int create(Rol r) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(Rol r) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<Rol> readHola(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<GrantedAuthority> buscarRolUser(int iduser) {
		List<GrantedAuthority> autores = new ArrayList<GrantedAuthority>();
		String SQL = "SELECT r.idrol, r.nomrol FROM usuario as u " + 
				"INNER JOIN usuario_rol as ur ON u.idusuario=ur.idusuario " + 
				"INNER JOIN rol as r ON r.idrol=ur.idrol " + 
				"WHERE u.idusuario = ?";
		List<Rol> roles = jdbcTemplate.query(SQL, new Object[]{iduser}, new BeanPropertyRowMapper<Rol>(Rol.class));		
		for(int i=0;i<roles.size();i++) {		
			autores.add(new SimpleGrantedAuthority(roles.get(i).getNomrol()));
		}
		return autores;
	}
	@Override
	public void convertitMap(Map<String, Object> map) {
		// TODO Auto-generated method stub
		
	}

}
