void main(){
    int[][] coordinates = {{5,2}, {2, 5}, {3, 4}};

    for (int[] coordinatePair : coordinates) {
        printCoordinates(coordinatePair);
    }
}

void printCoordinates(int[] coordinatePair){
    for (int i : coordinatePair) {
        System.out.println(i);
    }
}



