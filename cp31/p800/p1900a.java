package cp31.p800;

public class p1900a {
    public static int minimumWaterSources(String s) {
        int n = s.length();
        boolean threeConsecutive = false;
        int emptycells=0;
       
        for (int i = 0; i < n - 2; i++) {
            if (s.charAt(i) == '.' && s.charAt(i + 1) == '.' && s.charAt(i + 2) == '.') {
                threeConsecutive = true;
                break;
            }

            if (s.charAt(i) == '.') {
                emptycells++;
            }

        }
      
      return  threeConsecutive?2:emptycells;
      

    }

    public static void main(String[] args) {
        System.out.println(minimumWaterSources("##..#.#...#"));

    }

}
