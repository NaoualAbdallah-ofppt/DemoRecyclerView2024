package aa.bb.demorecyclerview;

import java.util.ArrayList;

public class Animal {
    private String nom;
    private int photo;
    private static ArrayList<Animal> lstAnim= new ArrayList<>();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public Animal(String nom, int photo) {
        this.nom = nom;
        this.photo = photo;
    }


    public static ArrayList<Animal> getLstAnimals()
    {
        lstAnim.clear();
       lstAnim.add(new Animal("Ours",R.drawable.image1));
        lstAnim.add(new Animal("Oiseau",R.drawable.image2));
        lstAnim.add(new Animal("Poisson",R.drawable.image3));
        lstAnim.add(new Animal("Flament",R.drawable.image4));
        lstAnim.add(new Animal("Girafe",R.drawable.image5));
        return  lstAnim;

    }
}
