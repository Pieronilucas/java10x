package Intermediario;

public enum Biju {
    SHUKAKU("Shukaku", "Gaara", 1),
    MATATABIA("Matatabia", "Yugito Nii", 2),
    ISOBU("Isobu", "Yagura", 3),
    SON_GOKU("Son goku", "Roshi", 4),
    KOKU("Koku", "Han", 5),
    SAIKEN("Saiken", "Utakata", 6),
    CHOMEI("Chomei", "Fuu", 7),
    GYUKI("Gyuki", "Killer Bee", 8),
    KURAMA("Kurama", "Naruto Uzumaki", 9);

    String nomeBiju;
    String junchuriki;
    int numeroDeCaldas;

    Biju() {
    }

    Biju(String nomeBiju, String junchuriki, int numeroDeCaldas) {
        this.nomeBiju = nomeBiju;
        this.junchuriki = junchuriki;
        this.numeroDeCaldas = numeroDeCaldas;
    }
}
