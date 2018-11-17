package botoes;

import javax.swing.*;

import janelas.JanelaJogo;
import principal.*;

import java.awt.*;

public class Bandeira extends JButton {

    private static int TAM = Janela.getTAM_BOTAO();

    public Bandeira() {
        super("Bandeira");
        this.setPreferredSize(new Dimension(TAM, TAM));
    }

    public Bandeira(String text, Icon icon) {
        super(text, icon);
    }
}