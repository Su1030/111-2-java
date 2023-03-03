class test0003{
    String sex;
    int height;
    int weight;

    public test0003(String sex, int height, int weight){
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }
    public void printSex(){
        System.out.println(sex);
    }

     public void printHight(){
        System.out.println(height);
     }

     public void printWeight(){
        System.out.println(weight);
     }

     public void printBMI(){
        System.out.println(weight/((height/100)^2));
     }
}
