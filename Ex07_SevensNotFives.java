class Ex07_SevensNotFives {
    public static void main(String[] args) {

        for (int index = 2000; index <= 3200; index++) {
            if(index % 7 == 0 && index % 5 == 1) System.out.print(index + ", ");
        }
    
    } // main

} // class