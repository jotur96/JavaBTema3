public class App {
    public static void main(String[] args) throws Exception {
  
        String[] nombres = new String[]{"a","b","a","b","a","b","a","b","a","b","a","b"};

        String resultado = "";

        for(int i=0; i < nombres.length;i++){

            resultado += " "+nombres[i];

        }

        System.out.println(resultado);

    }
}
