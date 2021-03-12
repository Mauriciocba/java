
public class piezas {
    
    
    private int nroPieza;
    private int tipoPieza;
    private int peso;
    private int entrega;

    public piezas(int nroPieza, int tipoPieza, int peso, int entrega) {
        this.nroPieza = nroPieza;
        this.tipoPieza = tipoPieza;
        this.peso = peso;
        this.entrega = entrega;
    }

    public piezas() {
       nroPieza = 0;
       tipoPieza = 0;
       peso = 0;
       entrega =0;
        
        
    }


    public int getNroPieza() {
        return nroPieza;
    }

    public void setNroPieza(int nroPieza) {
        this.nroPieza = nroPieza;
    }

    public int getTipoPieza() {
        return tipoPieza;
    }

    public void setTipoPieza(int tipoPieza) {
        this.tipoPieza = tipoPieza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEntrega() {
        return entrega;
    }

    public void setEntrega(int entrega) {
        this.entrega = entrega;
    }
  
 
    
}

