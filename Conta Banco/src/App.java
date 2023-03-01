import javax.sound.midi.Soundbank;
import javax.swing.SpinnerDateModel;

public class App {

    public static void main(String[] args) {
       
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(134153);
        p1.setDono("Mohamed");
        p1.estadoAdual();
    }

}
