public class Game {
    private String name;
    private int score;
    
    public void setName(String name){
        this.name = name;
    }
    public void setScore(int score){
        this.score = score;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
    }
    public static void main(String[] args){
        Game game = new Game();
        game.setName("Tetris");
        game.setScore(100);
        game.printDetails();
    }
}
