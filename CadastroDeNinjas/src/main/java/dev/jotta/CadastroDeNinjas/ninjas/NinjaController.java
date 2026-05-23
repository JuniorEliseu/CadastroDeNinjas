package dev.jotta.CadastroDeNinjas.ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class NinjaController {

    private NinjaService ninjaService;

    // construtor para injetar a dependência do service
    public NinjaController(NinjaService ninjaService) {

        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Boas Vindas";
    }


    /*CRUD*/
    //add ninja -- (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado";
    }

    //Mostrar todos os Ninjas -- (READ)
    @GetMapping("/listar")
    public List<NinjaModel> mostrarNinjas() {

        return ninjaService.listarNinjas();
    }

    //procurar por Id -- (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjaPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
    }

    //Alterar dados do Ninja -- (UPDATE)
    @PutMapping("/alterar")
    public String alterarNinja() {
        return "Ninja Alterado";
    }

    //deletar Ninja -- (DELETE)
    @DeleteMapping("/deletarPorId")
    public String deletarNinja() {
        return "Ninja Deletado";
    }

}
