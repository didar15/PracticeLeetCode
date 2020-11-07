package LC3;

public class LC207_Course_Schedule {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        int [] a=new int[numCourses];

        for(int [] arrs: prerequisites){

              a[arrs[1]]=1;
          }


        for (int i = 0; i <a.length ; i++) {
            int count=0;
            if (a[i]==count) {
                count++;
            } else {
                return false;
            }
        }

 return true;

    }

    public static void main(String[] args) {
        int [][] a={{1,0}, {0,1}};
        System.out.println(canFinish(2,a));
    }
}
