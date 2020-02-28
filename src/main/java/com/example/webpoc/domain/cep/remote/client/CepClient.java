package com.example.webpoc.domain.cep.remote.client;

import com.example.webpoc.domain.cep.CepResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Vinicius Lima
 * @version : $<br/>
 */
@FeignClient(url = "https://viacep.com.br", name = "cepClient")
public interface CepClient {

    @GetMapping(value = "/ws/{numCep}/json/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public CepResponse fillCep (@PathVariable("numCep") String numCep);
}
