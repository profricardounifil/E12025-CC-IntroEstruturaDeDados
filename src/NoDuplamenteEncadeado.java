public class NoDuplamenteEncadeado {
    Integer conteudo;
    NoDuplamenteEncadeado prox;
    NoDuplamenteEncadeado ant;

    NoDuplamenteEncadeado(Integer conteudo) {
        this.conteudo = conteudo;
        this.prox = null;
        this.ant = null;
    }

    public Integer getConteudo() {
        return conteudo;
    }

    public void setConteudo(Integer conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplamenteEncadeado getProx() {
        return prox;
    }

    public void setProx(NoDuplamenteEncadeado prox) {
        this.prox = prox;
    }

    public NoDuplamenteEncadeado getAnt() {
        return ant;
    }

    public void setAnt(NoDuplamenteEncadeado ant) {
        this.ant = ant;
    }
}
