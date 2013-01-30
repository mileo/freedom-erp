package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgmenuId generated by hbm2java
 */
@Embeddable
public class SgmenuId implements java.io.Serializable {

	private int codmenu;
	private int codmodu;
	private int codsis;

	public SgmenuId() {
	}

	public SgmenuId(int codmenu, int codmodu, int codsis) {
		this.codmenu = codmenu;
		this.codmodu = codmodu;
		this.codsis = codsis;
	}

	@Column(name = "CODMENU", nullable = false)
	public int getCodmenu() {
		return this.codmenu;
	}

	public void setCodmenu(int codmenu) {
		this.codmenu = codmenu;
	}

	@Column(name = "CODMODU", nullable = false)
	public int getCodmodu() {
		return this.codmodu;
	}

	public void setCodmodu(int codmodu) {
		this.codmodu = codmodu;
	}

	@Column(name = "CODSIS", nullable = false)
	public int getCodsis() {
		return this.codsis;
	}

	public void setCodsis(int codsis) {
		this.codsis = codsis;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SgmenuId))
			return false;
		SgmenuId castOther = (SgmenuId) other;

		return (this.getCodmenu() == castOther.getCodmenu())
				&& (this.getCodmodu() == castOther.getCodmodu())
				&& (this.getCodsis() == castOther.getCodsis());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodmenu();
		result = 37 * result + this.getCodmodu();
		result = 37 * result + this.getCodsis();
		return result;
	}

}
