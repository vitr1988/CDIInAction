package ru.otus.misc.alternative;

import ru.otus.misc.PrintService;

import javax.enterprise.inject.Alternative;

@Alternative
public class OtherPrintServiceImpl implements PrintService {

    @Override
    public String print() {
        return "Write it manually in test env";
    }
}
