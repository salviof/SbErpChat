/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.chat.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author salvio
 */
public class ComandoDeAtendimento {

    private ItfEventoMatix evento;
    private String comando;
    private List<String> parametros = new ArrayList<>();
    private String textoCompleto;

    public ComandoDeAtendimento(ItfEventoMatix pEvento) throws ErroComandoAtendimentoInvalido {
        evento = pEvento;

        textoCompleto = pEvento.getContent().getString("body");
        String[] partes = textoCompleto.split(" ");
        if (partes.length < 2) {
            throw new ErroComandoAtendimentoInvalido("[" + textoCompleto + "] não é um comando válido");
        }
        comando = partes[1];
        int i = 1;
        for (String pr : partes) {
            if (i > 2) {
                parametros.add(pr);
            }
            i++;
        }

    }

    public String getComando() {
        return comando;
    }

    public List<String> getParametros() {
        return parametros;
    }

    public String getNovaRota() {
        return getParametros().get(0);
    }

    public ItfEventoMatix getEvento() {
        return evento;
    }

    public String getTextoCompleto() {
        return textoCompleto;
    }

}
