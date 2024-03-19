package Atividade3LacoDeRepeticao;

public class Atividade3 {
    public static void main(String[] args) {

        int somaPar = 0;
        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0){
                somaPar = somaPar + i;
            }
        }
        System.out.println(somaPar);
    }
}
