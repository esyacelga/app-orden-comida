package com.orden.comida.app.servicio.dominio.ports.message.listener.aprovacionrestaurante;

import com.orden.comida.app.servicio.dominio.dto.message.AprovacionRestauranteRespuesta;

public interface AprovacionRestauranteMessageListener {
    void ordenAprovada (AprovacionRestauranteRespuesta aprovacionRestauranteRespuesta);
    void ordenRechazada (AprovacionRestauranteRespuesta aprovacionRestauranteRespuesta);

}
