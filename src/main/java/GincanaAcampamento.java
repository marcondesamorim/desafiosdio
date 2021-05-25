import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GincanaAcampamento {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        List<String> alunos = new ArrayList<>();

        int numeroDeAlunos;
        String aluno;
        String valorFicha;
        int valorAtualFicha;
        int indiceAtual;
        int indiceAlunoEliminado;

        numeroDeAlunos = Integer.parseInt(scr.next());

        while (numeroDeAlunos > 0) {

            for (int i = 0; i < numeroDeAlunos; i++) {

                aluno = scr.next();
                valorFicha = scr.next();
                alunos.add(aluno.trim() + " " + valorFicha.trim());

            }

            indiceAtual = 0;
            indiceAlunoEliminado = 0;
            valorAtualFicha = Integer.parseInt(alunos.get(indiceAtual).split(" ")[1]);

            for (int i = 0; i < numeroDeAlunos - 1; i++) {

                if (valorAtualFicha % 2 == 0) {

                    indiceAlunoEliminado = (alunos.size() - (valorAtualFicha % alunos.size()) + indiceAtual) % alunos.size();

                } else if (valorAtualFicha % 2 != 0) {

                    indiceAlunoEliminado = (valorAtualFicha % alunos.size() + indiceAtual) % alunos.size();

                }

                valorAtualFicha = Integer.parseInt(alunos.get(indiceAlunoEliminado).split(" ")[1]);
                alunos.remove(indiceAlunoEliminado);

                indiceAtual = (valorAtualFicha % 2 == 0) ?
                        ((indiceAlunoEliminado <= alunos.size() - 1) ?
                                indiceAlunoEliminado : 0) :
                        ((indiceAlunoEliminado == 0) ?
                                (alunos.size() - 1) : (indiceAlunoEliminado - 1));

            }

            System.out.println("Vencedor(a): " + alunos.get(0).split(" ")[0]);

            alunos.clear();
            numeroDeAlunos = Integer.parseInt(scr.next());

        }
        scr.close();
    }
}