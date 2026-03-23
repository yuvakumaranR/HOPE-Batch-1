public class NPDataTypes {
    
    public static void main(String[] args) {
        int [] nums={1, 2, 3, 4, 5};
        for(int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
        String s1="Hello";
        String s2="Hello";
        System.out.println( s1+" "+s2);
        System.out.println(s1==s2);
        String s3=new String();
        String s4=new String();
        System.out.println(s3==s4);
        s3="hello";
        s4="hello";
        System.out.println(s3==s4);

        //why false learn memory allocation in java
        
    }

}
  