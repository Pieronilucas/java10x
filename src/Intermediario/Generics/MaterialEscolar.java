package Intermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class MaterialEscolar<T>{
    private List<T> mochilaEscolar;

    public MaterialEscolar() {
        this.mochilaEscolar = new ArrayList<T>();
    }

    public MaterialEscolar(T mochilaEscolar) {
        this.mochilaEscolar = new ArrayList<T>();
    }

    public void addObject(T mochila) {
        mochilaEscolar.add(mochila);
    }

    public void showMochila() {
        for (T mochila : mochilaEscolar) {
            System.out.println(mochila);
        }
    }

    @Override
    public String toString() {
        return "Mochila{" +
                "mochila=" + mochilaEscolar +
                '}';
    }

    public List<T> getMochilaEscolar() {
        return mochilaEscolar;
    }

    public void setMochilaEscolar(List<T> mochilaEscolar) {
        this.mochilaEscolar = mochilaEscolar;
    }
}
