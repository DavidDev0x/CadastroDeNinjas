package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas") // Pega informações
    public String boasVindas(){
        return "Minha primeira mensagem nessa rota";
    }


}
