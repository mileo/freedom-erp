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
 * Sgatribusu generated by hbm2java
 */
@Entity
@Table(name = "SGATRIBUSU")
public class Sgatribusu implements java.io.Serializable {

	private SgatribusuId id;
	private Sgatribuicao sgatribuicao;
	private Sgusuario sgusuario;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgatribusu() {
	}

	public Sgatribusu(SgatribusuId id, Sgatribuicao sgatribuicao,
			Sgusuario sgusuario, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgatribuicao = sgatribuicao;
		this.sgusuario = sgusuario;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgatribusu(SgatribusuId id, Sgatribuicao sgatribuicao,
			Sgusuario sgusuario, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.sgatribuicao = sgatribuicao;
		this.sgusuario = sgusuario;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idusu", column = @Column(name = "IDUSU", nullable = false, length = 8)),
			@AttributeOverride(name = "codfilialuu", column = @Column(name = "CODFILIALUU", nullable = false)),
			@AttributeOverride(name = "codempuu", column = @Column(name = "CODEMPUU", nullable = false)),
			@AttributeOverride(name = "idatrib", column = @Column(name = "IDATRIB", nullable = false, length = 10)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public SgatribusuId getId() {
		return this.id;
	}

	public void setId(SgatribusuId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "IDATRIB", referencedColumnName = "IDATRIB", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgatribuicao getSgatribuicao() {
		return this.sgatribuicao;
	}

	public void setSgatribuicao(Sgatribuicao sgatribuicao) {
		this.sgatribuicao = sgatribuicao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "IDUSU", referencedColumnName = "IDUSU", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALUU", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPUU", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgusuario getSgusuario() {
		return this.sgusuario;
	}

	public void setSgusuario(Sgusuario sgusuario) {
		this.sgusuario = sgusuario;
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
