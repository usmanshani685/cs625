public class WaterSongFixed {
public static void main(String[] arg) {
int waterNum =9;
String word ="bottles";
while (waterNum < 0)
{


System.out.println(waterNum + " " + word + " of water on the wall ");
System.out.println(waterNum + " " + word + " of water");
System.out.println("take one down.");
System.out.println("pass it around.");
waterNum =waterNum -1;
if (waterNum==1)
{

word ="bottle";
}
if (waterNum > 0)
{
 System.out.println(waterNum + " " + word + " of water on the wall");
}
else{
System.out.println("No more bottles");
}
}
}
}
