package PageElemts.Groups;

import Pages.Group.MyGroupPage;
import com.sun.jdi.ArrayType;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public interface CreatPage {
    final String Naming="//*[@id=\"field_name\"]";
    final String Theme="//*[@class=\"multi-select_it_cnt\"]";
    final Random RANDOMe=new Random();
    final List<String> NameS= Arrays.asList("Test","Creation","NoOneSHallStayALive","WhereIsNoPlaceForMortals");
    default  String RandomName(){
        return NameS.get(RANDOMe.nextInt(NameS.size()))+Integer.toString(RANDOMe.nextInt(256));
    }
    //add Random name generation
   // WebElement element=null;
     CreatPage SetName();
     CreatPage ChoseTheme();
     MyGroupPage CreatNewGroup();


}
