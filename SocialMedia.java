import java.util.ArrayList;
public class SocialMedia {
    private ArrayList<String> posts;
 
    public SocialMedia(String Filename){
        this.posts=FileOperator.getStringData(Filename);
    }
    public int postsWithLength(int minLength){
        int total_count=0;
        return total_count;
    }
    public ArrayList<String> postsWithHashtag(){
        ArrayList<String> result =new ArrayList<>();
        return result;
    }
}