public class Person {
    private String FIO = "Semenikhin Alexandr Olegovich";

    public void printPerson(){
        FIO.trim();
        String[] temp = FIO.split(" ");
        if(temp[0] != null){
            System.out.print(temp[0] + " ");
        } else {
            System.out.println("Wrong Format");
        }
        if (temp[1] != null){
            char[] temp1 = temp[1].toCharArray();
            System.out.print(temp1[0]+ ".");
        } else {
            System.out.print("-");
        }
        if (temp[2] != null){
            char[] temp1 = temp[2].toCharArray();
            System.out.print(temp1[0]+ ".");
        } else {
            System.out.println("-");
        }
        System.out.println("");
    }
}
