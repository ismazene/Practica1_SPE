package org.example;

abstract class MetodoPago {
    public abstract void procesarPago(double importe);


    class TarjetaCredito extends MetodoPago {
        private String nr_targeta = "16";
        private String opcionVisa = "VISA";
        private String opcionMastercard = "MASTERCAD";
        private String opcionMaestro = "MAESTRO";

        
        @Override
        public void procesarPago(double importe) {

        }
    }

    class PayPal extends MetodoPago {
        @Override
        public void procesarPago(double importe) {

        }
    }

    class Bizum extends MetodoPago {
        @Override
        public void procesarPago(double importe) {
        }
    }
}
