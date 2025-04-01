import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    ArrayList<Car> mylist = new ArrayList<>();
    public ArrayList<Car> readCSVfile(){
        try {
            return try_readCSVfile();
        } catch (FileNotFoundException e) {
            System.err.println("Nincs fájl");
            System.err.println(e.getMessage());
            return null;
        }
    }
    private ArrayList<Car> try_readCSVfile() throws FileNotFoundException{
        File myfile = new File("cars.csv");
        try(Scanner scn = new Scanner(myfile)){
            scn.nextLine();
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                String[] var = line.split(";");
                //System.out.println(line);
                Car myCar= new Car(var[1], var[2], 
                                Integer.parseInt(var[3]),
                                Double.parseDouble(var[4]));
                mylist.add(myCar);
            }
            return mylist;
        }
    }
}
