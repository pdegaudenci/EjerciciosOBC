package example.com;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService notificacion;

    public UserService(NotificationService notificacion){
        this.notificacion =notificacion;
    }
}
