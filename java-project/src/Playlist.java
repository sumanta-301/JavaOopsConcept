//manipulating arraylist 

import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Sneaker Pimps - Six Underground");
    desertIslandPlaylist.add("HeartAttack");
    desertIslandPlaylist.add("Memories");
    desertIslandPlaylist.add("believer");
    desertIslandPlaylist.add("Senorita");
    desertIslandPlaylist.add("Hips Don't Lie'");
    desertIslandPlaylist.add("Loves me Like you Do");
    System.out.println(desertIslandPlaylist);
    //System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove(0);
    System.out.println(desertIslandPlaylist.size());
    int indexA = desertIslandPlaylist.indexOf("believer");
    int indexB = desertIslandPlaylist.indexOf("Senorita");
//    desertIslandPlaylist.set(indexA, indexB);
    System.out.println(indexA);
    System.out.println(indexB);
    String tempA ="believer";
    desertIslandPlaylist.set(indexA, "senorita");
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);

  }
  
}