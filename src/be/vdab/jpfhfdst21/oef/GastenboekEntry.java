package be.vdab.jpfhfdst21.oef;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GastenboekEntry implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private final LocalDateTime datum = LocalDateTime.now();
    private String schrijver;
    private String boodschap;



}
