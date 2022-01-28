interface printable {
    void print();
}
class Ex implements printable{
     public void print(){
         System.out.println("Interface Example");}
         public static void main(String[] args) {
             Ex obj = new Ex();
             obj.print();

         }
     }
