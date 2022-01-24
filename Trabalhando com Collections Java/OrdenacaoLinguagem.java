import java.util.*;

/**
 * Exercício proposto na aula Set do cursos Trabalhando com Collections Java
 * 
 * Crie uma classe LinguagemFavorita que possua os atributos nome,
 * anoDeCriacao e ide. Em seguida, crie um conjunto com 3 linguagens
 * e faça um programa que ordene esse conjunto por:
 * - Odem de inserção
 * - Ordem natural (nome)
 * - IDE
 * - Ano de criação e nome
 * - Nome, ano de criação e IDE
 * - Ao final, exeba as liguagem no console uma abaixo da outra
 */

public class OrdenacaoLinguagem {
    public static void main(String[] args) {
        List<LinguagemFavorita> listaLinguagens = new ArrayList<>();
        listaLinguagens.add(new LinguagemFavorita("Java", 1991, "Eclipse"));
        listaLinguagens.add(new LinguagemFavorita("Phyton", 1991, "Jupyter Notebook"));
        listaLinguagens.add(new LinguagemFavorita("C", 1972, "Visual Studio Code"));

        System.out.println("Orem de inserção");
        Set<LinguagemFavorita> minhaLiguagemInsercao = new LinkedHashSet<>(listaLinguagens);
        for (LinguagemFavorita linguagem : minhaLiguagemInsercao)
            System.out.println(linguagem);
        
        System.out.println("\nOrdem natural (nome)");
        Set<LinguagemFavorita> minhaLiguagemOrdenada = new TreeSet<>(listaLinguagens);
        for (LinguagemFavorita linguagem : minhaLiguagemOrdenada)
            System.out.println(linguagem);

        System.out.println("\nIDE");
        minhaLiguagemOrdenada = new TreeSet<>(new ComparatorIDE());
        minhaLiguagemOrdenada.addAll(listaLinguagens);
        for (LinguagemFavorita linguagem : listaLinguagens)
            System.out.println(linguagem);
            
        System.out.println("\nAno de criação e nome");
        minhaLiguagemOrdenada = new TreeSet<>(new ComparatorAnoNome());
        minhaLiguagemOrdenada.addAll(listaLinguagens);
        for (LinguagemFavorita linguagem : listaLinguagens)
            System.out.println(linguagem);

        System.out.println("\nNome, Ano de criação, IDE");
        minhaLiguagemOrdenada = new TreeSet<>(new ComparatorNomeAnoIde());
        minhaLiguagemOrdenada.addAll(listaLinguagens);
        for (LinguagemFavorita linguagem : listaLinguagens)
            System.out.println(linguagem);
    }
    
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private int anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "{Nome: " + this.nome +
                "\tAno de criação: " + this.anoDeCriacao +
                "\tIDE: " + this.ide + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LinguagemFavorita other = (LinguagemFavorita) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public int compareTo(LinguagemFavorita o) {
        return this.nome.compareTo(o.nome);
    }
}

class ComparatorIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int anoDeCriacao = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if (anoDeCriacao != 0)
            return anoDeCriacao;
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int comapador = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (comapador != 0)
            return comapador;
        comapador = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if (comapador != 0)
            return comapador;
        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
}