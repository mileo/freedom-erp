package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * LffretecompraId generated by hbm2java
 */
public class LffretecompraId implements java.io.Serializable {

	private int codfrete;
	private int codcompra;
	private short codfilial;
	private int codemp;

	public LffretecompraId() {
	}

	public LffretecompraId(int codfrete, int codcompra, short codfilial,
			int codemp) {
		this.codfrete = codfrete;
		this.codcompra = codcompra;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodfrete() {
		return this.codfrete;
	}

	public void setCodfrete(int codfrete) {
		this.codfrete = codfrete;
	}

	public int getCodcompra() {
		return this.codcompra;
	}

	public void setCodcompra(int codcompra) {
		this.codcompra = codcompra;
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
		if (!(other instanceof LffretecompraId))
			return false;
		LffretecompraId castOther = (LffretecompraId) other;

		return (this.getCodfrete() == castOther.getCodfrete())
				&& (this.getCodcompra() == castOther.getCodcompra())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodfrete();
		result = 37 * result + this.getCodcompra();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
