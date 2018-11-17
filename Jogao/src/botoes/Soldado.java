package botoes;

import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.JButton;

import janelas.JanelaJogo;

public class Soldado extends JButton {

	private static int TAM = JanelaJogo.getTAM_BOTAO();
	  
	public Soldado() {
		super("Soldado");
		this.setPreferredSize(new Dimension(TAM, TAM));
		// TODO Auto-generated constructor stub
	}

	public Soldado(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

}
