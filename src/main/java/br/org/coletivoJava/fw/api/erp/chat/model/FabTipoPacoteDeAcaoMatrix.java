/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.chat.model;

/**
 *
 * @author salvio
 */
public enum FabTipoPacoteDeAcaoMatrix {

    MENSAGEM,
    DIGITANDO,
    LEITURA,
    ATUALIZACAO_MEMBROS,
    REACAO;

    public static FabTipoPacoteDeAcaoMatrix getTipoEventoByTypeStr(String pTipoEvento) {

        switch (pTipoEvento) {
            case "m.reaction":
                return REACAO;
            case "m.typing":
                return DIGITANDO;

            case "m.room.message":
                return MENSAGEM;

            case "m.receipt":
                return LEITURA;

            case "m.room.member":
                return ATUALIZACAO_MEMBROS;
            default:
                return null;
        }
    }

}
