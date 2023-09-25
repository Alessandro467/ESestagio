package model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Vaga implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codVaga;
	private String descricaoVaga;
	private String gerente;
	private Integer qtdVaga;
	private String nomeVaga;
	private Integer codCoordenador;
	private Integer codEmpresa;

	public Vaga() {
		super();
	}
	
	public Vaga(Integer codVaga, String descricaoVaga, String gerente, Integer qtdVaga, String nomeVaga, Integer codCoordenador, Integer codEmpresa) {
		super();
		this.codVaga = codVaga;
		this.descricaoVaga = descricaoVaga;
		this.gerente = gerente;
		this.qtdVaga = qtdVaga;
		this.nomeVaga = nomeVaga;
		this.codCoordenador = codCoordenador;
		this.codEmpresa = codEmpresa;
		
	}

	public Integer getCodVaga() {
		return codVaga;
	}

	public void setCodVaga(Integer codVaga) {
		this.codVaga = codVaga;
	}

	public String getDescricaoVaga() {
		return descricaoVaga;
	}

	public void setDescricaoVaga(String descricaoVaga) {
		this.descricaoVaga = descricaoVaga;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public Integer getQtdVaga() {
		return qtdVaga;
	}

	public void setQtdVaga(Integer qtdVaga) {
		this.qtdVaga = qtdVaga;
	}

	public String getNomeVaga() {
		return nomeVaga;
	}

	public void setNomeVaga(String nomeVaga) {
		this.nomeVaga = nomeVaga;
	}

	public Integer getCodCoordenador() {
		return codCoordenador;
	}

	public void setCodCoordenador(Integer codCoordenador) {
		this.codCoordenador = codCoordenador;
	}

	public Integer getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(Integer codEmpresa) {
		this.codEmpresa = codEmpresa;
	}
	
}

