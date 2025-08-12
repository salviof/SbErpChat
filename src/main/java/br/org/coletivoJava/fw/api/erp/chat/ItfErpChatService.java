/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.chat;

import br.org.coletivoJava.fw.api.erp.chat.model.ItfUsuarioChat;
import br.org.coletivoJava.fw.api.erp.chat.model.ItfChatSalaBean;
import br.org.coletivoJava.fw.api.erp.chat.model.ItfNotificacaoUsuarioChat;
import br.org.coletivoJava.fw.api.erp.chat.model.ItfSalaChatSessaoEescutaAtiva;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import java.io.InputStream;
import java.util.List;

/**
 *
 * @author salvio
 */
public interface ItfErpChatService {

    public String gerarSenhaPadrao(ItfUsuarioChat pUsuario) throws ErroRegraDeNEgocioChat;

    public String gerarAliasIdentificadorCanonico(String nomeCurtoAlias);

    public ItfChatSalaBean getSalaByCodigo(String pCodigo) throws ErroConexaoServicoChat;

    public ItfChatSalaBean getSalaByNome(String pNome) throws ErroConexaoServicoChat;

    public ItfChatSalaBean getSalaByAlias(String pAlias) throws ErroConexaoServicoChat;

    public ItfChatSalaBean getSalaCriandoSeNaoExistir(ItfChatSalaBean pSala) throws ErroConexaoServicoChat;

    /**
     *
     * Procura a sala pelo código da sala ou pelo apelido
     *
     * @param pSala
     * @param pCodigoIndiceSala SE o código for nulo cria a sala, se começar com
     * # procura pelo apelido, se começar com ! procura pelo id, não tendo
     * nenhum dos dois, pesquisa pelo nome
     * @return
     * @throws ErroConexaoServicoChat
     */
    public ItfChatSalaBean getSalaCriandoSeNaoExistir(ItfChatSalaBean pSala, String pCodigoIndiceSala) throws ErroConexaoServicoChat;

    public ItfChatSalaBean getSalaAtualizada(ItfChatSalaBean pSala) throws ErroConexaoServicoChat;

    public String salaEnviarMesagem(ItfChatSalaBean pSala, ItfUsuarioChat pUsuario, String codigoMensagem, String pMensagem) throws ErroConexaoServicoChat;

    public String salaEnviarImagem(ItfChatSalaBean pSala, ItfUsuarioChat pUsuario, String codigoMensagem, String pNomeArquivo, InputStream pInput) throws ErroConexaoServicoChat;

    public String salaEnviarDocumento(ItfChatSalaBean pSala, ItfUsuarioChat pUsuario, String pCodigoMensagem, String pNomeArquivo, InputStream pInput) throws ErroConexaoServicoChat;

    public String salaEnviarVideo(ItfChatSalaBean pSala, ItfUsuarioChat pUsuario, String codigoMensagem, String pNomeArquivo, InputStream pInput) throws ErroConexaoServicoChat;

    public String salaEnviarAudio(ItfChatSalaBean pSala, ItfUsuarioChat pUsuario, String codigoMensagem, String pNomeArquivo, InputStream pInput) throws ErroConexaoServicoChat;

    public boolean salaNotificarLeitura(String pCodigoSala, ItfUsuarioChat pUsuario, String pCodigoReciboMatix);

    public boolean salaExcluir(ItfChatSalaBean pCondigoSala) throws ErroConexaoServicoChat;

    public boolean salaAtualizarMembros(ItfChatSalaBean pSala, List<ItfUsuarioChat> pLista) throws ErroConexaoServicoChat;

    public boolean salaAdicionarMembro(ItfChatSalaBean pSala, String pCodigoMembro) throws ErroConexaoServicoChat;

    public boolean salaRemoverMembro(ItfChatSalaBean pSala, String pCodigoMembro) throws ErroConexaoServicoChat;

    public boolean salaLerUltimoEvento(String pCodigoSala, ItfUsuarioChat pUsuarioLeitura) throws ErroConexaoServicoChat;

    public JsonArray salaLerUltimasMensagens(String pCodigoSala) throws ErroConexaoServicoChat;

    public List<ItfUsuarioChat> atualizarListaDeUsuarios() throws ErroConexaoServicoChat;

    public ItfUsuarioChat getUsuarioByEmail(String pEmail) throws ErroConexaoServicoChat;

    public ItfUsuarioChat getUsuarioByTelefone(String pTelefone) throws ErroConexaoServicoChat;

    public ItfUsuarioChat getUsuarioByCodigo(String pCodigo) throws ErroConexaoServicoChat;

    public List<ItfNotificacaoUsuarioChat> getUltimasNotificacoesUsuarioAdmin() throws ErroConexaoServicoChat;

    public List<ItfUsuarioChat> getUsuarios() throws ErroConexaoServicoChat;

    public ItfUsuarioChat usuarioCriar(ItfUsuarioChat pUsuario) throws ErroConexaoServicoChat;

    public ItfUsuarioChat usuarioAtualizar(ItfUsuarioChat pUsuario) throws ErroConexaoServicoChat;

    public ItfUsuarioChat usuarioAtualizar(String pCodigo, String pNome, String pEmail, String pTelefone) throws ErroConexaoServicoChat;

    public ItfUsuarioChat usuarioCriar(ItfUsuarioChat pUsuario, String pSenha) throws ErroConexaoServicoChat;

    public boolean usuarioAtualizarSenha(String pCodigoUsuario, String pNovaSenha) throws ErroConexaoServicoChat, ErroRegraDeNEgocioChat;

    public ItfUsuarioChat getUsuarioChatByLoginSessaoAtual() throws ErroConexaoServicoChat;

    public boolean tokenGestaoEfetuarLogin(ItfUsuario pUsuario) throws ErroConexaoServicoChat;

    public boolean tokenGestaoEfetuarLogin(ItfUsuarioChat pUsuario, String pSenha) throws ErroConexaoServicoChat;

    public boolean isUsuarioOnlineByCodUser(String pCodigo) throws ErroConexaoServicoChat;

    public ItfChatSalaBean espacoCriar(String pNomeVisivel, String pAliasUnico) throws ErroConexaoServicoChat;

    public boolean espacoAdicionarSala(String pCodigoSpace, String pCodigoSala) throws ErroConexaoServicoChat;

    public String enviarDirect(String pCodigoUsuario, String pMensagem) throws ErroConexaoServicoChat;

    public boolean usuarioLogadoObterChaveAcesso(String pUserName, String pSenha);

    public boolean usuarioLogadovalidarChaveAcessoRegistrada();

    public boolean validarTokenOuGerarNovo(ItfUsuarioChat pUsuario, String pCodigo, String pSenha) throws ErroRegraDeNEgocioChat, ErroConexaoServicoChat;

    public boolean validarTokenSistema();

    public ItfUsuarioChat getUsuarioAdmin();

    public String gerarCodigoUsuarioContato(String pNome, String pWhatsappTelefone) throws ErroRegraDeNEgocioChat, ErroConexaoServicoChat;

    public ItfUsuarioChat gerarUsuarioContato(String pNome, String pWhatsappTelefone) throws ErroConexaoServicoChat, ErroRegraDeNEgocioChat;

    public String gerarCodigoUsuarioAtendimento(String pNome, String pEmail) throws ErroConexaoServicoChat, ErroRegraDeNEgocioChat;

    public ItfUsuarioChat gerarUsuarioAtendimento(String pNome, String pEmail) throws ErroConexaoServicoChat, ErroRegraDeNEgocioChat;

    public ItfSalaChatSessaoEescutaAtiva salaAbrirSessao(ItfChatSalaBean pSala) throws ErroConexaoServicoChat;

    public boolean isUmUsuarioAtendimento(ItfUsuarioChat pUsuarioAtendimento);

    public boolean isUmUsuarioContato(ItfUsuarioChat pUsuarioAtendimento);

}
