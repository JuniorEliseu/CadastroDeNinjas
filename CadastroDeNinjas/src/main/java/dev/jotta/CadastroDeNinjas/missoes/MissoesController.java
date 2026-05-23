package dev.jotta.CadastroDeNinjas.missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

     /*CRUD*/

    // criar missão
    @PostMapping("/criarMissao")
    public String criarMissao() {
        return "Missão Criada";
    }

    //listar missão por id
   @GetMapping("/listarMissaoPorId")
    public String listarMissaoPorId() {
        return "Mostrando Missão por ID";
    }

    // listar todas as missões
    @RequestMapping("/listarTodasAsMissões")
    public List<MissoesModel> listarTodasAsMissoes() {
        return missoesService.listarMissoes();
    }

    //alterar missão
    @PutMapping("/alterarMissao")
    public String alterarMissao() {
        return "Missão Alterada";
    }

    //deletar missão
    @DeleteMapping("/deletarMissao")
    public String deletarMissao() {
        return "Missão Deletada";
    }
}
