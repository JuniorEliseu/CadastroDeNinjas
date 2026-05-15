package dev.jotta.CadastroDeNinjas.missoes;



import dev.jotta.CadastroDeNinjas.ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel  {

        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;
        private String rankMissao;

        @OneToMany(mappedBy = "missoes")
        private List<NinjaModel> ninjas;

}
