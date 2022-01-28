package br.com.alistese.alistese.controller;

import br.com.alistese.alistese.enums.Permissoes;
import br.com.alistese.alistese.model.Usuario;
import br.com.alistese.alistese.repository.UsuarioRepository;
import br.com.alistese.alistese.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
