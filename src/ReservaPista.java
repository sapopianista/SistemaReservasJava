import java.time.LocalDate;

public class ReservaPista extends Reserva{
    private static final double VALOR_PISTA = 100.00;

    public ReservaPista(int id, String nomeCliente, LocalDate data) {
        super(id, nomeCliente, data);
    }

    @Override
    public double calcularValorTotal() {
        return VALOR_PISTA;
    }

    @Override
    public boolean processarCancelamento(int horasAntecedencia) {
        return horasAntecedencia >= 24;
    }
}
