package janela;

public class MainJanela {
	public static void inicializa(String nome) {
		JanelaJogo janela = new JanelaJogo(nome);
//		janela.setSize();
//		janela.setExtendedState(Frame.MAXIMIZED_BOTH);
		janela.setVisible(true);
	}
	public static void main(String[] args) {
		inicializa("Super Combat");
	}
}
