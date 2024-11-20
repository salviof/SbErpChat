package br.org.coletivoJava.fw.api.erp.chat.model;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.contato.ItfBeanContatoSimples;
import java.util.List;

public interface ItfChatSalaBean extends ItfBeanSimples {

    public String getCodigoChat();

    public String getApelido();

    public String getUrlSala();

    public String getUrlSalaFull();

    boolean isExiste();

    public List<ItfUsuarioChat> getUsuarios();

}
