package iscte.ista;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Student john_Student = new Student("John", 123456);
        String john = gson.toJson(john_Student);
        Student paul_Student;
        String paul = "{\"name\":\"Paul\",\"number\":987654}";
        paul_Student = gson.fromJson(paul, Student.class);
    }
}

/*
Escreva a função main() da classe App para pedir ao utilizador o tamanho de uma
lista imaginária de alunos americanos e a produza em formato CVS, com 2 colunas (número e
nome). O número é um inteiro em série, começando no valor da constante INITIAL_NUMBER.
O nome é uma fusão aleatória de um nome próprio (masculino ou feminino) e de um apelido,
ambos obtidos através da leitura dos ficheiros JSON atrás mencionados. Não devem haver dois
alunos com o mesmo nome.

Defina a função String toCSV() na classe Student e considere que estão definidas as seguintes
constantes na classe App:

private static final String FIRSTNAMES_F_FILE = "data/firstnames_f.json";
private static final String FIRSTNAMES_M_FILE = "data/firstnames_m.json";
private static final String SURNAMES_FILE = "data/surnames.json";
private static final String STUDENTS_CVS_FILE = "data/students.cvs";
private static final int INITIAL_NUMBER = 21000;
*/