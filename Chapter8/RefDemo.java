package Chapter8;

public class RefDemo {
    pubic static void main ( String [] args) {
        BoxWeight weightbox = new BoxWeight(З, 5, 7, 8.37);
        Вох plainbox = new Вох();
        double vol;
        vol = weightbox.volume() ;
        System.out . println ( " Oбъeм weightbox ра вен "+ vol ) ;
        System. out . println ( "Bec weightbox равен "+
                weightbox.weight );
        System. out . println ( ) ;
        // Присвоить ссыпку на BoxWe ight ссыпке на Вох.
        plainbox = weightbox;
        vol = plainbox.volume() ; // нормально, метод volume () определен в Вох
        System.out.println("Oбъeм plainbox равен " + vol );
/* Следующий оператор ошибочен, пот ому что член weight в plainbox
не определен . */
// System.out . print ln ( "Bec plainbox равен "+ plainbox . weight )
}
