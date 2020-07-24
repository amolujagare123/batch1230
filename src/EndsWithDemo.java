public class EndsWithDemo {


    public static void main(String[] args) {


    String str = "Hey Babay you are so loevely";
    String[] stArr = str.split(" ");

        for(int i = 0 ; i< stArr.length;i++ )
        {
            if(stArr[i].endsWith("y"))
              System.out.println(stArr[i]);
        }

}
}
