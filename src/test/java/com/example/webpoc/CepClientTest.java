package com.example.webpoc;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.example.webpoc.domain.cep.CepResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import com.google.gson.Gson;

/**
 * @author vinicius lima
 * @version : $<br/>
 * : $
 */

//@PropertySource("classpath:/resources/ceps.json")
public class CepClientTest {

    Gson gson = new Gson();

    private String path = System.getProperty("user.dir");

    @Test
    public void validarStatus () throws FileNotFoundException {

        CepResponse mockResponse = gson
                .fromJson(new FileReader(path + "/src/test/resources/ceps.json"),
                        CepResponse.class);

        System.out.println("CEP = " + mockResponse.getCep());

        Assertions.assertEquals(HttpStatus.OK, HttpStatus.ACCEPTED);

    }

}
