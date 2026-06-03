package com.example.proxy;

public class DocumentoProxy implements IDocumento {

    private Documento documento;
    private Integer idDocumento;

    public DocumentoProxy(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    @Override
    public String visualizar(Usuario usuario) {

        if (!usuario.isAutorizado()) {
            return "Acesso negado";
        }

        if (documento == null) {
            documento = new Documento(idDocumento);
        }

        return documento.visualizar(usuario);
    }
}