package model;

import interfaces.Exportador;

import java.util.ArrayList;
import java.util.List;

public abstract class Relatorio {
    protected Exportador exportador;
    protected List<ItemRelatorio> itens;

    public Relatorio(Exportador exportador) {
        this.exportador = exportador;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemRelatorio item) {
        itens.add(item);
    }

    protected double calcularTotal(List<ItemRelatorio> lista) {
        double soma = 0;
        for (ItemRelatorio item : lista) {
            soma += item.getValor();
        }
        return soma;
    }

    protected List<ItemRelatorio> filtrarItensDetalhados(boolean detalhado) {
        List<ItemRelatorio> novalista = new ArrayList<>();
        if (detalhado) {
            novalista = itens;
        } else {
            for (ItemRelatorio item : itens) {
                if (item.getValor() >= 100) {
                    novalista.add(item);
                }
            }
        }
        return novalista;
    };

    public abstract void gerar(boolean detalhado);
}
