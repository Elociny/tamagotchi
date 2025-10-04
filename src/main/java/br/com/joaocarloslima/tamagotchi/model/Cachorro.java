package br.com.joaocarloslima.tamagotchi.model;

public class Cachorro extends Animal {
    @Override
    public void brincar() {
        felicidade += 15;
        energia -= 10;
        fome += 10;
        ajustarValores();
    }

    @Override
    public void comer() {
        fome -= 20;
        energia += 15;
        ajustarValores();
    }

    @Override
    public void dormir() {
        energia += 15;
        fome += 10;
        ajustarValores();
    }

    @Override
    public void turno() {
        energia -= 10;
        fome += 10;
        felicidade -= 5;
        ajustarValores();
    }
}
