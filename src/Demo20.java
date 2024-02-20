void main(){
//    myMethod(new String[][]{{"S001", "Kasun Sampath"}, {"S002", "Upul Shantha"}, {"S003", "Ramindu Kumara"}});
    myMethod(new String[]{"S001", "Kasun Sampath"}, new String[]{"S002", "Upul Shantha"}, new String[]{"S003", "Ramindu Kumara"});
}
void myMethod(String[]... students){
    for (String[] student : students) {
        myMethod(student);
    }
}

void myMethod(String[] student){
    System.out.println(STR."ID=\{student[0]}, NAME=\{student[1]}");
}