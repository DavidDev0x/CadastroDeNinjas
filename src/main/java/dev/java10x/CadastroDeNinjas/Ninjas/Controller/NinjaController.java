package dev.java10x.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas") // Pega informações
    public String boasVindas(){
        return "Minha primeira mensagem nessa rota";
    }


}
