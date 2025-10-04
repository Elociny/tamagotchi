package br.com.joaocarloslima.tamagotchi.model;

public class Dragao extends Animal {
    @Override
    public void brincar() {
        felicidade += 12;
        energia -= 15;
        fome += 15;
        ajustarValores();
    }

    @Override
    public void comer() {
        fome -= 30;
        energia += 20;
        ajustarValores();
    }

    @Override
    public void dormir() {
        energia += 10;
        fome += 10;
        ajustarValores();
    }

    @Override
    public void turno() {
        energia -= 15;
        fome += 10;
        felicidade -= 8;
        ajustarValores();
    }
}
