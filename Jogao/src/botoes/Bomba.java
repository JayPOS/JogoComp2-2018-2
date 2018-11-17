package botoes;

import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.JButton;

import janelas.JanelaJogo;

public class Bomba extends JButton {

	private static int TAM = JanelaJogo.getTAM_BOTAO();

	public Bomba() {
		super("Bomba");
		this.setPreferredSize(new Dimension(TAM, TAM));
		// TODO Auto-generated constructor stub
	}

	public Bomba(Icon arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
