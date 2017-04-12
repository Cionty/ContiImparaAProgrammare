package contiimparaaprogrammare;

/**
 *
 * @author Enrico Conti
 */
public class ContiImparaAProgrammare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creo un istanza della classe coniglio di pascqua
        Database db = new Database();
        
        //printo la tabella prima di effettuare modifiche
        System.out.println("board prima della modifica\n");
        System.out.println(db);
        
        //aggiungo 4 alimenti
        db.addAlimento(1, 5, 18, 22);
        db.addAlimento(3, 4, 18, 22);
        db.addAlimento(2, 6, 25, 5);
        db.addAlimento(5, 2, 5, 12);
        db.addAlimento(654, 513, 18, 22);
        db.addAlimento(3, 4, 12, 42);//alimento non aggiunto
        db.addAlimento(2, 5, 25, 11);//alimento non aggiunto
        db.addAlimento(32, 15, 5, 13);
        db.addAlimento(13, 14, 8, 22);
        db.addAlimento(34, 44, 18, 22);
        db.addAlimento(2, 5, 25, 5);//alimento non aggiunto
        db.addAlimento(1, 5, 5, 12);//alimento non aggiunto
        db.addAlimento(4532, 421, 18, 22);
        db.addAlimento(32, 145, 58, 42);//alimento non aggiunto
        db.addAlimento(2222222, 4545, 25, 5);
        db.addAlimento(3, 5, 5, 12);//alimento non aggiunto
        
        //verifico che gli unici alimenti aggiunti siano il primo e il secondo
        System.out.println("\nboard dopo della modifica\n");
        System.out.println(db);
        
    }
    
}
