package janela;

public class MainJanela {

    private static int MENU = 0;
    private static int EDITOR = 1;
    private static int ALEATORIO = 2;
    private static int JOGAR = 3;

    private int modoJogo;

    private JanelaJogo janela;

    public MainJanela() {
        this.modoJogo = 0;
    }

    public void inicializa(String nome) {
		janela = new JanelaJogo(nome);
//		janela.setSize();
//		janela.setExtendedState(Frame.MAXIMIZED_BOTH);
		janela.setVisible(true);
	}
	public static void main(String[] args) {
	    MainJanela jogo = new MainJanela();
		jogo.inicializa("Super Combat");
	}
}
