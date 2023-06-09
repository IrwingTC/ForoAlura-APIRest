package com.alura.itc.domain.topico;

import com.alura.itc.domain.curso.Curso;
import com.alura.itc.domain.usuario.DatosMostrarUsuario;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
@Schema(description = "Datos a mostrar de cada tópico")
public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
        LocalDateTime fechaCreacion,
        String status,
        DatosMostrarUsuario autor,
        Curso curso) {

    public DatosListadoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(), topico.getStatus().toString(),
                new DatosMostrarUsuario(topico.getAutor().getId(),topico.getAutor().getNombre()), topico.getCurso());
    }
}
