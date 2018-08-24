package ru.otus.bean;

import lombok.Data;
import ru.otus.bean.interfaces.Logonable;

import javax.enterprise.context.RequestScoped;
import java.util.logging.Logger;

@Data
@RequestScoped
public class User implements Logonable {

    private static final Logger logger = Logger.getLogger(User.class.getName());

    private String name;
    private String email;
    private String address;
    private int age;
    private boolean registered;

    @Override
    public boolean logon() {
        logger.info("Logon by name");
        return name != null && !name.isEmpty();
    }
}
