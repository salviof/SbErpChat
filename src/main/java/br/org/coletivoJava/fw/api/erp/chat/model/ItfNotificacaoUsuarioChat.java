/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.chat.model;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimples;

/**
 *
 * @author salvio
 */
public interface ItfNotificacaoUsuarioChat extends ComoEntidadeSimples {

    public String getTipoEvento();

    public String getRemetente();

    public String getCodigoSalaOrigem();

    public String getConteudo();

    public String getCodigoNotificacao();

    public String getEventoJson();

}
