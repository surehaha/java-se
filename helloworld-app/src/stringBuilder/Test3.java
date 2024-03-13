package stringBuilder;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(getArraydata(new int[]{11,22,33}));
    }
    public static String getArraydata(int[] arr){
        if(arr==null){
            return null;
        }

        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");
            }

        }
        sb.append("]");

        return sb.toString();
    }
}
