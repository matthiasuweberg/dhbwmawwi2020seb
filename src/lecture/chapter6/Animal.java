package lecture.chapter6;

public class Animal {

    private float height;
    private String description;
    private float weight;

    public Animal(float height, String description, float weight){
        this.setWeight(weight);
        this.setDescription(description);
        this.setHeight(height);
    }

    public void eat(){
        System.out.println("Das Tier " + this.description + " isst!");
    }

    public void breath(){
        System.out.println("Das Tier " + this.description + " atmet!");
    }

    public void move(){
        System.out.println("Das Tier " + this.description + " bewegt sich!");
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return super.toString() + " - Beschreibung: " + getDescription() +
                "; Größe: " + getHeight() + "; Gewicht: " + getWeight();
    }

}
