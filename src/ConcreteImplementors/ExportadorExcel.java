package ConcreteImplementors;

import interfaces.Exportador;
import model.ItemRelatorio;

import java.util.List;

public class ExportadorExcel implements Exportador {
    @Override
    public void exportar(String titulo, List<ItemRelatorio> itens, double total) {
        System.out.printf("""
                === EXPORTANDO EXCEL ===
                %s
                """, titulo);
        for (ItemRelatorio item : itens) {
            System.out.printf("%s;%.2f\n", item.getDescricao(), item.getValor());
        }
        System.out.printf("""
                TOTAL; %.2f
                ======================\n
                """, total);
    }
}
