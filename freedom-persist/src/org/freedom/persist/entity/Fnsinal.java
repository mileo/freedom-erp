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
 * Fnsinal generated by hbm2java
 */
@Entity
@Table(name = "FNSINAL")
public class Fnsinal implements java.io.Serializable {

	private FnsinalId id;
	private String descsinal;
	private int corsinal;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Fnitreceber> fnitrecebers = new HashSet<Fnitreceber>(0);
	private Set<Fnitpagar> fnitpagars = new HashSet<Fnitpagar>(0);
	private Set<Fnlanca> fnlancas = new HashSet<Fnlanca>(0);

	public Fnsinal() {
	}

	public Fnsinal(FnsinalId id, String descsinal, int corsinal, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.descsinal = descsinal;
		this.corsinal = corsinal;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Fnsinal(FnsinalId id, String descsinal, int corsinal, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Fnitreceber> fnitrecebers, Set<Fnitpagar> fnitpagars,
			Set<Fnlanca> fnlancas) {
		this.id = id;
		this.descsinal = descsinal;
		this.corsinal = corsinal;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnitrecebers = fnitrecebers;
		this.fnitpagars = fnitpagars;
		this.fnlancas = fnlancas;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codsinal", column = @Column(name = "CODSINAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)) })
	public FnsinalId getId() {
		return this.id;
	}

	public void setId(FnsinalId id) {
		this.id = id;
	}

	@Column(name = "DESCSINAL", nullable = false, length = 100)
	public String getDescsinal() {
		return this.descsinal;
	}

	public void setDescsinal(String descsinal) {
		this.descsinal = descsinal;
	}

	@Column(name = "CORSINAL", nullable = false)
	public int getCorsinal() {
		return this.corsinal;
	}

	public void setCorsinal(int corsinal) {
		this.corsinal = corsinal;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnsinal")
	public Set<Fnitreceber> getFnitrecebers() {
		return this.fnitrecebers;
	}

	public void setFnitrecebers(Set<Fnitreceber> fnitrecebers) {
		this.fnitrecebers = fnitrecebers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnsinal")
	public Set<Fnitpagar> getFnitpagars() {
		return this.fnitpagars;
	}

	public void setFnitpagars(Set<Fnitpagar> fnitpagars) {
		this.fnitpagars = fnitpagars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnsinal")
	public Set<Fnlanca> getFnlancas() {
		return this.fnlancas;
	}

	public void setFnlancas(Set<Fnlanca> fnlancas) {
		this.fnlancas = fnlancas;
	}

}
