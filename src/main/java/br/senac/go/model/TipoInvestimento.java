package br.senac.go.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data //fazer o get,set,hascode, equals - Lombok
@Entity //ORM controle o estado do objeto
@Table(name = "TIPO_INVESTIMENTO")
public class TipoInvestimento {

    @Id //indica chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) //indica a foma de gerar a chave primária
    private Integer id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "TEM_RISCO")
    private boolean temRisco;

    @Column(name = "DATA_INICIO")
    private LocalDateTime dataInicio;

    @Column(name = "DATA_FIM")
    private LocalDateTime dataFim;

}
