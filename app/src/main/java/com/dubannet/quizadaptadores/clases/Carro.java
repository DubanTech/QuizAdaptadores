package com.dubannet.quizadaptadores.clases;

public class Carro {
    private String img;
    private String Nombre;
    private String Modelo;
    private String Ano;
    private String color;

    public Carro() {
    }

    public Carro(String img, String nombre, String modelo, String ano, String color) {
        this.img = img;
        Nombre = nombre;
        Modelo = modelo;
        Ano = ano;
        this.color = color;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String ano) {
        Ano = ano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
