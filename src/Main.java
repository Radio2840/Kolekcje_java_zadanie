import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> imiona_unikatowe = new HashSet<>();
        System.out.println("Wprowadzaj imiona, znak '-' jest wyjsciem z petli");
        while(true){
            String wartosc = scanner.next();
            if(Objects.equals(wartosc, "-")){
                break;
            }
            else {
                imiona_unikatowe.add(wartosc);
            }
        }

        for(String s:imiona_unikatowe){
            System.out.println(s);
        }


        System.out.println("Wprowadzaj imiona dwoch par, znak '-' jest wyjsciem z petli");

        Map<String,String> mapa = new HashMap<>();
        String os1;
        String os2;
        while(true){
            System.out.println("Podaj imie os1");
            os1 = scanner.next();
            System.out.println("Podaj imie os2");
            os2 = scanner.next();
            if(Objects.equals(os1, "-"  ) || Objects.equals(os2,"-")){
                break;
            }
            else{
                mapa.put(os1,os2);
            }
        }

        System.out.println("Podaj imie partnera"); // nie wiem jak zrobic 3 wartosciowa mape bo kluczen nie moga sie powtazac :c
        String key= scanner.next();
        if(mapa.get(key)==null){
            System.out.println("nie ma takiej pary, lub zle wpisales imie");
        }
        else {
            System.out.println(key + " <3 " + mapa.get(key));
        }
    }
}