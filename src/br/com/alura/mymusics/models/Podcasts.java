package br.com.alura.mymusics.models;

import br.com.alura.mymusics.models.Audio;

public class Podcasts extends Audio {

    private String hoster;
    private String type;

    public String getHoster() {
        return hoster;
    }

    public void setHoster(String hoster) {
        this.hoster = hoster;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getClassification() {
        if(getLikes() > 1000){
            return 10;
        }else {
            return 7;
        }
    }
}
