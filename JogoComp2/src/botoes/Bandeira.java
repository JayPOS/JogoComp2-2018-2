package botoes;

import javax.swing.*;
import java.awt.*;
import janela.*;

public class Bandeira extends JButton {

    private static int TAM = JanelaJogo.getTAM_BOTAO();

    public Bandeira() {
        super("Bandeira");
        this.setSize(new Dimension(TAM, TAM));
    }

    public Bandeira(String text, Icon icon) {
        super(text, icon);
    }
}
