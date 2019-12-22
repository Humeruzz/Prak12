public class Adress {
    private String string = "F,F,F,F,F,F,F";
    private String string1 = "G,G,G,G,G,G,G";
    private String string2 = "H,H,H,H,H,H,H";
    private String string3 = "V,V,V,V,V,V,V";
    public void printAdress(){
        String[] temp = string.trim().split(",");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]);
            if (i != temp.length-1){
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();
        temp = string1.trim().split(",");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]);
            if (i != temp.length-1){
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();
        temp = string2.trim().split(",");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]);
            if (i != temp.length-1){
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();
        temp = string3.trim().split(",");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]);
            if (i != temp.length-1){
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();
    }
}
