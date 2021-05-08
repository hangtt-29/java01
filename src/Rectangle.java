public class Rectangle {
    int a = 15;
    int b = 7;
    int r = 8;
    double pi=3.14;

     float chuivinhchuhat() {
        int P = (a + b) * 2;
//         System.out.println("Chu vi hình chữ nhật:" + P+ "cm");
        return P;

    }
    void Dientichhinhchunhat(){
        int S= a*b;
        System.out.println("Diện tích hình chữ nhật:"+S +"cm2");
        //return S;
    }
    void CHuvihinhtron(){
        int d= 2*r;
        double C=d*pi;
        System.out.println("Chu Vi Hình Tròn:"+C+ "cm");
        ;
    }
    void Dientichhinhtron(){

        double Stron= r*r*pi;
        System.out.println("Diện tích hình tròn:"+Stron+ "cm2");
    }

}
