import java.time.LocalDate;

public class ReservaVIP extends Reserva{
    private static final double VALOR_VIP_BASE = 250.00;
    private boolean incluiOpenBar;

    public ReservaVIP(int id, String nomeCliente, LocalDate data, boolean incluiOpenBar) {
        super(id, nomeCliente, data);
        this.incluiOpenBar = incluiOpenBar;
    }

    @Override
    public double calcularValorTotal() {
        if (incluiOpenBar) {
            return VALOR_VIP_BASE + 150.00;
        }
        return VALOR_VIP_BASE;
    }

    @Override
    public boolean processarCancelamento(int horasAntecedencia) {
        return horasAntecedencia >= 12;
    }

    public boolean isIncluiOpenBar() {
        return incluiOpenBar;
    }

    public void setIncluiOpenBar(boolean incluiOpenBar) {
        this.incluiOpenBar = incluiOpenBar;
    }
}
