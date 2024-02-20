void main() {
    // Single Method Invocation Statement
    myMethod(new int[][]{{8, 2}, {6, 3}},
            new int[][]{{8, -2}, {7, 10}},
            new int[][]{{8, 5}, {-7, 8}, {4, 11}},
            new int[][]{{12, 3}});
}

void myMethod(int[][]... pairGroups) {
    for (int[][] pairs : pairGroups) printPair(getMinMaxPair(pairs));
}

int[] getMinMaxPair(int[][] pairs){
    int min = pairs[0][0];  // {{8, 2}, {6, 3}}; min = 8
    int max = min;          // max = 8
    for (int[] pair : pairs) {
        for (int value : pair) {
            if (min > value) min = value;
            if (max < value) max = value;
        }
    }
    return new int[]{min,max};
}

void printPair(int[] pair) {
    System.out.println(STR."(\{pair[0]},\{pair[1]})");
}