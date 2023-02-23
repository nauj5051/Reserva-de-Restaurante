public class Restaurante  {
    private int quantidadeDeCadeiras = 200;
    private int quantidadeDeMesas = 50;
    private String tiposDeEspaço;
    
    public Restaurante(String tiposDeEspaço) {
        setTiposDeEspaço(tiposDeEspaço);
    }

    public int getQuantidadeDeMesas() {
        return quantidadeDeMesas;
    }
    public void setQuantidadeDeMesas(int quantidadeDeMesas) {
        this.quantidadeDeMesas = quantidadeDeMesas;
    }
   
    public int getQuantidadeDeCadeiras() {
        return quantidadeDeCadeiras;
    }
    public void setQuantidadeDeCadeiras(int quantidadeDeCadeiras) {
        this.quantidadeDeCadeiras = quantidadeDeCadeiras;
    }
    public String getTiposDeEspaço() {
        return tiposDeEspaço;
    }

    public void setTiposDeEspaço(String tiposDeEspaço) {
        if(tiposDeEspaço == "1"){
            this.tiposDeEspaço = "Espaço Criança";
        }
        else if(tiposDeEspaço == "2"){
            this.tiposDeEspaço = "Espaço Família";
        }
        else if(tiposDeEspaço == "3"){
            this.tiposDeEspaço = "Espaço Corporativo";
        }    
    }
   
    
}
