/*

**** FoodDecisionMaker ver.JAVA ****
authorized by bnbong, JJongmen

### 2019/12/15 ###

We was decided make this project by Android application at first, but we faced a technical limit.
For a month, we have studied for Android Studio to make a nice application by googling a new or old contents,
searching YouTube lecture about Android Studio, Android Studio official site, even foreign lecture.
But we can't found good solution (how to use fragment drawer project, how put onClick event on fragment, etc) about fragment drawer project that we made.
So we decided to upload this JAVA code-only source code at GitHub.

Sorry for that, And welcome to FoodDecisionMaker!

*/

import java.util.Scanner;
import java.util.Random;

interface Key { public boolean equals(Key m); } //음식점의 이름, 음식 종류를 저장하는 요소 Key
interface Record { public Key keyOf(); } //Key요소를 저장하는 Record 리스트

/*
 / Record에 저장되는 음식점에 관한 데이터는
 / 음식점의 이름, 음식점에서 파는 음식의 종류(양식/한식), 가격의 크기(비싼가 안비싼가), 학교와의 거리(먼가 멀지 않은가), 평점
 / 으로 구성됨.
*/


class DataBase {
	private Record[] base;
	public DataBase(int initial_size) {
		if (initial_size < 0) initial_size = 1;
		base = new Record[initial_size];
	}
	public Record find(Key k) { //pick a element that you want to search
		for (int i = 0; i < base.length; i++) 
			if (base[i] != null && base[i].keyOf().equals(k)) 
				return base[i];
		return null;
	}
	public boolean insert(Record r) { //will help insert elements that you write at decision rullet.
		int i; 
		if (find(r.keyOf()) != null) return false;
		for (i = 0; i < base.length; i++) 
			if (base[i] == null) {
				base[i] = r; return true; 
			}
		Record[] base_new = new Record[base.length * 2];
		for (i = 0; i < base.length; i++)  
			base_new[i] = base[i];
		base = base_new; 
		base[i] = r;
		return true; 
	}
	public boolean delete(Key k) { //will help delete elements that you write at decision rullet.
		for (int i = 0; i < base.length; i++) 
			if (base[i] != null && base[i].keyOf().equals(k)) {
				base[i] = null; return true;
			}
		return false;
	}	
}
class StringDoubleKey implements Key { 
	private String id_str_restname;
    private String id_str_menukinds; 
    private String expensive;
    private String distance;
    private String rating; 
    
	public StringDoubleKey(String s, String i, String e, String d, String r) {id_str_restname = s; id_str_menukinds = i; expensive = e; distance = d; rating = r;}
	public String getKindString() { return id_str_menukinds; }
    public String getNameString() { return id_str_restname;}
    public String getExpensive() { return expensive;}
    public String getDistance() {return distance; }
    public String getRating() {return rating; }

	public boolean equals(Key m) {
        return id_str_menukinds == ((StringDoubleKey)m).getKindString() && id_str_restname == ((StringDoubleKey)m).getNameString() && expensive == ((StringDoubleKey)m).getExpensive()
        && distance == ((StringDoubleKey)m).getDistance() && rating == ((StringDoubleKey)m).getRating();
	}
	public String toString() { return id_str_restname + id_str_menukinds + expensive + distance + rating; }
}


class OtherElements implements Record {
	private StringDoubleKey restaurant_id;
	
	public Key keyOf() {
	    return retaurant_id;
	}
	public String toString() {
        return restaurant_id.toString();
	}
} 


public class FoodDecisionMaker {

    public void main(String[] args) {
        int response = 0;
        Scanner scanner = new Scanner(System.in);

        DataBase db = new DataBase(100) ;
        Record r1 = new StringDoubleKey("SubWay", "Western food", "Expensive", "Close", "Low");
        Record r2 = new StringDoubleKey("213 Burger", "Western food", "Cheap", "Close", "High");
        Record r3 = new StringDoubleKey("jjigae jjigae", "Korean food", "Cheap", "Close", "High");
        Record r4 = new StringDoubleKey("All Chone", "Korean food", "Cheap", "Close", "High");

        db.insert(r1); db.insert(r2); db.insert(r3); db.insert(r4);

        System.out.println("Welcome to Food Decision Maker!! \n\n 1. Run Decision Rullet\n\n 2. Run Decision Navigator\n\n 3. Quit");
        
        while(true){
            System.out.println("Write number to do : (write 1, 2, 3) ");
            try{
                switch(response = scanner.nextInt()){
                    case 1: //Decision Rullet
                        int element = 0;
                        System.out.println("Write number of elements to run rullet.");
                        element = sc.nextInt();

                        String[] rullet = new String[element];

                        for(int i = 0; i < element; i++) {
                            String str_element = "";
                            System.out.println("Write element at " + (i+1));
                            
                            str_element = sc.nextLine();
                            rullet[i] = str_element;
                        }
                        Random random = new Random();
                        
                        System.out.println("Result : " + rullet[random.nextInt(element)]);
                        break;
                    case 2: //Decision Navigator
                        String navi_response = "";
                        System.out.println("Enter your preference (Food type, price, distance, rating) : (write f, p, d, r) ");
                        while (true){
                            try{
                                navi_response = scanner.nextLine();
                                break;
                            } catch(Exception e) {
                                System.out.println("Write sentence string.");
                                continue;
                            }
                        }
                        
                        if (navi_response == "f") { //food type (Western food, Korean food)

                        } else if(navi_response == "p") { //price (Cheap, Expensive)

                        } else if(navi_response == "d") { //distance (Close, Far)

                        } else if(navi_response == "r") { //rating (Low, High)

                        }

                    case 3: System.out.println("Thank You!"); exit(1);
                }
                continue;
                
            } catch(Exception e){
                System.out.println("Write 1, 2, 3");
                continue;
            }
        }
    }
}