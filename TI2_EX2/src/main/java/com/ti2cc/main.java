package com.ti2cc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MatriculaDAO dao = new MatriculaDAO();

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1 - Listar");
            System.out.println("2 - Inserir");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    for (Matricula m : dao.listar()) {
                        System.out.println(m.getId() + " - " + m.getAluno() + " - " + m.getCurso());
                    }
                    break;
                case 2:
                    System.out.print("Aluno: ");
                    String aluno = scanner.nextLine();
                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();
                    dao.inserir(new Matricula(0, aluno, curso));
                    System.out.println("Registro inserido!");
                    break;
                case 3:
                    System.out.print("ID do registro a atualizar: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo aluno: ");
                    String novoAluno = scanner.nextLine();
                    System.out.print("Novo curso: ");
                    String novoCurso = scanner.nextLine();
                    dao.atualizar(new Matricula(idAtualizar, novoAluno, novoCurso));
                    System.out.println("Registro atualizado!");
                    break;
                case 4:
                    System.out.print("ID do registro a excluir: ");
                    int idExcluir = scanner.nextInt();
                    dao.excluir(idExcluir);
                    System.out.println("Registro excluído!");
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}

