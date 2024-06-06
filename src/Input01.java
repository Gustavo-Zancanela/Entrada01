
import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
            //Create a JOptionPane.
            //Store the input as a String and print it.
        String algo = JOptionPane.showInputDialog("Digite um número");
        System.out.println(algo);
        int algoInteiro = Integer.parseInt(algo);
            //Parse the input as an int.
            //Print its value +1
        algoInteiro++;
        System.out.println(algoInteiro);
        
        
            //Try creating a dialog, parsing it, and initializing an int in a single line.
            //You should have only one semicolon (;) in this line.
        int algo2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        System.out.println(algo2);
        
    }
}
