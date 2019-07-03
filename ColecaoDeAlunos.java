package selecionaveis;

import java.util.ArrayList;
import java.util.List;

public class ColecaoDeAlunos implements Selecionavel {

	private List<String> alunos;

	public ColecaoDeAlunos(String a, String b, String c) {
		this.alunos = new ArrayList<String>();
		this.alunos.add(a);
		this.alunos.add(b);
		this.alunos.add(c);
	}

	public List<String> getList() {
		return this.alunos;
	}

}
