package mindera;

import java.util.Objects;

public class Fruit implements Comparable<Fruit> {
    private String name;
    private int acidity;

    public Fruit(String name, int acidity) {
        this.name = name;
        this.acidity = acidity;
    }

    public String getName() {
        return name;
    }

    public int getAcidity() {
        return acidity;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", acidity=" + acidity +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return acidity == fruit.acidity && Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, acidity);
    }

    @Override
    public int compareTo(Fruit fruit) {

      /*  if (this.getAcidity() < fruit.getAcidity()) {
            return -1;
        }
        if (this.getAcidity() == fruit.getAcidity()) {
            return 0;
        }
        return 1;
*/
        return this.getAcidity() - fruit.getAcidity();
    }
}
