package ConcreteImplementors;

import interfaces.Exportador;
import model.ItemRelatorio;

import java.util.List;

public class ExportadorPDF implements Exportador {
    @Override
    public void exportar(String titulo, List<ItemRelatorio> itens, double total) {
        System.out.printf("""
                === EXPORTANDO PDF ===
                Título: %s
                Itens:\s
                """, titulo);
        for(ItemRelatorio item : itens) {
            System.out.printf("- %s | R$%.2f\n", item.getDescricao(), item.getValor());
        }
        System.out.printf("""
                Total: R$%.2f
                ======================\n
                """, total);
    }
}
