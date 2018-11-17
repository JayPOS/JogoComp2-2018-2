package botoes;

import java.awt.Dimension;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

import janelas.JanelaJogo;

public class Marechal extends JButton {
	
	private static int TAM = JanelaJogo.getTAM_BOTAO();

	public Marechal() {
		super("Marechal");
		this.setPreferredSize(new Dimension(TAM, TAM));
	}

	public Marechal(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

}
