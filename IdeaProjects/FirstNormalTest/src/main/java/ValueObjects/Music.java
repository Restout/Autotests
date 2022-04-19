package ValueObjects;

public class Music {
    protected String m_name;
    protected String m_duration;
    protected String m_author;
    protected boolean m_Explicted;

   public Music(String name, String author, String duration, boolean expc){
       m_name=name;
       m_author=author;
       m_duration=duration;
       m_Explicted=expc;


   }
   public Music(){

   }
    public Music(String name, String author, String duration){
    this(name, author,duration,false);
   }
   @Override
    public boolean equals(Object that){
       Music music=(Music) that;
       if(this==that)
return true;
       if(that==null)
           return false;

     return music.m_name.equals(this.m_name)&&music.m_author.equals(this.m_author)&&music.m_duration.equals(this.m_duration);

    }
    public void SetAuthor(String Author){m_author=Author;}

    public void SetDuration(String Duration){m_duration=Duration;}
    public void SetName(String Name){m_name=Name;}
    public void SetExplicted(boolean Exp){m_Explicted=Exp;}
    public String GetAuthor(){
       return  m_author;
    }
    public String GetDuration(){
return m_duration;
    }
    public String GetName(){
return m_name;
    }

    public boolean IsEplc(){
return m_Explicted;
    }
}