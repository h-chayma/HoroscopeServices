package org.example.service;

import org.example.entity.Person;
import org.example.proxy.ZodiacSignService;
import org.example.proxy.ZodiacSignServiceService;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

@WebService
public class LoveCompatibilityService {
    private static final Map<String, Map<String, Integer>> compatibilityMap = new HashMap<>();

    static {
        // Aries' compatibility scores
        Map<String, Integer> ariesCompatibility = new HashMap<>();
        ariesCompatibility.put("Taurus", 80);
        ariesCompatibility.put("Gemini", 60);
        ariesCompatibility.put("Cancer", 50);
        ariesCompatibility.put("Leo", 75);
        ariesCompatibility.put("Virgo", 40);
        ariesCompatibility.put("Libra", 65);
        ariesCompatibility.put("Scorpio", 30);
        ariesCompatibility.put("Sagittarius", 70);
        ariesCompatibility.put("Capricorn", 45);
        ariesCompatibility.put("Aquarius", 55);
        ariesCompatibility.put("Pisces", 35);

        compatibilityMap.put("Aries", ariesCompatibility);

        // Taurus compatibility scores
        Map<String, Integer> taurusCompatibility = new HashMap<>();
        taurusCompatibility.put("Aries", 80);
        taurusCompatibility.put("Gemini", 70);
        taurusCompatibility.put("Cancer", 60);
        taurusCompatibility.put("Leo", 50);
        taurusCompatibility.put("Virgo", 90);
        taurusCompatibility.put("Libra", 40);
        taurusCompatibility.put("Scorpio", 30);
        taurusCompatibility.put("Sagittarius", 65);
        taurusCompatibility.put("Capricorn", 75);
        taurusCompatibility.put("Aquarius", 55);
        taurusCompatibility.put("Pisces", 85);

        compatibilityMap.put("Taurus", taurusCompatibility);

        // Gemini compatibility scores
        Map<String, Integer> geminiCompatibility = new HashMap<>();
        geminiCompatibility.put("Aries", 60);
        geminiCompatibility.put("Taurus", 70);
        geminiCompatibility.put("Cancer", 40);
        geminiCompatibility.put("Leo", 65);
        geminiCompatibility.put("Virgo", 50);
        geminiCompatibility.put("Libra", 75);
        geminiCompatibility.put("Scorpio", 35);
        geminiCompatibility.put("Sagittarius", 55);
        geminiCompatibility.put("Capricorn", 45);
        geminiCompatibility.put("Aquarius", 80);
        geminiCompatibility.put("Pisces", 30);

        compatibilityMap.put("Gemini", geminiCompatibility);

        // Cancer compatibility scores
        Map<String, Integer> cancerCompatibility = new HashMap<>();
        cancerCompatibility.put("Aries", 50);
        cancerCompatibility.put("Taurus", 60);
        cancerCompatibility.put("Gemini", 40);
        cancerCompatibility.put("Leo", 55);
        cancerCompatibility.put("Virgo", 75);
        cancerCompatibility.put("Libra", 30);
        cancerCompatibility.put("Scorpio", 80);
        cancerCompatibility.put("Sagittarius", 45);
        cancerCompatibility.put("Capricorn", 35);
        cancerCompatibility.put("Aquarius", 65);
        cancerCompatibility.put("Pisces", 70);

        compatibilityMap.put("Cancer", cancerCompatibility);

        // Leo compatibility scores
        Map<String, Integer> leoCompatibility = new HashMap<>();
        leoCompatibility.put("Aries", 75);
        leoCompatibility.put("Taurus", 50);
        leoCompatibility.put("Gemini", 65);
        leoCompatibility.put("Cancer", 55);
        leoCompatibility.put("Virgo", 40);
        leoCompatibility.put("Libra", 70);
        leoCompatibility.put("Scorpio", 45);
        leoCompatibility.put("Sagittarius", 85);
        leoCompatibility.put("Capricorn", 30);
        leoCompatibility.put("Aquarius", 60);
        leoCompatibility.put("Pisces", 35);

        compatibilityMap.put("Leo", leoCompatibility);

        // Virgo compatibility scores
        Map<String, Integer> virgoCompatibility = new HashMap<>();
        virgoCompatibility.put("Aries", 40);
        virgoCompatibility.put("Taurus", 90);
        virgoCompatibility.put("Gemini", 50);
        virgoCompatibility.put("Cancer", 75);
        virgoCompatibility.put("Leo", 40);
        virgoCompatibility.put("Libra", 55);
        virgoCompatibility.put("Scorpio", 30);
        virgoCompatibility.put("Sagittarius", 65);
        virgoCompatibility.put("Capricorn", 80);
        virgoCompatibility.put("Aquarius", 35);
        virgoCompatibility.put("Pisces", 70);

        compatibilityMap.put("Virgo", virgoCompatibility);

        // Libra compatibility scores
        Map<String, Integer> libraCompatibility = new HashMap<>();
        libraCompatibility.put("Aries", 65);
        libraCompatibility.put("Taurus", 40);
        libraCompatibility.put("Gemini", 75);
        libraCompatibility.put("Cancer", 30);
        libraCompatibility.put("Leo", 70);
        libraCompatibility.put("Virgo", 55);
        libraCompatibility.put("Scorpio", 45);
        libraCompatibility.put("Sagittarius", 60);
        libraCompatibility.put("Capricorn", 35);
        libraCompatibility.put("Aquarius", 80);
        libraCompatibility.put("Pisces", 50);

        compatibilityMap.put("Libra", libraCompatibility);

        // Scorpio compatibility scores
        Map<String, Integer> scorpioCompatibility = new HashMap<>();
        scorpioCompatibility.put("Aries", 30);
        scorpioCompatibility.put("Taurus", 30);
        scorpioCompatibility.put("Gemini", 35);
        scorpioCompatibility.put("Cancer", 80);
        scorpioCompatibility.put("Leo", 45);
        scorpioCompatibility.put("Virgo", 30);
        scorpioCompatibility.put("Libra", 45);
        scorpioCompatibility.put("Sagittarius", 70);
        scorpioCompatibility.put("Capricorn", 60);
        scorpioCompatibility.put("Aquarius", 85);
        scorpioCompatibility.put("Pisces", 40);

        compatibilityMap.put("Scorpio", scorpioCompatibility);

        // Sagittarius compatibility scores
        Map<String, Integer> sagittariusCompatibility = new HashMap<>();
        sagittariusCompatibility.put("Aries", 70);
        sagittariusCompatibility.put("Taurus", 65);
        sagittariusCompatibility.put("Gemini", 55);
        sagittariusCompatibility.put("Cancer", 45);
        sagittariusCompatibility.put("Leo", 85);
        sagittariusCompatibility.put("Virgo", 65);
        sagittariusCompatibility.put("Libra", 60);
        sagittariusCompatibility.put("Scorpio", 70);
        sagittariusCompatibility.put("Capricorn", 75);
        sagittariusCompatibility.put("Aquarius", 50);
        sagittariusCompatibility.put("Pisces", 35);

        compatibilityMap.put("Sagittarius", sagittariusCompatibility);

        // Capricorn compatibility scores
        Map<String, Integer> capricornCompatibility = new HashMap<>();
        capricornCompatibility.put("Aries", 45);
        capricornCompatibility.put("Taurus", 75);
        capricornCompatibility.put("Gemini", 45);
        capricornCompatibility.put("Cancer", 35);
        capricornCompatibility.put("Leo", 30);
        capricornCompatibility.put("Virgo", 80);
        capricornCompatibility.put("Libra", 35);
        capricornCompatibility.put("Scorpio", 60);
        capricornCompatibility.put("Sagittarius", 75);
        capricornCompatibility.put("Aquarius", 65);
        capricornCompatibility.put("Pisces", 50);

        compatibilityMap.put("Capricorn", capricornCompatibility);

        // Aquarius compatibility scores
        Map<String, Integer> aquariusCompatibility = new HashMap<>();
        aquariusCompatibility.put("Aries", 55);
        aquariusCompatibility.put("Taurus", 55);
        aquariusCompatibility.put("Gemini", 80);
        aquariusCompatibility.put("Cancer", 65);
        aquariusCompatibility.put("Leo", 60);
        aquariusCompatibility.put("Virgo", 35);
        aquariusCompatibility.put("Libra", 80);
        aquariusCompatibility.put("Scorpio", 85);
        aquariusCompatibility.put("Sagittarius", 50);
        aquariusCompatibility.put("Capricorn", 65);
        aquariusCompatibility.put("Pisces", 45);

        compatibilityMap.put("Aquarius", aquariusCompatibility);

        // Pisces compatibility scores
        Map<String, Integer> piscesCompatibility = new HashMap<>();
        piscesCompatibility.put("Aries", 35);
        piscesCompatibility.put("Taurus", 85);
        piscesCompatibility.put("Gemini", 30);
        piscesCompatibility.put("Cancer", 70);
        piscesCompatibility.put("Leo", 35);
        piscesCompatibility.put("Virgo", 70);
        piscesCompatibility.put("Libra", 50);
        piscesCompatibility.put("Scorpio", 40);
        piscesCompatibility.put("Sagittarius", 35);
        piscesCompatibility.put("Capricorn", 50);
        piscesCompatibility.put("Aquarius", 45);

        compatibilityMap.put("Pisces", piscesCompatibility);
    }

    @WebMethod
    @WebResult
    public int calculateLoveCompatibility(@WebParam(name="person1")Person person1, @WebParam(name="person2")Person person2) {
        ZodiacSignService zsp = new ZodiacSignServiceService().getZodiacSignServicePort();
        String zodiacSign1 = zsp.getZodiacSign(person1.getDay(),person1.getMonth(),person1.getYear());
        String zodiacSign2 = zsp.getZodiacSign(person2.getDay(),person2.getMonth(),person2.getYear());

        return compatibilityMap
                .getOrDefault(zodiacSign1, new HashMap<>())
                .getOrDefault(zodiacSign2, 0);
    }
}
