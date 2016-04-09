package com.smaola14;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ErrorServlet extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(PrimeNumberCalculator.class);

    public void doGet(HttpServletRequest request, HttpServletResponse response){

        Throwable throwable = (Throwable) request.getAttribute("javax.servlet.error.exception");
        logger.error("A servlet error occurred", throwable);

        try {
            response.getWriter().print("An error occurred. Please contact the administrator.");
        } catch (IOException e) {
            logger.error("Could not get output writer", e);
        }
    }
}