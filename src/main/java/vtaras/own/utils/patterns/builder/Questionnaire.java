package vtaras.own.utils.patterns.builder;

public class Questionnaire {
    private String name;
    private String surname;
    private int age;
    private double weight;
    private double height;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public static class Builder {
        private Questionnaire questioned;

        public Builder() {
            questioned = new Questionnaire();
        }

        public Builder withName(String name) {
            questioned.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            questioned.surname = surname;
            return this;
        }

        public Builder withAge(int age) {
            questioned.age = age;
            return this;
        }

        public Builder withWeight(double weight) {
            questioned.weight = weight;
            return this;
        }

        public Builder withHeight(double height) {
            questioned.height = height;
            return this;
        }

        public Questionnaire build() {
            return questioned;
        }
    }
}
