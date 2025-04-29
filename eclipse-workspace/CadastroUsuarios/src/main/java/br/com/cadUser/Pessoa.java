package br.com.cadUser;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class Pessoa {

	private String name;
    private List<String> names = new ArrayList<>();

    public void adicionarNome() {
        if (name != null && !name.trim().isEmpty()) {
            names.add(name);
            name = ""; // limpa o campo após adicionar
        }
    }

    // Getter e Setter para nome
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter e Setter para nomes
    public List<String> getNames() {
        return names;
    }
    public void setNames(List<String> names) {
        this.names = names;
    }
}
