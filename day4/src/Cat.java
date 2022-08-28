public class Cat {
    String  fur_color;
    Integer  num_of_leg;

    void setFur_color(String color) {
        this.fur_color = color;
    }

    void setNum_of_leg(Integer leg) {
        this.num_of_leg = leg;
    }

    String getFur_color() {
        return fur_color;
    }

    Integer getNum_of_leg() {
        return num_of_leg;
    }

    static void show_identity(String name, String warna, Integer number) {
            Cat cat = new Cat();
            cat.setFur_color(warna);
            cat.setNum_of_leg(number);

            System.out.println("Saya " + name + " dengan detail, Warna Bulu " + cat.getFur_color() +
                    " dengan jumlah kaki " + cat.getNum_of_leg());

    }
}
