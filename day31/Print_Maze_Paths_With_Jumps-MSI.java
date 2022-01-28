/* Q. print maze paths with jumps
input-
3
3
output -
h1h1v1v1
h1h1v2
h1v1h1v1
h1v1v1h1
h1v1d1
h1v2h1
h1d1v1
h2v1v1
h2v2
v1h1h1v1
v1h1v1h1
v1h1d1
v1h2v1
v1v1h1h1
v1v1h2
v1d1h1
v2h1h1
v2h2
d1h1v1
d1v1h1
d1d1
d2
*/
import java.io.*;
	import java.util.*;

	public class Print_Maze_Paths_With_Jumps {

	    public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();
            printMazePaths(1, 1, n, m, "");
	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	         if(sr == dr && sc == dc ){
                 System.out.println(psf);
                 return;
             }

            for(int ms = 1; ms <= dc - sc; ms++){
               printMazePaths(sr , sc + ms, dr , dc, psf + "h" + ms);
            }

            for(int ms = 1; ms <= dr - sr; ms++){
               printMazePaths(sr + ms, sc, dr , dc, psf + "v" + ms);
            }

            for(int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++){
               printMazePaths(sr + ms, sc + ms, dr , dc, psf + "d" + ms);
            }

	    }

	}