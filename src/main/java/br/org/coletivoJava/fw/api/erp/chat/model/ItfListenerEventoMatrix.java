/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.chat.model;

import br.org.coletivoJava.fw.api.erp.chat.ErroMtxParalizacaoDeProcessamento;

/**
 *
 * @author salvio
 */
public interface ItfListenerEventoMatrix {

    public boolean isElegivel(ItfEventoMatix pEvento);

    public void processarEvento(ItfEventoMatix pEvento) throws ErroMtxParalizacaoDeProcessamento;

    public boolean isSalaComAutoMonitoramento(String pNomeSAla);

    public ComoChatSalaBean getSala();

}
