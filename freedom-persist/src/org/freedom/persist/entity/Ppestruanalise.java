package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Ppestruanalise generated by hbm2java
 */
@Entity
@Table(name = "PPESTRUANALISE")
public class Ppestruanalise implements java.io.Serializable {

	private PpestruanaliseId id;
	private Pptipoanalise pptipoanalise;
	private Ppestrufase ppestrufase;
	private BigDecimal vlrmin;
	private BigDecimal vlrmax;
	private String especificacao;
	private char emitcert;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set ppopcqs = new HashSet(0);

	public Ppestruanalise() {
	}

	public Ppestruanalise(PpestruanaliseId id, Pptipoanalise pptipoanalise,
			Ppestrufase ppestrufase, char emitcert, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.pptipoanalise = pptipoanalise;
		this.ppestrufase = ppestrufase;
		this.emitcert = emitcert;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Ppestruanalise(PpestruanaliseId id, Pptipoanalise pptipoanalise,
			Ppestrufase ppestrufase, BigDecimal vlrmin, BigDecimal vlrmax,
			String especificacao, char emitcert, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt, Set ppopcqs) {
		this.id = id;
		this.pptipoanalise = pptipoanalise;
		this.ppestrufase = ppestrufase;
		this.vlrmin = vlrmin;
		this.vlrmax = vlrmax;
		this.especificacao = especificacao;
		this.emitcert = emitcert;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.ppopcqs = ppopcqs;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codestanalise", column = @Column(name = "CODESTANALISE", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public PpestruanaliseId getId() {
		return this.id;
	}

	public void setId(PpestruanaliseId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTPANALISE", referencedColumnName = "CODTPANALISE", nullable = false),
			@JoinColumn(name = "CODFILIALTA", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPTA", referencedColumnName = "CODEMP", nullable = false) })
	public Pptipoanalise getPptipoanalise() {
		return this.pptipoanalise;
	}

	public void setPptipoanalise(Pptipoanalise pptipoanalise) {
		this.pptipoanalise = pptipoanalise;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SEQEST", referencedColumnName = "SEQEST", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SEQEF", referencedColumnName = "SEQEF", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFASE", referencedColumnName = "CODFASE", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALFS", referencedColumnName = "CODFILIALFS", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPFS", referencedColumnName = "CODEMPFS", nullable = false, insertable = false, updatable = false) })
	public Ppestrufase getPpestrufase() {
		return this.ppestrufase;
	}

	public void setPpestrufase(Ppestrufase ppestrufase) {
		this.ppestrufase = ppestrufase;
	}

	@Column(name = "VLRMIN", precision = 15, scale = 5)
	public BigDecimal getVlrmin() {
		return this.vlrmin;
	}

	public void setVlrmin(BigDecimal vlrmin) {
		this.vlrmin = vlrmin;
	}

	@Column(name = "VLRMAX", precision = 15, scale = 5)
	public BigDecimal getVlrmax() {
		return this.vlrmax;
	}

	public void setVlrmax(BigDecimal vlrmax) {
		this.vlrmax = vlrmax;
	}

	@Column(name = "ESPECIFICACAO", length = 50)
	public String getEspecificacao() {
		return this.especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	@Column(name = "EMITCERT", nullable = false, length = 1)
	public char getEmitcert() {
		return this.emitcert;
	}

	public void setEmitcert(char emitcert) {
		this.emitcert = emitcert;
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
	@Column(name = "DTALT", nullable = false, length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", nullable = false, length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", nullable = false, length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppestruanalise")
	public Set getPpopcqs() {
		return this.ppopcqs;
	}

	public void setPpopcqs(Set ppopcqs) {
		this.ppopcqs = ppopcqs;
	}
*/
}
