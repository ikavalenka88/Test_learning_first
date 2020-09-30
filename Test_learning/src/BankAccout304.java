import static javax.swing.JOptionPane.*;
class BankAccout304 {
    double rate;
    Person fellow;
    BankAccout304(String name,double money,int time,double r){
        rate=r;
        fellow=new Person(name,money,time);
    }
    void show(){
        showMessageDialog(null,fellow,"Deposit",INFORMATION_MESSAGE);
    }
    class Person{
        String name;
        double money;
        int time;
        double getMoney(){
            double s=money;
            for (int k=1;k<=time;k++){
                s*=(1+rate/100);
            }
            s=Math.round(s*100)/100.0;
            return s;
        }
        public String toString(){
            String txt="Name: "+name+"\n";
            txt+="Start value: "+money+"\n";
            txt+="Percent rate: "+rate+"\n";
            txt+="Tine(years): "+time+"\n";
            txt+="Final value: "+getMoney();
            return txt;
        }
        Person(String txt, double m,int t){
            name=txt;
            money=m;
            time=t;
        }
    }
}
class UsingInnerClassDemo{
    public static void main(String[] args) {
        BankAccout304 ivanov=new BankAccout304("Ivan Ivanov",1000.0,5,8.0);
        ivanov.show();
    }
}