import aparelhoTelefonico.Telefone;
import navegadorInternet.Navegador;
import reprodutorMusical.Reprodutor;

public class Iphone implements Reprodutor, Navegador, Telefone {
    public static void main(String[] args) throws Exception {

        Iphone iPhone15 = new Iphone();

        iPhone15.selecionarMusica("Teste!");
        iPhone15.tocar();
        iPhone15.pausar();

        iPhone15.exibirPagina("www.google.com");
        iPhone15.atualizarPagina();
        iPhone15.abrirNovaAba();

        iPhone15.ligar("98 98304-4781");
        iPhone15.atender();
        iPhone15.iniciarCorreioVoz();

    }

    // Implementando os métodos da interface Reprodutor
    @Override
    public void tocar() {
        System.out.println("Tocando Musica...");

    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada!");
    }

    @Override
    public String selecionarMusica(String msc) {
        System.out.println("Musica escolhida: " + msc);
        return msc;
    }

    // Implementando os métodos da interface Navegador
    @Override
    public String exibirPagina(String url) {
        System.out.println("Site: " + url);
        return url;
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Nova aba aberta...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada!");
    }

    // Implementando os métodos da interface Telefone
    @Override
    public String ligar(String numero) {
        System.out.println("Ligando para: " + numero);
        return numero;
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz, você tem 5 recados.");
    }

}
