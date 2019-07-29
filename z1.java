public class z1 {
    public static void main(String[] args){
        //1-4
        System.out.println("Задание 1-4");
        int array[] = new int[10];
		int k[]=new int [6];
        int s=0;
      

        for(int i=0; i<array.length; i++){
            array[i] = (int) (Math.random()*5)+1;
            System.out.print (array[i]+" ");
            s+=array[i];
            switch (array[i]) {     //подсчет каждой цифры
                case 1: k[1]++; break;
                case 2: k[2]++; break;
                case 3: k[3]++; break;
                case 4: k[4]++; break;
                case 5: k[5]++; break;
            }
        }
        System.out.print("\n'1': "+k[1]+"\n'2': "+k[2]+"\n'3': "+k[3]+"\n'4': "+k[4]+"\n'5': "+k[5]+"\nсумма: "+s);

        //5
        System.out.println("\n\nЗадание 5");
        char arrayChar[] = new char[12];
        for(int i=0; i<arrayChar.length; i++){
            arrayChar[i] = (char) (Math.random()*94+33);
            System.out.print (arrayChar[i]+" ");
        }

        //6
        System.out.println("\n\nЗадание 6");
        int arrayDouble[] = new int[20];
        int lNull=0, lOne=0, maxNull=0, maxOne=0;
        boolean f;
        arrayDouble[0] = (int) Math.round(Math.random());
        System.out.print (arrayDouble[0]+" ");
        if (arrayDouble[0]==0) {f=false; lNull++;}
        else {f=true; lOne++;}
        for(int i=1; i<arrayDouble.length; i++){
            arrayDouble[i] = (int) Math.round(Math.random());
            System.out.print (arrayDouble[i]+" ");
            if (arrayDouble[i]!=arrayDouble[i-1]) {
                if (f) {
                    if (lOne>maxOne) maxOne=lOne; else{}
                    lOne=0;
                    lNull++;
                }
                else {
                    if (lNull>maxNull) maxNull=lNull; else{}
                    lNull=0;
                    lOne++;
                }
                f = !f;}
            else if (f) lOne++;
            else lNull++;
        }
        System.out.println("\n0 встречался "+maxNull+" раз подряд");
        System.out.println("1 встречался "+maxOne+" раз подряд");

        //7
        System.out.println("\n\nЗадание 7");
        int arrayLast[] = new int[10];
        int sEven=0, sUneven=0;
        for (int i=0; i<10; i++){
            arrayLast[i] = (int) (Math.random()*9);
            System.out.println(arrayLast[i]+" ");
            if (arrayLast[i] % 2==0) sEven+=arrayLast[i];
            else sUneven+=arrayLast[i];
        }
        System.out.print("Сумма всех четных чисел: "+sEven+"\nСумма всех нечетных чисел: "+sUneven);
    }
}
