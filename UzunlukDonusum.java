import java.util.Scanner;

public class UzunlukDonusum {
    public static void main(String[] args) {
        double metre;
        String neyi, neye;
        Scanner oku = new Scanner(System.in);
            System.out.println("Neyi donusturmek istiyorsunuz : (meter, kilometer, mega, giga etc.)");
        neyi = oku.nextLine();
            System.out.println("Neye donusturmek istiyorsunuz : (meter, kilometer, mega, giga etc.)");
        neye = oku.nextLine();
        if(neyi.equalsIgnoreCase("metre")){
            System.out.println("Metreyi giriniz : ");
            metre = oku.nextDouble();
            if(neye.equalsIgnoreCase("desimetre")) {
                System.out.println(metre*Math.pow(10,1));
            }else if (neye.equalsIgnoreCase("santimetre")){
                    System.out.println(metre*Math.pow(10,2));
                }else if(neye.equalsIgnoreCase("milimetre")){
                    System.out.println(metre*Math.pow(10, 3));
                }else if(neye.equalsIgnoreCase("mikrometre")){
                    System.out.println(metre*Math.pow(10, 6));
                }else if (neye.equalsIgnoreCase("nanometre")){
                    System.out.println(metre*Math.pow(10, 9));
                }else if (neye.equalsIgnoreCase("picometre")){
                    System.out.println(metre*Math.pow(10, 12));
                }else if (neye.equalsIgnoreCase("dekametre")){
                    System.out.println(metre*Math.pow(10, -1));
                }else if (neye.equalsIgnoreCase("hektametre")){
                    System.out.println(metre*Math.pow(10, -2));
                }else if (neye.equalsIgnoreCase("kilometre")){
                    System.out.println(metre*Math.pow(10, -3));
                }else if (neye.equalsIgnoreCase("megametre")){
                    System.out.println(metre*Math.pow(10, -6));
                }else if (neye.equalsIgnoreCase("gigametre")){
                    System.out.println(metre*Math.pow(10, -9));
                }
            } else if(neyi.equalsIgnoreCase("desimetre")){
            System.out.println("Desimetreyi giriniz : ");
            metre = oku.nextDouble();
            if(neye.equalsIgnoreCase("metre")) {
                System.out.println(metre*Math.pow(10,-1));
            }else if (neye.equalsIgnoreCase("santimetre")){
                System.out.println(metre*Math.pow(10,1));
            }else if(neye.equalsIgnoreCase("milimetre")){
                System.out.println(metre*Math.pow(10, 2));
            }else if(neye.equalsIgnoreCase("mikrometre")){
                System.out.println(metre*Math.pow(10, 5));
            }else if (neye.equalsIgnoreCase("nanometre")){
                System.out.println(metre*Math.pow(10, 8));
            }else if (neye.equalsIgnoreCase("picometre")){
                System.out.println(metre*Math.pow(10, 11));
            }else if (neye.equalsIgnoreCase("dekametre")){
                System.out.println(metre*Math.pow(10, -2));
            }else if (neye.equalsIgnoreCase("hektametre")){
                System.out.println(metre*Math.pow(10, -3));
            }else if (neye.equalsIgnoreCase("kilometre")){
                System.out.println(metre*Math.pow(10, -4));
            }else if (neye.equalsIgnoreCase("megametre")){
                System.out.println(metre*Math.pow(10, -7));
            }else if (neye.equalsIgnoreCase("gigametre")){
                System.out.println(metre*Math.pow(10, -10));
            }
        } else if(neyi.equalsIgnoreCase("santimetre")){
            System.out.println("Santimetreyi giriniz : ");
            metre = oku.nextDouble();
            if(neye.equalsIgnoreCase("metre")) {
                System.out.println(metre*Math.pow(10,-2));
            }else if (neye.equalsIgnoreCase("desimetre")){
                System.out.println(metre*Math.pow(10,-1));
            }else if(neye.equalsIgnoreCase("milimetre")){
                System.out.println(metre*Math.pow(10, 1));
            }else if(neye.equalsIgnoreCase("mikrometre")){
                System.out.println(metre*Math.pow(10, 4));
            }else if (neye.equalsIgnoreCase("nanometre")){
                System.out.println(metre*Math.pow(10, 7));
            }else if (neye.equalsIgnoreCase("picometre")){
                System.out.println(metre*Math.pow(10, 10));
            }else if (neye.equalsIgnoreCase("dekametre")){
                System.out.println(metre*Math.pow(10, -3));
            }else if (neye.equalsIgnoreCase("hektametre")){
                System.out.println(metre*Math.pow(10, -4));
            }else if (neye.equalsIgnoreCase("kilometre")){
                System.out.println(metre*Math.pow(10, -5));
            }else if (neye.equalsIgnoreCase("megametre")){
                System.out.println(metre*Math.pow(10, -8));
            }else if (neye.equalsIgnoreCase("gigametre")){
                System.out.println(metre*Math.pow(10, -11));
            }
        } else if(neyi.equalsIgnoreCase("milimetre")){
            System.out.println("Milimetreyi giriniz : ");
            metre = oku.nextDouble();
            if(neye.equalsIgnoreCase("metre")) {
                System.out.println(metre*Math.pow(10,-3));
            }else if (neye.equalsIgnoreCase("desimetre")){
                System.out.println(metre*Math.pow(10,-2));
            }else if(neye.equalsIgnoreCase("santimetre")){
                System.out.println(metre*Math.pow(10, -1));
            }else if(neye.equalsIgnoreCase("mikrometre")){
                System.out.println(metre*Math.pow(10, 3));
            }else if (neye.equalsIgnoreCase("nanometre")){
                System.out.println(metre*Math.pow(10, 6));
            }else if (neye.equalsIgnoreCase("picometre")){
                System.out.println(metre*Math.pow(10, 9));
            }else if (neye.equalsIgnoreCase("dekametre")){
                System.out.println(metre*Math.pow(10, -4));
            }else if (neye.equalsIgnoreCase("hektametre")){
                System.out.println(metre*Math.pow(10, -5));
            }else if (neye.equalsIgnoreCase("kilometre")){
                System.out.println(metre*Math.pow(10, -6));
            }else if (neye.equalsIgnoreCase("megametre")){
                System.out.println(metre*Math.pow(10, -9));
            }else if (neye.equalsIgnoreCase("gigametre")){
                System.out.println(metre*Math.pow(10, -12));
            }
        }else if(neyi.equalsIgnoreCase("mikrometre")){
            System.out.println("Mikrometreyi giriniz : ");
            metre = oku.nextDouble();
            if(neye.equalsIgnoreCase("metre")) {
                System.out.println(metre*Math.pow(10,-6));
            }else if (neye.equalsIgnoreCase("desimetre")){
                System.out.println(metre*Math.pow(10,-5));
            }else if(neye.equalsIgnoreCase("santimetre")){
                System.out.println(metre*Math.pow(10, -4));
            }else if(neye.equalsIgnoreCase("milimetre")){
                System.out.println(metre*Math.pow(10, -3));
            }else if (neye.equalsIgnoreCase("nanometre")){
                System.out.println(metre*Math.pow(10, 3));
            }else if (neye.equalsIgnoreCase("picometre")){
                System.out.println(metre*Math.pow(10, 6));
            }else if (neye.equalsIgnoreCase("dekametre")){
                System.out.println(metre*Math.pow(10, -7));
            }else if (neye.equalsIgnoreCase("hektametre")){
                System.out.println(metre*Math.pow(10, -8));
            }else if (neye.equalsIgnoreCase("kilometre")){
                System.out.println(metre*Math.pow(10, -9));
            }else if (neye.equalsIgnoreCase("megametre")){
                System.out.println(metre*Math.pow(10, -12));
            }else if (neye.equalsIgnoreCase("gigametre")){
                System.out.println(metre*Math.pow(10, -15));
            }
        }else if(neyi.equalsIgnoreCase("nanometre")){
            System.out.println("Nanometreyi giriniz : ");
            metre = oku.nextDouble();
            if(neye.equalsIgnoreCase("metre")) {
                System.out.println(metre*Math.pow(10,-9));
            }else if (neye.equalsIgnoreCase("desimetre")){
                System.out.println(metre*Math.pow(10,-8));
            }else if(neye.equalsIgnoreCase("santimetre")){
                System.out.println(metre*Math.pow(10, -7));
            }else if(neye.equalsIgnoreCase("milimetre")){
                System.out.println(metre*Math.pow(10, -6));
            }else if (neye.equalsIgnoreCase("mikrometre")){
                System.out.println(metre*Math.pow(10, -3));
            }else if (neye.equalsIgnoreCase("picometre")){
                System.out.println(metre*Math.pow(10, 3));
            }else if (neye.equalsIgnoreCase("dekametre")){
                System.out.println(metre*Math.pow(10, -10));
            }else if (neye.equalsIgnoreCase("hektametre")){
                System.out.println(metre*Math.pow(10, -11));
            }else if (neye.equalsIgnoreCase("kilometre")){
                System.out.println(metre*Math.pow(10, -12));
            }else if (neye.equalsIgnoreCase("megametre")){
                System.out.println(metre*Math.pow(10, -15));
            }else if (neye.equalsIgnoreCase("gigametre")){
                System.out.println(metre*Math.pow(10, -18));
            }
        }else if(neyi.equalsIgnoreCase("picometre")){
            System.out.println("Picometreyi giriniz : ");
            metre = oku.nextDouble();
            if(neye.equalsIgnoreCase("metre")) {
                System.out.println(metre*Math.pow(10,-12));
            }else if (neye.equalsIgnoreCase("desimetre")){
                System.out.println(metre*Math.pow(10,-11));
            }else if(neye.equalsIgnoreCase("santimetre")){
                System.out.println(metre*Math.pow(10, -10));
            }else if(neye.equalsIgnoreCase("milimetre")){
                System.out.println(metre*Math.pow(10, -9));
            }else if (neye.equalsIgnoreCase("mikrometre")){
                System.out.println(metre*Math.pow(10, -6));
            }else if (neye.equalsIgnoreCase("nanometre")){
                System.out.println(metre*Math.pow(10, -3));
            }else if (neye.equalsIgnoreCase("dekametre")){
                System.out.println(metre*Math.pow(10, -13));
            }else if (neye.equalsIgnoreCase("hektametre")){
                System.out.println(metre*Math.pow(10, -14));
            }else if (neye.equalsIgnoreCase("kilometre")){
                System.out.println(metre*Math.pow(10, -15));
            }else if (neye.equalsIgnoreCase("megametre")){
                System.out.println(metre*Math.pow(10, -18));
            }else if (neye.equalsIgnoreCase("gigametre")){
                System.out.println(metre*Math.pow(10, -21));
            }
        }else if(neyi.equalsIgnoreCase("dekametre")){
            System.out.println("Dekametre giriniz : ");
            metre = oku.nextDouble();
            if(neye.equalsIgnoreCase("metre")) {
                System.out.println(metre*Math.pow(10,1));
            }else if (neye.equalsIgnoreCase("desimetre")){
                System.out.println(metre*Math.pow(10,2));
            }else if(neye.equalsIgnoreCase("santimetre")){
                System.out.println(metre*Math.pow(10, 3));
            }else if(neye.equalsIgnoreCase("milimetre")){
                System.out.println(metre*Math.pow(10, 4));
            }else if (neye.equalsIgnoreCase("mikrometre")){
                System.out.println(metre*Math.pow(10, 7));
            }else if (neye.equalsIgnoreCase("nanometre")){
                System.out.println(metre*Math.pow(10, 10));
            }else if (neye.equalsIgnoreCase("picometre")){
                System.out.println(metre*Math.pow(10, 13));
            }else if (neye.equalsIgnoreCase("hektametre")){
                System.out.println(metre*Math.pow(10, -1));
            }else if (neye.equalsIgnoreCase("kilometre")){
                System.out.println(metre*Math.pow(10, -2));
            }else if (neye.equalsIgnoreCase("megametre")){
                System.out.println(metre*Math.pow(10, -5));
            }else if (neye.equalsIgnoreCase("gigametre")){
                System.out.println(metre*Math.pow(10, -8));
            }
        }else if(neyi.equalsIgnoreCase("Hektametre")){
            System.out.println("Hektametre giriniz : ");
            metre = oku.nextDouble();
            if(neye.equalsIgnoreCase("metre")) {
                System.out.println(metre*Math.pow(10,2));
            }else if (neye.equalsIgnoreCase("desimetre")){
                System.out.println(metre*Math.pow(10,3));
            }else if(neye.equalsIgnoreCase("santimetre")){
                System.out.println(metre*Math.pow(10, 4));
            }else if(neye.equalsIgnoreCase("milimetre")){
                System.out.println(metre*Math.pow(10, 5));
            }else if (neye.equalsIgnoreCase("mikrometre")){
                System.out.println(metre*Math.pow(10, 8));
            }else if (neye.equalsIgnoreCase("nanometre")){
                System.out.println(metre*Math.pow(10, 11));
            }else if (neye.equalsIgnoreCase("picometre")){
                System.out.println(metre*Math.pow(10, 14));
            }else if (neye.equalsIgnoreCase("dekametre")){
                System.out.println(metre*Math.pow(10, 1));
            }else if (neye.equalsIgnoreCase("kilometre")){
                System.out.println(metre*Math.pow(10, -1));
            }else if (neye.equalsIgnoreCase("megametre")){
                System.out.println(metre*Math.pow(10, -4));
            }else if (neye.equalsIgnoreCase("gigametre")){
                System.out.println(metre*Math.pow(10, -7));
            }
        }else if(neyi.equalsIgnoreCase("Kilometre")){
            System.out.println("Kilometre giriniz : ");
            metre = oku.nextDouble();
            if(neye.equalsIgnoreCase("metre")) {
                System.out.println(metre*Math.pow(10,3));
            }else if (neye.equalsIgnoreCase("desimetre")){
                System.out.println(metre*Math.pow(10,4));
            }else if(neye.equalsIgnoreCase("santimetre")){
                System.out.println(metre*Math.pow(10,5));
            }else if(neye.equalsIgnoreCase("milimetre")){
                System.out.println(metre*Math.pow(10,6));
            }else if (neye.equalsIgnoreCase("mikrometre")){
                System.out.println(metre*Math.pow(10,10));
            }else if (neye.equalsIgnoreCase("nanometre")){
                System.out.println(metre*Math.pow(10,13));
            }else if (neye.equalsIgnoreCase("picometre")){
                System.out.println(metre*Math.pow(10, 15));
            }else if (neye.equalsIgnoreCase("dekametre")){
                System.out.println(metre*Math.pow(10, 2));
            }else if (neye.equalsIgnoreCase("hektametre")){
                System.out.println(metre*Math.pow(10, 1));
            }else if (neye.equalsIgnoreCase("megametre")){
                System.out.println(metre*Math.pow(10, -3));
            }else if (neye.equalsIgnoreCase("gigametre")){
                System.out.println(metre*Math.pow(10, -6));
            }
        }else if(neyi.equalsIgnoreCase("megametre")){
            System.out.println("megametre giriniz : ");
            metre = oku.nextDouble();
            if(neye.equalsIgnoreCase("metre")) {
                System.out.println(metre*Math.pow(10,6));
            }else if (neye.equalsIgnoreCase("desimetre")){
                System.out.println(metre*Math.pow(10,7));
            }else if(neye.equalsIgnoreCase("santimetre")){
                System.out.println(metre*Math.pow(10,8));
            }else if(neye.equalsIgnoreCase("milimetre")){
                System.out.println(metre*Math.pow(10,9));
            }else if (neye.equalsIgnoreCase("mikrometre")){
                System.out.println(metre*Math.pow(10,13));
            }else if (neye.equalsIgnoreCase("nanometre")){
                System.out.println(metre*Math.pow(10,16));
            }else if (neye.equalsIgnoreCase("picometre")){
                System.out.println(metre*Math.pow(10, 19));
            }else if (neye.equalsIgnoreCase("dekametre")){
                System.out.println(metre*Math.pow(10, 5));
            }else if (neye.equalsIgnoreCase("hektametre")){
                System.out.println(metre*Math.pow(10, 4));
            }else if (neye.equalsIgnoreCase("kilometre")){
                System.out.println(metre*Math.pow(10, 3));
            }else if (neye.equalsIgnoreCase("gigametre")){
                System.out.println(metre*Math.pow(10, -3));
            }
        }else if(neyi.equalsIgnoreCase("gigametre")){
            System.out.println("gigametre giriniz : ");
            metre = oku.nextDouble();
            if(neye.equalsIgnoreCase("metre")) {
                System.out.println(metre*Math.pow(10,9));
            }else if (neye.equalsIgnoreCase("desimetre")){
                System.out.println(metre*Math.pow(10,10));
            }else if(neye.equalsIgnoreCase("santimetre")){
                System.out.println(metre*Math.pow(10,11));
            }else if(neye.equalsIgnoreCase("milimetre")){
                System.out.println(metre*Math.pow(10,12));
            }else if (neye.equalsIgnoreCase("mikrometre")){
                System.out.println(metre*Math.pow(10,16));
            }else if (neye.equalsIgnoreCase("nanometre")){
                System.out.println(metre*Math.pow(10,19));
            }else if (neye.equalsIgnoreCase("picometre")){
                System.out.println(metre*Math.pow(10, 22));
            }else if (neye.equalsIgnoreCase("dekametre")){
                System.out.println(metre*Math.pow(10, 8));
            }else if (neye.equalsIgnoreCase("hektametre")){
                System.out.println(metre*Math.pow(10, 7));
            }else if (neye.equalsIgnoreCase("kilometre")){
                System.out.println(metre*Math.pow(10, 6));
            }else if (neye.equalsIgnoreCase("megametre")){
                System.out.println(metre*Math.pow(10, 3));
            }
        }
    }
}