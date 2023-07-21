package com.example.aguaatv3;

public class Item {
    Boolean status;
    int imagem;

    public Item(Boolean status, int imagem) {
        this.status = status;
        this.imagem = imagem;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
