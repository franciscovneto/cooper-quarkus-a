package br.cooper.quarkus.a;

public class CotacaoDiariaDados {

	private String cotacaoCompra;
	private String cotacaoVenda;
	private String dataHoraCotacao;

	/**
	 * @return the cotacaoCompra
	 */
	public String getCotacaoCompra() {
		return cotacaoCompra;
	}

	/**
	 * @param cotacaoCompra the cotacaoCompra to set
	 */
	public void setCotacaoCompra(String cotacaoCompra) {
		this.cotacaoCompra = cotacaoCompra;
	}

	/**
	 * @return the cotacaoVenda
	 */
	public String getCotacaoVenda() {
		return cotacaoVenda;
	}

	/**
	 * @param cotacaoVenda the cotacaoVenda to set
	 */
	public void setCotacaoVenda(String cotacaoVenda) {
		this.cotacaoVenda = cotacaoVenda;
	}

	/**
	 * @return the dataHoraCotacao
	 */
	public String getDataHoraCotacao() {
		return dataHoraCotacao;
	}

	/**
	 * @param dataHoraCotacao the dataHoraCotacao to set
	 */
	public void setDataHoraCotacao(String dataHoraCotacao) {
		this.dataHoraCotacao = dataHoraCotacao;
	}
}