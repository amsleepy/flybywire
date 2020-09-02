/* 
Name: Stephen Emmons
Class: CptS 233
Assign: Micro Assignment 1
Date: 9/2/2020
gitRepo url: https://github.com/amsleepy/flybywire
*/

package microassign1;

public class Main {
    
    public static void main(String[] arg0) {

        RoomDimensions dim = new RoomDimensions(12.0, 12.5);
        System.out.println(dim);

        RoomCarpet carp = new RoomCarpet(dim, 6.0);
        System.out.println(carp);

    }

}