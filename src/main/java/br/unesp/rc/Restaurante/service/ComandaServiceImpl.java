package br.unesp.rc.Restaurante.service;

import br.unesp.rc.Restaurante.model.Comanda;
import br.unesp.rc.Restaurante.repository.ComandaRepo;
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
public class ComandaServiceImpl implements ComandaService{

    private final ComandaRepo comandaRepo;

    @Override
    public Comanda saveComanda(Comanda comanda) {
        return comandaRepo.save(comanda);

    }
    @Override
    public List<Comanda> getAllComandas() {
        List<Comanda> comanda = comandaRepo.findAll();
        return comanda;
    }

    @Override
    public Comanda getComandaById(int idComanda) {
        Comanda comanda = comandaRepo.findById(idComanda);
        if(comanda == null){
            log.error("Comanda não encontrada");
            throw new RuntimeException("Comanda não Encontrada");
        }else{
            log.info("Comanda encontrada: {}", comanda.getComandaCode());
            return comanda;
        }

    }
}