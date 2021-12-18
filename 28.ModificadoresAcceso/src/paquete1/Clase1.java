package paquete1;

/**
 *
 * @author Josh
 */
public class Clase1 {
    
    //public String atributoPublico = "Valor atributo publico";
//    protected String atributoProtected = "Valor atributo protected";
//    String atributoDefault = "Valor atributo default";
//    
//    Clase1(){
//        System.out.println("Constructor default");
//    } 
//    
//    void metodoDefault(){
//        System.out.println("Metodo default");
//    }

//    public Clase1() {
//         System.out.println("Constructor Publico");
//         
//    }
//    
//     public void metodoPublico(){
//        System.out.println("Metodo publico");
//    }
//     
//      protected void metodoProtected(){
//        System.out.println("Metodo protected");
//    }
//    
//       void metodoDefault(){
//        System.out.println("Metodo default");
//    }
    
    
      private String atributoPrivado = "Valor atributo privado";
    
    private Clase1(){
        System.out.println("Constructor privado");
    } 
    
    public Clase1(String argumento){
        this();
        System.out.println("Constructor publico");
    }
    
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
}
