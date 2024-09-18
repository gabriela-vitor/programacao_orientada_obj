import javax.swing.JOptionPane;

public class trigonometriaTeste{
    public static void main(String[] args){
        //double.parsedouble converte para double
        double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com x para cos(x): "));

        JOptionPane.showMessageDialog(null, "cos("+x+")"+trigonometria.cos(x));

    }
}
