package br.unesp.rc.Restaurante.service;

/*
@author Guilherme on 12/07/2022.
@project Restaurante
*/

import br.unesp.rc.Restaurante.model.Receita;
import br.unesp.rc.Restaurante.repository.ReceitaRepo;
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
public class ReceitaServiceImpl implements ReceitaService{

    private final ReceitaRepo receitaRepo;

    @Override
    public Receita saveReceita(Receita receita) {
        return receitaRepo.save(receita);

    }
    @Override
    public List<Receita> getAllReceitas() {
        List<Receita> receita = receitaRepo.findAll();
        return receita;
    }

    @Override
    public Receita getReceitaByNome(String nome) {
        Receita receita = receitaRepo.findByNome(nome);
        if(receita == null){
            log.error("Receita não encontrada");
            throw new RuntimeException("Receita não Encontrada");
        }else{
            log.info("Receita encontrada: {}", receita.getNome());
            return receita;
        }

    }
}
