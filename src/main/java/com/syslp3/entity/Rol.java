package com.syslp3.entity;

public class Rol {
private int idrol;
private String nomrol;
public Rol(int idrol, String nomrol) {
	this.idrol = idrol;
	this.nomrol = nomrol;
}
public Rol() {
}
public int getIdrol() {
	return idrol;
}
public void setIdrol(int idrol) {
	this.idrol = idrol;
}
public String getNomrol() {
	return nomrol;
}
public void setNomrol(String nomrol) {
	this.nomrol = nomrol;
}

}
