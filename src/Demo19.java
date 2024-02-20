void main() {
    int[] abc = {10, 20};
    myMethod("IJSE", abc);
    myMethod("DEP", null);
    myMethod("GDSE");
    myMethod("CMJD", 10);
    myMethod("CMJD", 10, 20);
    //myMethod("IJSE", abc, 10);
    //myMethod("IJSE", null, 10);
}

//void myMethod(String something, int[] nums) {    // Fixed Arity Method
//
//}

void myMethod(String something, int... nums) {   // Variable Arity Method
    System.out.println(STR."\{something}=\{nums != null ? nums.length : nums}");
}
