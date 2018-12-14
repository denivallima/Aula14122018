
package com.fieb.senai.entidades;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Estado {
    
    private String nome;
    Set<Integer> cidades = new HashSet<>();

    public Estado(String nome) {
        this.nome = nome;
    }

    public Estado() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estado other = (Estado) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
