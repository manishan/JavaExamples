package StringCode;

import javax.swing.text.html.parser.DTDConstants;

public class RemoveRepeatativeString {
    public static void main(String args[]){
        String s= "aabbccs";
        //char[] chArr = s.toCharArray();
        //char[] chArr1= new char[chArr.length];
        String result = "";
        System.out.println("s = "+ s);
        for(int i=0; i < s.length(); i++) {
            System.out.println(s.contains(result));
            if (s.contains(result)) {
                System.out.println("I am here");
                continue;
            } else {
                result = result + s.charAt(i);
            }
        }


          /*  if(chArr[i]==chArr[j]){
                chArr1[i]=chArr[i];
            }else{
                chArr[]
            }
        }*/
        System.out.println("Result = "+ result);

    }
}
