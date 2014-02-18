package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * PpopsubprodId generated by hbm2java
 */
public class PpopsubprodId implements java.io.Serializable {

	private int codop;
	private short seqop;
	private short seqsubprod;
	private short codfilial;
	private int codemp;

	public PpopsubprodId() {
	}

	public PpopsubprodId(int codop, short seqop, short seqsubprod,
			short codfilial, int codemp) {
		this.codop = codop;
		this.seqop = seqop;
		this.seqsubprod = seqsubprod;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodop() {
		return this.codop;
	}

	public void setCodop(int codop) {
		this.codop = codop;
	}

	public short getSeqop() {
		return this.seqop;
	}

	public void setSeqop(short seqop) {
		this.seqop = seqop;
	}

	public short getSeqsubprod() {
		return this.seqsubprod;
	}

	public void setSeqsubprod(short seqsubprod) {
		this.seqsubprod = seqsubprod;
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
		if (!(other instanceof PpopsubprodId))
			return false;
		PpopsubprodId castOther = (PpopsubprodId) other;

		return (this.getCodop() == castOther.getCodop())
				&& (this.getSeqop() == castOther.getSeqop())
				&& (this.getSeqsubprod() == castOther.getSeqsubprod())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodop();
		result = 37 * result + this.getSeqop();
		result = 37 * result + this.getSeqsubprod();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
