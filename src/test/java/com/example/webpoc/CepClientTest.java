package com.example.webpoc;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.example.webpoc.domain.cep.CepResponse;
import com.example.webpoc.domain.cep.remote.CepService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;

/**
 * @author vinicius lima
 * @version : $<br/>
 * : $
 */

//@PropertySource("classpath:/resources/ceps.json")
public class CepClientTest {

    CepService cepService = new CepService();

    Gson gson = new Gson();

    private String path = System.getProperty("user.dir");

    @Test
    public void validarFormato () throws FileNotFoundException {

        CepResponse[] mockResponse = gson
                .fromJson(new FileReader(path + "/src/test/resources/ceps.json"),
                        CepResponse[].class);

        String responseFormat =
                mockResponse[0].getLogradouro() + ", " + mockResponse[0].getLocalidade() + " - " + mockResponse[0]
                        .getUf();

        String response = cepService
                .formatResponse(mockResponse[0].getLogradouro(), mockResponse[0].getLocalidade(),
                        mockResponse[0].getUf());

        Assertions.assertEquals(response, responseFormat);

    }

}
