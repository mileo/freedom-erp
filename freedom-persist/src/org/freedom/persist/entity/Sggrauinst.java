package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sggrauinst generated by hbm2java
 */
public class Sggrauinst implements java.io.Serializable {

	private SggrauinstId id;
	private Sgfilial sgfilial;
	private String descgri;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set atconveniados = new HashSet(0);

	public Sggrauinst() {
	}

	public Sggrauinst(SggrauinstId id, Sgfilial sgfilial, String descgri,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descgri = descgri;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sggrauinst(SggrauinstId id, Sgfilial sgfilial, String descgri,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set atconveniados) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descgri = descgri;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.atconveniados = atconveniados;
	}

	public SggrauinstId getId() {
		return this.id;
	}

	public void setId(SggrauinstId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDescgri() {
		return this.descgri;
	}

	public void setDescgri(String descgri) {
		this.descgri = descgri;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	public Set getAtconveniados() {
		return this.atconveniados;
	}

	public void setAtconveniados(Set atconveniados) {
		this.atconveniados = atconveniados;
	}

}
