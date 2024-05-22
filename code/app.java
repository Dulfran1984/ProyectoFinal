import java.util.LinkedList;
import javax.swing.JOptionPane;
public class app {
    static LinkedList <cls_pacientes> pacientes = new LinkedList<>();//creación de la lista de pacientes
    public static void main(String[] args) {
        fnt_menuPrincipal(true);
    }
    private static void fnt_pacientes(){
        String opcionesPac = JOptionPane.showInputDialog(null, 
            "MENU PACIENTES\n\n1. REGISTRAR\n2. CONSULTAR\3. SALIR");
            if (opcionesPac.equals("1")){
                String nombre = JOptionPane.showInputDialog(null, "NOMBRE");
                String id = JOptionPane.showInputDialog(null, "ID");
                int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "EDAD"));
                String contacto = JOptionPane.showInputDialog(null, "CONTACTO");
                String historia = JOptionPane.showInputDialog(null, "HISTORIA");
                pacientes.add(new cls_pacientes(nombre, id, edad, contacto, historia));
                JOptionPane.showMessageDialog(null, "Paciente registrado con éxito");
            }
    }
    private static void fnt_menuPrincipal(boolean m){
        while (m == true){
            String opcionesStr = JOptionPane.showInputDialog(null, 
            "MENÚ PRINCIPAL\n\n1. NUEVO PACIENTE\n2. NUEVA CITA\n3. REPORTE\n4. SALIR");
            if (opcionesStr.equals("1")){
                fnt_pacientes();
            }
        }
    }
}