package com.ejemplo.cafeteria;

import java.util.Map; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CafeteriaController { 

    @GetMapping("/bienvenida")
            public String bienvenida () {
                return "Bienvenido a Café Andino"; 
            }

            @GetMapping("/pedido/{producto}")
            public String pedido(@PathVariable String producto) { 
                return "Preparando tu" + producto + "..."; 
            } 


            @GetMapping("/menu")
            public Map<String, Integer> menu() {
                return Map.of(
                        "tinto", 2000,
                        "capuchino", 3500,
                        "chocolate", 4500,
                        "aromatica", 2000,
                        "brownie", 4000,
                        "tamal",7800,
                        "caldo de costilla",9000,
                        "arepa de huevo", 3000,
                        "buñuelo", 1500,
                        "empanada", 2500
                ); 
            } 
             
            @GetMapping("/cafeteria")
            public Map<String, Object> cafeteria() {
                return Map.of(
                        "nombre", "Café Andino",
                        "ciudad", "Bogotá",
                        "abierto", true, 
                        "horario", "7:00 AM - 8:00 PM"
                ); 
            } 

            @GetMapping("/total/{precio}/{cantidad}")
            public String total(@PathVariable int precio, @PathVariable int cantidad) {
                int total = precio * cantidad; 
                return "Total a pagar: $" + total;
            }

}
             