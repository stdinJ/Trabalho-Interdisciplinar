package com.ti2cc;

public class Matricula {
    private int id;
    private String aluno;
    private String curso;

    public Matricula(int id, String aluno, String curso) {
        this.id = id;
        this.aluno = aluno;
        this.curso = curso;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getAluno() { return aluno; }
    public void setAluno(String aluno) { this.aluno = aluno; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
}
