package pedido;

public class PedidoEnviadoState extends PedidoState{
    public PedidoEnviadoState(){}
    private static PedidoEnviadoState instance = new PedidoEnviadoState();
    public static PedidoEnviadoState getInstance(){
        return instance;
    }

    public String getStateName(){
        return "Enviado";
    }
}
