package Problem;

public class PrintaToz {
    public static void main(String[] args) {
        
        String series="";
        for(int i=0;i<26;i++){
            System.out.println("i:"+i);
            char ch=(char) ('a'+i);
            System.out.println("ch:"+ch);
            series=series+ch;
        }
        System.out.println(series);
    }
    
}
