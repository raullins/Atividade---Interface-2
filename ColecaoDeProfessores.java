package selecionaveis;

import java.util.ArrayList;
import java.util.List;

public class ColecaoDeProfessores implements Selecionavel {

	private List<String> professores;

	public ColecaoDeProfessores(String a, String b, String c) {
		this.professores = new ArrayList<String>();
		this.professores.add(a);
		this.professores.add(b);
		this.professores.add(c);
	}

	public List<String> getList() {
		return this.professores;
	}

}
