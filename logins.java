import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class logins {

    private JTextField usuariotxt;
    private JButton botonok;
    private JPanel jpanel;
    private JPasswordField contraseñatxt;
    String usuario;
    String contraseña;

    public logins() {
        botonok.addActionListener(new ActionListener() {
            //abrir archivo .dat
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(usuario);
                System.out.println(contraseña);
                //crear un nuevo archivo
                File file = new File("C://Users//POO//Documents//registrar.dat");
                try{
                    //Escribir datos dentro de un archivo //file archivo que ya guarde arribaa
                    FileWriter fileWriter = new FileWriter(file,true);
                    //crear otra clase escribri datos para guardar en memoria
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(usuario+":"+contraseña+"\n");
                    //cerrar
                    bufferedWriter.close();
                }catch (IOException exception){
                    System.out.println("Error al registrar el dato");
                }

            }
        });
        usuariotxt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuario=usuariotxt.getText();
            }
        });
        contraseñatxt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contraseña=contraseñatxt.getText();
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Página principal");
        frame.setContentPane(new logins().jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}

