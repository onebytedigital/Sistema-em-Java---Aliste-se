package br.com.alistese.alistese.controller;

import br.com.alistese.alistese.model.Funcao;
import br.com.alistese.alistese.model.Usuario;
import br.com.alistese.alistese.service.FuncaoService;
import br.com.alistese.alistese.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    @Autowired
    FuncaoService funcaoService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/admin/novo-usuario")
    public ModelAndView getForm() {
        ModelAndView mv = new ModelAndView("form-usuario");
        List<Funcao> funcoes = funcaoService.findAll();
        mv.addObject("funcoes", funcoes);
        mv.addObject("titulo","Novo Usuário");
        mv.addObject("nomeLogado", usuarioService.getNomeLogado());
        mv.addObject("funcaoLogado", usuarioService.getFuncaoLogado());
        return mv;
    }

    @RequestMapping("admin/listar-usuarios")
    public ModelAndView listarUsuarios(RedirectAttributes attributes) {
        ModelAndView mv = new ModelAndView("listar-usuarios");
        Iterable<Usuario> usuarios = usuarioService.findAll();
        mv.addObject("usuarios", usuarios);
        mv.addObject("nomeLogado", usuarioService.getNomeLogado());
        mv.addObject("funcaoLogado", usuarioService.getFuncaoLogado());
        return mv;
    }

    @PostMapping("/admin/salvar-usuario")
    public String salvarUsuario(@Valid Usuario usuario, BindingResult result, RedirectAttributes attributes) {
        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Ops, ocorreu um erro, tente novamente mais tarde!");
            return "redirect:/admin/listar-usuarios";
        }
        usuarioService.save(usuario);
        attributes.addFlashAttribute("mensagem", "Usuario salvo com sucesso!");
        return "redirect:/admin/listar-usuarios";
    }

    @GetMapping("/admin/deletar-usuario/{id}")
    public String deletarUsuario(@PathVariable Integer id, RedirectAttributes attributes) {
        usuarioService.deleteById(id);
        attributes.addFlashAttribute("mensagem", "Usuário excluído com sucesso!");
        return "redirect:/admin/listar-usuarios";
    }

    @GetMapping("/admin/editar-usuario")
    public ModelAndView getUsuarioId(@RequestParam("id") Integer id) {
        ModelAndView mv = new ModelAndView("form-usuario");
        mv.addObject("titulo","Editar Usuário");
        List<Funcao> funcoes = funcaoService.findAll();
        mv.addObject("funcoes", funcoes);
        Optional<Usuario> usuario = usuarioService.findById(id);
        mv.addObject("usuario", usuario.get());
        mv.addObject("nomeLogado", usuarioService.getNomeLogado());
        mv.addObject("funcaoLogado", usuarioService.getFuncaoLogado());
        return mv;
    }
}
