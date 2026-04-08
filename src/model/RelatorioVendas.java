package model;

import interfaces.Exportador;

import java.util.List;

public class RelatorioVendas extends Relatorio{
    private String titulo = "Relatório de Vendas";

    public RelatorioVendas(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar(boolean detalhado) {
        List<ItemRelatorio> lista = filtrarItensDetalhados(detalhado);
        exportador.exportar(titulo, lista, calcularTotal(lista));
    }
}