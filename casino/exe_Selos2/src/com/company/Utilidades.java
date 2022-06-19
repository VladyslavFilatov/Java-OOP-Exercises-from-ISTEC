package com.company;

public class Utilidades {
    public void selos2 (int quantia){
        int s5=0, s3=0, r, q;
        try{
            if (quantia>=8){
                q=quantia/8;
                r=quantia%8;
                switch (r){
                    case 0: s5=q;s3=q;break;
                    case 1: s5=q-1;s3=q+2;break;
                    case 2: s5=q+1;s3=q-1;break;
                    
                    case 3: s5=q;s3=q+1;break;
                    case 4: s5=q-1;s3=q+3;break;
                    case 5: s5=q+1;s3=q;break;
                    case 6: s5=q;s3=q+2;break;
                    case 7: s5=q+2;s3=q-1;break;
                }

            }else if (quantia==3){s5=0;s3=1;}
            else if (quantia==5){s5=1;s3=0;}
            else if (quantia==6){s5=0;s3=2;}
            else System.out.println("erro");

            System.out.println("Selod de 5 ="+s5+" Selos de 3 ="+s3);


        }catch(Exception erro){
            System.out.println(erro.getMessage());
        }
    }
}
