package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LfsittribId generated by hbm2java
 */
@Embeddable
public class LfsittribId implements java.io.Serializable {

	private String codsittrib;
	private String impsittrib;
	private short codfilial;
	private int codemp;

	public LfsittribId() {
	}

	public LfsittribId(String codsittrib, String impsittrib, short codfilial,
			int codemp) {
		this.codsittrib = codsittrib;
		this.impsittrib = impsittrib;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODSITTRIB", nullable = false, length = 2)
	public String getCodsittrib() {
		return this.codsittrib;
	}

	public void setCodsittrib(String codsittrib) {
		this.codsittrib = codsittrib;
	}

	@Column(name = "IMPSITTRIB", nullable = false, length = 2)
	public String getImpsittrib() {
		return this.impsittrib;
	}

	public void setImpsittrib(String impsittrib) {
		this.impsittrib = impsittrib;
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
		if (!(other instanceof LfsittribId))
			return false;
		LfsittribId castOther = (LfsittribId) other;

		return ((this.getCodsittrib() == castOther.getCodsittrib()) || (this
				.getCodsittrib() != null && castOther.getCodsittrib() != null && this
				.getCodsittrib().equals(castOther.getCodsittrib())))
				&& ((this.getImpsittrib() == castOther.getImpsittrib()) || (this
						.getImpsittrib() != null
						&& castOther.getImpsittrib() != null && this
						.getImpsittrib().equals(castOther.getImpsittrib())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodsittrib() == null ? 0 : this.getCodsittrib()
						.hashCode());
		result = 37
				* result
				+ (getImpsittrib() == null ? 0 : this.getImpsittrib()
						.hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
