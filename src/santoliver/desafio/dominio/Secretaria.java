package santoliver.desafio.dominio;

import java.time.LocalDate;
import java.util.*;
import java.util.List;

public class Secretaria {

    private String nomeSec;
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Agenda> agendamentos = new ArrayList<>();

    public void cadastrarPaciente(String nomePac, int rgPac) {
        Paciente paciente = new Paciente();
        paciente.setNomePac(nomePac);
        paciente.setRgPac(rgPac);

        pacientes.add(paciente);
        System.out.println("Paciente " + paciente.getNomePac() + " cadastrado com sucesso!");
    }

    public void agendarConsulta(String nome, int dia, int mes, int ano) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNomePac().equalsIgnoreCase(nome)) {
                Agenda agendamento = new Agenda();
                agendamento.setData(LocalDate.of(ano, mes, dia));
                agendamento.setNomePac(nome);
                agendamentos.add(agendamento);

                System.out.println("Agendamento para " + dia + "/" + mes + "/" + ano + " realizado com sucesso!");
                break;
            }

        }

    }

    public void listarPacientes() {
        System.out.println("PACIENTES:");
        int i = 0;
        for(Paciente p : pacientes) {
            i = i + 1;
            System.out.println(i + ". " + p.getNomePac());

        }

    }

    public void conferirAgenda() {
        System.out.println("AGENDAMENTOS:");
        for (Agenda a : agendamentos) {
            System.out.println(a.getNomePac() + " - " + a.getData());
        }
    }

    public String getNomeSec() {
        return nomeSec;
    }

    public void setNomeSec(String nomeSec) {
        this.nomeSec = nomeSec;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Agenda> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agenda> agendamentos) {
        this.agendamentos = agendamentos;
    }
}
