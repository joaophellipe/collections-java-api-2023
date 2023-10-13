package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int convite) {
        this.nome = nome;
        this.codigoConvite = convite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConviteConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoConvite);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", convite=" + codigoConvite +
                '}';
    }
}
