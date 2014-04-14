package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * SgcatimgId generated by hbm2java
 */
public class SgcatimgId implements java.io.Serializable {

	private int codcatimg;
	private short codfilial;
	private int codemp;

	public SgcatimgId() {
	}

	public SgcatimgId(int codcatimg, short codfilial, int codemp) {
		this.codcatimg = codcatimg;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodcatimg() {
		return this.codcatimg;
	}

	public void setCodcatimg(int codcatimg) {
		this.codcatimg = codcatimg;
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
		if (!(other instanceof SgcatimgId))
			return false;
		SgcatimgId castOther = (SgcatimgId) other;

		return (this.getCodcatimg() == castOther.getCodcatimg())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcatimg();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
