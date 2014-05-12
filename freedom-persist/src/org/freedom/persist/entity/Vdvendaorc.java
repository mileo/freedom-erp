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
 * Vdvendaorc generated by hbm2java
 */
@Entity
@Table(name = "VDVENDAORC")
public class Vdvendaorc implements java.io.Serializable {

	private VdvendaorcId id;
	private Vditvenda vditvenda;
	private Vditorcamento vditorcamento;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdvendaorc() {
	}

	public Vdvendaorc(VdvendaorcId id, Vditvenda vditvenda,
			Vditorcamento vditorcamento, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vditvenda = vditvenda;
		this.vditorcamento = vditorcamento;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdvendaorc(VdvendaorcId id, Vditvenda vditvenda,
			Vditorcamento vditorcamento, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.vditvenda = vditvenda;
		this.vditorcamento = vditorcamento;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codvenda", column = @Column(name = "CODVENDA", nullable = false)),
			@AttributeOverride(name = "coditvenda", column = @Column(name = "CODITVENDA", nullable = false)),
			@AttributeOverride(name = "tipovenda", column = @Column(name = "TIPOVENDA", nullable = false, length = 1)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codorc", column = @Column(name = "CODORC", nullable = false)),
			@AttributeOverride(name = "coditorc", column = @Column(name = "CODITORC", nullable = false)),
			@AttributeOverride(name = "tipoorc", column = @Column(name = "TIPOORC", nullable = false, length = 1)),
			@AttributeOverride(name = "codfilialor", column = @Column(name = "CODFILIALOR", nullable = false)),
			@AttributeOverride(name = "codempor", column = @Column(name = "CODEMPOR", nullable = false)) })
	public VdvendaorcId getId() {
		return this.id;
	}

	public void setId(VdvendaorcId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVENDA", referencedColumnName = "CODVENDA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODITVENDA", referencedColumnName = "CODITVENDA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "TIPOVENDA", referencedColumnName = "TIPOVENDA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Vditvenda getVditvenda() {
		return this.vditvenda;
	}

	public void setVditvenda(Vditvenda vditvenda) {
		this.vditvenda = vditvenda;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODORC", referencedColumnName = "CODORC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODITORC", referencedColumnName = "CODITORC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "TIPOORC", referencedColumnName = "TIPOORC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALOR", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPOR", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Vditorcamento getVditorcamento() {
		return this.vditorcamento;
	}

	public void setVditorcamento(Vditorcamento vditorcamento) {
		this.vditorcamento = vditorcamento;
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
