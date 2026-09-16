package siga;

public class ConsultaBuilder {
//    public String montarConsulta(String tabela, String filtro, String ordenacao,
//                                 int limite, int offset, int timeoutSegundos,
//                                 boolean somenteAtivos)
    private String tabela;
    private String filtro;
    private String ordenacao;
    private int limite;
    private int offset;
    private int timeoutSegundos;
    private boolean somenteAtivos;

    public ConsultaBuilder(String tabela) {
        this.tabela = tabela;
    }

    public ConsultaBuilder filtro(String filtro) {
        this.filtro = filtro;
        return this;
    }

    public ConsultaBuilder ordenacao(String ordenacao) {
        this.ordenacao = ordenacao;
        return this;
    }

    public ConsultaBuilder limite(int limite) {
        this.limite = limite;
        return this;
    }

    public ConsultaBuilder offset(int offset) {
        this.offset = offset;
        return this;
    }

    public ConsultaBuilder timeoutSegundos(int timeoutSegundos) {
        this.timeoutSegundos = timeoutSegundos;
        return this;
    }

    //Neste metodo apliquei o valor true diretamente de vez passar algum parametro para melhorar a semantica
    public ConsultaBuilder somenteAtivos() {
        this.somenteAtivos = true;
        return this;
    }


}
