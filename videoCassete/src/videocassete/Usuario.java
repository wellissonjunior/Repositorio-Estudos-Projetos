package videocassete;

import java.util.Scanner;

public class Usuario extends Aparelho implements Function {
    

    @Override
    public void iniciarVideo() {
        System.out.println("O filme está rodando...");
        System.out.println("Foi no banheiro e não parou o filme, né?! Aproveita que está em pé e volta um pouquinho apertando na tecla rw");
            System.out.println("Apertou? S/N");
            Scanner voltar = new Scanner(System.in);
            String voltando = voltar.nextLine();
            voltarVideo();
    }
    @Override
    public void pararVideo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pararVideo'");
    }
    @Override
    public void adiantarVideo() {
        System.out.println("Cuidado para não passar demais... Aperta o PLAAAAY!!!!");
        System.out.println("Apertou? S/N");
        Scanner apertandoPlay = new Scanner(System.in);
        String playNovamente = apertandoPlay.nextLine();
        System.out.println("Senta lá no sofá de novo");
        getPlay();
        System.out.println("O filme acabou! Levanta do sofá e aperta o stop. Não esuqce de rebobinar a fita...");
        getRf();
        System.out.println("Meia hora depois...");
        getEject();
        System.out.println("Fim de filme!!!");
    }
    @Override
    public void voltarVideo() {
        System.out.println("Ops! Voltou demais! Aperta o FF para adiantar...");
           adiantarVideo();
    }
    @Override
    public void ejetarFita() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ejetarFita'");
    }
    @Override
    public void colocarFita() {
        System.out.println("Agora encaixe sua fita VHS no aparelho");
        System.out.println("A fita VHS está dentro do aparelho? S/N");
        Scanner colocandoFita = new Scanner(System.in);
        String fita = colocandoFita.nextLine();

        if (fita.equalsIgnoreCase("S")) {
            getPlay();
            iniciarVideo();
            
           
        } else {
            System.out.println("Você terá que procurar a fita se quiser assistir o filme");
        }
        
    }
    @Override
    public void ligarAparelho() {
        
        System.out.println("Para ligar o aparelho você precisa levantar do sofá, ir até o aparelho e clicar no botão ON.");
        System.out.println("Já foi ligar o aparelho? S/N");
        Scanner irLigar = new Scanner(System.in);
        String ligando = irLigar.nextLine();
        if (ligando.equalsIgnoreCase("S")) {
            
            getLiga();
            colocarFita() ;
            
        } else {
            System.out.println("Este aparelho não tem controle remoto, você precisa levantar do sofá, ir até o aparelho e clicar no botão de ligar");
            
        }
    }

}
