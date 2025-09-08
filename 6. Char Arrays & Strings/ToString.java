class Laptop {
    
        String model;
        int price;

        @Override
        public String toString() {
            return "Laptop [model=" + model + ", price=" + price + "]";
        }        
}

public class ToString {  
     public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenevo Yoga";
        obj.price = 1000;

        // System.out.println(obj.toString()); same o/p
        System.out.println(obj);

    }   
}