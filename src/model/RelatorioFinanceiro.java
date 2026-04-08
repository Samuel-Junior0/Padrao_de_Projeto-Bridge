package model;

import interfaces.Exportador;

import java.util.List;

public class RelatorioFinanceiro extends Relatorio{
    private String titulo = "Relatório Financeiro";

    public RelatorioFinanceiro(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar(boolean detalhado) {
        List<ItemRelatorio> lista = filtrarItensDetalhados(detalhado);
        exportador.exportar(titulo, lista, calcularTotal(lista));
    }
}
