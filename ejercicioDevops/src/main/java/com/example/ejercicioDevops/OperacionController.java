package com.example.ejercicioDevops;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperacionController {	
	
	
	@CrossOrigin(origins = "http://localhost:5050")
	@PostMapping("/sumar")
    public int sumar(@RequestParam int numero1, @RequestParam int numero2) {
        
		int resultado = numero1+numero2;
		
		return resultado;
    }
	
	@CrossOrigin(origins = "http://localhost:5050")
	@PostMapping("/multiplicar")
    public int multiplicar(@RequestParam int numero1, @RequestParam int numero2) {
		
		int resultado = numero1*numero2;
		
		return resultado;
    }
	

}
