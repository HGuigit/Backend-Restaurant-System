package br.unesp.rc.Restaurante.service;

import br.unesp.rc.Restaurante.model.Usuario;
import br.unesp.rc.Restaurante.repository.UsuarioRepo;
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
public class UsuarioServiceImpl implements UsuarioService{

    private final UsuarioRepo usuarioRepo;

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);

    }
    @Override
    public List<Usuario> getAllUsuarios() {
        List<Usuario> usuario = usuarioRepo.findAll();
        return usuario;
    }

    @Override
    public Usuario getUsuarioBy(String nome) {
        Usuario usuario = usuarioRepo.findByNome(nome);
        if(usuario == null){
            log.error("Usuario não encontrada");
            throw new RuntimeException("Usuario não Encontrada");
        }else{
            log.info("Usuario encontrada: {}", usuario.getNome());
            return usuario;
        }

    }
}