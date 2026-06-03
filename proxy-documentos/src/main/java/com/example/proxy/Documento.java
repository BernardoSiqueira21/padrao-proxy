package com.example.proxy;

public class Documento implements IDocumento {

    private Integer id;

    public Documento(Integer id) {
        this.id = id;
    }

    @Override
    public String visualizar(Usuario usuario) {
        return BancoDados.buscarDocumento(id);
    }
}