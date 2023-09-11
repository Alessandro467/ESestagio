package model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Documento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codDoc;
	private String tipoDoc;
	private String tituloDoc;
	private String dataDoc;


public Documento(){
	super();
}

public Documento(Integer codDoc, String tipoDoc, String tituloDoc) {
	super();
	this.codDoc = codDoc;
	this.tipoDoc = tipoDoc;
	this.tituloDoc = tituloDoc;

}

public int getCodDoc() {
	return codDoc;
}

public void setCodDoc(int codDoc) {
	this.codDoc = codDoc;
}

public String getTipoDoc() {
	return tipoDoc;
}

public void setTipoDoc(String tipoDoc) {
	this.tipoDoc = tipoDoc;
}

public String getTituloDoc() {
	return tituloDoc;
}

public void setTituloDoc(String tituloDoc) {
	this.tituloDoc = tituloDoc;
}

}
