/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.chat.model;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoUsuario;
import java.util.List;

/**
 *
 * @author salvio
 */
public interface ComoUsuarioChat extends ComoUsuario {

    public String getCodigoUsuario();

    public String getEmailPrincipal();

    public List<String> getEmailsSecundarios();

    public String getCodigoCRMUniversal();

}
