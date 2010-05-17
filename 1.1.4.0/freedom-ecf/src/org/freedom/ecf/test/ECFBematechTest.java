
package org.freedom.ecf.test;

import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;

import org.freedom.ecf.driver.ECFBematech;

public class ECFBematechTest extends TestCase {

	public ECFBematechTest( String name ) {

		super( name );
	}

	public void testComandosDeInicializacao() {

		ECFBematech ecf = new ECFBematech( "COM1" );

		assertTrue( trataRetornoFuncao( ecf.alteraSimboloMoeda( "R" ) ) );

		assertTrue( trataRetornoFuncao( ecf.adicaoDeAliquotaTriburaria( "0001", ECFBematech.ICMS ) ) );

		assertTrue( trataRetornoFuncao( ecf.programaHorarioVerao() ) );

		assertTrue( trataRetornoFuncao( ecf.nomeiaTotalizadorNaoSujeitoICMS( 4, "Totalizador teste" ) ) );

		assertTrue( trataRetornoFuncao( ecf.programaTruncamentoArredondamento( '1' ) ) );

		assertTrue( trataRetornoFuncao( ecf.programarEspacoEntreLinhas( 8 ) ) );

		assertTrue( trataRetornoFuncao( ecf.programarLinhasEntreCupons( 5 ) ) );

		assertTrue( trataRetornoFuncao( ecf.nomeiaDepartamento( 2, "Teste" ) ) );
	}

	public void testComandosDeCupomFiscal() {

		ECFBematech ecf = new ECFBematech( "COM1" );

		System.out.print( "aberturaDeCupom > " );
		assertTrue( trataRetornoFuncao( ecf.aberturaDeCupom() ) );

		System.out.print( "aberturaDeCupom String > " );
		assertTrue( trataRetornoFuncao( ecf.aberturaDeCupom( "00.000.000/0000-00 CNPJ e nome do Cliente" ) ) );

		System.out.print( "programaUnidadeMedida > " );
		assertTrue( trataRetornoFuncao( ecf.programaUnidadeMedida( "Kg" ) ) );

		System.out.print( "vendaItem > " );
		assertTrue( trataRetornoFuncao( ecf.vendaItem( 
				"0000000000001", "Produto Teste                ", "FF", 'I', 1f, 10f, 'D', 0f ) ) );

		System.out.print( "cancelaItemAnterior > " );
		assertTrue( trataRetornoFuncao( ecf.cancelaItemAnterior() ) );

		System.out.print( "aumentaDescItem > " ); 
		assertTrue( trataRetornoFuncao( ecf.aumentaDescItem( 
				"Descricao do item aumentada para 60 caracteres" ) ) );
		 
		System.out.print( "vendaItemTresCasas > " ); 
		assertTrue( trataRetornoFuncao( ecf.vendaItemTresCasas( 
				"1234567890002", "Produto Teste                ", "FF", 'I', 2f, 2.050f, 'D', 0.10f ) ) );
		
		System.out.print( "vendaItemDepartamento > " ); 
		assertTrue( trataRetornoFuncao( ecf.vendaItemDepartamento( 
				"FF", 1f, 10f, 0.50f, 0.50f, 2, "Kg", "1234567890003", "Descricao do produto" ) ) ); 
		 
		System.out.print( "cancelaItemGenerico 2 > " ); 
		assertTrue( trataRetornoFuncao( ecf.cancelaItemGenerico( 2 ) ) );		

		System.out.print( "iniciaFechamentoCupom > " );
		assertTrue( trataRetornoFuncao( ecf.iniciaFechamentoCupom( ECFBematech.ACRECIMO_VALOR, 0.50f ) ) );

		System.out.print( "efetuaFormaPagamento Dinheiro > " );
		assertTrue( trataRetornoFuncao( ecf.efetuaFormaPagamento( "01", 5.00f, null ) ) );

		System.out.print( "programaFormaPagamento > " ); 
		String f2 = ecf.programaFormaPagamento( "Cheque          " ); 
		System.out.println( f2 );
		assertTrue( ! "".equals( f2 ) );

		System.out.print( "efetuaFormaPagamento Cheque > " ); 
		assertTrue( trataRetornoFuncao( ecf.efetuaFormaPagamento( f2, 5.50f, "Cheque          " ) ) );

		System.out.print( "estornoFormaPagamento > " ); 
		assertTrue( trataRetornoFuncao( ecf.estornoFormaPagamento( "Cheque          ", "Dinheiro", 5.50f ) ) );
		
		System.out.print( "finalizaFechamentoCupom > " );
		assertTrue( trataRetornoFuncao( ecf.finalizaFechamentoCupom( "Obrigado e volte sempre pra testar!" ) ) );

		//System.out.print( "cancelaCupom > " ); 
		//assertTrue( trataRetornoFuncao( ecf.cancelaCupom() ) );
	}
	
	public void testComandosDeOperacoesNaoFiscais() {

		ECFBematech ecf = new ECFBematech( "COM1" );
		
		System.out.print( "relatorioGerencial > " ); 
		assertTrue( trataRetornoFuncao( ecf.relatorioGerencial( 
				"Abrindo Relatorio Gerencial" ) ) );	
		
		System.out.print( "relatorioGerencial usando > " ); 
		assertTrue( trataRetornoFuncao( ecf.relatorioGerencial( 
				"Utilizando Relatorio Gerencial" ) ) );	
		
		System.out.print( "fechamentoRelatorioGerencial > " ); 
		assertTrue( trataRetornoFuncao( ecf.fechamentoRelatorioGerencial() ) );
		
		System.out.print( "comprovanteNFiscalNVinculado suprimento > " ); 
		assertTrue( trataRetornoFuncao( ecf.comprovanteNFiscalNVinculado( ECFBematech.SUPRIMENTO, 50f, "Dinheiro        " ) ) );
		
		System.out.print( "comprovanteNFiscalNVinculado sangria > " ); 
		assertTrue( trataRetornoFuncao( ecf.comprovanteNFiscalNVinculado( ECFBematech.SANGRIA, 45f, "Dinheiro        " ) ) );
		
		System.out.print( "comprovanteNFiscalNVinculado n�o ICMS > " ); 
		assertTrue( trataRetornoFuncao( ecf.comprovanteNFiscalNVinculado( "02", 35f, "Dinheiro        " ) ) );
		
		testComandosDeCupomFiscal();
		System.out.print( "abreComprovanteNFiscalVinculado > " ); 
		assertTrue( trataRetornoFuncao( ecf.abreComprovanteNFiscalVinculado( "Cheque          ", 5.5f, Integer.parseInt( ecf.retornoNumeroCupom() ) ) ) );
		
		System.out.print( "usaComprovanteNFiscalVinculado > " ); 
		assertTrue( trataRetornoFuncao( ecf.usaComprovanteNFiscalVinculado( 
				"Usando o Comprovante Nao fiscal Vinculado" ) ) );		

		System.out.print( "fechamentoRelatorioGerencial > " ); 
		assertTrue( trataRetornoFuncao( ecf.fechamentoRelatorioGerencial() ) );
	}
	
	public void testComandosDeAutenticacao() {
		
		ECFBematech ecf = new ECFBematech( "COM1" );
		
		System.out.print( "programaCaracterParaAutenticacao > " ); 
		//int [] sesc = {143,137,137,249,0,255,137,137,137,0,143,137,137,249,0,255,129,129 };
		int [] sesc = {1,2,4,8,16,32,64,128,64,32,16,8,4,2,1,129,129,129 };
		assertTrue( trataRetornoFuncao( ecf.programaCaracterParaAutenticacao( sesc ) ) );	
		
		testComandosDeCupomFiscal();
		System.out.print( "autenticacaoDeDocumento > " ); 
		assertTrue( trataRetornoFuncao( ecf.autenticacaoDeDocumento() ) );
	}
	
	public void testComandosDeRelatoriosFiscais() {
		
		ECFBematech ecf = new ECFBematech( "COM1" );
		
		System.out.print( "leituraX > " ); 
		assertTrue( trataRetornoFuncao( ecf.leituraX() ) );		
		
		System.out.print( "leituraXSerial > " ); 
		assertTrue( trataRetornoFuncao( ecf.leituraXSerial() ) );
		System.out.println( new String( ecf.getBytesLidos() ) );
		
		Calendar cal = Calendar.getInstance();
		Date hoje = cal.getTime();
		cal.set( Calendar.MONTH, cal.get( Calendar.MONTH ) - 1 );
		Date antes = cal.getTime();
		
		System.out.print( "leituraMemoriaFiscal data > " );
		assertTrue( trataRetornoFuncao( ecf.leituraMemoriaFiscal( antes, hoje, ECFBematech.IMPRESSAO ) ) );
		System.out.println( new String( ecf.getBytesLidos() ) );
		
		System.out.print( "leituraMemoriaFiscal data retorno > " );
		assertTrue( trataRetornoFuncao( ecf.leituraMemoriaFiscal( antes, hoje, ECFBematech.RETORNO ) ) );
		System.out.println( new String( ecf.getBytesLidos() ) );
		
		System.out.print( "leituraMemoriaFiscal redu��o > " ); 
		assertTrue( trataRetornoFuncao( ecf.leituraMemoriaFiscal( 605, 610, ECFBematech.IMPRESSAO ) ) );
		System.out.println( new String( ecf.getBytesLidos() ) );
		
		System.out.print( "leituraMemoriaFiscal redu��o retorno > " ); 
		assertTrue( trataRetornoFuncao( ecf.leituraMemoriaFiscal( 605, 610, ECFBematech.RETORNO ) ) );
		System.out.println( new String( ecf.getBytesLidos() ) );

		System.out.print( "reducaoZ > " ); 
		assertTrue( trataRetornoFuncao( ecf.reducaoZ() ) );
	}

	public void testComandosDeInformacoesDaImpressora() {

		ECFBematech ecf = new ECFBematech( "COM1" );
		
		System.out.print( "leitura do estado > " ); 
		System.out.println( ecf.getStatus() );	
		
		System.out.print( "retorno de aliquotas > " ); 
		System.out.println( ecf.retornoAliquotas() );	
		
		System.out.print( "retorno de totalizadores parcias > " ); 
		System.out.println( ecf.retornoTotalizadoresParciais() );	
		
		System.out.print( "retorno de n�mero do cupom > " ); 
		System.out.println( ecf.retornoNumeroCupom() );	
		
		System.out.println( "retorno de vari�veis > " ); 
		System.out.println( "\tGrande total > " + ecf.retornoVariaveis( ECFBematech.V_GRANDE_TOTAL ) );
		System.out.println( "\tFlags Fiscais > " + ecf.retornoVariaveis( ECFBematech.V_FLAG_FISCAL ) );
		
		System.out.print( "retorno do estado do papel > " ); 
		System.out.println( ecf.retornoEstadoPapel() );	
		
		System.out.print( "retorno da ultima redu��o Z > " ); 
		System.out.println( ecf.retornoUltimaReducao() );	
		
		System.out.print( "sub total > > " ); 
		System.out.println( ecf.retornoSubTotal() );	
	}

	public void testComandosDeImpressaoDeCheques() {

		ECFBematech ecf = new ECFBematech( "COM1" );
		/*
		System.out.print( "programaMoedaSingular > " ); 
		assertTrue( trataRetornoFuncao( ecf.programaMoedaSingular( "Real" ) ) );
		
		System.out.print( "programaMoedaPlural > " ); 
		assertTrue( trataRetornoFuncao( ecf.programaMoedaPlural( "Reais" ) ) );
		*/
		System.out.print( "imprimeCheque > " ); 
		System.out.println( ecf.imprimeCheque( 
				1.30f, "Favorecido                                   ", 
				"Localidade                 ", 19, 11, 2007 ) );
		
		System.out.print( "retornoStatusCheque > " ); 
		System.out.println( ecf.retornoStatusCheque() );
		
	}
	
	public boolean trataRetornoFuncao( final int iRetorno ) {

		boolean bRetorno = false;

		String sMensagem = "";

		switch ( iRetorno ) {

		case -1:
			sMensagem = "Erro na envoca��o do metodo!";
			break;
		case 0:
			sMensagem = "Erro de comunica��o f�sica";
			break;
		case 1:
			sMensagem = "";
			break;
		case -2:
			sMensagem = "Par�metro inv�lido na fun��o.";
			break;
		case -3:
			sMensagem = "Aliquota n�o programada";
			break;
		case -4:
			sMensagem = "O arquivo de inicializa��o BEMAFI32.INI n�o foi encontrado no diret�rio de sistema do Windows";
			break;
		case -5:
			sMensagem = "Erro ao abrir a porta de comunica��o";
			break;
		case -8:
			sMensagem = "Erro ao criar ou gravar no arquivo STATUS.TXT ou RETORNO.TXT";
			break;
		case -27:
			sMensagem = "Status da impressora diferente de 6,0,0 (ACK, ST1 e ST2)";
			break;
		case -30:
			sMensagem = "Fun��o n�o compat�vel com a impressora YANCO";
			break;
		case -31:
			sMensagem = "Forma de pagamento n�o finalizada";
			break;
		default:
			sMensagem = "Retorno indefinido: " + iRetorno;
			break;

		}

		if ( "".equals( sMensagem.trim() ) ) {
			bRetorno = true;
			sMensagem = "COMANDO EXECUTADO";
		} else {
			sMensagem = "[" + iRetorno + "] " + sMensagem;
		}

		System.out.println( sMensagem );

		return bRetorno;
	}
}
