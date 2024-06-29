package santoliver.desafio.dominio;

import java.time.LocalDate;
import java.util.Objects;

public class Agenda {

    private LocalDate data;
    private String nomePac;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNomePac() {
        return nomePac;
    }

    public void setNomePac(String nomePac) {
        this.nomePac = nomePac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Agenda agenda)) return false;
        return Objects.equals(getNomePac(), agenda.getNomePac());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNomePac());
    }
}
