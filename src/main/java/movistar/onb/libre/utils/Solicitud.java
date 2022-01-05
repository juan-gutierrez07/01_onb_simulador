package movistar.onb.libre.utils;

public class Solicitud {

    private String url;
    private double monto;
    private int cuota;
    private double tasa_anual_ef;
    private double range;
    public Solicitud(String url, double monto,int cuota,double tasa_anual_ef, double range){
        this.url= url;
        this.monto= monto;
        this.cuota= cuota;
        this.tasa_anual_ef = tasa_anual_ef;
        this.range=range;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public double getTasa_anual_ef() {
        return tasa_anual_ef;
    }

    public void setTasa_anual_ef(double tasa_anual_ef) {
        this.tasa_anual_ef = tasa_anual_ef;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "url='" + url + '\'' +
                ", monto=" + monto +
                ", cuota=" + cuota +
                ", tasa_anual_ef=" + tasa_anual_ef +
                ", range=" + range +
                '}';
    }

}
