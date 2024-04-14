package br.com.cadUser;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Pessoa {
	private String nome;
    private ArrayList<String> nomesArmazenados;

 // Construtor
    public Pessoa() {
        nomesArmazenados = new ArrayList<>();
        }

 // Getter e Setter para o atributo nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
 // Getter e Setter para o atributo nomesArmazenados
    public ArrayList<String> getNomesArmazenados() {
        return nomesArmazenados;
    }

    public void setNomesArmazenados(ArrayList<String> nomesArmazenados) {
        this.nomesArmazenados = nomesArmazenados;
    }
    
 // Método de ação para o botão Enviar
    public String enviar() {
        // Adiciona o nome à lista de nomes armazenados
        nomesArmazenados.add(nome);
        // Limpa o campo de entrada
        nome = "";
        // Retorna null para permanecer na mesma página após enviar o formulário
        return null;
    }
}
