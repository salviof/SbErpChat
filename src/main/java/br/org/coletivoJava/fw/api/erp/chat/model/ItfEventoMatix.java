/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.chat.model;

import org.json.JSONObject;

/**
 *
 * @author salvio
 */
public interface ItfEventoMatix {

    public String getRoom_id();

    public FabTipoPacoteDeAcaoMatrix getTipoEvento();

    public JSONObject getRaw();

    public JSONObject getContent();

    public String getType();

    public String getEvent_id();

    public String getSender();

}
