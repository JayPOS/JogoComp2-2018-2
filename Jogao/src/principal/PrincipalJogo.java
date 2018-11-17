package principal;

import javax.swing.JFrame;
import janelas.*;


public class PrincipalJogo {
	
	private JFrame controladorJanela;
	private static int modoJanela;

	private static int MENU = 0;
    private static int EDITOR = 1;
    private static int ALEATORIO = 2;
    private static int JOGAR = 3;


	public PrincipalJogo() {
		this.modoJanela = this.getEDITOR();
		
	}
	public void inicializaEditor() {
		this.controladorJanela = new JanelaEditor("Super Combat");
		this.controladorJanela.setVisible(true);
	}
	public void inicializaJogao() {
		this.controladorJanela =  new JanelaJogo("Super Combat");
		this.controladorJanela.setVisible(true);
	}

	public static void main(String[] args) {
		PrincipalJogo jogo = new PrincipalJogo();
		if (jogo.getModoJanela() == jogo.getMENU()) {
			
		}
		else if (jogo.modoJanela == jogo.getEDITOR()) {
			jogo.inicializaEditor();
		}
		else if(jogo.getModoJanela() == jogo.getALEATORIO()) {
			
		}
		else if (jogo.modoJanela == jogo.getJOGAR()) {
			jogo.inicializaJogao();
			
		}
	}
	
	public static int getMENU() {
		return MENU;
	}
	public static int getEDITOR() {
		return EDITOR;
	}
	public static int getALEATORIO() {
		return ALEATORIO;
	}
	public static int getJOGAR() {
		return JOGAR;
	}
	public static int getModoJanela() {
		return modoJanela;
	}

}
