package com.itson.sistema_restaurante_de_comida_rapida;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class OrderScreen extends JFrame {

    private final JTable tabla;
    private final JButton btnAgregar, btnActualizar, btnEliminar;

    public OrderScreen() {
        setTitle("Ordenes");
        setSize(new Dimension(1080, 720));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel main = new JPanel(new BorderLayout());
        main.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        String[] columnas = {"Id", "Nombre", "Precio"};
        Object[][] datos = {
            {1, "Hamburguesa", "$85.00"},
            {2, "Papas Fritas", "$45.00"},
            {3, "Refresco", "$25.00"}
        };

        tabla = new JTable(datos, columnas);
        JScrollPane scrollTabla = new JScrollPane(tabla);
        main.add(scrollTabla, BorderLayout.CENTER);

        JPanel panelControles = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 10));

        btnAgregar = new JButton("Agregar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");

        panelControles.add(btnAgregar);
        panelControles.add(btnActualizar);
        panelControles.add(btnEliminar);

        main.add(panelControles, BorderLayout.SOUTH);

        add(main, BorderLayout.CENTER);

        btnAgregar.addActionListener(e -> JOptionPane.showMessageDialog(this, "Agregar nueva orden!"));
        btnActualizar.addActionListener(e -> JOptionPane.showMessageDialog(this, "Actualizar orden seleccionada!"));
        btnEliminar.addActionListener(e -> JOptionPane.showMessageDialog(this, "Eliminar orden seleccionada!"));
    }

}

class HomeScreen extends JFrame {

    private final JTable tabla;
    private final JButton button1, button2, button3, button4, button5;

    public HomeScreen() {
        setTitle("Sistema Restaurante de Comida Rápida");
        setSize(new Dimension(1440, 720));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel main = new JPanel(new BorderLayout());
        main.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel sidebar = new JPanel(new BorderLayout());
        sidebar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel sidebarContainer = new JPanel(new GridLayout(0, 1, 10, 10));

        button1 = new JButton("Order");
        button2 = new JButton("I am a button!");
        button3 = new JButton("I am a button!");
        button4 = new JButton("I am a button!");
        button5 = new JButton("I am a button!");

        for (JButton button : new JButton[]{button1, button2, button3, button4, button5}) {
            button.setPreferredSize(new Dimension(200, 35));
            sidebarContainer.add(button);
        }

        sidebar.add(sidebarContainer, BorderLayout.NORTH);

        String[] columnas = {"Id", "Nombre", "Precio"};
        Object[][] datos = {
            {1, "Hamburguesa", "$85.00"},
            {2, "Papas Fritas", "$45.00"},
            {3, "Refresco", "$25.00"}
        };

        tabla = new JTable(datos, columnas);
        JScrollPane scrollTabla = new JScrollPane(tabla);

        main.add(scrollTabla, BorderLayout.CENTER);

        main.add(sidebar, BorderLayout.WEST);

        add(main, BorderLayout.CENTER);

        button1.addActionListener(e -> {
            new OrderScreen().setVisible(true);
        });
    }

}

public class Sistema_Restaurante_de_Comida_Rapida {

    public static void main(String[] args) {

        new HomeScreen().setVisible(true);

    }
}
