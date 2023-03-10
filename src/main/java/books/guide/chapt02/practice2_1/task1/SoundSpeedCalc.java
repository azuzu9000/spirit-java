package books.guide.chapt02.practice2_1.task1;

public class SoundSpeedCalc {
    public static void main(String[] args) {
        SoundSpeed soundSpeed = new SoundSpeed();
        soundSpeed.timeInSeconds = 35.079;
        soundSpeed.isEcho = true;
        String verb;
        
        if(soundSpeed.isEcho) {
            verb = "echo";
        } else {
            verb = "travel";
        }
        System.out.println("The sound took " + soundSpeed.timeInSeconds + " seconds to " +
                verb + " and thus the distance is " + soundSpeed.getResult() + " feet away.");
    }
}