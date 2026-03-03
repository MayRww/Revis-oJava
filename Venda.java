public class Venda {

    private Produto[] produtos;
    private Cliente cliente;

    // Construtor
    public Venda(Cliente cliente, Produto[] produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(cliente.toString()).append("\n");
        sb.append("Produtos:\n");
        for (Produto p : produtos) {
            sb.append("- ").append(p.toString()).append("\n");
        }
        sb.append("Total da venda: R$ ").append(calcularTotal());
        return sb.toString();
    }
}