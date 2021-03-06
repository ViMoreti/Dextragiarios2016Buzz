package br.com.dextra.estagio2015.atv07;

/** Arrumei o método verifica data pois quando era ano bissexto e fevereiro retornava a resposta errada */

public class Atividade7 {

	private Integer dia;
	private Integer mes;
	private Integer ano;

	public Boolean verificaData(Long dia, Long mes, Long ano) {
		this.dia = dia.intValue();
		this.mes = mes.intValue();
		this.ano = ano.intValue();
		
		if (this.mes > 12 || this.dia > 31) {
			return false;
		}

		if (this.mes <= 7) {
			if (this.mes % 2 == 1 && this.dia <= 31) {
				return true;
			} else if (this.mes % 2 == 0) {
				if (this.mes == 2 && this.dia <= 29) {
					if (this.ano % 4 == 0) {
						return true;
					} else if (this.ano % 4 != 0) {
						return false;
					}
				} else if (this.mes != 2 && this.dia <= 30) {
					return true;
				}
			}
		} else if (this.mes > 7) {
			if (this.mes % 2 == 0 && this.dia <= 31) {
				return true;
			} else if (this.mes % 2 == 1 && this.dia <= 30) {
				return true;
			}
		}
		return false;
	}

}
