package one.digitalinovattion.oo.fundamentos;

public class Carro extends Veiculo {

    private String cor;
    private String modelo;
    private int capacidadeTanque;

    public Carro() {

    }

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    }

    /**
     * @return String return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return String return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return int return the capacidadeTanque
     */
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    /**
     * @param capacidadeTanque the capacidadeTanque to set
     */
    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public Double calculaValorParaEncherTaque(Double valorGasolina) {

        return this.getCapacidadeTanque() * valorGasolina;
    }

}