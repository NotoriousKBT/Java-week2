class Ex01_CountTo100 {
    public static void main(String[] args) {
        final int hundred = 100;
        for (int index = 0; index < hundred; index++) {
            
            if(((index % 9) == 0)) {
                System.out.println("Cat's have 9 lives!");
            } else {
                System.out.println(index);
            }
        } // for
    } // main
} // class 