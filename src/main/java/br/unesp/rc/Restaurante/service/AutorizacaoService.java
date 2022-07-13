package br.unesp.rc.Restaurante.service;

import br.unesp.rc.Restaurante.model.Autorizacao;

import java.util.List;

public interface ReceitaService {

    Autorizacao saveAutorizacao(Autorizacao autorizacao);
    List<Autorizacao> getAllAltorizacoes();
    Autorizacao getAutorizacaoByNome(String nome);

}