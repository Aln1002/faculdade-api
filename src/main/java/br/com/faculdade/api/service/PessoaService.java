package br.com.faculdade.api.service;

import br.com.faculdade.api.domain.Pessoa;
import br.com.faculdade.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public ResponseEntity<Pessoa> buscarPorCodigo(Long codigo) {
        Optional<Pessoa> pessoaBuscaPorCodigo = pessoaRepository.findById(codigo);
        if (pessoaBuscaPorCodigo.isPresent()) {
            return ResponseEntity.ok(pessoaBuscaPorCodigo.get());
        }
        return ResponseEntity.notFound().build();
    }
}
