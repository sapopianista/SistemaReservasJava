import java.util.ArrayList;
import java.util.List;

public class GerenciadorReservas {
    List<Reserva> listaReservas;

    public GerenciadorReservas() {
        this.listaReservas = new ArrayList<>();
    }

    public void adicionarReserva(Reserva reserva) {
        listaReservas.add(reserva);
    }

    public List<Reserva> listarTodas() {
        return new ArrayList<>(listaReservas);
    }

    public Reserva buscarporId(int id) {
        for (Reserva r : listaReservas) {
            if (r.getId() == id) {
                return r;
            }
        } return null;
    }

    public boolean editarReserva(int id, Reserva reservaAtualizada) {
        for (int i = 0; i < listaReservas.size(); i++) {
            if (listaReservas.get(i).getId() == id) {
                listaReservas.set(i, reservaAtualizada);
                System.out.println(listaReservas.get(i).toString());
                return true;
            }
        } return false;
    }

    public boolean removerReserva(int id) {
        Reserva r = buscarporId(id);
        if (r != null) {
            listaReservas.remove(r);
            System.out.println("Reserva: ID: " + r.getId() + " | " +
                    r.getNomeCliente() + "\nRemovida com sucesso!");
            System.out.println("Total de reservas restantes: " + listarTodas().size());
            return true;
        } return false;
    }
}