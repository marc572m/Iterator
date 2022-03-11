package FilEksempler;

public class Person {
    String fNavn;
    String eNavn;
    int stdNr;

    public Person(String fNavn, String eNavn, int stdNr) {
        this.fNavn = fNavn;
        this.eNavn = eNavn;
        this.stdNr = stdNr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fNavn='" + fNavn + '\'' +
                ", eNavn='" + eNavn + '\'' +
                ", stdNr=" + stdNr +
                '}';
    }
}
