void main(){
    char[] myChars = {'i', 'j', 's', 'e'};
    char[] myChars2 = {'d', 'e', 'p'};
    System.out.println(myChars.equals(myChars2));
    System.out.println(myChars == myChars2);

    System.out.println("--------------");

    String str1 = new String("ijse");
    String str2 = new String("ijse");
    System.out.println(str1.equals(str2));
    System.out.println(str1 == str2);
}