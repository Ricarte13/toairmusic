package br.com.alura.mymusics.models;

public class Audio {

    private String title;
    private int duration;
    private int totalReproductions;
    private int likes;
    private double classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getLikes() {
        return likes;
    }

    public double getClassification() {
        return classification;
    }
    public void like(){
        this.likes++;
    }

    public void reproduce(){
        this.totalReproductions++;
    }
}
