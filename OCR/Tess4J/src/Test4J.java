
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thanh
 */
public class Test4J {
    public static void main(String[] args) throws IOException {
         // ImageIO.scanForPlugins(); // for server environment
        
   try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            JOptionPane.showMessageDialog(null, "Cài đặt thư viện look and feel thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }

        frmMain main = new frmMain();
        main.setVisible(true);
    }
    
}
