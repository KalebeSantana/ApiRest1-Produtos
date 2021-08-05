package com.produtos.ApiRest1.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
@Entity
@Table(name = "TB_PRODUTO")
public class Produtos implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String nome;

    private BigDecimal quantidade;

    private BigDecimal valor;

}
