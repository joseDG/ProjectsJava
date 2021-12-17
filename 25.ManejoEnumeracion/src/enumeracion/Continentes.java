package enumeracion;


public enum Continentes {
    //se pueden agregar mas valores
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    //se agrega final porque no quiero que se modifique
    private final int paises;

    //se pueden agregar mas valores
    private Continentes(int paises) {
        this.paises = paises;
    }
    
    //como esta final la variable solo puedo obtenerlo
    public int getPaises() {
        return paises;
    }
    
    
    
}
