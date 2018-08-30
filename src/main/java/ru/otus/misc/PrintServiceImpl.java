package ru.otus.misc;

import org.apache.log4j.Logger;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class PrintServiceImpl implements PrintService {

    @Inject
    Logger logger;

    @Override
    public String print() {
        String text = "Print by default";
        logger.info(text);
        return text;
    }
}
