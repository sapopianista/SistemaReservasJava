import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GerenciadorReservas gerenciador = new GerenciadorReservas();

        System.out.println("--- Criando e Cadastrando Reservas ---");
        Reserva pista = new ReservaPista(1, "Daniel Patrick", LocalDate.now().plusDays(2));
        Reserva vip = new ReservaVIP(2, "Kauane Lima", LocalDate.now().plusDays(5), true);
        Reserva camarote = new ReservaCamarote(3, "Tiago Vieira", LocalDate.now().plusDays(10), 5);

        gerenciador.adicionarReserva(pista);
        gerenciador.adicionarReserva(vip);
        gerenciador.adicionarReserva(camarote);

        System.out.println("\n--- Lista de Reservas Cadastradas ---");
        for (Reserva r : gerenciador.listarTodas()) {
            System.out.printf("ID: " + r.getId() +
                    " | Cliente: " + r.getNomeCliente() +
                    " | Tipo: " + r.getClass().getSimpleName() +
                    " | Valor Total R$ %.2f\n", r.calcularValorTotal());
        }

        System.out.println("\n--- Buscando Reserva por ID ---");
        Reserva encontrada = gerenciador.buscarporId(2);
        if (encontrada != null) {
            System.out.println("Encontrada! Cliente: ID: " + encontrada.id +
                    " | " + encontrada.getNomeCliente());
        }

        System.out.println("\n--- Testando Cancelamento ---");
        System.out.println("Cancelar Camarote com 24h? " + camarote.processarCancelamento(24));
        System.out.println("Cancelar VIP com 24h? " + vip.processarCancelamento(24));

        System.out.println("\n--- Removendo Reservas ---");
        gerenciador.removerReserva(1);
        System.out.println("Total de reservass restantes: " + gerenciador.listarTodas().size());
    }
}