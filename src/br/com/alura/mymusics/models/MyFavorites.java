package br.com.alura.mymusics.models;

public class MyFavorites {

    public void add(Audio audio) {
        if(audio.getClassification() >= 9) {
            System.out.println(audio.getTitle() + " is a real success!");
        }else {
            System.out.println(audio.getTitle() + " also is one of the everybody likes");
        }
    }
}
