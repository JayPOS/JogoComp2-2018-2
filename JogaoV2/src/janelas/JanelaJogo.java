package janelas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import botoes.Vazio;
import principal.Janela;

public class JanelaJogo extends JPanel {

	/**
	 * Create the panel.
	 */
	private JPanel tabuleiro;
	private JPanel background;
	private JPanel detalhes;
	private GridLayout tabuleirao;
	private BorderLayout teste;
	
	private static int COMPRIMENTO = Janela.getCOMPRIMENTO();
	private static int LARGURA = Janela.getLARGURA();
	private static int TAM_BOTAO = Janela.getTAM_BOTAO()/10;
	private static int QTD_BOTAO = Janela.getQTD_BOTAO();
	
	private JButton[][] botoes = new JButton[QTD_BOTAO][QTD_BOTAO];
	
	public JanelaJogo() {
		// Chamada de constritores:
		super();
		tabuleirao = new GridLayout(QTD_BOTAO, QTD_BOTAO);
		teste = new BorderLayout();
		background = new JPanel();
		tabuleiro = new JPanel();
		detalhes = new JPanel();
		detalhes.setBackground(new Color(145, 255, 117));
		detalhes.setPreferredSize(new Dimension(COMPRIMENTO/5, LARGURA));
		tabuleiro.setPreferredSize(new Dimension(TAM_BOTAO*10, TAM_BOTAO*10));
		
		// Começarei aqui
		background.setLayout(teste);
		tabuleiro.setLayout(tabuleirao);
		detalhes.setLayout(new GridLayout(6, 1, 10, 10));
		background.add(tabuleiro, BorderLayout.CENTER);
		background.add(detalhes, BorderLayout.WEST);
		
		for (int i = 0; i < QTD_BOTAO; i++) {
            for (int j = 0; j < QTD_BOTAO; j++) {
                botoes[i][j] = new Vazio();
                botoes[i][j].setPreferredSize(new Dimension(TAM_BOTAO, TAM_BOTAO));
                botoes[i][j].setBackground(new Color(68, 255, 75));
                tabuleiro.add(botoes[i][j]);
            }
        }

	}

}
