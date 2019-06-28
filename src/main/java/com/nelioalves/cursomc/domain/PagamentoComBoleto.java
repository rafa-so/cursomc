package com.nelioalves.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.nelioalves.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento {
	
	private static final long serialVersionUID = 1L;
	
	private Date dataVenvimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
		super();
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, 
			Date dataVenvimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataVenvimento = dataVenvimento;
		this.dataPagamento = dataPagamento;
	}
	
	public Date getDataVenvimento() {
		return dataVenvimento;
	}
	
	public void setDataVenvimento(Date dataVenvimento) {
		this.dataVenvimento = dataVenvimento;
	}
	
	public Date getDataPagamento() {
		return dataPagamento;
	}
	
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
}
