package pedido;

public class PedidoCriadoState extends PedidoState {
    public PedidoCriadoState() {}
    private static PedidoCriadoState instance = new PedidoCriadoState();
    public static PedidoCriadoState getInstance() {
        return instance;
    }

    public String getStateName() { return "Criado"; }
}
