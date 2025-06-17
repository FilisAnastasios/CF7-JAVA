package gr.aueb.cf.ch2;

/**
 * a small frog wants to go to the other side of the road.
 * the frog is currently located at position x and wants to
 * a position greater or equal to Y. The small frog jumps a
 * fixed distance, D. Fine the minimim number of jups.
 *
 * x = 10
 * y = 85
 * d = 30
 *
 * jumps = 3
 * 10 + 30 = 40
 * 40 + 30 = 70
 * 70 + 30 = 100
 *
 */
public class FrogJumpsApp {

    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        // calculate mjumps
        // i ceil perni ena dekadiko kai ton kane akereo pros ta pano
        // kanoume tin praksi . pernoume double kai sto telos
        // theloume na ton kanoume pali int gia (jumps)
        // typecast

        jumps = (int) Math.ceil((target - start) / (double) hop);

        System.out.println("Jump: " + jumps);


    }
}
