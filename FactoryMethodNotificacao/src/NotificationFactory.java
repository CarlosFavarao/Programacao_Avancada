public class NotificationFactory{
    public static Notification createNotification(String type){
        switch(type){ //essa classe Instância as classes, melhorando a manutenção e, em geral, ajudando a descomplicar as chamadas na classe main
            case "email":
                return new EmailNotification();//instanciando...

            case "sms":
                return new SMSNotification();

            case "push":
                return new PushNotification();

        }
        return null;
    }
}
