package selecionaveis;

import java.util.ArrayList;
import java.util.List;

public class ComponenteDeSele��o {

	private List<String> resultado;

	public ComponenteDeSele��o(Selecionavel s, String x) {
		this.resultado = new ArrayList<String>();
		for (String j : (s.getList())) {
			if (x.equals(j)) {
				resultado.add(j);
			}
		}

	}

	public List<String> getLista() {
		return this.resultado;
	}

}
