package com.src.laboratorio_3_nunez;

import javax.swing.*;

public class Laboratorio_6_NunezCardenas {

    // ------------------ Clase Cliente ------------------
    static class Cliente {
        String codigo;
        String nombres;
        String apellidos;
        String telefono;
        String correo;
        String direccion;
        String codigoPostal;

        public Cliente(String codigo, String nombres, String apellidos, String telefono, String correo, String direccion, String codigoPostal) {
            this.codigo = codigo;
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.telefono = telefono;
            this.correo = correo;
            this.direccion = direccion;
            this.codigoPostal = codigoPostal;
        }

        public String getClaveHash() {
            return nombres + apellidos;
        }

        @Override
        public String toString() {
            return "Código: " + codigo + ", Nombre: " + nombres + " " + apellidos +
                    ", Tel: " + telefono + ", Email: " + correo +
                    ", Dirección: " + direccion + ", CP: " + codigoPostal;
        }
    }

    // ------------------ Clase HashUtils ------------------
    static class HashUtils {
        public static int hash(String key, int size) {
            int hash = 7;
            for (char c : key.toCharArray()) {
                hash = hash * 31 + c;
            }
            return Math.abs(hash) % size;
        }
    }

    // ------------------ HashTableLinearProbing ------------------
    static class HashTableLinearProbing {
        private Cliente[] table;
        private int size;

        public HashTableLinearProbing(int size) {
            this.size = size;
            this.table = new Cliente[size];
        }

        public boolean insert(Cliente cliente) {
            int index = HashUtils.hash(cliente.getClaveHash(), size);
            int initialIndex = index;
            do {
                if (table[index] == null) {
                    table[index] = cliente;
                    return true;
                }
                index = (index + 1) % size;
            } while (index != initialIndex);
            return false;
        }

        public Cliente search(String key) {
            int index = HashUtils.hash(key, size);
            int initialIndex = index;
            do {
                if (table[index] == null) return null;
                if (table[index].getClaveHash().equals(key)) {
                    return table[index];
                }
                index = (index + 1) % size;
            } while (index != initialIndex);
            return null;
        }
    }

    // ------------------ BSTNode ------------------
    static class BSTNode {
        Cliente cliente;
        BSTNode left, right;

        public BSTNode(Cliente cliente) {
            this.cliente = cliente;
        }
    }

    // ------------------ BST ------------------
    static class BST {
        private BSTNode root;

        public void insert(Cliente cliente) {
            root = insertRec(root, cliente);
        }

        private BSTNode insertRec(BSTNode node, Cliente cliente) {
            if (node == null) return new BSTNode(cliente);
            if (cliente.getClaveHash().compareTo(node.cliente.getClaveHash()) < 0)
                node.left = insertRec(node.left, cliente);
            else
                node.right = insertRec(node.right, cliente);
            return node;
        }

        public Cliente search(String key) {
            return searchRec(root, key);
        }

        private Cliente searchRec(BSTNode node, String key) {
            if (node == null) return null;
            if (node.cliente.getClaveHash().equals(key)) return node.cliente;
            if (key.compareTo(node.cliente.getClaveHash()) < 0)
                return searchRec(node.left, key);
            else
                return searchRec(node.right, key);
        }
    }

    // ------------------ HashTableBST ------------------
    static class HashTableBST {
        private BST[] table;
        private int size;

        public HashTableBST(int size) {
            this.size = size;
            this.table = new BST[size];
            for (int i = 0; i < size; i++) {
                table[i] = new BST();
            }
        }

        public void insert(Cliente cliente) {
            int index = HashUtils.hash(cliente.getClaveHash(), size);
            table[index].insert(cliente);
        }

        public Cliente search(String key) {
            int index = HashUtils.hash(key, size);
            return table[index].search(key);
        }
    }

    public static void main(String[] args) {
        HashTableLinearProbing linearTable = new HashTableLinearProbing(100);
        HashTableBST bstTable = new HashTableBST(100);

        JFrame frame = new JFrame("Comparación de Métodos Hash");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel[] labels = {
            new JLabel("Código:"), new JLabel("Nombre:"), new JLabel("Apellido:"),
            new JLabel("Teléfono:"), new JLabel("Correo:"), new JLabel("Dirección:"), new JLabel("Código Postal:")
        };

        JTextField[] campos = {
            new JTextField(), new JTextField(), new JTextField(),
            new JTextField(), new JTextField(), new JTextField(), new JTextField()
        };

        JButton botonInsertar = new JButton("Insertar");
        JButton botonBuscar = new JButton("Buscar");

        int y = 30;
        for (int i = 0; i < labels.length; i++) {
            labels[i].setBounds(50, y, 120, 30);
            campos[i].setBounds(180, y, 250, 30);
            frame.add(labels[i]);
            frame.add(campos[i]);
            y += 50;
        }

        botonInsertar.setBounds(80, y, 150, 30);
        botonBuscar.setBounds(250, y, 150, 30);
        frame.add(botonInsertar);
        frame.add(botonBuscar);

        botonInsertar.addActionListener(e -> {
            String codigo = campos[0].getText().trim();
            String nombre = campos[1].getText().trim();
            String apellido = campos[2].getText().trim();
            String telefono = campos[3].getText().trim();
            String correo = campos[4].getText().trim();
            String direccion = campos[5].getText().trim();
            String cp = campos[6].getText().trim();

            if (codigo.isEmpty() || nombre.isEmpty() || apellido.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Código, nombre y apellido son obligatorios.");
                return;
            }

            Cliente c = new Cliente(codigo, nombre, apellido, telefono, correo, direccion, cp);
            linearTable.insert(c);
            bstTable.insert(c);
            JOptionPane.showMessageDialog(frame, "Cliente insertado correctamente.");
        });

        botonBuscar.addActionListener(e -> {
            String nombre = campos[1].getText().trim();
            String apellido = campos[2].getText().trim();
            String clave = nombre + apellido;

            long start = System.nanoTime();
            Cliente c1 = linearTable.search(clave);
            long end = System.nanoTime();
            long tiempoLinear = end - start;

            start = System.nanoTime();
            Cliente c2 = bstTable.search(clave);
            end = System.nanoTime();
            long tiempoBST = end - start;

            String resultado = "";

            if (c1 != null)
                resultado += "Linear Probing: Encontrado\n" + c1 + "\nTiempo: " + tiempoLinear + " ns\n";
            else
                resultado += "Linear Probing: No encontrado\n";

            resultado += "Complejidad Linear Probing: Mejor caso O(1), Peor caso O(n)\n\n";

            if (c2 != null)
                resultado += "Encadenamiento BST: Encontrado\n" + c2 + "\nTiempo: " + tiempoBST + " ns\n";
            else
                resultado += "Encadenamiento BST: No encontrado\n";

            resultado += "Complejidad BST: Mejor caso O(log n), Peor caso O(n)\n";

            JOptionPane.showMessageDialog(frame, resultado);
        });

        frame.setVisible(true);
    }
}
