class test0004poker1{
    int suits;
    int number;

    public test0004poker1(int suits,int number){
        this.suits = suits;
        this.number = number;
    }

    public int card(){
        return suits*100 + number;
    }
}