package br.com.joaocarloslima.tamagotchi.model;

public class Gato extends Animal {

    @Override
    public void brincar() {
        felicidade += 10;
        energia -= 5;
        fome += 5;
        ajustarValores();
    }

    @Override
    public void comer() {
        fome -= 15;
        energia += 10;
        ajustarValores();
    }

    @Override
    public void dormir() {
        energia += 20;
        fome += 5;
    }

    @Override
    public void turno() {
        energia -= 5;
        fome += 5;
        energia -= 3;
        ajustarValores();
    }
}
