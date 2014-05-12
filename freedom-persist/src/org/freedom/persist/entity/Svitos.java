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
 * Svitos generated by hbm2java
 */
@Entity
@Table(name = "SVITOS")
public class Svitos implements java.io.Serializable {

	private SvitosId id;
	private Eqproduto eqproduto;
	private Svos svos;
	private String refprod;
	private BigDecimal qtditos;
	private BigDecimal precoitos;
	private String sititos;
	private String obsitos;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set svavaliacaos = new HashSet(0);
	private Set svexecucaos = new HashSet(0);

	public Svitos() {
	}

	public Svitos(SvitosId id, Eqproduto eqproduto, Svos svos, String refprod,
			BigDecimal qtditos, BigDecimal precoitos, String sititos,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.svos = svos;
		this.refprod = refprod;
		this.qtditos = qtditos;
		this.precoitos = precoitos;
		this.sititos = sititos;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Svitos(SvitosId id, Eqproduto eqproduto, Svos svos, String refprod,
			BigDecimal qtditos, BigDecimal precoitos, String sititos,
			String obsitos, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt, Set svavaliacaos, Set svexecucaos) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.svos = svos;
		this.refprod = refprod;
		this.qtditos = qtditos;
		this.precoitos = precoitos;
		this.sititos = sititos;
		this.obsitos = obsitos;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.svavaliacaos = svavaliacaos;
		this.svexecucaos = svexecucaos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codos", column = @Column(name = "CODOS", nullable = false)),
			@AttributeOverride(name = "coditos", column = @Column(name = "CODITOS", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public SvitosId getId() {
		return this.id;
	}

	public void setId(SvitosId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false),
			@JoinColumn(name = "CODFILIALPD", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPPD", referencedColumnName = "CODEMP", nullable = false) })
	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODOS", referencedColumnName = "CODOS", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Svos getSvos() {
		return this.svos;
	}

	public void setSvos(Svos svos) {
		this.svos = svos;
	}

	@Column(name = "REFPROD", nullable = false, length = 20)
	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	@Column(name = "QTDITOS", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtditos() {
		return this.qtditos;
	}

	public void setQtditos(BigDecimal qtditos) {
		this.qtditos = qtditos;
	}

	@Column(name = "PRECOITOS", nullable = false, precision = 15, scale = 5)
	public BigDecimal getPrecoitos() {
		return this.precoitos;
	}

	public void setPrecoitos(BigDecimal precoitos) {
		this.precoitos = precoitos;
	}

	@Column(name = "SITITOS", nullable = false, length = 2)
	public String getSititos() {
		return this.sititos;
	}

	public void setSititos(String sititos) {
		this.sititos = sititos;
	}

	@Column(name = "OBSITOS", length = 1000)
	public String getObsitos() {
		return this.obsitos;
	}

	public void setObsitos(String obsitos) {
		this.obsitos = obsitos;
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

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "svitos")
	public Set getSvavaliacaos() {
		return this.svavaliacaos;
	}

	public void setSvavaliacaos(Set svavaliacaos) {
		this.svavaliacaos = svavaliacaos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "svitos")
	public Set getSvexecucaos() {
		return this.svexecucaos;
	}

	public void setSvexecucaos(Set svexecucaos) {
		this.svexecucaos = svexecucaos;
	}
*/
}
