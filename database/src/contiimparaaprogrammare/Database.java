package contiimparaaprogrammare;

import java.util.ArrayList;

/**
 *
 * @author Enrico
 */
public class Database {
    
    private ArrayList labels;
    public int[][] values;
    
    public Database(){
        //inizializzo l'array
        this.labels = new ArrayList();
        
        //assegno i nomi delle colonne
        this.labels.add("id");
        this.labels.add("nome");
        this.labels.add("costo");
        this.labels.add("tasse");
        
        //inizializzo la matrice
        this.values = new int[10][labels.size()];
        
        for(int i=0; i<values.length; i++){
            for(int c=0; c<values[0].length; c++){
                values[i][c] = -1;
            }
        }

    }
    
    /**
     * 
     * @param id
     * @param nome
     * @param costo
     * @param tasse
     * @return 1 if success, 0 if already present, -1 if db full
     */
    public int addAlimento(int id, int nome, int costo, int tasse){
        //scorro la prima colonna del db per verificare che non ci siano 
        //alimenti con lo stesso id ritornando 0 se due alimenti 
        //hanno lo stesso id 
        for(int i=0; i<values.length; i++){
            if(values[i][0] == id){
                return 0;
            }
        }
        //scorro la seconda colonna per verificare che nessun alimento abbia 
        //lo stesso nome di un altro in tal caso ritorna 0
        for(int i=0; i<values.length; i++){
            if(values[i][1] == nome){
                return 0;
            }
        }
        //a questo punto aggiungo l'alimento al db scorrendo ogni campo della 
        //prima riga libera che trovo per poi ritornare uno per
        //confermare la riuscita del metodo
        for(int i=0; i<values.length; i++){
            if(values[i][0] == -1){
                values[i][0] = id;
                values[i][1] = nome;
                values[i][2] = costo;
                values[i][3] = tasse;
                return 1;
            }            
        }
        //in caso il db fosse già pieno ritorna -1
        return -1;
    }
    
    @Override
    public String toString(){
        
        String s = "";
        for(int i=0; i<labels.size(); i++){
            s += labels.get(i) + "\t";
        }
        
        s += "\n";
        for(int i=0; i<values.length; i++){
            for(int c=0; c<values[0].length; c++){
                s += values[i][c] + "\t";
                
            }
            s += "\n";
        }
        
        return s;
    }
}
