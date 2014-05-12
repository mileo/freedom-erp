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
 * Atatendente generated by hbm2java
 */
@Entity
@Table(name = "ATATENDENTE")
public class Atatendente implements java.io.Serializable {

	private AtatendenteId id;
	private Sgfilial sgfilial;
	private Rhempregado rhempregado;
	private Vdvendedor vdvendedor;
	private Sgusuario sgusuario;
	private String nomeatend;
	private int codempta;
	private short codfilialta;
	private int codtpatend;
	private String rgatend;
	private String endatend;
	private String bairatend;
	private String cidatend;
	private String cepatend;
	private String foneatend;
	private String faxatend;
	private String emailatend;
	private Integer numatend;
	private String ufatend;
	private String celatend;
	private String identificatend;
	private String cpfatend;
	private BigDecimal metaatend;
	private char partpremiatend;
	private char acesatdolerout;
	private char acesatdoaltout;
	private char acesatdodellan;
	private char acesatdodelout;
	private char acesrelestout;
	private char acestrocomis;
	private char acestrocomisout;
	private char aceschamlerout;
	private char aceschamaltout;
	private char aceschamdellan;
	private char aceschamaltpro;
	private char aceschamdelout;
	private char aceschamfinpro;
	private char aceschamfinout;
	private Date dtins;
	private String idusuins;
	private Date dtalt;
	private String idusualt;
	private Date hins;
	private Date halt;
	private Set tkhistoricos = new HashSet(0);
	private Set eqrecmercs = new HashSet(0);
	private Set atsetoratendentes = new HashSet(0);
	private Set crchamados = new HashSet(0);
	private Set vdorcamentos = new HashSet(0);
	private Set sgprefere2s = new HashSet(0);
	private Set atatendimentos = new HashSet(0);

	public Atatendente() {
	}

	public Atatendente(AtatendenteId id, Sgfilial sgfilial, String nomeatend,
			int codempta, short codfilialta, int codtpatend,
			BigDecimal metaatend, char partpremiatend, char acesatdolerout,
			char acesatdoaltout, char acesatdodellan, char acesatdodelout,
			char acesrelestout, char acestrocomis, char acestrocomisout,
			char aceschamlerout, char aceschamaltout, char aceschamdellan,
			char aceschamaltpro, char aceschamdelout, char aceschamfinpro,
			char aceschamfinout) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.nomeatend = nomeatend;
		this.codempta = codempta;
		this.codfilialta = codfilialta;
		this.codtpatend = codtpatend;
		this.metaatend = metaatend;
		this.partpremiatend = partpremiatend;
		this.acesatdolerout = acesatdolerout;
		this.acesatdoaltout = acesatdoaltout;
		this.acesatdodellan = acesatdodellan;
		this.acesatdodelout = acesatdodelout;
		this.acesrelestout = acesrelestout;
		this.acestrocomis = acestrocomis;
		this.acestrocomisout = acestrocomisout;
		this.aceschamlerout = aceschamlerout;
		this.aceschamaltout = aceschamaltout;
		this.aceschamdellan = aceschamdellan;
		this.aceschamaltpro = aceschamaltpro;
		this.aceschamdelout = aceschamdelout;
		this.aceschamfinpro = aceschamfinpro;
		this.aceschamfinout = aceschamfinout;
	}

	public Atatendente(AtatendenteId id, Sgfilial sgfilial,
			Rhempregado rhempregado, Vdvendedor vdvendedor,
			Sgusuario sgusuario, String nomeatend, int codempta,
			short codfilialta, int codtpatend, String rgatend, String endatend,
			String bairatend, String cidatend, String cepatend,
			String foneatend, String faxatend, String emailatend,
			Integer numatend, String ufatend, String celatend,
			String identificatend, String cpfatend, BigDecimal metaatend,
			char partpremiatend, char acesatdolerout, char acesatdoaltout,
			char acesatdodellan, char acesatdodelout, char acesrelestout,
			char acestrocomis, char acestrocomisout, char aceschamlerout,
			char aceschamaltout, char aceschamdellan, char aceschamaltpro,
			char aceschamdelout, char aceschamfinpro, char aceschamfinout,
			Date dtins, String idusuins, Date dtalt, String idusualt,
			Date hins, Date halt, Set tkhistoricos, Set eqrecmercs,
			Set atsetoratendentes, Set crchamados, Set vdorcamentos,
			Set sgprefere2s, Set atatendimentos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.rhempregado = rhempregado;
		this.vdvendedor = vdvendedor;
		this.sgusuario = sgusuario;
		this.nomeatend = nomeatend;
		this.codempta = codempta;
		this.codfilialta = codfilialta;
		this.codtpatend = codtpatend;
		this.rgatend = rgatend;
		this.endatend = endatend;
		this.bairatend = bairatend;
		this.cidatend = cidatend;
		this.cepatend = cepatend;
		this.foneatend = foneatend;
		this.faxatend = faxatend;
		this.emailatend = emailatend;
		this.numatend = numatend;
		this.ufatend = ufatend;
		this.celatend = celatend;
		this.identificatend = identificatend;
		this.cpfatend = cpfatend;
		this.metaatend = metaatend;
		this.partpremiatend = partpremiatend;
		this.acesatdolerout = acesatdolerout;
		this.acesatdoaltout = acesatdoaltout;
		this.acesatdodellan = acesatdodellan;
		this.acesatdodelout = acesatdodelout;
		this.acesrelestout = acesrelestout;
		this.acestrocomis = acestrocomis;
		this.acestrocomisout = acestrocomisout;
		this.aceschamlerout = aceschamlerout;
		this.aceschamaltout = aceschamaltout;
		this.aceschamdellan = aceschamdellan;
		this.aceschamaltpro = aceschamaltpro;
		this.aceschamdelout = aceschamdelout;
		this.aceschamfinpro = aceschamfinpro;
		this.aceschamfinout = aceschamfinout;
		this.dtins = dtins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.idusualt = idusualt;
		this.hins = hins;
		this.halt = halt;
		this.tkhistoricos = tkhistoricos;
		this.eqrecmercs = eqrecmercs;
		this.atsetoratendentes = atsetoratendentes;
		this.crchamados = crchamados;
		this.vdorcamentos = vdorcamentos;
		this.sgprefere2s = sgprefere2s;
		this.atatendimentos = atatendimentos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codatend", column = @Column(name = "CODATEND", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public AtatendenteId getId() {
		return this.id;
	}

	public void setId(AtatendenteId id) {
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
			@JoinColumn(name = "MATEMPR", referencedColumnName = "MATEMPR"),
			@JoinColumn(name = "CODFILIALEP", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPEP", referencedColumnName = "CODEMP") })
	public Rhempregado getRhempregado() {
		return this.rhempregado;
	}

	public void setRhempregado(Rhempregado rhempregado) {
		this.rhempregado = rhempregado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVEND", referencedColumnName = "CODVEND"),
			@JoinColumn(name = "CODFILIALVE", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPVE", referencedColumnName = "CODEMP") })
	public Vdvendedor getVdvendedor() {
		return this.vdvendedor;
	}

	public void setVdvendedor(Vdvendedor vdvendedor) {
		this.vdvendedor = vdvendedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "IDUSU", referencedColumnName = "IDUSU"),
			@JoinColumn(name = "CODFILIALUS", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPUS", referencedColumnName = "CODEMP") })
	public Sgusuario getSgusuario() {
		return this.sgusuario;
	}

	public void setSgusuario(Sgusuario sgusuario) {
		this.sgusuario = sgusuario;
	}

	@Column(name = "NOMEATEND", nullable = false, length = 50)
	public String getNomeatend() {
		return this.nomeatend;
	}

	public void setNomeatend(String nomeatend) {
		this.nomeatend = nomeatend;
	}

	@Column(name = "CODEMPTA", nullable = false)
	public int getCodempta() {
		return this.codempta;
	}

	public void setCodempta(int codempta) {
		this.codempta = codempta;
	}

	@Column(name = "CODFILIALTA", nullable = false)
	public short getCodfilialta() {
		return this.codfilialta;
	}

	public void setCodfilialta(short codfilialta) {
		this.codfilialta = codfilialta;
	}

	@Column(name = "CODTPATEND", nullable = false)
	public int getCodtpatend() {
		return this.codtpatend;
	}

	public void setCodtpatend(int codtpatend) {
		this.codtpatend = codtpatend;
	}

	@Column(name = "RGATEND", length = 13)
	public String getRgatend() {
		return this.rgatend;
	}

	public void setRgatend(String rgatend) {
		this.rgatend = rgatend;
	}

	@Column(name = "ENDATEND", length = 50)
	public String getEndatend() {
		return this.endatend;
	}

	public void setEndatend(String endatend) {
		this.endatend = endatend;
	}

	@Column(name = "BAIRATEND", length = 30)
	public String getBairatend() {
		return this.bairatend;
	}

	public void setBairatend(String bairatend) {
		this.bairatend = bairatend;
	}

	@Column(name = "CIDATEND", length = 30)
	public String getCidatend() {
		return this.cidatend;
	}

	public void setCidatend(String cidatend) {
		this.cidatend = cidatend;
	}

	@Column(name = "CEPATEND", length = 8)
	public String getCepatend() {
		return this.cepatend;
	}

	public void setCepatend(String cepatend) {
		this.cepatend = cepatend;
	}

	@Column(name = "FONEATEND", length = 12)
	public String getFoneatend() {
		return this.foneatend;
	}

	public void setFoneatend(String foneatend) {
		this.foneatend = foneatend;
	}

	@Column(name = "FAXATEND", length = 9)
	public String getFaxatend() {
		return this.faxatend;
	}

	public void setFaxatend(String faxatend) {
		this.faxatend = faxatend;
	}

	@Column(name = "EMAILATEND", length = 60)
	public String getEmailatend() {
		return this.emailatend;
	}

	public void setEmailatend(String emailatend) {
		this.emailatend = emailatend;
	}

	@Column(name = "NUMATEND")
	public Integer getNumatend() {
		return this.numatend;
	}

	public void setNumatend(Integer numatend) {
		this.numatend = numatend;
	}

	@Column(name = "UFATEND", length = 2)
	public String getUfatend() {
		return this.ufatend;
	}

	public void setUfatend(String ufatend) {
		this.ufatend = ufatend;
	}

	@Column(name = "CELATEND", length = 9)
	public String getCelatend() {
		return this.celatend;
	}

	public void setCelatend(String celatend) {
		this.celatend = celatend;
	}

	@Column(name = "IDENTIFICATEND", length = 18)
	public String getIdentificatend() {
		return this.identificatend;
	}

	public void setIdentificatend(String identificatend) {
		this.identificatend = identificatend;
	}

	@Column(name = "CPFATEND", length = 11)
	public String getCpfatend() {
		return this.cpfatend;
	}

	public void setCpfatend(String cpfatend) {
		this.cpfatend = cpfatend;
	}

	@Column(name = "METAATEND", nullable = false, precision = 15, scale = 5)
	public BigDecimal getMetaatend() {
		return this.metaatend;
	}

	public void setMetaatend(BigDecimal metaatend) {
		this.metaatend = metaatend;
	}

	@Column(name = "PARTPREMIATEND", nullable = false, length = 1)
	public char getPartpremiatend() {
		return this.partpremiatend;
	}

	public void setPartpremiatend(char partpremiatend) {
		this.partpremiatend = partpremiatend;
	}

	@Column(name = "ACESATDOLEROUT", nullable = false, length = 1)
	public char getAcesatdolerout() {
		return this.acesatdolerout;
	}

	public void setAcesatdolerout(char acesatdolerout) {
		this.acesatdolerout = acesatdolerout;
	}

	@Column(name = "ACESATDOALTOUT", nullable = false, length = 1)
	public char getAcesatdoaltout() {
		return this.acesatdoaltout;
	}

	public void setAcesatdoaltout(char acesatdoaltout) {
		this.acesatdoaltout = acesatdoaltout;
	}

	@Column(name = "ACESATDODELLAN", nullable = false, length = 1)
	public char getAcesatdodellan() {
		return this.acesatdodellan;
	}

	public void setAcesatdodellan(char acesatdodellan) {
		this.acesatdodellan = acesatdodellan;
	}

	@Column(name = "ACESATDODELOUT", nullable = false, length = 1)
	public char getAcesatdodelout() {
		return this.acesatdodelout;
	}

	public void setAcesatdodelout(char acesatdodelout) {
		this.acesatdodelout = acesatdodelout;
	}

	@Column(name = "ACESRELESTOUT", nullable = false, length = 1)
	public char getAcesrelestout() {
		return this.acesrelestout;
	}

	public void setAcesrelestout(char acesrelestout) {
		this.acesrelestout = acesrelestout;
	}

	@Column(name = "ACESTROCOMIS", nullable = false, length = 1)
	public char getAcestrocomis() {
		return this.acestrocomis;
	}

	public void setAcestrocomis(char acestrocomis) {
		this.acestrocomis = acestrocomis;
	}

	@Column(name = "ACESTROCOMISOUT", nullable = false, length = 1)
	public char getAcestrocomisout() {
		return this.acestrocomisout;
	}

	public void setAcestrocomisout(char acestrocomisout) {
		this.acestrocomisout = acestrocomisout;
	}

	@Column(name = "ACESCHAMLEROUT", nullable = false, length = 1)
	public char getAceschamlerout() {
		return this.aceschamlerout;
	}

	public void setAceschamlerout(char aceschamlerout) {
		this.aceschamlerout = aceschamlerout;
	}

	@Column(name = "ACESCHAMALTOUT", nullable = false, length = 1)
	public char getAceschamaltout() {
		return this.aceschamaltout;
	}

	public void setAceschamaltout(char aceschamaltout) {
		this.aceschamaltout = aceschamaltout;
	}

	@Column(name = "ACESCHAMDELLAN", nullable = false, length = 1)
	public char getAceschamdellan() {
		return this.aceschamdellan;
	}

	public void setAceschamdellan(char aceschamdellan) {
		this.aceschamdellan = aceschamdellan;
	}

	@Column(name = "ACESCHAMALTPRO", nullable = false, length = 1)
	public char getAceschamaltpro() {
		return this.aceschamaltpro;
	}

	public void setAceschamaltpro(char aceschamaltpro) {
		this.aceschamaltpro = aceschamaltpro;
	}

	@Column(name = "ACESCHAMDELOUT", nullable = false, length = 1)
	public char getAceschamdelout() {
		return this.aceschamdelout;
	}

	public void setAceschamdelout(char aceschamdelout) {
		this.aceschamdelout = aceschamdelout;
	}

	@Column(name = "ACESCHAMFINPRO", nullable = false, length = 1)
	public char getAceschamfinpro() {
		return this.aceschamfinpro;
	}

	public void setAceschamfinpro(char aceschamfinpro) {
		this.aceschamfinpro = aceschamfinpro;
	}

	@Column(name = "ACESCHAMFINOUT", nullable = false, length = 1)
	public char getAceschamfinout() {
		return this.aceschamfinout;
	}

	public void setAceschamfinout(char aceschamfinout) {
		this.aceschamfinout = aceschamfinout;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Column(name = "IDUSUINS", length = 8)
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

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "atatendente")
	public Set getTkhistoricos() {
		return this.tkhistoricos;
	}
*/
	public void setTkhistoricos(Set tkhistoricos) {
		this.tkhistoricos = tkhistoricos;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "atatendente")
	public Set getEqrecmercs() {
		return this.eqrecmercs;
	}

	public void setEqrecmercs(Set eqrecmercs) {
		this.eqrecmercs = eqrecmercs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "atatendente")
	public Set getAtsetoratendentes() {
		return this.atsetoratendentes;
	}

	public void setAtsetoratendentes(Set atsetoratendentes) {
		this.atsetoratendentes = atsetoratendentes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "atatendente")
	public Set getCrchamados() {
		return this.crchamados;
	}
*/
	public void setCrchamados(Set crchamados) {
		this.crchamados = crchamados;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "atatendente")
	public Set getVdorcamentos() {
		return this.vdorcamentos;
	}

	public void setVdorcamentos(Set vdorcamentos) {
		this.vdorcamentos = vdorcamentos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "atatendente")
	public Set getSgprefere2s() {
		return this.sgprefere2s;
	}

	public void setSgprefere2s(Set sgprefere2s) {
		this.sgprefere2s = sgprefere2s;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "atatendente")
	public Set getAtatendimentos() {
		return this.atatendimentos;
	}

	public void setAtatendimentos(Set atatendimentos) {
		this.atatendimentos = atatendimentos;
	}*/

}
