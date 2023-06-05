package com.goesbernardo.processapagamentos.dto;


import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.goesbernardo.processapagamentos.domain.FormaPagamento;
import com.goesbernardo.processapagamentos.domain.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class ProcessaPagamentoPagamentoDTO implements Serializable {

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





}
