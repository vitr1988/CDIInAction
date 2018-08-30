package ru.otus.bean;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class Reader implements Readable {

    @Override
    public int read() {
        return 0;
    }
}
