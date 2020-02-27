package com.example.webpoc.domain.cep.remote;

import org.springframework.stereotype.Service;

/**
 * @author vinicius lima
 * @version : $<br/>
 */

@Service
public class CepService {

    public String formatResponse (String logradouro, String localidade, String uf) {
        return logradouro + ", " + localidade + " - " + uf;
    }

}
