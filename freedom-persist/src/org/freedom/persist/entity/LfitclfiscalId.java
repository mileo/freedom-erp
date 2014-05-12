package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LfitclfiscalId generated by hbm2java
 */
@Embeddable
public class LfitclfiscalId implements java.io.Serializable {

	private int codemp;
	private int codfilial;
	private String codfisc;
	private int coditfisc;

	public LfitclfiscalId() {
	}

	public LfitclfiscalId(int codemp, int codfilial, String codfisc,
			int coditfisc) {
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codfisc = codfisc;
		this.coditfisc = coditfisc;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public int getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(int codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODFISC", nullable = false, length = 13)
	public String getCodfisc() {
		return this.codfisc;
	}

	public void setCodfisc(String codfisc) {
		this.codfisc = codfisc;
	}

	@Column(name = "CODITFISC", nullable = false)
	public int getCoditfisc() {
		return this.coditfisc;
	}

	public void setCoditfisc(int coditfisc) {
		this.coditfisc = coditfisc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LfitclfiscalId))
			return false;
		LfitclfiscalId castOther = (LfitclfiscalId) other;

		return (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& ((this.getCodfisc() == castOther.getCodfisc()) || (this
						.getCodfisc() != null && castOther.getCodfisc() != null && this
						.getCodfisc().equals(castOther.getCodfisc())))
				&& (this.getCoditfisc() == castOther.getCoditfisc());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result
				+ (getCodfisc() == null ? 0 : this.getCodfisc().hashCode());
		result = 37 * result + this.getCoditfisc();
		return result;
	}

}
