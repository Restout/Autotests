package PageElemts.Groups;

public interface CreatPage {
    final String Naming="//*[@id=\"field_name\"]";
    final String Theme="//*[@class=\"multi-select_it_cnt\"]";
    final String Name="Test";//add Random name generation
     CreatPage SetName();
     CreatPage ChoseTheme();
     void CreatNewGroup();


}
