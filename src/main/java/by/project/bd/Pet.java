package by.project.bd;


public class Pet {
    private long idPet;
    private String name;
    private String type;
    private String sex;
    private int age;
    private String date_inn;

    public Pet() {
    }

    // экстренный ввод
    public Pet(long idPet, String date_inn, String type) {
        this.idPet = idPet;
        this.name="NoIdent";
        this.age=0;
        this.sex="NoIdent";
        this.type=type;
        this.date_inn=date_inn;

    }

    //стационарный ввод
    public Pet(long idPet, String name, String type, String sex, int age, String date_inn) {
        this.idPet = idPet;
        this.name = name;
        this.type = type;
        this.sex = sex;
        this.age = age;
        this.date_inn = date_inn;
    }
}
