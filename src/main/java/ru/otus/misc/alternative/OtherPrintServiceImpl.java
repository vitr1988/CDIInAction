package ru.otus.misc.alternative;

import org.apache.log4j.Logger;
import ru.otus.misc.PrintService;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

@Alternative
public class OtherPrintServiceImpl implements PrintService {

    @Inject
    Logger logger;

    @Override
    public String print() {
        String text = "Write it manually";
        logger.info(text);
        return text;
    }
}
