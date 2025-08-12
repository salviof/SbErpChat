/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package br.org.coletivoJava.fw.api.erp.chat;

/**
 *
 * @author salvio
 */
public class ErroMtxParalizacaoDeProcessamento extends Throwable {

    public ErroMtxParalizacaoDeProcessamento(String pMotivo) {
        super(pMotivo);
    }

}
