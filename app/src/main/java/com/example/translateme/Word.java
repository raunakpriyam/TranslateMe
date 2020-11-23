package com.example.translateme;



public class Word {
    private String mdefaulttranslation;
    private String mMiworkTransaltion;
    private int mimageresourceid;
    private int maudioresourceid;

     public Word(String defaulttranslation,String MiworkTransaltion,int imageresourceid,int audioresourceid){
         mdefaulttranslation=defaulttranslation;
         mMiworkTransaltion=MiworkTransaltion;
         mimageresourceid=imageresourceid;
         maudioresourceid=audioresourceid;

     }

    public Word(String defaulttranslation,String MiworkTransaltion){
        mdefaulttranslation=defaulttranslation;
        mMiworkTransaltion=MiworkTransaltion;
    }

     public String getMdefaulttranslation(){
         return mdefaulttranslation;
     }
     public String getmMiworkTransaltion(){
         return mMiworkTransaltion;
     }
     public int getMimageresourceid(){
         return mimageresourceid;
     }
     public int getMaudioresourceid(){
         return maudioresourceid;
     }

}
