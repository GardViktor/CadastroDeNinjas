package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    // POST -- MANDAR UMA REQUISIÇÃO PARA CRIAR AS MISSOES
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão Criada";}

    // GET -- MANDAR UMA REQUISIÇÃO PARA MOSTRAR AS MISSOES
    @GetMapping("/listar")
    public String listarMissao(){
        return "Missão Listada";}

    // PUT -- MANDAR UMA REQUISIÇÃO PARA ALTERAR AS MISSOES
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão Alterada";}

    // DELETE -- MANDAR UMA REQUISIÇÃO PARA DELETAR AS MISSOES
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missão Deletada";}
}