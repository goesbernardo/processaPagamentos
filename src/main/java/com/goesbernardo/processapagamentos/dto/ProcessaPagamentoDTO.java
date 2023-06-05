package com.goesbernardo.processapagamentos.dto;


import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.goesbernardo.processapagamentos.domain.FormaPagamento;
import com.goesbernardo.processapagamentos.domain.Status;
import com.goesbernardo.processapagamentos.domain.TipoBandeira;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@JsonSerialize
public class ProcessaPagamentoDTO implements Serializable {

    @NotNull
    @NotEmpty
    private Long id;
    @NotNull
    private Double valor;
    @NotNull
    @NotEmpty
    @JsonEnumDefaultValue
    private Status status;
    @NotNull
    @NotEmpty
    @JsonEnumDefaultValue
    private FormaPagamento formaPagamento;
    @JsonEnumDefaultValue
    private TipoBandeira tipoBandeira;





}
