package santoliver.desafio;

import santoliver.desafio.dominio.Secretaria;

public class Main {
    public static void main(String[] args) {
        Secretaria joana = new Secretaria();
        joana.setNomeSec("Joana Souza");

        // CADASTRANDO PACIENTES
        joana.cadastrarPaciente("Carla Zanetti", 1234567);
        joana.cadastrarPaciente("Julia Zanetti", 9876541);
        joana.cadastrarPaciente("Marcos de Oliveira", 5655987);
        joana.cadastrarPaciente("Walesca Pires", 2148652);

        System.out.println();

        // REALIZANDO AGENDAMENTO
        joana.agendarConsulta("Carla Zanetti", 23, 9, 2024);
        joana.agendarConsulta("Julia Zanetti", 23, 9, 2024);
        joana.agendarConsulta("Walesca Pires", 23, 9, 2024);
        joana.agendarConsulta("Marcos de Oliveira", 23, 9, 2024);
        joana.agendarConsulta("Walesca Pires", 15, 10, 2024);

        System.out.println();

        // LISTANDO PACIENTES
        joana.listarPacientes();

        System.out.println();

        // CONFERINDO AGENDAMENTOS
        joana.conferirAgenda();
    }
}
