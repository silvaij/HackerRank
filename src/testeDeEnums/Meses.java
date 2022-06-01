package testeDeEnums;

public class Meses {
    public static void main(String[] args) {
         Integer mes = MesesEnum.ABRIL.getMes();
         iteraMeses();
    }

    public static void iteraMeses(){
        for(int i = 1 ; i <=12 ; i++){
            switch(i){
                case 1 :{
                    System.out.println(MesesEnum.JANEIRO);
                break;
                } case 2 :{
                    System.out.println(MesesEnum.FEVEREIRO);
                    break;
                }
                case 3 :{
                    System.out.println(MesesEnum.MARCO);
                    break;
                }
                case 4 :{
                    System.out.println(MesesEnum.ABRIL);
                    break;
                }
                case 5 :{
                    System.out.println(MesesEnum.MAIO);
                    break;
                }
                case 6 :{
                    System.out.println(MesesEnum.JUNHO);
                    break;
                }
                case 7 :{
                    System.out.println(MesesEnum.JULHO);
                    break;
                }
                case 8 :{
                    System.out.println(MesesEnum.AGOSTO);
                    break;
                }
                case 9 :{
                    System.out.println(MesesEnum.SETEMBRO);
                    break;
                }
                case 10 :{
                    System.out.println(MesesEnum.OUTUBRO);
                    break;
                }
                case 11 :{
                    System.out.println(MesesEnum.NOVEMBRO);
                    break;
                }
                case 12 :{
                    System.out.println(MesesEnum.DEZEMBRO);
                    break;
                }
            }
        }
    }
}
