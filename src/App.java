public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente nomes[] = new Cliente[3];
        nomes[0] = new Cliente( "53178952461", "Juan");
        nomes[1] = new Cliente( "49635687512", "Marcos");
        nomes[2] = new Cliente( "19588327899", "Débora");

        Restaurante rest [] = new Restaurante[3];
        rest[0] = new Restaurante("1");
        rest[1] = new Restaurante("2");
        rest[2] = new Restaurante("3");

       nomes[2].apresentar();
       Reserva num = new Reserva();
       num.reservar(nomes[2], 200, rest[2], 40);
        
    }
}
