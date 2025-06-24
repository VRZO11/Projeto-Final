package pedido;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class Pedido extends Observable {
    private PedidoState estado;

    public Pedido() {
        this.estado = PedidoCriadoState.getInstance();
    }

    public PedidoState getEstado() {
        return estado;
    }

    public void setEstado(PedidoState estado) {
        this.estado = estado;

        Map<String, Object> evento = new HashMap<>();
        evento.put("type", "StatusUpdate");
        evento.put("data", estado);

        setChanged();
        notifyObservers(evento);
    }
}
