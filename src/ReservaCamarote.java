import java.time.LocalDate;

public class ReservaCamarote extends Reserva{
    private static final double VALOR_POR_PESSOA = 200.00;
    private int quantidadePessoas;

    public ReservaCamarote(int id, String nomeCliente, LocalDate data, int quantidadePessoas) {
        super(id, nomeCliente, data);
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public double calcularValorTotal(){
        return VALOR_POR_PESSOA * quantidadePessoas;
    }

    @Override
    public boolean processarCancelamento(int horasAntecedencia) {
        return horasAntecedencia >= 48;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }
}
