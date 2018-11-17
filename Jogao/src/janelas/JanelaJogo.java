package teste;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Janelinha extends JFrame implements ComponentListener {
	
	private JPanel tabuleiro;
	private JPanel background;
	private JPanel detalhes;
	private GridLayout tabuleirao;
	private BorderLayout teste;
	
	public Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	private static int COMPRIMENTO = 800;
	private static int LARGURA = 600;
	private static int TAM_BOTAO = LARGURA/10;
	private static int QTD_BOTAO = 5;
	
	private JButton[][] botoes = new JButton[QTD_BOTAO][QTD_BOTAO];
	
	public Janelinha(String nome) {
		super(nome);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, COMPRIMENTO, LARGURA);
		
		// Chamadas de construtores:
		this.addComponentListener(this);
		this.setResizable(false);
		tabuleirao = new GridLayout(QTD_BOTAO, QTD_BOTAO);
		teste = new BorderLayout();
		background = new JPanel();
		tabuleiro = new JPanel();
		detalhes = new JPanel();
		detalhes.setBackground(new Color(100, 255, 100));
		detalhes.setPreferredSize(new Dimension(COMPRIMENTO/5, LARGURA));
		tabuleiro.setPreferredSize(new Dimension(TAM_BOTAO*10, TAM_BOTAO*10));
		// Começarei aqui
		
		background.setLayout(teste);
		tabuleiro.setLayout(tabuleirao);
		background.add(tabuleiro, BorderLayout.CENTER);
		background.add(detalhes, BorderLayout.WEST);
//		background.add(new JLabel("   "), BorderLayout.SOUTH);
//		background.add(new JPanel());
		this.getContentPane().add(background);
		for (int i = 0; i < QTD_BOTAO; i++) {
			for (int j = 0; j < QTD_BOTAO; j++) {
				botoes[i][j] = new JButton();
				botoes[i][j].setPreferredSize(new Dimension(TAM_BOTAO, TAM_BOTAO));
				botoes[i][j].setBackground(new Color(50, 255, 50));
				tabuleiro.add(botoes[i][j]);
			}
		}
		this.revalidate();
//		this.repaint();
	}

	public static int getCOMPRIMENTO() {
		return COMPRIMENTO;
	}

	public static int getLARGURA() {
		return LARGURA;
	}

	public static int getTAM_BOTAO() {
		return TAM_BOTAO;
	}

	@Override
	public void componentResized(ComponentEvent e) {
		if(this.getWidth() < COMPRIMENTO) {
			
		}
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
