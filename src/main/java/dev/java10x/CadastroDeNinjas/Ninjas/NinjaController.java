package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
        public String criarNinjas() {
        return "Ninja Criado";}

    // Mostrar todos os Ninjas (READ)
    @GetMapping("/listar")
        public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();}

    // Mostrar Ninja por ID (READ)
    @GetMapping("/listarID")
    public String mostrarNinjasID() {
        return "Ninja Listado ID";}

    // Alterar Ninja (UPDATE)
    @PutMapping("/alterar")
        public String alterarNinja() {
        return "Ninja Alterado";}

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletar")
        public String deletarNinja() {
        return "Ninja Deletado";}
}