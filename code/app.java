import java.util.LinkedList;
import javax.swing.JOptionPane;
public class app {
    static LinkedList <cls_pacientes> pacientes = new LinkedList<>();//creación de la lista de pacientes
    public static void main(String[] args) {
        fnt_menuPrincipal(true);
    }
    private static void fnt_pacientes(boolean mp){
        while (mp == true){
            String opcionesPac = JOptionPane.showInputDialog(null, 
            "MENU PACIENTES\n\n1. REGISTRAR\n2. CONSULTAR\n3. SALIR");
            if(opcionesPac.equals("3")){
                mp = false;
            }
            if (opcionesPac.equals("1")){
                boolean sw = false;
                String id = JOptionPane.showInputDialog(null, "ID");
                for (int i = 0; i < pacientes.size(); i++){
                    if (pacientes.get(i).getIdStr().equals(id)){
                        sw = true;
                        break;
                    }
                }
                if (sw == false){
                    String nombre = JOptionPane.showInputDialog(null, "NOMBRE");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "EDAD"));
                    String contacto = JOptionPane.showInputDialog(null, "CONTACTO");
                    String historia = JOptionPane.showInputDialog(null, "HISTORIA");
                    pacientes.add(new cls_pacientes(nombre, id, edad, contacto, historia));
                    JOptionPane.showMessageDialog(null, "Paciente registrado con éxito");
                }else{
                    JOptionPane.showMessageDialog(null, "Este paciente ya se encuentra registrado");
                }
            }
            if (opcionesPac.equals("2")){//Opción consultar
                boolean sw = false;
                int pos = 0;
                String id = JOptionPane.showInputDialog(null, "ID");
                for (int i = 0; i < pacientes.size(); i++){
                    if (pacientes.get(i).getIdStr().equals(id)){
                        sw = true;
                        pos = i;
                        break;
                    }
                }
                if(sw == true){
                    JOptionPane.showMessageDialog(null, 
                    "NOMBRE: " + pacientes.get(pos).getNombreStr() + "\nEDAD: " + pacientes.get(pos).getEdadInt() + "\nCONTACTO: " + pacientes.get(pos).getContactoStr() + "\nHISTORIA: " + pacientes.get(pos).getHistoriaStr());
                }else{
                    JOptionPane.showMessageDialog(null, "Este paciente no se encuentra registrado");
                }
            }
        }
    }
    private static void fnt_menuPrincipal(boolean m){
        while (m == true){
            String opcionesStr = JOptionPane.showInputDialog(null, 
            "MENÚ PRINCIPAL\n\n1. NUEVO PACIENTE\n2. NUEVA CITA\n3. REPORTE\n4. SALIR");
            if (opcionesStr.equals("1")){
                fnt_pacientes(true);
            }
        }
    }
}