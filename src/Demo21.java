void main() {
    printCoordinates(
            new int[]{10, 20},
            new int[0],
            new int[]{20},
            new int[]{},
            new int[]{40, 50},
            new int[]{10, 20, 30});
}

void printCoordinates(int[]... coordinatePairs) {
    for (int[] pair : coordinatePairs) {
        if (pair.length == 1 || pair.length == 2) printCoordinate(pair[0], pair.length == 1 ? pair[0] : pair[1]);
    }
}

void printCoordinate(int x, int y) {
    System.out.println(STR."(\{x},\{y})");
}