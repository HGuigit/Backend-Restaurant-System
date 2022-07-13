package br.unesp.rc.Restaurante.service;

import br.unesp.rc.Restaurante.model.Permissao;
import br.unesp.rc.Restaurante.repository.PermissaoRepo;
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
public class PermissaoServiceImpl implements PermissaoService{

    private final PermissaoRepo permissaoRepo;

    @Override
    public Permissao savePermissao(Permissao permissao) {
        return permissaoRepo.save(permissao);

    }
    @Override
    public List<Permissao> getAllPermissoes() {
        List<Permissao> permissao = permissaoRepo.findAll();
        return permissao;
    }

    @Override
    public Permissao getPermissaoById(int idPermissoes) {
        Permissao permissao = permissaoRepo.findById(idPermissoes);
        if(permissao == null){
            log.error("Permissao não encontrada");
            throw new RuntimeException("Permissao não Encontrada");
        }else{
            log.info("Permissao encontrada: {}", permissao.getId());
            return permissao;
        }

    }
}