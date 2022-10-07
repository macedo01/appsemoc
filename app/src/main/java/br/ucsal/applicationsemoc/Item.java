package br.ucsal.applicationsemoc;

public class Item {
    private String titulo;
    private  String texto;

    public Item(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
