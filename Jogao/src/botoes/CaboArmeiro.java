package botoes;

import java.awt.Dimension;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

import janelas.JanelaJogo;

public class CaboArmeiro extends JButton {
	
	private static int TAM = JanelaJogo.getTAM_BOTAO();

	public CaboArmeiro() {
		super("Cabo Armeiro");
		this.setPreferredSize(new Dimension(TAM, TAM));
		// TODO Auto-generated constructor stub
	}

	public CaboArmeiro(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

}
