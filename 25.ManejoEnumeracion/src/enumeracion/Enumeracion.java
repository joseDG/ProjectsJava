
package enumeracion;

public class Enumeracion {
    public static void main(String[] args) {
        
//        System.out.println("Dia 1:" + Dias.LUNES);
//        indicarDiaSemana(Dias.MARTES);

        System.out.println("Continente No4: " + Continentes.AMERICA);
        System.out.println("No de paises en el 4to contienente es de: " + Continentes.AFRICA.getPaises());
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Dia 1 " + dias.LUNES);
            break;
            case MARTES:
                System.out.println("Dia 2 " + dias.MARTES);
            break;
            default:
                System.out.println("Ese dia no existe");
        }
    }
}
