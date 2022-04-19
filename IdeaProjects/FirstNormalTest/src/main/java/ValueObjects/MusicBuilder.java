package ValueObjects;

public class MusicBuilder extends Music{
    private String m_name;
    private String m_duration;
    private String m_author;
    private boolean m_Explicted;
    private Music music;
    MusicBuilder() {
this.music=new Music();

    }
    public MusicBuilder WithName(String Name){
        music.m_name=Name;
        return this;
    }
    public MusicBuilder WithAuthor(String author){
        music.m_author=author;
        return this;
    }
    public MusicBuilder WithDuration(String Duration){
        music.m_duration=Duration;
        return this;
    }
    public MusicBuilder IsExPLICTED(boolean Explicted){
        music.m_Explicted=Explicted;
        return this;
    }



}
