
public class Reserva  {
    private boolean disponivel = true;

    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void reservar( Cliente c1, int quantidadesCad, Restaurante tipoEsp, int mesas ){
        
      if(isDisponivel() == true){
        int operacao = 0;
        int operacaoMes = 0;
        if(quantidadesCad <= tipoEsp.getQuantidadeDeCadeiras() && mesas <= tipoEsp.getQuantidadeDeMesas()){
            operacao = tipoEsp.getQuantidadeDeCadeiras() - quantidadesCad;
            operacaoMes = tipoEsp.getQuantidadeDeMesas() - mesas;
        System.out.println("Quantidade de cadeiras reservadas: " + quantidadesCad);
        System.out.println("Quantidade de Mesas reservadas: " + mesas);
        System.out.println("Tipo de espeaço: " + tipoEsp.getTiposDeEspaço());
        System.out.println("Quantidades de cadeiras restantes: " +operacao);
        System.out.println("Quantidades de mesas restantes: " +operacaoMes);
        System.out.println("RESERVA CONCLUIDA COM SUCESSO");
        }
        else{
            System.out.println("Quantidade de cadeiras e mesas indisponíveis");
        }
   
    }
       else{
        System.out.println("Não temos vagas");
       }
    }

  
}
