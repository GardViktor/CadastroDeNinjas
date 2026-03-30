package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
        public String criarNinjas() {
        return "Ninja Criado";}

    // Mostrar todos os Ninjas (READ)
    @GetMapping("/todos")
        public String mostrarTodosOsNinjas() {
        return "Todos os Ninjas";}

    // Mostrar Ninja por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasID() {
        return "Todos os Ninjas Por ID";}

    // Alterar Ninja (UPDATE)
    @PutMapping("/alterarID")
        public String alterarNinjaID() {
        return "Alterar Ninja Por ID";}

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
        public String deletarNinjaID() {
        return "Ninja deletado Por ID";}
}