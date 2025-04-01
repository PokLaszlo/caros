import java.util.ArrayList;

public class Solution {
    Store store= new Store();
    ArrayList<Car> mylist= store.readCSVfile();
    public void sum_of_carprices(){
        double sum=0.0;
        for(Car c:mylist){
            sum+=(c.getPrice());
        }
        System.out.println("Kocsik árának összege: "+sum+" forint");
    }
    public void task02(){
        int counter=0;
        for (int i=0;i<mylist.size();i++) {
            counter++;
        }
        System.out.println("Ennyi autót árulnak: "+counter);
    }
    public void task03()/*Van-e Citroen?*/{
        String brand= "Citroen";
        int i=0;
        while (!mylist.get(i).getBrand().equals(brand) && i<mylist.size()) {
            i++;
        }
        if (i<mylist.size()){
            System.out.println("Van Citroen, ennyiedik sorban: "+(i+2));
        }
        else{
            System.out.println("Nincs Citroen");
        }
    }
    public void task04()/*másolás-tétel */{
        ArrayList<Car> ladalist = new ArrayList<>();
        for (Car car : mylist) {
            if(car.getBrand().equals("BMW")){
                ladalist.add(car);
            }
        }
        for (Car car : ladalist) {
            System.out.println(car.getYear());
        }
    }
}