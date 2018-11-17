package janelas;

import botoes.*;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class JanelaEditor extends JFrame implements ComponentListener, ActionListener {
	
	private JPanel tabuleiro;
	private JPanel background;
	private JPanel detalhes;
	private GridLayout tabuleirao;
	private BorderLayout teste;
	
	private Bandeira bandeira = new Bandeira();
	private Soldado soldado = new Soldado();
	private Bomba bomba = new Bomba();
	private Espiao espiao = new Espiao();
	private CaboArmeiro cabo = new CaboArmeiro();
	private Marechal marechal = new Marechal();
	
	
	private static int COMPRIMENTO = 800;
	private static int LARGURA = 600;
	private static int TAM_BOTAO = LARGURA/10;
	private static int QTD_BOTAO = 5;
	
	private JButton[][] botoes = new JButton[QTD_BOTAO][QTD_BOTAO];
	
	public JanelaEditor(String nome) {
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
		detalhes.setBackground(new Color(145, 255, 117));
		detalhes.setPreferredSize(new Dimension(COMPRIMENTO/5, LARGURA));
		tabuleiro.setPreferredSize(new Dimension(TAM_BOTAO*10, TAM_BOTAO*10));
		// Começarei aqui
		
		background.setLayout(teste);
		tabuleiro.setBorder(new EmptyBorder(5, 5, 5, 5));
		tabuleiro.setLayout(tabuleirao);
		tabuleiro.setBackground(new Color(145, 255, 117));
		detalhes.setBorder(new EmptyBorder(10, 35, 10, 35));
		detalhes.setLayout(new GridLayout(7, 1, 10, 10));
		background.add(tabuleiro, BorderLayout.CENTER);
		background.add(detalhes, BorderLayout.WEST);
		background.add(new Jogar("Jogar"), BorderLayout.SOUTH);
		
		
//		background.add(new JLabel("   "), BorderLayout.SOUTH);
//		background.add(new JPanel());
		
		
		for (int i = 0; i < QTD_BOTAO; i++) {
            for (int j = 0; j < QTD_BOTAO; j++) {
                botoes[i][j] = new Vazio();
                botoes[i][j].setPreferredSize(new Dimension(TAM_BOTAO, TAM_BOTAO));
                botoes[i][j].setBackground(new Color(36, 230, 46));
                tabuleiro.add(botoes[i][j]);
            }
        }
		
        detalhes.add(bandeira);
        detalhes.add(bomba);
        detalhes.add(espiao);
        detalhes.add(soldado);
        detalhes.add(cabo);
        detalhes.add(marechal);
        
        this.getContentPane().add(background);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
