package br.com.alistese.alistese.controller;

import br.com.alistese.alistese.model.Soldado;
import br.com.alistese.alistese.service.SoldadoService;
import br.com.alistese.alistese.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class SoldadoController {
    @Autowired
    SoldadoService soldadoService;
    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/salvar-soldado")
    public String salvarSoldado(@Valid Soldado soldado, BindingResult result, RedirectAttributes attributes) {
        if(result.hasErrors()) {
            attributes.addFlashAttribute("mensagem","Algo deu errado, verifique as informações");
            return "redirect:/#alistamento";
        }
        soldadoService.save(soldado);
        return "redirect:/sucesso";
    }

    @GetMapping("/sucesso")
    public String sucesso() {
        return "sucesso";
    }

    @GetMapping("/admin/listar-soldados")
    public ModelAndView listarSoldados() {
        ModelAndView mv = new ModelAndView("listar-soldados");
        Iterable<Soldado> soldados = soldadoService.findAll();
        mv.addObject("nomeLogado", usuarioService.getNomeLogado());
        mv.addObject("funcaoLogado", usuarioService.getFuncaoLogado());
        mv.addObject("soldados", soldados);
        return mv;
    }
}
