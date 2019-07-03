package selecionaveis;

import java.util.ArrayList;
import java.util.List;

public class ColecaoDeDisciplinas implements Selecionavel {

	private List<String> disciplinas;

	public ColecaoDeDisciplinas(String a, String b, String c) {
		this.disciplinas = new ArrayList<String>();
		this.disciplinas.add(a);
		this.disciplinas.add(b);
		this.disciplinas.add(c);
	}

	public List<String> getList() {
		return this.disciplinas;
	}

}
