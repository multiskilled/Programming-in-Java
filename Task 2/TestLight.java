import java.util.*;

public class TestLight{

int low=1;
int medium=2;
int high=3;

private int light_brightness=low;
private boolean light_switch=false;
String light_color="red";

public String toString(){
//returns string description
    if(light_switch==true){
        return light_brightness+ light_color;
    }else{
        return light_color + "light is off";
    }
    
}

//default consructor for light




    public static void main(String args[]){


        
    }
}