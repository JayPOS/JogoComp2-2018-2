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
	
	private Jogar jogar = new Jogar();
	
	
	private static int COMPRIMENTO = 800;
	private static int LARGURA = 600;
	private static int TAM_BOTAO = LARGURA/10;
	private static int QTD_BOTAO = 5;
	
	private static int BANDEIRA = 1;
	private static int BOMBA = 2;
	private static int ESPIAO = 3;
	private static int SOLDADO = 4;
	private static int CABO = 5;
	private static int MARECHAL = 6;
	
	private int controleBotao; 
	
	private JButton[][] botoes = new JButton[QTD_BOTAO][QTD_BOTAO];
	
	public JanelaEditor(String nome) {
		super(nome);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, COMPRIMENTO, LARGURA);
		
		// Chamadas de construtores:
		this.addComponentListener(this);
		this.setResizable(false);
		
		this.controleBotao = 0;
		
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
		background.add(this.jogar, BorderLayout.SOUTH);
		
//		background.add(new JLabel("   "), BorderLayout.SOUTH);
//		background.add(new JPanel());
		
		
		for (int i = 0; i < QTD_BOTAO; i++) {
            for (int j = 0; j < QTD_BOTAO; j++) {
                botoes[i][j] = new Vazio();
                botoes[i][j].setPreferredSize(new Dimension(TAM_BOTAO, TAM_BOTAO));
                botoes[i][j].setBackground(new Color(36, 230, 46));
                botoes[i][j].addActionListener(this);
                tabuleiro.add(botoes[i][j]);
            }
        }
		
        detalhes.add(bandeira);
        detalhes.add(bomba);
        detalhes.add(espiao);
        detalhes.add(soldado);
        detalhes.add(cabo);
        detalhes.add(marechal);
        
        // Adicionando ActionListener para os botoes do Editor
        
        this.bandeira.addActionListener(this);
        this.bomba.addActionListener(this);
        this.espiao.addActionListener(this);
        this.soldado.addActionListener(this);
        this.cabo.addActionListener(this);
        this.marechal.addActionListener(this);
        
        this.jogar.addActionListener(this);
        
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
	
	public static int getBANDEIRA() {
		return BANDEIRA;
	}

	public static int getBOMBA() {
		return BOMBA;
	}

	public static int getESPIAO() {
		return ESPIAO;
	}

	public static int getSOLDADO() {
		return SOLDADO;
	}

	public static int getCABO() {
		return CABO;
	}

	public static int getMARECHAL() {
		return MARECHAL;
	}

	
	public int getControleBotao() {
		return controleBotao;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.bandeira) {
			if (this.controleBotao == 0) {
				this.controleBotao = this.getBANDEIRA();
			}
			else if (this.controleBotao == this.getBANDEIRA()) {
				this.controleBotao = 0;
			}
			else {
				this.controleBotao = this.getBANDEIRA();
			}
		}
		else if(e.getSource() == this.bomba) {
			if (this.controleBotao == 0) {
				this.controleBotao = this.getBOMBA();
			}
			else if (this.controleBotao ==  this.getBOMBA()) {
				this.controleBotao = 0;
			}
			else {
				this.controleBotao = this.getBOMBA();
			}
		}
		else if (e.getSource() == this.espiao) {
			if (this.controleBotao == 0) {
				this.controleBotao = this.getESPIAO();
			}
			else if (this.controleBotao == this.getESPIAO()) {
				this.controleBotao = 0;
			}
			else {
				this.controleBotao = this.getESPIAO();
			}
		}
		else if (e.getSource() == this.soldado) {
			if (this.controleBotao == 0) {
				this.controleBotao = this.getSOLDADO();
			}
			else if (this.controleBotao == this.getSOLDADO()){
				this.controleBotao = 0;
			}
			else {
				this.controleBotao = this.getSOLDADO();
			}
		}
		else if (e.getSource() == this.cabo) {
			if (this.controleBotao == 0) {
				this.controleBotao = this.getCABO();
			}
			else if (this.controleBotao == this.getCABO()) {
				this.controleBotao = 0;
			}
			else {
				this.controleBotao = this.getCABO();
			}
		}
		else if (e.getSource() == this.marechal) {
			if (this.controleBotao == 0) {
				this.controleBotao = this.getMARECHAL();
			}
			else if (this.controleBotao == this.getMARECHAL()) {
				this.controleBotao = 0;
			}
			else {
				this.controleBotao = this.getMARECHAL();
			}
		}
		for (int i = 0; i < QTD_BOTAO; i++) {
            for (int j = 0; j < QTD_BOTAO; j++) {
            	if (e.getSource() == this.botoes[i][j] && this.botoes[i][j] instanceof botoes.Vazio) {
            		switch(this.controleBotao) {
            		case 1:
            			this.botoes[i][j] = null;
            			this.botoes[i][j] = new Bandeira();
//            			if (this.botoes[i][j] instanceof botoes.Bandeira) {
//            				System.out.println("É sim");
//            			}
            			this.invalidate();
            			this.validate();
            			this.repaint();
            			break;
            		case 2:
            			this.botoes[i][j] = new Bomba();
            			break;
            		case 3:
            			this.botoes[i][j] = new Espiao();
            			break;
            		case 4:
            			this.botoes[i][j] = new Soldado();
            			break;
            		case 5:
            			this.botoes[i][j] = new CaboArmeiro();
            			break;
            		case 6:
            			this.botoes[i][j] = new Marechal();
            			break;
            		}
            	}
            }
		}
		System.out.println(this.controleBotao);
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
