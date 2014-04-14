package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * CrambienteavalId generated by hbm2java
 */
public class CrambienteavalId implements java.io.Serializable {

	private int codambaval;
	private short codfilial;
	private int codemp;

	public CrambienteavalId() {
	}

	public CrambienteavalId(int codambaval, short codfilial, int codemp) {
		this.codambaval = codambaval;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodambaval() {
		return this.codambaval;
	}

	public void setCodambaval(int codambaval) {
		this.codambaval = codambaval;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

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
		if (!(other instanceof CrambienteavalId))
			return false;
		CrambienteavalId castOther = (CrambienteavalId) other;

		return (this.getCodambaval() == castOther.getCodambaval())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodambaval();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
