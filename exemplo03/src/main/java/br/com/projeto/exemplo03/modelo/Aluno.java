package br.com.projeto.exemplo03.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "alunos")
@Getter
@Setter
public class Aluno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String aluno;

    @ManyToMany
    @JoinTable(
        name = "tabela_auxiliar",
        joinColumns = {@JoinColumn(name = "codigo_aluno", referencedColumnName = "codigo")},
        inverseJoinColumns = {@JoinColumn(name = "codigo_curso", referencedColumnName = "codigo")}
    )
    private List<Curso> cursos = new ArrayList<>();

}
