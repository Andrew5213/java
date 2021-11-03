package ExercicioMap;

import program_users.endities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class principal {
    public static void main(String[] args) {
        System.out.println("programa do sistema eleitoral");
        System.out.println("digite o local do arquivo");
        Scanner in = new Scanner(System.in);
        String caminho = in.nextLine();
        Map<String,Integer> map = new LinkedHashMap<>() ;

        try(BufferedReader bd = new BufferedReader(new FileReader(caminho))){
            String line=bd.readLine();
            while(line !=null){
                String[] fields =line.split(",");
                String username=fields[0];
                int votos = Integer.parseInt(fields[1]);
                if(map.containsKey(username)){
                    int votesSoFar=map.get(username);
                    map.put(username,votos+votesSoFar);

                } else {
                    map.put(username, votos);
                }
                line=bd.readLine();
            }
            for (String key : map.keySet() ){
                System.out.println(key +":"+map.get(key));
            }
        }catch (IOException e){
            System.out.println("erro!! "+e.getMessage());
        }
        in.close();
    }
}
