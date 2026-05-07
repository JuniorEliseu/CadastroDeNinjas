package dev.jotta.CadastroDeNinjas.Missoes;



import dev.jotta.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel  {

        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;
        private char rankMissao;

        @OneToMany(mappedBy = "missoes")
        private List<NinjaModel> ninjas;

}
