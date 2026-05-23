package dev.jotta.CadastroDeNinjas.missoes;

import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class MissoesService {

    private MissoesRepository missoesrepository;

    public MissoesService(MissoesRepository missoesrepository) {
        this.missoesrepository = missoesrepository;
    }

        public List<MissoesModel> listarMissoes() {
            return missoesrepository.findAll();
        }
}
