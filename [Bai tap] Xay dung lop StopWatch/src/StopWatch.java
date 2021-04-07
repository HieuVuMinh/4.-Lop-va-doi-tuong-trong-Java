public class StopWatch {
    double startTime;
    double endTime;

    StopWatch(){

    }

    void start(){
        this.startTime = System.currentTimeMillis();
    }
    void end(){
        this.endTime = System.currentTimeMillis();
    }
    double getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
