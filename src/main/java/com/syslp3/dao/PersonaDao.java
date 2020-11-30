package com.syslp3.dao;

import java.util.Map;

import com.syslp3.entity.Persona;


public interface PersonaDao {
	int create(Persona r);
	int update(Persona r);
	int update(int id);
	int delete(int id);
	Persona read(int id);
	Map<String, Object> readAll();
}
