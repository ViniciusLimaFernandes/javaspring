package com.example.webpoc.domain.cep.remote;

import com.example.webpoc.domain.cep.CepResponse;
import com.example.webpoc.domain.cep.remote.client.CepClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author vinicius lima
 * @version : $<br/>
 */

@Service
public class CepService {

    @Autowired
    private CepClient cepClient;

    public CepResponse getCepResponse (String cep) {

        final CepResponse cepInfo = this.getCep(cep);

        return CepResponse.builder().logradouro(cepInfo.getLogradouro()).localidade(cepInfo.getLocalidade())
                .complemento(cepInfo.getComplemento()).uf(cepInfo.getUf()).cep(cepInfo.getCep()).build();
    }

    public CepResponse getCep (final String cep) {
        return this.cepClient.fillCep(cep);
    }

    public String formatResponse (String logradouro, String localidade, String uf) {
        return logradouro + ", " + localidade + " - " + uf;
    }

}
