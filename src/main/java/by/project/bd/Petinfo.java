package by.project.bd;

public class Petinfo {
    long idPet;
    String petinfo;
    String drugs;
    String lastdateinn;
    String firstdateinn;
    long doc_idDoc;

    public Petinfo() {
            }

    public Petinfo(long idPet, long doc_idDoc) {
        this.idPet = idPet;
        this.doc_idDoc = doc_idDoc;
        this.petinfo = "NoIdent";
        this.drugs = "NoIdent";
        this.lastdateinn = "NoIdent";
        this.firstdateinn = "NoIdent";
    }

    public Petinfo(long idPet, String petinfo, String drugs, String lastdateinn, String firstdateinn, long doc_idDoc) {
        this.idPet = idPet;
        this.petinfo = petinfo;
        this.drugs = drugs;
        this.lastdateinn = lastdateinn;
        this.firstdateinn = firstdateinn;
        this.doc_idDoc = doc_idDoc;
    }
}
