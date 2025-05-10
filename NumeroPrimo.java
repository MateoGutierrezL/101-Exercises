public class NumeroPrimo {

    public void NumerosPrimos(){

        for(int i = 0; i <= 100; i++){

            if (i <= 1){
                continue;
            }

            boolean noPrimo = false;

            for (int k = 2; k < i; k++){

                if (i % k == 0){
                    noPrimo = true;
                    break;
                }
            }

                if (!noPrimo){
                    System.out.println(i);
                }




        }
    }
}
