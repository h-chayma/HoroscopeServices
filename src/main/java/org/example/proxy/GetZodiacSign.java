
package org.example.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getZodiacSign complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getZodiacSign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getZodiacSign", propOrder = {
    "day",
    "month",
    "year"
})
public class GetZodiacSign {

    protected int day;
    protected int month;
    protected int year;

    /**
     * Obtient la valeur de la propriété day.
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * Définit la valeur de la propriété day.
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * Obtient la valeur de la propriété month.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Définit la valeur de la propriété month.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Obtient la valeur de la propriété year.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Définit la valeur de la propriété year.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
