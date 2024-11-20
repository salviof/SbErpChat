/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.fw.api.erp.chat;

/**
 *
 * @author desenvolvedorninja01
 */
import com.super_bits.modulosSB.SBCore.modulos.erp.ApiERPColetivoJavaFW;
import com.super_bits.modulosSB.SBCore.modulos.erp.ItfApiErpSuperBits;

@ApiERPColetivoJavaFW(descricaoApi = "Chats Casanova digital", nomeApi = "Chat", slugInicial = "Chat")
public enum ERPChat implements ItfApiErpSuperBits<ItfErpChatService> {

    MATRIX_ORG,
    ROCKET_CHAT;

    @Override
    public Class<? extends ItfErpChatService> getInterface() {
        return ItfErpChatService.class;
    }

}
