package br.org.coletivoJava.fw.api.erp.chat.model;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimples;
import java.util.List;

public interface ComoChatSalaBean extends ComoEntidadeSimples {

    public String getCodigoChat();

    public String getApelido();

    public String getUrlSala();

    public String getUrlSalaFull();

    boolean isExiste();

    public List<ComoUsuarioChat> getUsuarios();

}
