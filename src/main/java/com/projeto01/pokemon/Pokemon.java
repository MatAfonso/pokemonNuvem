package com.projeto01.pokemon;

public class Pokemon {
    private String nome;
    private int vida;
    private String tipo;

    public Pokemon(String nome, int vida, String tipo) {
        this.nome = nome;
        this.vida = vida;
        this.tipo = tipo;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = vida; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}