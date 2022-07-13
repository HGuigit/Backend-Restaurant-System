package br.unesp.rc.Restaurante.service;

import br.unesp.rc.Restaurante.model.Ingrediente;
import br.unesp.rc.Restaurante.repository.IngredienteRepo;
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
public class IngredienteServiceImpl implements IngredienteService{

    private final IngredienteRepo ingredienteRepo;

    @Override
    public Ingrediente saveIngrediente(Ingrediente ingrediente) {
        return ingredienteRepo.save(ingrediente);

    }
    @Override
    public List<Ingrediente> getAllIngredientes() {
        List<Ingrediente> ingrediente = ingredienteRepo.findAll();
        return ingrediente;
    }

    @Override
    public Ingrediente getIngredienteByNome(String nome) {
        Ingrediente ingrediente = ingredienteRepo.findByNome(nome);
        if(ingrediente == null){
            log.error("Ingrediente não encontrado");
            throw new RuntimeException("Ingrediente não Encontrado");
        }else{
            log.info("Ingrediente encontrado: {}", ingrediente.getNome());
            return ingrediente;
        }

    }
}