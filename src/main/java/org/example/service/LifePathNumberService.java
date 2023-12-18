package org.example.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class LifePathNumberService {
    @WebMethod(operationName = "getLifePathNumber")
    @WebResult
    public int calculateLifePathNumber(@WebParam(name="day") int day, @WebParam(name="month") int month,@WebParam(name="year") int year) {
        int dayDigit = reduceToSingleDigit(day);
        int monthDigit = reduceToSingleDigit(month);
        int yearDigit = reduceToSingleDigit(sumDigits(year));

        return sumDigits(dayDigit + monthDigit + yearDigit);
    }

    private int reduceToSingleDigit(int number) {
        while (number > 9) {
            number = sumDigits(number);
        }
        return number;
    }

    private int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
