package com.goesbernardo.processapagamentos.configuration;

import com.goesbernardo.processapagamentos.domain.Status;
import com.goesbernardo.processapagamentos.dto.ProcessaPagamentoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class ProcessaPagamentoListener {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public final static String MESSAGE_EFETUADO = "pagamento.efetuado";

    public final static String MESSAGE_PROCESSADO = "pagamento.processado";


    @RabbitListener(queues = MESSAGE_EFETUADO)
    public void recebeMensagem(ProcessaPagamentoDTO dto) {

        log.info("processamento de mensagens", dto);
        dto.setStatus(Status.AUTORIZADO);
        rabbitTemplate.convertAndSend(MESSAGE_PROCESSADO, dto);

    }


}


