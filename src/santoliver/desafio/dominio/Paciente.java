package santoliver.desafio.dominio;

import java.util.Objects;

public class Paciente {

    private String nomePac;
    private int rgPac;

    public String getNomePac() {
        return nomePac;
    }

    public void setNomePac(String nomePac) {
        this.nomePac = nomePac;
    }

    public int getRgPac() {
        return rgPac;
    }

    public void setRgPac(int rgPac) {
        this.rgPac = rgPac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paciente paciente)) return false;
        return getRgPac() == paciente.getRgPac() && Objects.equals(getNomePac(), paciente.getNomePac());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomePac(), getRgPac());
    }
}
