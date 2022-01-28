package br.com.alistese.alistese.controller;

import br.com.alistese.alistese.model.Funcao;
import br.com.alistese.alistese.model.Soldado;
import br.com.alistese.alistese.model.Usuario;
import br.com.alistese.alistese.repository.FuncaoRepository;
import br.com.alistese.alistese.service.SoldadoService;
import br.com.alistese.alistese.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
    @Autowired
    SoldadoService soldadoService;
    @Autowired
    UsuarioService usuarioService;

    @RequestMapping("/admin")
    public ModelAndView admin() {
        ModelAndView mv = new ModelAndView("admin");
        Long totalSoldados = soldadoService.count();
        mv.addObject("totalSoldados", totalSoldados);
        mv.addObject("nomeLogado", usuarioService.getNomeLogado());
        mv.addObject("funcaoLogado", usuarioService.getFuncaoLogado());
        return mv;
    }
}
