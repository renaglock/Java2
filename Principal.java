package clases;
import view.frmMenu;
public class Principal {

    public static void main(String[] args) {
        // Apariencia Windows
        try {
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.windows.WindowsLookAndFeel");
        } catch (Exception e) {
        }
        //Hago Visible el menu
        frmMenu objMenu = new frmMenu();
        objMenu.setVisible(true);
    }

}
