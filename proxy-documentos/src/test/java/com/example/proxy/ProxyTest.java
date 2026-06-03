package com.example.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProxyTest {

    @Test
    void devePermitirAcesso() {

        Usuario usuario =
                new Usuario("Ana", true);

        IDocumento documento =
                new DocumentoProxy(1);

        assertEquals(
                "Relatório Financeiro 2025",
                documento.visualizar(usuario)
        );
    }

    @Test
    void deveNegarAcesso() {

        Usuario usuario =
                new Usuario("Pedro", false);

        IDocumento documento =
                new DocumentoProxy(1);

        assertEquals(
                "Acesso negado",
                documento.visualizar(usuario)
        );
    }
}