package com.example.tp_final;

import java.io.*;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "personne", value = "/")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PersonneDAO personneDAO = new PersonneDAO();

        List<Personne> personnes = personneDAO.getPersonnes();

        request.setAttribute("personnes", personnes);

        request.getRequestDispatcher("personnes.jsp").forward(request, response);
    }
}