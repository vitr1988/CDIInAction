package ru.otus.bean;

import ru.otus.bean.interfaces.Logonable;
import ru.otus.qualifier.Id;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/reader")
public class ReaderServlet extends HttpServlet {

    @Inject
    Reader reader;

    @Id//(lang = LangEnum.ENGLISH)
    @Inject
    Logonable account;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println(reader.read());
    }
}
