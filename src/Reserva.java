import java.time.LocalDate;

public abstract class Reserva implements Cancelavel{
    int id;
    String nomeCliente;
    LocalDate data;

    public Reserva(int id, String nomeCliente, LocalDate data) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.data = data;
    }

    public abstract double calcularValorTotal();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Cliente: %s | Tipo: %s | Valor Total: R$ %.2f",
                this.id,
                this.nomeCliente,
                this.getClass().getSimpleName(),
                this.calcularValorTotal());
    }
}
