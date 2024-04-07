package br.com.vainaweb.escola1.enumation;

public enum Cargo {
    INSTRUTOR (0),
    FACILITADOR (1),
    COORDENACAO ( 2),
    ADMINISTRATIVO ( 3);

    final int valor;

    Cargo(int valor) {
        this.valor = valor;
    }
}
