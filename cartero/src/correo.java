
public class correo {

    private piezas[] pieza;

    public correo(int vector) {
        pieza = new piezas[vector];
    }

    public void agregarProducto(piezas pie) {

        for (int i = 0; i < pieza.length; i++) {
            if (pieza[i] == null) {
                pieza[i] = pie;
                break;
            }

        }
    }
    
    
    public int cantidadPiezasSinEntregar() {
        int contSinEntregar = 0;
        for (int i = 0; i < pieza.length; i++) {
            if (pieza[i].getEntrega() == 0) {
                contSinEntregar++;
            }
        }
        return contSinEntregar;
    }
    
    public int sumatoriaPiezasTipo2() {
        int acuPeso = 0;
        for (int i = 0; i < pieza.length; i++) {
            if (pieza[i].getTipoPieza()== 2) {
                acuPeso+=pieza[i].getPeso();
            }
        }
        return acuPeso;
    }
    
    public String DevolverEstadoEntregado(int NroPiezaingresado) {
        String mensaje="pieza no encontrada";
        for (int i = 0; i < pieza.length; i++) {
            if (pieza[i].getNroPieza()==NroPiezaingresado) {
                if(pieza[i].getEntrega()==0)
                {
                    mensaje = "pieza no entregada";
                }
                else {
                    mensaje = "pieza entregada correctamente";
                    
                }
                break;
            }
        }
        return mensaje;
    }
    
    
}

