package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * SgatribuicaoId generated by hbm2java
 */
public class SgatribuicaoId implements java.io.Serializable {

	private String idatrib;
	private short codfilial;
	private int codemp;

	public SgatribuicaoId() {
	}

	public SgatribuicaoId(String idatrib, short codfilial, int codemp) {
		this.idatrib = idatrib;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public String getIdatrib() {
		return this.idatrib;
	}

	public void setIdatrib(String idatrib) {
		this.idatrib = idatrib;
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
		if (!(other instanceof SgatribuicaoId))
			return false;
		SgatribuicaoId castOther = (SgatribuicaoId) other;

		return ((this.getIdatrib() == castOther.getIdatrib()) || (this
				.getIdatrib() != null && castOther.getIdatrib() != null && this
				.getIdatrib().equals(castOther.getIdatrib())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdatrib() == null ? 0 : this.getIdatrib().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
