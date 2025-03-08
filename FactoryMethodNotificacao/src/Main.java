import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type;

        System.out.println("Escolha o tipo de Notificação: ");

        System.out.println("1: E-mail");
        System.out.println("2: SMS");
        System.out.println("3: Push");
        int op = scanner.nextInt();

        switch (op){
            case 1:
                type = "email";//a variável type recebe a string do que deverá ser criado na Factory
                break;

            case 2:
                type = "sms";
                break;

            case 3:
                type = "push";
                break;

            default:
                System.out.println("Opção Inválida!!!");
                return;

        }

        scanner.nextLine();
        System.out.println("Digite a mensagem: ");
        String message = scanner.nextLine();

        Notification notification = NotificationFactory.createNotification(type);//aqui redirecionados a criação de instâncias para a Factory
        notification.send(message);//utilizando os métodos normalmente com os nomes padrão, alem de funcional economiza codigo
    }
}
