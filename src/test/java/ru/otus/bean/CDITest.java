package ru.otus.bean;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.junit4.WeldInitiator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import ru.otus.misc.PrintService;
import ru.otus.misc.alternative.OtherPrintServiceImpl;
import ru.otus.qualifier.Id;

import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;

public class CDITest {

    @Rule
    public WeldInitiator weld = WeldInitiator.from(
            new Weld().beanClasses(PrintService.class, Account.class).addAlternative(OtherPrintServiceImpl.class)).inject(this).build();

    @Inject
    PrintService service;

    @Test
    public void testAccount() {
        Account account = weld.select(Account.class, new AnnotationLiteral<Id>(){}).get();
        Assert.assertFalse(account.logon());

        account.setId(-1);
        Assert.assertTrue(account.logon());
    }

    @Test
    public void testPrintService() {
        Assert.assertEquals("Write it manually in test env", service.print());
    }
}
