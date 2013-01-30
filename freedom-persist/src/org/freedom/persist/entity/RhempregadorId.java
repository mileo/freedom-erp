package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RhempregadorId generated by hbm2java
 */
@Embeddable
public class RhempregadorId implements java.io.Serializable {

	private int codempr;
	private short codfilial;
	private int codemp;

	public RhempregadorId() {
	}

	public RhempregadorId(int codempr, short codfilial, int codemp) {
		this.codempr = codempr;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODEMPR", nullable = false)
	public int getCodempr() {
		return this.codempr;
	}

	public void setCodempr(int codempr) {
		this.codempr = codempr;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RhempregadorId))
			return false;
		RhempregadorId castOther = (RhempregadorId) other;

		return (this.getCodempr() == castOther.getCodempr())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodempr();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
