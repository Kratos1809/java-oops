public class NiceCar {
    private Media player;
    private Engine engine;

    public NiceCar(){
        engine = new PoweEngine();
        player = new CDPlayer();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
        this.player = new CDPlayer();

    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void MusicStart(){
        player.start();
    }

    public void MusicStop(){
        player.stop();
    }

    public void upgrade(Engine engine){
        this.engine = engine;
        // this.player = new CDPlayer();
    }
}
