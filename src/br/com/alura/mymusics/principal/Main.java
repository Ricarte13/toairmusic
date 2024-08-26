package br.com.alura.mymusics.principal;

import br.com.alura.mymusics.models.Musics;
import br.com.alura.mymusics.models.MyFavorites;
import br.com.alura.mymusics.models.Podcasts;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Musics myMusic = new Musics();
        myMusic.setSinger("Nadson o Ferinha");
        myMusic.setTitle("Enxoval");

        for (int i = 0; i < 1000; i++) {
            myMusic.like();
        }

        for (int i = 0; i < 2000; i++) {
            myMusic.reproduce();
        }

        Podcasts myPodcast = new Podcasts();
        myPodcast.setHoster("AnaMed");
        myPodcast.setTitle("EasyHealth");

        for (int i = 0; i < 5000; i++) {
            myPodcast.reproduce();
        }

        for (int i = 0; i < 2000; i++) {
            myPodcast.like();
        }

        MyFavorites favorites = new MyFavorites();
        favorites.add(myMusic);
        favorites.add(myPodcast);
    }
}