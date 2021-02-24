package designpartners.templatemethod.solicitacao;

import designpartners.templatemethod.solicitacao.gerador.GeradorSolicitacao;
import designpartners.templatemethod.solicitacao.gerador.SolicitacaoCadastroPessoaFisica;
import designpartners.templatemethod.solicitacao.gerador.SolicitacaoCadastroPessoaJuridica;
import designpartners.templatemethod.solicitacao.model.Solicitacao;
import designpartners.templatemethod.solicitacao.model.TipoSolicitacao;

public class Main {

	public static void main(String[] args) {

		GeradorSolicitacao gerador = null;
		gerador = new SolicitacaoCadastroPessoaJuridica();
		gerador.criar(new Solicitacao(10, TipoSolicitacao.PJ));

		gerador = new SolicitacaoCadastroPessoaFisica();
		gerador.criar(new Solicitacao(20, TipoSolicitacao.PF));
		
		
	}
}
