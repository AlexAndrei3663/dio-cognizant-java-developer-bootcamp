package Introducao.projetoNo;

public class ProjetoNo {
    public static void main(String[] args) {
        No<String> no1 = new No<>("Conteudo no1");

        No<String> no2 = new No<>("Conteudo no2");
        no1.setProximoNo(no2);

        No<String> no3 = new No<>("Conteudo no3");
        no2.setProximoNo(no3);

        // no1 -> no2 -> no3 -> null
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);
        System.out.println("---------------------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());

    }
}
