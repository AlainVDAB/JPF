package be.vdab.winkel;

import java.math.BigDecimal;

public class Product {
    private String omschrijving;
    private BigDecimal prijs;

    public Product(String omschrijving, BigDecimal prijs) {
        setOmschrijving(omschrijving);
        setPrijs(prijs);
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        if (omschrijving != null && !omschrijving.trim().equals(""))
        this.omschrijving = omschrijving;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    public void setPrijs(BigDecimal prijs) {
        if(prijs.compareTo(BigDecimal.ZERO)>0)
        this.prijs = prijs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        return getOmschrijving().equals(product.getOmschrijving());
    }

    @Override
    public int hashCode() {
        return getOmschrijving().hashCode();
    }

    @Override
    public String toString() {
        return omschrijving + "=" + prijs;
    }
}
