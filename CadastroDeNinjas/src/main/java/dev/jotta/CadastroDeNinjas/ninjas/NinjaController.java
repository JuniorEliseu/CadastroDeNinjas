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
    @PostMapping("/ninjas/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {

        return ninjaService.criarNinja(ninja);
    }

    //Mostrar todos os Ninjas -- (READ)
    @GetMapping("/ninjas/listar")
    public List<NinjaModel> mostrarNinjas() {
        return ninjaService.listarNinjas();
    }

    //procurar por Id -- (READ)
    @GetMapping("/ninjas/listar/{id}")
    public NinjaModel listarNinjaPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
    }

    //Alterar dados do Ninja -- (UPDATE)
    @PutMapping("/ninjas/alterar")
    public String alterarNinja() {
        return "Ninja Alterado";
    }

    //deletar Ninja -- (DELETE)
    @DeleteMapping("/ninjas/deletar/{id}")
    public String deletarNinja(@PathVariable Long id) {
        ninjaService.deletarNinja(id);
        return "Ninja Deletado";
    }

}
