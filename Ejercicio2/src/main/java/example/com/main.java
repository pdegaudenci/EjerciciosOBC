package example.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args){
        ApplicationContext contexto=new ClassPathXmlApplicationContext("beans.xml");

       UserService usuNotificacion=(UserService) contexto.getBean("UserService");
       usuNotificacion.notificacion.imprimirSaludo();
    }
}
