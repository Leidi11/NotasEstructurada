import javax.swing.JOptionPane;

public class NotasEstructurada {
    public static void main(String[] args) throws Exception {
        for(int est =1; est <=2; est++) {
            String nombre = JOptionPane.showInputDialog(null, "ingrese el nombre");
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "INGRESE LA NOTA 1"));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "INGRESE LA NOTA 2"));
            float notafinal = (nota1 + nota2) / 2;
            JOptionPane.showMessageDialog(null, "INFORMACION DEL ESTUDIANTE\nNombre: " + nombre + " nota final:" + notafinal);
            if (notafinal <=3 ) {
                JOptionPane.showMessageDialog(null, "el estudiante reprobo el curso");
            }else {
                JOptionPane.showMessageDialog(null, "EL ESTUDIANTE APROBO EL CURSO");
            }
    
        }

        
    }
}
