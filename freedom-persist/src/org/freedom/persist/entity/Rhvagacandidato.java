package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
 * Rhvagacandidato generated by hbm2java
 */
@Entity
@Table(name = "RHVAGACANDIDATO")
public class Rhvagacandidato implements java.io.Serializable {

	private RhvagacandidatoId id;
	private Rhcandidato rhcandidato;
	private Rhvaga rhvaga;
	private String stvagacand;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Rhvagacandidato() {
	}

	public Rhvagacandidato(RhvagacandidatoId id, Rhcandidato rhcandidato,
			Rhvaga rhvaga, String stvagacand, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.rhcandidato = rhcandidato;
		this.rhvaga = rhvaga;
		this.stvagacand = stvagacand;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rhvagacandidato(RhvagacandidatoId id, Rhcandidato rhcandidato,
			Rhvaga rhvaga, String stvagacand, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.rhcandidato = rhcandidato;
		this.rhvaga = rhvaga;
		this.stvagacand = stvagacand;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codvaga", column = @Column(name = "CODVAGA", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codcand", column = @Column(name = "CODCAND", nullable = false)),
			@AttributeOverride(name = "codfilialca", column = @Column(name = "CODFILIALCA", nullable = false)),
			@AttributeOverride(name = "codempca", column = @Column(name = "CODEMPCA", nullable = false)) })
	public RhvagacandidatoId getId() {
		return this.id;
	}

	public void setId(RhvagacandidatoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCAND", referencedColumnName = "CODCAND", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALCA", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPCA", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Rhcandidato getRhcandidato() {
		return this.rhcandidato;
	}

	public void setRhcandidato(Rhcandidato rhcandidato) {
		this.rhcandidato = rhcandidato;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVAGA", referencedColumnName = "CODVAGA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Rhvaga getRhvaga() {
		return this.rhvaga;
	}

	public void setRhvaga(Rhvaga rhvaga) {
		this.rhvaga = rhvaga;
	}

	@Column(name = "STVAGACAND", nullable = false, length = 2)
	public String getStvagacand() {
		return this.stvagacand;
	}

	public void setStvagacand(String stvagacand) {
		this.stvagacand = stvagacand;
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
