package selecionaveis;

public class Teste {

	public static void main(String[] args) {

		ColecaoDeAlunos alunos = new ColecaoDeAlunos("A", "B", "C");
		ColecaoDeProfessores professores = new ColecaoDeProfessores("X", "Y", "Z");
		ColecaoDeDisciplinas disciplinas = new ColecaoDeDisciplinas("J", "K", "L");

		ComponenteDeSeleção cds = new ComponenteDeSeleção(alunos, "C");

		for (String s : cds.getLista()) {
			System.out.println(s);
		}

	}

}
