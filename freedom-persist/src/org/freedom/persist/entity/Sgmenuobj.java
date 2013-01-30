package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sgmenuobj generated by hbm2java
 */
@Entity
@Table(name = "SGMENUOBJ")
public class Sgmenuobj implements java.io.Serializable {

	private SgmenuobjId id;
	private Sgmenu sgmenu;
	private Sgobjeto sgobjeto;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgmenuobj() {
	}

	public Sgmenuobj(SgmenuobjId id, Sgmenu sgmenu, Sgobjeto sgobjeto,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgmenu = sgmenu;
		this.sgobjeto = sgobjeto;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgmenuobj(SgmenuobjId id, Sgmenu sgmenu, Sgobjeto sgobjeto,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.sgmenu = sgmenu;
		this.sgobjeto = sgobjeto;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codmenu", column = @Column(name = "CODMENU", nullable = false)),
			@AttributeOverride(name = "codmodu", column = @Column(name = "CODMODU", nullable = false)),
			@AttributeOverride(name = "codsis", column = @Column(name = "CODSIS", nullable = false)),
			@AttributeOverride(name = "idobj", column = @Column(name = "IDOBJ", nullable = false, length = 30)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public SgmenuobjId getId() {
		return this.id;
	}

	public void setId(SgmenuobjId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODMENU", referencedColumnName = "CODMENU", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODMODU", referencedColumnName = "CODMODU", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODSIS", referencedColumnName = "CODSIS", nullable = false, insertable = false, updatable = false) })
	public Sgmenu getSgmenu() {
		return this.sgmenu;
	}

	public void setSgmenu(Sgmenu sgmenu) {
		this.sgmenu = sgmenu;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "IDOBJ", referencedColumnName = "IDOBJ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgobjeto getSgobjeto() {
		return this.sgobjeto;
	}

	public void setSgobjeto(Sgobjeto sgobjeto) {
		this.sgobjeto = sgobjeto;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 8)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
