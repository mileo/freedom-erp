package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cpforneced generated by hbm2java
 */
public class Cpforneced implements java.io.Serializable {

	private CpfornecedId id;
	private Sgfilial sgfilial;
	private Fnhistpad fnhistpad;
	private Sgunifcod sgunifcod;
	private Lftipofisccli lftipofisccli;
	private Cptipofor cptipofor;
	private Fnbanco fnbanco;
	private Sgmunicipio sgmunicipio;
	private String razfor;
	private String nomefor;
	private Date datafor;
	private Character ativofor;
	private char pessoafor;
	private String cnpjfor;
	private String cpffor;
	private String inscfor;
	private String rgfor;
	private String endfor;
	private Integer numfor;
	private String complfor;
	private String bairfor;
	private String cepfor;
	private String cidfor;
	private String uffor;
	private String contfor;
	private String fonefor;
	private String faxfor;
	private String agenciafor;
	private String contafor;
	private String emailfor;
	private String obsfor;
	private String celfor;
	private Character clifor;
	private String sspfor;
	private String dddfonefor;
	private String dddfaxfor;
	private String dddcelfor;
	private String sitefor;
	private String codcontdeb;
	private String codcontcred;
	private String codforcontab;
	private String suframafor;
	private Short nrodependfor;
	private String inscconreg;
	private String codexportador;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqclifors = new HashSet(0);
	private Set eqrecmercs = new HashSet(0);
	private Set fnsublancas = new HashSet(0);
	private Set cptabfors = new HashSet(0);
	private Set sgfilials = new HashSet(0);
	private Set cpcompras = new HashSet(0);
	private Set cpimportacaos = new HashSet(0);
	private Set cpordcompras = new HashSet(0);
	private Set vditcontratofors = new HashSet(0);
	private Set fnpagars = new HashSet(0);
	private Set vdtransps = new HashSet(0);
	private Set sgprefere1s = new HashSet(0);
	private Cphomologfor cphomologfor;
	private Set vdclientefors = new HashSet(0);
	private Set cpprodfors = new HashSet(0);
	private Set fnlancas = new HashSet(0);
	private Set sgeqvclifors = new HashSet(0);

	public Cpforneced() {
	}

	public Cpforneced(CpfornecedId id, Sgfilial sgfilial, Cptipofor cptipofor,
			String razfor, String nomefor, Date datafor, char pessoafor,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.cptipofor = cptipofor;
		this.razfor = razfor;
		this.nomefor = nomefor;
		this.datafor = datafor;
		this.pessoafor = pessoafor;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpforneced(CpfornecedId id, Sgfilial sgfilial, Fnhistpad fnhistpad,
			Sgunifcod sgunifcod, Lftipofisccli lftipofisccli,
			Cptipofor cptipofor, Fnbanco fnbanco, Sgmunicipio sgmunicipio,
			String razfor, String nomefor, Date datafor, Character ativofor,
			char pessoafor, String cnpjfor, String cpffor, String inscfor,
			String rgfor, String endfor, Integer numfor, String complfor,
			String bairfor, String cepfor, String cidfor, String uffor,
			String contfor, String fonefor, String faxfor, String agenciafor,
			String contafor, String emailfor, String obsfor, String celfor,
			Character clifor, String sspfor, String dddfonefor,
			String dddfaxfor, String dddcelfor, String sitefor,
			String codcontdeb, String codcontcred, String codforcontab,
			String suframafor, Short nrodependfor, String inscconreg,
			String codexportador, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set eqclifors,
			Set eqrecmercs, Set fnsublancas, Set cptabfors, Set sgfilials,
			Set cpcompras, Set cpimportacaos, Set cpordcompras,
			Set vditcontratofors, Set fnpagars, Set vdtransps, Set sgprefere1s,
			Cphomologfor cphomologfor, Set vdclientefors, Set cpprodfors,
			Set fnlancas, Set sgeqvclifors) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fnhistpad = fnhistpad;
		this.sgunifcod = sgunifcod;
		this.lftipofisccli = lftipofisccli;
		this.cptipofor = cptipofor;
		this.fnbanco = fnbanco;
		this.sgmunicipio = sgmunicipio;
		this.razfor = razfor;
		this.nomefor = nomefor;
		this.datafor = datafor;
		this.ativofor = ativofor;
		this.pessoafor = pessoafor;
		this.cnpjfor = cnpjfor;
		this.cpffor = cpffor;
		this.inscfor = inscfor;
		this.rgfor = rgfor;
		this.endfor = endfor;
		this.numfor = numfor;
		this.complfor = complfor;
		this.bairfor = bairfor;
		this.cepfor = cepfor;
		this.cidfor = cidfor;
		this.uffor = uffor;
		this.contfor = contfor;
		this.fonefor = fonefor;
		this.faxfor = faxfor;
		this.agenciafor = agenciafor;
		this.contafor = contafor;
		this.emailfor = emailfor;
		this.obsfor = obsfor;
		this.celfor = celfor;
		this.clifor = clifor;
		this.sspfor = sspfor;
		this.dddfonefor = dddfonefor;
		this.dddfaxfor = dddfaxfor;
		this.dddcelfor = dddcelfor;
		this.sitefor = sitefor;
		this.codcontdeb = codcontdeb;
		this.codcontcred = codcontcred;
		this.codforcontab = codforcontab;
		this.suframafor = suframafor;
		this.nrodependfor = nrodependfor;
		this.inscconreg = inscconreg;
		this.codexportador = codexportador;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqclifors = eqclifors;
		this.eqrecmercs = eqrecmercs;
		this.fnsublancas = fnsublancas;
		this.cptabfors = cptabfors;
		this.sgfilials = sgfilials;
		this.cpcompras = cpcompras;
		this.cpimportacaos = cpimportacaos;
		this.cpordcompras = cpordcompras;
		this.vditcontratofors = vditcontratofors;
		this.fnpagars = fnpagars;
		this.vdtransps = vdtransps;
		this.sgprefere1s = sgprefere1s;
		this.cphomologfor = cphomologfor;
		this.vdclientefors = vdclientefors;
		this.cpprodfors = cpprodfors;
		this.fnlancas = fnlancas;
		this.sgeqvclifors = sgeqvclifors;
	}

	public CpfornecedId getId() {
		return this.id;
	}

	public void setId(CpfornecedId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Fnhistpad getFnhistpad() {
		return this.fnhistpad;
	}

	public void setFnhistpad(Fnhistpad fnhistpad) {
		this.fnhistpad = fnhistpad;
	}

	public Sgunifcod getSgunifcod() {
		return this.sgunifcod;
	}

	public void setSgunifcod(Sgunifcod sgunifcod) {
		this.sgunifcod = sgunifcod;
	}

	public Lftipofisccli getLftipofisccli() {
		return this.lftipofisccli;
	}

	public void setLftipofisccli(Lftipofisccli lftipofisccli) {
		this.lftipofisccli = lftipofisccli;
	}

	public Cptipofor getCptipofor() {
		return this.cptipofor;
	}

	public void setCptipofor(Cptipofor cptipofor) {
		this.cptipofor = cptipofor;
	}

	public Fnbanco getFnbanco() {
		return this.fnbanco;
	}

	public void setFnbanco(Fnbanco fnbanco) {
		this.fnbanco = fnbanco;
	}

	public Sgmunicipio getSgmunicipio() {
		return this.sgmunicipio;
	}

	public void setSgmunicipio(Sgmunicipio sgmunicipio) {
		this.sgmunicipio = sgmunicipio;
	}

	public String getRazfor() {
		return this.razfor;
	}

	public void setRazfor(String razfor) {
		this.razfor = razfor;
	}

	public String getNomefor() {
		return this.nomefor;
	}

	public void setNomefor(String nomefor) {
		this.nomefor = nomefor;
	}

	public Date getDatafor() {
		return this.datafor;
	}

	public void setDatafor(Date datafor) {
		this.datafor = datafor;
	}

	public Character getAtivofor() {
		return this.ativofor;
	}

	public void setAtivofor(Character ativofor) {
		this.ativofor = ativofor;
	}

	public char getPessoafor() {
		return this.pessoafor;
	}

	public void setPessoafor(char pessoafor) {
		this.pessoafor = pessoafor;
	}

	public String getCnpjfor() {
		return this.cnpjfor;
	}

	public void setCnpjfor(String cnpjfor) {
		this.cnpjfor = cnpjfor;
	}

	public String getCpffor() {
		return this.cpffor;
	}

	public void setCpffor(String cpffor) {
		this.cpffor = cpffor;
	}

	public String getInscfor() {
		return this.inscfor;
	}

	public void setInscfor(String inscfor) {
		this.inscfor = inscfor;
	}

	public String getRgfor() {
		return this.rgfor;
	}

	public void setRgfor(String rgfor) {
		this.rgfor = rgfor;
	}

	public String getEndfor() {
		return this.endfor;
	}

	public void setEndfor(String endfor) {
		this.endfor = endfor;
	}

	public Integer getNumfor() {
		return this.numfor;
	}

	public void setNumfor(Integer numfor) {
		this.numfor = numfor;
	}

	public String getComplfor() {
		return this.complfor;
	}

	public void setComplfor(String complfor) {
		this.complfor = complfor;
	}

	public String getBairfor() {
		return this.bairfor;
	}

	public void setBairfor(String bairfor) {
		this.bairfor = bairfor;
	}

	public String getCepfor() {
		return this.cepfor;
	}

	public void setCepfor(String cepfor) {
		this.cepfor = cepfor;
	}

	public String getCidfor() {
		return this.cidfor;
	}

	public void setCidfor(String cidfor) {
		this.cidfor = cidfor;
	}

	public String getUffor() {
		return this.uffor;
	}

	public void setUffor(String uffor) {
		this.uffor = uffor;
	}

	public String getContfor() {
		return this.contfor;
	}

	public void setContfor(String contfor) {
		this.contfor = contfor;
	}

	public String getFonefor() {
		return this.fonefor;
	}

	public void setFonefor(String fonefor) {
		this.fonefor = fonefor;
	}

	public String getFaxfor() {
		return this.faxfor;
	}

	public void setFaxfor(String faxfor) {
		this.faxfor = faxfor;
	}

	public String getAgenciafor() {
		return this.agenciafor;
	}

	public void setAgenciafor(String agenciafor) {
		this.agenciafor = agenciafor;
	}

	public String getContafor() {
		return this.contafor;
	}

	public void setContafor(String contafor) {
		this.contafor = contafor;
	}

	public String getEmailfor() {
		return this.emailfor;
	}

	public void setEmailfor(String emailfor) {
		this.emailfor = emailfor;
	}

	public String getObsfor() {
		return this.obsfor;
	}

	public void setObsfor(String obsfor) {
		this.obsfor = obsfor;
	}

	public String getCelfor() {
		return this.celfor;
	}

	public void setCelfor(String celfor) {
		this.celfor = celfor;
	}

	public Character getClifor() {
		return this.clifor;
	}

	public void setClifor(Character clifor) {
		this.clifor = clifor;
	}

	public String getSspfor() {
		return this.sspfor;
	}

	public void setSspfor(String sspfor) {
		this.sspfor = sspfor;
	}

	public String getDddfonefor() {
		return this.dddfonefor;
	}

	public void setDddfonefor(String dddfonefor) {
		this.dddfonefor = dddfonefor;
	}

	public String getDddfaxfor() {
		return this.dddfaxfor;
	}

	public void setDddfaxfor(String dddfaxfor) {
		this.dddfaxfor = dddfaxfor;
	}

	public String getDddcelfor() {
		return this.dddcelfor;
	}

	public void setDddcelfor(String dddcelfor) {
		this.dddcelfor = dddcelfor;
	}

	public String getSitefor() {
		return this.sitefor;
	}

	public void setSitefor(String sitefor) {
		this.sitefor = sitefor;
	}

	public String getCodcontdeb() {
		return this.codcontdeb;
	}

	public void setCodcontdeb(String codcontdeb) {
		this.codcontdeb = codcontdeb;
	}

	public String getCodcontcred() {
		return this.codcontcred;
	}

	public void setCodcontcred(String codcontcred) {
		this.codcontcred = codcontcred;
	}

	public String getCodforcontab() {
		return this.codforcontab;
	}

	public void setCodforcontab(String codforcontab) {
		this.codforcontab = codforcontab;
	}

	public String getSuframafor() {
		return this.suframafor;
	}

	public void setSuframafor(String suframafor) {
		this.suframafor = suframafor;
	}

	public Short getNrodependfor() {
		return this.nrodependfor;
	}

	public void setNrodependfor(Short nrodependfor) {
		this.nrodependfor = nrodependfor;
	}

	public String getInscconreg() {
		return this.inscconreg;
	}

	public void setInscconreg(String inscconreg) {
		this.inscconreg = inscconreg;
	}

	public String getCodexportador() {
		return this.codexportador;
	}

	public void setCodexportador(String codexportador) {
		this.codexportador = codexportador;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	public Set getEqclifors() {
		return this.eqclifors;
	}

	public void setEqclifors(Set eqclifors) {
		this.eqclifors = eqclifors;
	}

	public Set getEqrecmercs() {
		return this.eqrecmercs;
	}

	public void setEqrecmercs(Set eqrecmercs) {
		this.eqrecmercs = eqrecmercs;
	}

	public Set getFnsublancas() {
		return this.fnsublancas;
	}

	public void setFnsublancas(Set fnsublancas) {
		this.fnsublancas = fnsublancas;
	}

	public Set getCptabfors() {
		return this.cptabfors;
	}

	public void setCptabfors(Set cptabfors) {
		this.cptabfors = cptabfors;
	}

	public Set getSgfilials() {
		return this.sgfilials;
	}

	public void setSgfilials(Set sgfilials) {
		this.sgfilials = sgfilials;
	}

	public Set getCpcompras() {
		return this.cpcompras;
	}

	public void setCpcompras(Set cpcompras) {
		this.cpcompras = cpcompras;
	}

	public Set getCpimportacaos() {
		return this.cpimportacaos;
	}

	public void setCpimportacaos(Set cpimportacaos) {
		this.cpimportacaos = cpimportacaos;
	}

	public Set getCpordcompras() {
		return this.cpordcompras;
	}

	public void setCpordcompras(Set cpordcompras) {
		this.cpordcompras = cpordcompras;
	}

	public Set getVditcontratofors() {
		return this.vditcontratofors;
	}

	public void setVditcontratofors(Set vditcontratofors) {
		this.vditcontratofors = vditcontratofors;
	}

	public Set getFnpagars() {
		return this.fnpagars;
	}

	public void setFnpagars(Set fnpagars) {
		this.fnpagars = fnpagars;
	}

	public Set getVdtransps() {
		return this.vdtransps;
	}

	public void setVdtransps(Set vdtransps) {
		this.vdtransps = vdtransps;
	}

	public Set getSgprefere1s() {
		return this.sgprefere1s;
	}

	public void setSgprefere1s(Set sgprefere1s) {
		this.sgprefere1s = sgprefere1s;
	}

	public Cphomologfor getCphomologfor() {
		return this.cphomologfor;
	}

	public void setCphomologfor(Cphomologfor cphomologfor) {
		this.cphomologfor = cphomologfor;
	}

	public Set getVdclientefors() {
		return this.vdclientefors;
	}

	public void setVdclientefors(Set vdclientefors) {
		this.vdclientefors = vdclientefors;
	}

	public Set getCpprodfors() {
		return this.cpprodfors;
	}

	public void setCpprodfors(Set cpprodfors) {
		this.cpprodfors = cpprodfors;
	}

	public Set getFnlancas() {
		return this.fnlancas;
	}

	public void setFnlancas(Set fnlancas) {
		this.fnlancas = fnlancas;
	}

	public Set getSgeqvclifors() {
		return this.sgeqvclifors;
	}

	public void setSgeqvclifors(Set sgeqvclifors) {
		this.sgeqvclifors = sgeqvclifors;
	}

}
