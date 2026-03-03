public class Main {

    // Contador de parâmetros
    public static int contadorParametros(Object... parametros) {
        return parametros.length;
    }

    public static void main(String[] args) {

        // Criando cliente
        Cliente cliente = new Cliente("Mayara", "123.456.789-00");

        // Criando 3 produtos
        Produto p1 = new Produto("Morango", 10.0);
        Produto p2 = new Produto("Chocolate", 15.0);
        Produto p3 = new Produto("Suco", 8.0);

        // Colocando os produtos em um array
        Produto[] listaProdutos = {p1, p2, p3};

        // Criando venda
        Venda venda = new Venda(cliente, listaProdutos);

        // Mostrando resultado
        System.out.println(venda);

        // Testando contador de parâmetros
        System.out.println("\nQuantidade de parametros: " + 
                contadorParametros(p1, p2, p3));
    }
}