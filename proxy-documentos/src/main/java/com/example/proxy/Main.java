package com.example.proxy;

public class Main {

    public static void main(String[] args) {

        Usuario gerente =
                new Usuario("Carlos", true);

        IDocumento documento =
                new DocumentoProxy(1);

        System.out.println(
                documento.visualizar(gerente));
    }
}