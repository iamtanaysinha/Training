class Human {

    //static for shared
    static int population = 0; 

    //constructor
    Human() {
        population++;    
    }

    void identify() {
        System.out.println("I am a Human");
    }
}
