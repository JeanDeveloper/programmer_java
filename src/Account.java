public class Account {

    private String owner;
    private double amount;

    public Account(String owner) {
        this.owner = owner; //sobrecarga
    }

        public Account(String owner, double amount) {
        this.owner = owner;
        if(amount < 0){
            this.amount = 0;
        }else{
            this.amount = amount;//sobrecarga
        }
    }


    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    //METODOS PARTICULARES

    //METODO PARA DEPOSITAR DINERO
    public void deposit(double count){
        if(count < 0){
            this.amount += count;
        }
    }

    //METODO PARA RETIRAR DINERO
    public void retire(double count){
        double dif = this.amount - count;
        if( dif > 0 ){
            this.amount -= count;
        }else{
            this.amount = 0;
        }
    }



}
