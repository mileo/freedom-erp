package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
 * Fnbanco generated by hbm2java
 */
@Entity
@Table(name = "FNBANCO")
public class Fnbanco implements java.io.Serializable {

	private FnbancoId id;
	private Sgfilial sgfilial;
	private Fnmodboleto fnmodboleto;
	private Fnbanco fnbanco;
	private String nomebanco;
	private char dvbanco;
	private String sitebanco;
	private byte[] imgbolbanco;
	private byte[] imgbolbanco2;
	private String layoutcheqbanco;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set fncartcobs = new HashSet(0);
	private Set sgitprefere6s = new HashSet(0);
	private Set fncontas = new HashSet(0);
	private Set vdclicontases = new HashSet(0);
	private Set vdvendas = new HashSet(0);
	private Set cpforneceds = new HashSet(0);
	private Set fnpagars = new HashSet(0);
	private Set vdmodcontrs = new HashSet(0);
	private Set cpcompras = new HashSet(0);
	private Set fncheques = new HashSet(0);
	private Set fnrecebers = new HashSet(0);
	private Set fnbancos = new HashSet(0);
	private Set fnitrecebers = new HashSet(0);
	private Set vdclientes = new HashSet(0);

	public Fnbanco() {
	}

	public Fnbanco(FnbancoId id, Sgfilial sgfilial, String nomebanco,
			char dvbanco, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.nomebanco = nomebanco;
		this.dvbanco = dvbanco;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnbanco(FnbancoId id, Sgfilial sgfilial, Fnmodboleto fnmodboleto,
			Fnbanco fnbanco, String nomebanco, char dvbanco, String sitebanco,
			byte[] imgbolbanco, byte[] imgbolbanco2, String layoutcheqbanco,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set fncartcobs, Set sgitprefere6s, Set fncontas,
			Set vdclicontases, Set vdvendas, Set cpforneceds, Set fnpagars,
			Set vdmodcontrs, Set cpcompras, Set fncheques, Set fnrecebers,
			Set fnbancos, Set fnitrecebers, Set vdclientes) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fnmodboleto = fnmodboleto;
		this.fnbanco = fnbanco;
		this.nomebanco = nomebanco;
		this.dvbanco = dvbanco;
		this.sitebanco = sitebanco;
		this.imgbolbanco = imgbolbanco;
		this.imgbolbanco2 = imgbolbanco2;
		this.layoutcheqbanco = layoutcheqbanco;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fncartcobs = fncartcobs;
		this.sgitprefere6s = sgitprefere6s;
		this.fncontas = fncontas;
		this.vdclicontases = vdclicontases;
		this.vdvendas = vdvendas;
		this.cpforneceds = cpforneceds;
		this.fnpagars = fnpagars;
		this.vdmodcontrs = vdmodcontrs;
		this.cpcompras = cpcompras;
		this.fncheques = fncheques;
		this.fnrecebers = fnrecebers;
		this.fnbancos = fnbancos;
		this.fnitrecebers = fnitrecebers;
		this.vdclientes = vdclientes;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codbanco", column = @Column(name = "CODBANCO", nullable = false, length = 3)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public FnbancoId getId() {
		return this.id;
	}

	public void setId(FnbancoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODMODBOL", referencedColumnName = "CODMODBOL"),
			@JoinColumn(name = "CODFILIALMB", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPMB", referencedColumnName = "CODEMP") })
	public Fnmodboleto getFnmodboleto() {
		return this.fnmodboleto;
	}

	public void setFnmodboleto(Fnmodboleto fnmodboleto) {
		this.fnmodboleto = fnmodboleto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODBANCOBP", referencedColumnName = "CODBANCO"),
			@JoinColumn(name = "CODFILIALBP", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPBP", referencedColumnName = "CODEMP") })
	public Fnbanco getFnbanco() {
		return this.fnbanco;
	}

	public void setFnbanco(Fnbanco fnbanco) {
		this.fnbanco = fnbanco;
	}

	@Column(name = "NOMEBANCO", nullable = false, length = 40)
	public String getNomebanco() {
		return this.nomebanco;
	}

	public void setNomebanco(String nomebanco) {
		this.nomebanco = nomebanco;
	}

	@Column(name = "DVBANCO", nullable = false, length = 1)
	public char getDvbanco() {
		return this.dvbanco;
	}

	public void setDvbanco(char dvbanco) {
		this.dvbanco = dvbanco;
	}

	@Column(name = "SITEBANCO", length = 80)
	public String getSitebanco() {
		return this.sitebanco;
	}

	public void setSitebanco(String sitebanco) {
		this.sitebanco = sitebanco;
	}

	@Column(name = "IMGBOLBANCO")
	public byte[] getImgbolbanco() {
		return this.imgbolbanco;
	}

	public void setImgbolbanco(byte[] imgbolbanco) {
		this.imgbolbanco = imgbolbanco;
	}

	@Column(name = "IMGBOLBANCO2")
	public byte[] getImgbolbanco2() {
		return this.imgbolbanco2;
	}

	public void setImgbolbanco2(byte[] imgbolbanco2) {
		this.imgbolbanco2 = imgbolbanco2;
	}

	@Column(name = "LAYOUTCHEQBANCO", length = 1000)
	public String getLayoutcheqbanco() {
		return this.layoutcheqbanco;
	}

	public void setLayoutcheqbanco(String layoutcheqbanco) {
		this.layoutcheqbanco = layoutcheqbanco;
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

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnbanco")
	public Set getFncartcobs() {
		return this.fncartcobs;
	}

	public void setFncartcobs(Set fncartcobs) {
		this.fncartcobs = fncartcobs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnbanco")
	public Set getSgitprefere6s() {
		return this.sgitprefere6s;
	}

	public void setSgitprefere6s(Set sgitprefere6s) {
		this.sgitprefere6s = sgitprefere6s;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnbanco")
	public Set getFncontas() {
		return this.fncontas;
	}

	public void setFncontas(Set fncontas) {
		this.fncontas = fncontas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnbanco")
	public Set getVdclicontases() {
		return this.vdclicontases;
	}

	public void setVdclicontases(Set vdclicontases) {
		this.vdclicontases = vdclicontases;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnbanco")
	public Set getVdvendas() {
		return this.vdvendas;
	}

	public void setVdvendas(Set vdvendas) {
		this.vdvendas = vdvendas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnbanco")
	public Set getCpforneceds() {
		return this.cpforneceds;
	}

	public void setCpforneceds(Set cpforneceds) {
		this.cpforneceds = cpforneceds;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnbanco")
	public Set getFnpagars() {
		return this.fnpagars;
	}

	public void setFnpagars(Set fnpagars) {
		this.fnpagars = fnpagars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnbanco")
	public Set getVdmodcontrs() {
		return this.vdmodcontrs;
	}

	public void setVdmodcontrs(Set vdmodcontrs) {
		this.vdmodcontrs = vdmodcontrs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnbanco")
	public Set getCpcompras() {
		return this.cpcompras;
	}

	public void setCpcompras(Set cpcompras) {
		this.cpcompras = cpcompras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnbanco")
	public Set getFncheques() {
		return this.fncheques;
	}

	public void setFncheques(Set fncheques) {
		this.fncheques = fncheques;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnbanco")
	public Set getFnrecebers() {
		return this.fnrecebers;
	}

	public void setFnrecebers(Set fnrecebers) {
		this.fnrecebers = fnrecebers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnbanco")
	public Set getFnbancos() {
		return this.fnbancos;
	}

	public void setFnbancos(Set fnbancos) {
		this.fnbancos = fnbancos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnbanco")
	public Set getFnitrecebers() {
		return this.fnitrecebers;
	}

	public void setFnitrecebers(Set fnitrecebers) {
		this.fnitrecebers = fnitrecebers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnbanco")
	public Set getVdclientes() {
		return this.vdclientes;
	}

	public void setVdclientes(Set vdclientes) {
		this.vdclientes = vdclientes;
	}
*/
}
