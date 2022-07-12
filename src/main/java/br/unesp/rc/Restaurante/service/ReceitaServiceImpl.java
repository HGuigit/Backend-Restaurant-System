package br.unesp.rc.Restaurante.service;

/*
@author Guilherme on 12/07/2022.
@project Restaurante
*/

import br.unesp.rc.Restaurante.model.Receita;
import br.unesp.rc.Restaurante.repository.ReceitaRepo;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Data
@RequiredArgsConstructor
@Transactional
public class ReceitaServiceImpl implements ReceitaService{

    private final ReceitaRepo receitaRepo;




    @Override
    public List<Receita> getAllReceitas() {

    }

    @Override
    public Receita getReceitaByNome(String nome) {
        Receita receita = receitaRepo.findByNome(nome);
        return receita;
    }
}
