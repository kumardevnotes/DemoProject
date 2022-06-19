public class StringArrayExample {

    public static void main(String args[]) {
        String[] cities = {"NewYork",  "NewJercy", "Delhi", "Hyderabad"};
        String mycity = "NewJercy";

        for(int index = 0; index  < cities.length; index++ ){
            if(cities[index].equals(mycity)){
                System.out.println("Your city found " + cities[index]);
                break; //used to termitae the for loop upon some condition met
            }
            else{

            }

        }


    }
}