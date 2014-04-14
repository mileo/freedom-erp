package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * SgimagemId generated by hbm2java
 */
public class SgimagemId implements java.io.Serializable {

	private int codimg;
	private short codfilial;
	private int codemp;

	public SgimagemId() {
	}

	public SgimagemId(int codimg, short codfilial, int codemp) {
		this.codimg = codimg;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodimg() {
		return this.codimg;
	}

	public void setCodimg(int codimg) {
		this.codimg = codimg;
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
		if (!(other instanceof SgimagemId))
			return false;
		SgimagemId castOther = (SgimagemId) other;

		return (this.getCodimg() == castOther.getCodimg())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodimg();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
