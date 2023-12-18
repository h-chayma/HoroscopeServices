package org.example.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.Random;

@WebService
public class CrystalBallService {
    private final String[] ANSWERS = {"Yes", "No", "Maybe", "Absolutely!", "Not a chance", "Possibly"};

    @WebMethod
    @WebResult
    public String getCrystalBallAnswer(@WebParam(name="question")String question) {
        Random random = new Random();
        int index = random.nextInt(ANSWERS.length);
        return ANSWERS[index];
    }
}
