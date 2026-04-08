import ConcreteImplementors.ExportadorExcel;
import ConcreteImplementors.ExportadorPDF;
import model.ItemRelatorio;
import model.RelatorioFinanceiro;
import model.RelatorioVendas;

public class Main {
    public static void main(String[] args) {

        ExportadorExcel expoE = new ExportadorExcel();
        ExportadorPDF expoP = new ExportadorPDF();

        ItemRelatorio itemA = new ItemRelatorio("Produto A", 50);
        ItemRelatorio itemB = new ItemRelatorio("Produto B", 200);
        ItemRelatorio itemC = new ItemRelatorio("Produto C", 150);

        RelatorioFinanceiro re1 = new RelatorioFinanceiro(expoP);
        re1.adicionarItem(itemA);
        re1.adicionarItem(itemB);
        re1.adicionarItem(itemC);

        RelatorioFinanceiro re2 = new RelatorioFinanceiro(expoE);
        re2.adicionarItem(itemA);
        re2.adicionarItem(itemB);
        re2.adicionarItem(itemC);

        RelatorioVendas re3 = new RelatorioVendas(expoP);
        re3.adicionarItem(itemA);
        re3.adicionarItem(itemB);
        re3.adicionarItem(itemC);

        RelatorioVendas re4 = new RelatorioVendas(expoE);
        re4.adicionarItem(itemA);
        re4.adicionarItem(itemB);
        re4.adicionarItem(itemC);

        re1.gerar(false);
        re2.gerar(true);
        re3.gerar(true);
        re4.gerar(false);

    }
}
