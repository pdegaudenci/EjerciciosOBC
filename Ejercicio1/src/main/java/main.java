import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.desktop.AppForegroundListener;

public class main {
    public static void main(String[] args) {

        ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");

        Saludo saludar = (Saludo) contexto.getBean("saludar");
        saludar.imprimirSaludo("Pedro");
    }
}
