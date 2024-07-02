package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();

		// ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();
		;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();

		Atendente atendente = new Atendente();
		atendente.receberPagamento();
		atendente.servindoMesa();
		// ação que somente o seu pacote cozinha precisa conhecer (default)
		atendente.trocarGas();

		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();

		// não deveria, mas o estabelecimento
		// ainda não definiu normas de atendimento
		cliente.pegarPedidoBalcao();

		// esta ação é muito sigilosa, qua tal ser privada ?
		cliente.consultarSaldoAplicativo();
	}
}