public class Audio {

    private String title;
    private int duration;
    private int totalReproductions;
    private int likes;
    private double classification;

    public Audio(String title, int duration, int totalReproductions, int likes, double classification) {
        this.title = title;
        this.duration = duration;
        this.totalReproductions = totalReproductions;
        this.likes = likes;
        this.classification = classification;
    }

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

    public void setTotalReproductions(int totalReproductions) {
        this.totalReproductions = totalReproductions;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public double getClassification() {
        return classification;
    }

    public void setClassification(double classification) {
        this.classification = classification;
    }

    public void like(String like){
        if (like == "y"){
            likes++;
            System.out.printf("Likes = %d%n", likes);
        }
    }

    public void reproduce(){
        System.out.println("Reproducing music!");
    }
}
