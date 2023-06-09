package com.alura.itc.domain.respuesta;

import com.alura.itc.domain.usuario.DatosMostrarUsuario;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
@Schema(description = "Datos a mostrar de la respuesta")
public record DatosMostrarRespuesta(
        Long id,
        String mensaje,
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
        LocalDateTime fechaCreacion,
        DatosMostrarUsuario autor,
        Boolean solucion) {
}
