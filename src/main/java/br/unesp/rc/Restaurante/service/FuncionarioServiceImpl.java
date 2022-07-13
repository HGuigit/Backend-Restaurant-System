package br.unesp.rc.Restaurante.service;

import br.unesp.rc.Restaurante.model.Funcionario;
import br.unesp.rc.Restaurante.repository.FuncionarioRepo;
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
public class FuncionarioServiceImpl implements FuncionarioService{

    private final FuncionarioRepo funcionarioRepo;

    @Override
    public Funcionario saveFuncionario(Funcionario funcionario) {
        return funcionarioRepo.save(funcionario);

    }
    @Override
    public List<Funcionario> getAllFuncionarios() {
        List<Funcionario> funcionario = funcionarioRepo.findAll();
        return funcionario;
    }

    @Override
    public Funcionario getFuncionarioById(int idFuncionario) {
        Funcionario funcionario = funcionarioRepo.findById(idFuncionario);
        if(funcionario == null){
            log.error("Funcionario não encontrada");
            throw new RuntimeException("Funcionario não Encontrada");
        }else{
            log.info("Funcionario encontrada: {}", funcionario.getCPF());
            return funcionario;
        }

    }
}