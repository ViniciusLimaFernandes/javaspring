package com.example.webpoc.domain.cep.resources;

import javax.websocket.server.PathParam;

import com.example.webpoc.domain.cep.remote.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vinicius Lima
 * @version : $<br/>
 */

@RestController
public class CepResource {

    @Autowired
    private CepService cepService;

    @GetMapping(path = "/hello/{name}")
    public ResponseEntity helloName (@PathVariable("name") final String name) {
        return ResponseEntity.ok("Hello, " + name + "!");
    }

    @GetMapping(path = "/help/{topic}")
    public ResponseEntity helpTopic (@PathVariable("topic") final String topic, @PathParam("item") final Integer item) {
        return ResponseEntity.ok("Hello, you found " + topic + "\t" + item);
    }

    @GetMapping(path = "/cep/{numCep}")
    public ResponseEntity infoCep (@PathVariable("numCep") final String numCep) {
        return ResponseEntity.ok(cepService.getCepResponse(numCep));
    }

}
