package br.senac.go.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data //fazer o get,set,hascode, equals - Lombok
@Entity //ORM controle o estado do objeto
@Table(name = "INVESTIMENTO")
public class Investimento {

    @Id //indica chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) //indica a foma de gerar a chave primária
    private Integer id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "VALOR_INICIAL")
    private BigDecimal valorInicial;

    @Column(name = "SALDO")
    private BigDecimal saldo;

    @Column(name = "DATA_INICIO")
    private LocalDateTime dataInicio;

    @Column(name = "DATA_FIM")
    private LocalDateTime dataFim;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TIPO_INVESTIMENTO_ID")
    private TipoInvestimento tipoInvestimento;
}
