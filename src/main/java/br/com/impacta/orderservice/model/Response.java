package br.com.impacta.orderservice.model;

import java.time.LocalDateTime;

public class Response {

    private LocalDateTime date;
    private String mensagem;
    private String descricao;

    public Response(LocalDateTime date, String mensagem, String descricao) {
        this.date = date;
        this.mensagem = mensagem;
        this.descricao = descricao;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
