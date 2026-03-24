public class ListaDuplamenteEncadeada {
    NoDuplamenteEncadeado inicio;
    NoDuplamenteEncadeado ultimo;

    ListaDuplamenteEncadeada() {
        this.inicio = new NoDuplamenteEncadeado(null);
        this.ultimo = this.inicio;
    }

    public void adicionar(int conteudo) {
        if(estaVazio()) {
            this.inicio.setConteudo(conteudo);
            this.ultimo = this.inicio;
        } else {
            NoDuplamenteEncadeado novoNo = new NoDuplamenteEncadeado(conteudo);
            this.ultimo.setProx(novoNo);
            novoNo.setAnt(this.ultimo);
            this.ultimo = novoNo;
        }
    }

    public void exibir () {
        if(!estaVazio()) {
            NoDuplamenteEncadeado aux = this.inicio;
            while(aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
        }
    }

    public void exibirInverso () {
        if(!estaVazio()) {
            NoDuplamenteEncadeado aux = this.ultimo;
            while(aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getAnt();
            }
        }
    }

    public boolean estaVazio() {
        if(this.inicio.getConteudo() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void remover(int conteudo) {
        if(verificarExistencia(conteudo)) {
            if(this.inicio.getConteudo() == conteudo) {
                if(this.inicio.getProx() == null) {
                    this.inicio.setConteudo(null);
                    this.ultimo = this.inicio;
                    return;
                } else {
                    this.inicio = this.inicio.getProx();
                    this.inicio.setAnt(null);
                    return;
                }
            } else {
                NoDuplamenteEncadeado aux = this.inicio;
                while(aux.getProx() != null) {
                    if(aux.getProx().getConteudo() == conteudo && aux.getProx().getProx() != null) {
                        aux.setProx(aux.getProx().getProx());
                        aux.getProx().setAnt(aux);
                        return;
                    } else if(this.ultimo.getConteudo() == conteudo) {
                        aux.getProx().setProx(null);
                        //this.ultimo.getAnt().setProx(null);
                        //aux.setProx(aux.getProx().getProx());
                        this.ultimo = aux.getProx();
                        return;
                    }
                }
            }
        }
    }

    public boolean verificarExistencia(int conteudo) {
        if(!estaVazio()) {
            NoDuplamenteEncadeado aux = this.inicio;
            while(aux != null) {
                if (aux.getConteudo() == conteudo) {
                    return true;
                }
                aux = aux.getProx();
            }
        }
        return false;
    }
}
