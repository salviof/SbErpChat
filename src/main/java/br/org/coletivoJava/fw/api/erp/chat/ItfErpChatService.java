/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.chat;

import br.org.coletivoJava.fw.api.erp.chat.model.ComoUsuarioChat;
import br.org.coletivoJava.fw.api.erp.chat.model.ItfNotificacaoUsuarioChat;
import br.org.coletivoJava.fw.api.erp.chat.model.ItfSalaChatSessaoEescutaAtiva;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoUsuario;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import java.io.InputStream;
import java.util.List;
import br.org.coletivoJava.fw.api.erp.chat.model.ComoChatSalaBean;

/**
 *
 * @author salvio
 */
public interface ItfErpChatService {

    public String gerarSenhaPadrao(ComoUsuario pUsuario, String pCodigoUsuario) throws ErroRegraDeNEgocioChat;

    public String gerarAliasIdentificadorCanonico(String nomeCurtoAlias);

    public ComoChatSalaBean getSalaByCodigo(String pCodigo) throws ErroConexaoServicoChat;

    public ComoChatSalaBean getSalaByNome(String pNome) throws ErroConexaoServicoChat;

    public ComoChatSalaBean getSalaByAlias(String pAlias) throws ErroConexaoServicoChat;

    public ComoChatSalaBean getSalaCriandoSeNaoExistir(ComoChatSalaBean pSala) throws ErroConexaoServicoChat;

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
    public ComoChatSalaBean getSalaCriandoSeNaoExistir(ComoChatSalaBean pSala, String pCodigoIndiceSala) throws ErroConexaoServicoChat;

    public ComoChatSalaBean getSalaAtualizada(ComoChatSalaBean pSala) throws ErroConexaoServicoChat;

    public String salaEnviarMesagem(ComoChatSalaBean pSala, ComoUsuarioChat pUsuario, String codigoMensagem, String pMensagem) throws ErroConexaoServicoChat;

    public String salaEnviarImagem(ComoChatSalaBean pSala, ComoUsuarioChat pUsuario, String codigoMensagem, String pNomeArquivo, InputStream pInput) throws ErroConexaoServicoChat;

    public String salaEnviarDocumento(ComoChatSalaBean pSala, ComoUsuarioChat pUsuario, String pCodigoMensagem, String pNomeArquivo, InputStream pInput) throws ErroConexaoServicoChat;

    public String salaEnviarVideo(ComoChatSalaBean pSala, ComoUsuarioChat pUsuario, String codigoMensagem, String pNomeArquivo, InputStream pInput) throws ErroConexaoServicoChat;

    public String salaEnviarAudio(ComoChatSalaBean pSala, ComoUsuarioChat pUsuario, String codigoMensagem, String pNomeArquivo, InputStream pInput) throws ErroConexaoServicoChat;

    public boolean salaNotificarLeitura(String pCodigoSala, ComoUsuarioChat pUsuario, String pCodigoReciboMatix);

    public boolean salaExcluir(ComoChatSalaBean pCondigoSala) throws ErroConexaoServicoChat;

    public boolean salaAtualizarMembros(ComoChatSalaBean pSala, List<ComoUsuarioChat> pLista) throws ErroConexaoServicoChat;

    public boolean salaAdicionarMembro(ComoChatSalaBean pSala, String pCodigoMembro) throws ErroConexaoServicoChat;

    public boolean salaRemoverMembro(ComoChatSalaBean pSala, String pCodigoMembro) throws ErroConexaoServicoChat;

    public boolean salaTornarMembroAdmin(ComoChatSalaBean pSala, String pCodigoMembro) throws ErroConexaoServicoChat;

    public boolean salaLerUltimoEvento(String pCodigoSala, ComoUsuarioChat pUsuarioLeitura) throws ErroConexaoServicoChat;

    public JsonArray salaLerUltimasMensagens(String pCodigoSala) throws ErroConexaoServicoChat;

    public List<ComoUsuarioChat> atualizarListaDeUsuarios() throws ErroConexaoServicoChat;

    public ComoUsuarioChat getUsuarioByEmail(String pEmail) throws ErroConexaoServicoChat;

    public ComoUsuarioChat getUsuarioByTelefone(String pTelefone) throws ErroConexaoServicoChat;

    public ComoUsuarioChat getUsuarioByCodigo(String pCodigo) throws ErroConexaoServicoChat;

    public List<ItfNotificacaoUsuarioChat> getUltimasNotificacoesUsuarioAdmin() throws ErroConexaoServicoChat;

    public List<ComoUsuarioChat> getUsuarios() throws ErroConexaoServicoChat;

    public ComoUsuarioChat usuarioCriar(ComoUsuarioChat pUsuario) throws ErroConexaoServicoChat;

    public ComoUsuarioChat usuarioAtualizar(ComoUsuarioChat pUsuario) throws ErroConexaoServicoChat;

    public ComoUsuarioChat usuarioAtualizar(String pCodigo, String pNome, String pEmail, String pTelefone) throws ErroConexaoServicoChat;

    public ComoUsuarioChat usuarioCriar(ComoUsuarioChat pUsuario, String pSenha) throws ErroConexaoServicoChat;

    public boolean usuarioAtualizarSenha(String pCodigoUsuario, String pNovaSenha) throws ErroConexaoServicoChat, ErroRegraDeNEgocioChat;

    public ComoUsuarioChat getUsuarioChatByLoginSessaoAtual() throws ErroConexaoServicoChat;

    public boolean tokenGestaoEfetuarLogin(ComoUsuario pUsuario) throws ErroConexaoServicoChat;

    public boolean tokenGestaoEfetuarLogin(ComoUsuarioChat pUsuario, String pSenha) throws ErroConexaoServicoChat;

    public boolean isUsuarioOnlineByCodUser(String pCodigo) throws ErroConexaoServicoChat;

    public ComoChatSalaBean espacoCriar(String pNomeVisivel, String pAliasUnico) throws ErroConexaoServicoChat;

    public boolean espacoAdicionarSala(String pCodigoSpace, String pCodigoSala) throws ErroConexaoServicoChat;

    public String enviarDirect(String pCodigoUsuario, String pMensagem) throws ErroConexaoServicoChat;

    public boolean usuarioLogadoObterChaveAcesso(String pUserName, String pSenha);

    public boolean usuarioLogadovalidarChaveAcessoRegistrada();

    public boolean validarTokenOuGerarNovo(ComoUsuario pUsuario, String pCodigo, String pSenha) throws ErroRegraDeNEgocioChat, ErroConexaoServicoChat;

    public boolean validarTokenSistema();

    public ComoUsuarioChat getUsuarioAdmin();

    public String gerarCodigoUsuarioContato(String pWhatsappTelefone) throws ErroRegraDeNEgocioChat, ErroConexaoServicoChat;

    public ComoUsuarioChat gerarUsuarioContato(String pNome, String pWhatsappTelefone) throws ErroConexaoServicoChat, ErroRegraDeNEgocioChat;

    public String gerarCodigoUsuarioAtendimento(String pNome, String pEmail) throws ErroConexaoServicoChat, ErroRegraDeNEgocioChat;

    public ComoUsuarioChat gerarUsuarioAtendimento(String pNome, String pEmail) throws ErroConexaoServicoChat, ErroRegraDeNEgocioChat;

    public ItfSalaChatSessaoEescutaAtiva salaAbrirSessao(ComoChatSalaBean pSala) throws ErroConexaoServicoChat;

    public boolean isUmUsuarioAtendimento(ComoUsuarioChat pUsuarioAtendimento);

    public boolean isUmUsuarioContato(ComoUsuarioChat pUsuarioAtendimento);

}
