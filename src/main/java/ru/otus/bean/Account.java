package ru.otus.bean;

import lombok.Data;
import org.apache.log4j.Logger;
import ru.otus.bean.interfaces.Logonable;
import ru.otus.qualifier.Id;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Id
@Data
@Dependent
public class Account implements Logonable {

    private int id;
    private String name;

    @Override
    public boolean logon() {
        return id != 0;
    }
}
