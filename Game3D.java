public class Game3D extends Game{
    private String videoCard;
    public void setVideoCard(String videoCard){
        this.videoCard = videoCard;
    }
    public String getVideoCard(){
        return videoCard;
    }
    public void printDetails(){
        super.printDetails();
        System.out.println("Video Card: " + videoCard);
    }

    public static void main(String[] args){
        Game3D game = new Game3D();
        game.setName("Doom");
        game.setScore(100);
        game.setVideoCard("Nvidia");
        game.printDetails();
    }
}
