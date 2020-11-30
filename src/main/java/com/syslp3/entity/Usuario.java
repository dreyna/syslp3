package com.syslp3.entity;

public class Usuario {
private int idusuario;
private String username;
private String password;
private int idpersona;
private Boolean value;
public Usuario() {
}
public Usuario(int idusuario, String username, String password, int idpersona, Boolean value) {
	super();
	this.idusuario = idusuario;
	this.username = username;
	this.password = password;
	this.idpersona = idpersona;
	this.value = value;
}
public int getIdusuario() {
	return idusuario;
}
public void setIdusuario(int idusuario) {
	this.idusuario = idusuario;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getIdpersona() {
	return idpersona;
}
public void setIdpersona(int idpersona) {
	this.idpersona = idpersona;
}
public Boolean getValue() {
	return value;
}
public void setValue(Boolean value) {
	this.value = value;
}


}
