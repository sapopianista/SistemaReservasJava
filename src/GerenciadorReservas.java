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

    public boolean removerReserva(int id) {
        Reserva r = buscarporId(id);
        if (r != null) {
            listaReservas.remove(r);
            return true;
        } return false;
    }
}
