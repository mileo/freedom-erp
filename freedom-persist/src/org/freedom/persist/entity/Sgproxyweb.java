package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sgproxyweb generated by hbm2java
 */
@Entity
@Table(name = "SGPROXYWEB")
public class Sgproxyweb implements java.io.Serializable {

	private SgproxywebId id;
	private String descproxy;
	private String hostproxy;
	private int portaproxy;
	private char autproxy;
	private String usuproxy;
	private String senhaproxy;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Sgestacao> sgestacaos = new HashSet<Sgestacao>(0);

	public Sgproxyweb() {
	}

	public Sgproxyweb(SgproxywebId id, String descproxy, String hostproxy,
			int portaproxy, char autproxy, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.descproxy = descproxy;
		this.hostproxy = hostproxy;
		this.portaproxy = portaproxy;
		this.autproxy = autproxy;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Sgproxyweb(SgproxywebId id, String descproxy, String hostproxy,
			int portaproxy, char autproxy, String usuproxy, String senhaproxy,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set<Sgestacao> sgestacaos) {
		this.id = id;
		this.descproxy = descproxy;
		this.hostproxy = hostproxy;
		this.portaproxy = portaproxy;
		this.autproxy = autproxy;
		this.usuproxy = usuproxy;
		this.senhaproxy = senhaproxy;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgestacaos = sgestacaos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codproxy", column = @Column(name = "CODPROXY", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public SgproxywebId getId() {
		return this.id;
	}

	public void setId(SgproxywebId id) {
		this.id = id;
	}

	@Column(name = "DESCPROXY", nullable = false, length = 60)
	public String getDescproxy() {
		return this.descproxy;
	}

	public void setDescproxy(String descproxy) {
		this.descproxy = descproxy;
	}

	@Column(name = "HOSTPROXY", nullable = false, length = 100)
	public String getHostproxy() {
		return this.hostproxy;
	}

	public void setHostproxy(String hostproxy) {
		this.hostproxy = hostproxy;
	}

	@Column(name = "PORTAPROXY", nullable = false)
	public int getPortaproxy() {
		return this.portaproxy;
	}

	public void setPortaproxy(int portaproxy) {
		this.portaproxy = portaproxy;
	}

	@Column(name = "AUTPROXY", nullable = false, length = 1)
	public char getAutproxy() {
		return this.autproxy;
	}

	public void setAutproxy(char autproxy) {
		this.autproxy = autproxy;
	}

	@Column(name = "USUPROXY", length = 128)
	public String getUsuproxy() {
		return this.usuproxy;
	}

	public void setUsuproxy(String usuproxy) {
		this.usuproxy = usuproxy;
	}

	@Column(name = "SENHAPROXY", length = 128)
	public String getSenhaproxy() {
		return this.senhaproxy;
	}

	public void setSenhaproxy(String senhaproxy) {
		this.senhaproxy = senhaproxy;
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

	@Column(name = "IDUSUINS", nullable = false, length = 128)
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

	@Column(name = "IDUSUALT", nullable = false, length = 128)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgproxyweb")
	public Set<Sgestacao> getSgestacaos() {
		return this.sgestacaos;
	}

	public void setSgestacaos(Set<Sgestacao> sgestacaos) {
		this.sgestacaos = sgestacaos;
	}

}
