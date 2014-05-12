package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FnfbncliId generated by hbm2java
 */
@Embeddable
public class FnfbncliId implements java.io.Serializable {

	private int codcli;
	private short codfilial;
	private int codemp;
	private String codbanco;
	private short codfilialbo;
	private int codempbo;
	private short codfilialpf;
	private int codemppf;
	private String tipofebraban;

	public FnfbncliId() {
	}

	public FnfbncliId(int codcli, short codfilial, int codemp, String codbanco,
			short codfilialbo, int codempbo, short codfilialpf, int codemppf,
			String tipofebraban) {
		this.codcli = codcli;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codbanco = codbanco;
		this.codfilialbo = codfilialbo;
		this.codempbo = codempbo;
		this.codfilialpf = codfilialpf;
		this.codemppf = codemppf;
		this.tipofebraban = tipofebraban;
	}

	@Column(name = "CODCLI", nullable = false)
	public int getCodcli() {
		return this.codcli;
	}

	public void setCodcli(int codcli) {
		this.codcli = codcli;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	@Column(name = "CODBANCO", nullable = false, length = 3)
	public String getCodbanco() {
		return this.codbanco;
	}

	public void setCodbanco(String codbanco) {
		this.codbanco = codbanco;
	}

	@Column(name = "CODFILIALBO", nullable = false)
	public short getCodfilialbo() {
		return this.codfilialbo;
	}

	public void setCodfilialbo(short codfilialbo) {
		this.codfilialbo = codfilialbo;
	}

	@Column(name = "CODEMPBO", nullable = false)
	public int getCodempbo() {
		return this.codempbo;
	}

	public void setCodempbo(int codempbo) {
		this.codempbo = codempbo;
	}

	@Column(name = "CODFILIALPF", nullable = false)
	public short getCodfilialpf() {
		return this.codfilialpf;
	}

	public void setCodfilialpf(short codfilialpf) {
		this.codfilialpf = codfilialpf;
	}

	@Column(name = "CODEMPPF", nullable = false)
	public int getCodemppf() {
		return this.codemppf;
	}

	public void setCodemppf(int codemppf) {
		this.codemppf = codemppf;
	}

	@Column(name = "TIPOFEBRABAN", nullable = false, length = 2)
	public String getTipofebraban() {
		return this.tipofebraban;
	}

	public void setTipofebraban(String tipofebraban) {
		this.tipofebraban = tipofebraban;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FnfbncliId))
			return false;
		FnfbncliId castOther = (FnfbncliId) other;

		return (this.getCodcli() == castOther.getCodcli())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& ((this.getCodbanco() == castOther.getCodbanco()) || (this
						.getCodbanco() != null
						&& castOther.getCodbanco() != null && this
						.getCodbanco().equals(castOther.getCodbanco())))
				&& (this.getCodfilialbo() == castOther.getCodfilialbo())
				&& (this.getCodempbo() == castOther.getCodempbo())
				&& (this.getCodfilialpf() == castOther.getCodfilialpf())
				&& (this.getCodemppf() == castOther.getCodemppf())
				&& ((this.getTipofebraban() == castOther.getTipofebraban()) || (this
						.getTipofebraban() != null
						&& castOther.getTipofebraban() != null && this
						.getTipofebraban().equals(castOther.getTipofebraban())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcli();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result
				+ (getCodbanco() == null ? 0 : this.getCodbanco().hashCode());
		result = 37 * result + this.getCodfilialbo();
		result = 37 * result + this.getCodempbo();
		result = 37 * result + this.getCodfilialpf();
		result = 37 * result + this.getCodemppf();
		result = 37
				* result
				+ (getTipofebraban() == null ? 0 : this.getTipofebraban()
						.hashCode());
		return result;
	}

}
