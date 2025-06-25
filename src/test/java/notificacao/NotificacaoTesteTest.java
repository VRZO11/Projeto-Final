package notificacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoTesteTest {
    @Test
    void deveRetornarNotificacaoEmail() {
        INotificacao notificacao = NotificacaoFactory.getNotification("NotificacaoTeste");

        assertTrue(notificacao instanceof NotificacaoEmail);
        assertEquals("Enviando e-mail: Teste", notificacao.send("Teste"));
    }
}