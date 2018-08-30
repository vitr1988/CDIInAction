package ru.otus.misc.decorator;

import ru.otus.misc.PrintService;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class AdditionalPrintServiceImpl implements PrintService {

    @Inject
    @Delegate
    PrintService service;

    @Override
    public String print() {
        return service.print() + " with decorator";
    }
}
