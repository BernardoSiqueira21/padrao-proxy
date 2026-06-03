package com.example.proxy;

import java.util.HashMap;
import java.util.Map;

public class BancoDados {

    private static Map<Integer, String> documentos =
            new HashMap<>();

    static {
        documentos.put(1,
                "Relatório Financeiro 2025");
    }

    public static String buscarDocumento(int id) {
        return documentos.get(id);
    }
}