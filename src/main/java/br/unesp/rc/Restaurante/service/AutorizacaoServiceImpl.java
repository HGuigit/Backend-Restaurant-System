package br.unesp.rc.Restaurante.service;

import br.unesp.rc.Restaurante.model.Autorizacao;
import br.unesp.rc.Restaurante.repository.AutorizacaoRepo;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Data
@RequiredArgsConstructor
@Transactional
@Slf4j
public class AutorizacaoServiceImpl implements AutorizacaoService{

    private final AutorizacaoRepo autorizacaoRepo;

    @Override
    public Autorizacao saveAutorizacao(Autorizacao autorizacao) {
        return autorizacaoRepo.save(autorizacao);

    }
    @Override
    public List<Autorizacao> getAllAutorizacoes() {
        List<Autorizacao> autorizacao = autorizacaoRepo.findAll();
        return autorizacao;
    }

    @Override
    public Autorizacao getAutorizacaoById(int idAutorizacao) {
        Autorizacao autorizacao = autorizacaoRepo.findById(idAutorizacao);
        if(autorizacao == null){
            log.error("Autorizacao não encontrada");
            throw new RuntimeException("Autorizacao não Encontrada");
        }else{
            log.info("Autorizacao encontrada: {}", autorizacao.getId());
            return autorizacao;
        }

    }
}