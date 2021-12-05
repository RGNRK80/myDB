package by.project.bd;

public class Doc {
    long idDoc;
    String name;
    String surname;
    String tel;
    String position;

    public Doc() {
    }

    public Doc(long idDoc, String name, String surname, String tel, String position) {
        this.idDoc = idDoc;
        this.name = name;
        this.surname = surname;
        this.tel = tel;
        this.position = position;
    }
}
