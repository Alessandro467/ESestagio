package model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Documento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codDoc")
	private Integer codigo;
	/**
	 * comentário prof. Bruno
	 * Os nomes dos atributos precisam respeitar as regras da O.O
	 * como não podem ficar iguais ao do banco de dados pode utilizar
	 * a notação @Column inserido acima, veja que fiz modificações no atributo
	 * o mesmo ocorre na classe Vaga
	 */
	
	
	private String tipoDoc;
	private String tituloDoc;
	private String dataDoc;


public Documento(){
	super();
}

public Documento(Integer codDoc, String tipoDoc, String tituloDoc) {
	super();
	this.codigo = codDoc;
	this.tipoDoc = tipoDoc;
	this.tituloDoc = tituloDoc;

}

public int getCodDoc() {
	return codigo;
}

public void setCodDoc(int codDoc) {
	this.codigo = codDoc;
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
