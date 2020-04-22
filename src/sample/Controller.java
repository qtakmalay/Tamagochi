package sample;

        import java.util.Random;

public class Controller implements CatInterface{

    Cat cat;
    @Override
    public Cat createCat(String name, String color, int age, double weight){
        Cat cat = new Cat(name, color, age, weight);
        cat = this.cat;
        return cat;
    }

    @Override
    public void catRun(int km){

        if(km!=0) {
            double max = 0;
            double min = 0.25;

            for (int i=0; i<=km; i++) {
                double randomNum = (Math.random()*((max-min)+1))+min;
                cat.setWeight(cat.getWeight()-randomNum);
            }
        }
    }
}
