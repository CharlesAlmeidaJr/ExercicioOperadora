import java.util.Scanner;

public class PlanoOperadora {
    
    public static void main(String[] args) {
        
        String plano, descricaoPlano = null, confirmar = "N";
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("\nEscolha o plano:\nB - BASIC\nM - MIDIA\nT - TURBO");
            plano = scanner.next();
            plano = plano.toUpperCase();

            switch(plano){
                case "B":
                    descricaoPlano = "Plano BASIC: 100 minutos de ligação.";
                    System.out.println("\nPlano escolhido:\n" + descricaoPlano + "\nTecla 'S' e ENTER para confirmar.");
                    confirmar = scanner.next();
                break;

                case "M":
                    descricaoPlano = "Plano MIDIA: 100 minutos de ligação + Whats e Instagram grátis.";
                    System.out.println("\nPlano escolhido:\n" + descricaoPlano + "\nTecla 'S' e ENTER para confirmar.");
                    confirmar = scanner.next();
                break;

                case "T":
                    descricaoPlano = "Plano TURBO: 100 minutos de ligação + Whats e Instagram grátis + 5Gb Youtube.";
                    System.out.println("\nPlano escolhido:\n" + descricaoPlano + "\nTecla 'S' e ENTER para confirmar.");
                    confirmar = scanner.next();
                break;

                default:
                    System.out.println("\nEscolha inválida");
                break;
            }

            confirmar = confirmar.toUpperCase();

        }while(!confirmar.equals("S"));

        System.out.println("\n\nPlano contratado: " + descricaoPlano);
    }

}
