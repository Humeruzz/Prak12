public class Telephone {
    private String number;

    public Telephone(String number) {
        this.number = number;
    }

    public void printPhone(){
        if(number != null){
           char[] temp = number.toCharArray();
           if (temp[0] == '+'){
               System.out.println("+" + temp[1] + temp[2]+ temp[3]+temp[4] + "-" + temp[5]+ temp[6] + temp[7]+ "-" + temp[8] + temp[9] + temp[10] + temp[11]);
           } else if (temp[0] == '8'){
               System.out.println("+7" + temp[1]+ temp[2]+temp[3] + "-" + temp[4]+ temp[5] + temp[6]+ "-" + temp[7] + temp[8] + temp[9] + temp[10]);
           } else {
               System.out.println("Wrong number");
           }
        }
    }
}
