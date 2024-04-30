package home_ques;

import java.util.ArrayList;

public class paths {
    public static void main(String[] args) {
        ArrayList<String> res = newpathmaze(1, 1, 3, 3);
        System.out.println(res);


    }

    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {
        if (sc == dc && sr == dr) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if (sc < dc) {
            hpaths = getMazePath(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            vpaths = getMazePath(sr + 1, sc, dr, dc);
        }
        ArrayList<String> myres = new ArrayList<>();
        for (String hpath : hpaths) {
            myres.add("h" + hpath);
        }
        for (String vpath : vpaths) {
            myres.add("v" + vpath);
        }
        return myres;
    }

    public static ArrayList<String> newpathmaze(int sr, int sc, int dr, int dc) {
        if (sc == dc && sr == dr) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        ArrayList<String> myres = new ArrayList<>();
        for (int s = 1; s <= dc - sc; s++) {
            ArrayList<String> hpaths = newpathmaze(sr, sc + s, dr, dc);
            for (String hpath : hpaths) {
                myres.add("h" + s + hpath);
            }
        }
        for (int s = 1; s <= dr - sr; s++) {
            ArrayList<String> vpaths = newpathmaze(sr + s, sc, dr, dc);
            for (String vpath : vpaths) {
                myres.add("v" + s + vpath);
            }
        }
        for (int s = 1; s <= dr - sr && s <= dc - sc; s++) {
            ArrayList<String> dpaths = newpathmaze(sr + s, sc + s, dr, dc);
            for (String dpath : dpaths) {
                myres.add("v" + "h" + s + dpath);
            }
        }
        return myres;
    }

}
