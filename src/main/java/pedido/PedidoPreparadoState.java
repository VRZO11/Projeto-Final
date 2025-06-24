package pedido;

public class PedidoPreparadoState extends PedidoState{
    public PedidoPreparadoState(){}
    private static PedidoPreparadoState instance = new PedidoPreparadoState();
    public static PedidoPreparadoState getInstance(){
        return instance;
    }

    public String getStateName(){ return "Preparado"; }
}
