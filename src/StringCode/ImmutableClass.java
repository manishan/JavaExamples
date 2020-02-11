package StringCode;

public final class ImmutableClass {
     final String PANCARDNUMBER;
     public ImmutableClass(String PANCARDNUMBER){
         this.PANCARDNUMBER= PANCARDNUMBER;
     }

     public String getPanNumber(){
         return PANCARDNUMBER;
     }

}
