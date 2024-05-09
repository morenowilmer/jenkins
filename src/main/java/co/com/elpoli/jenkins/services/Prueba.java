package co.com.elpoli.jenkins.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("prueba")
@CrossOrigin("*")
public class Prueba {

    public static final String mensaje = "Hola mundo";
    private static final Logger log = LoggerFactory.getLogger(Prueba.class);

    @ResponseBody
    @GetMapping(produces = "application/json")
    public ResponseEntity<Object> prueba() {
        System.out.println(mensaje);
        log.info(mensaje);

        return ResponseEntity.ok(mensaje);
    }
}
