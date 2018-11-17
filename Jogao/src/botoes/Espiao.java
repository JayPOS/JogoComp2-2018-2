package botoes;

import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.JButton;

import janelas.JanelaJogo;

public class Espiao extends JButton {
	
	  private static int TAM = JanelaJogo.getTAM_BOTAO();

	public Espiao() {
		super("Espiao");
		this.setPreferredSize(new Dimension(TAM, TAM));
		// TODO Auto-generated constructor stub
	}

	public Espiao(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

}
