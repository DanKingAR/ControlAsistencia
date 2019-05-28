package logica;

import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JProgressBar;

/**
 *
 * @author Dan Arevalo
 */
public class HiloPasos extends Thread {
    
    JProgressBar barra;
    private static final int retraso = 300;

    public HiloPasos(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
    public void run() {
        int minimo = barra.getMinimum();
        int maximo = barra.getMaximum();

        Runnable ejecutor = () -> {
            int valoractual = barra.getValue();
            barra.setValue(valoractual + 1);
        };
        for (int i = minimo; i < maximo; i++) {
            try {
                EventQueue.invokeAndWait(ejecutor);
                Thread.sleep(retraso);
            } catch (InterruptedException | InvocationTargetException ex) {

            }

        }

    }
    
}
