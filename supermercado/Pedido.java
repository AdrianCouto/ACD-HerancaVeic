import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<Item> itens;
    private TipoPagamento pagamento;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public void setPagamento(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public TipoPagamento getPagamento() {
        return pagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

}
