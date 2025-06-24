package usuario;

import notificacao.INotificacao;
import notificacao.NotificacaoFactory;
import pedido.PedidoState;

import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public class Usuario implements Observer {
    private final String name;
    private INotificacao notification;

    public Usuario(String name, String PreferredNotificationType) {
        this.name = name;
        this.notification = NotificacaoFactory.getNotification(PreferredNotificationType);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Map) {
            Map<?, ?> evento = (Map<?, ?>) arg;
            String type = (String) evento.get("type");
            PedidoState estado = (PedidoState) evento.get("data");

            if(type.equals("StatusUpdate")) {
                String mensagem = name + " O status do seu pedido foi atualizado para: " + estado;
                notification.send(mensagem);
            }
        }
    }
}
