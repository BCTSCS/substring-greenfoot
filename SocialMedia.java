import java.util.ArrayList;
public class SocialMedia {
    private ArrayList<String> posts;

    public SocialMedia(String filename){
        this.posts = FileOperator.getStringData(filename);
    }
    public int postsWithLength(int minLength){
        int totalCount = 0;
        return totalCount;
    }
    public ArrayList<String> postsWithHashtag(String hashtag){
        ArrayList<String> result = new ArrayList<>();
        for(String post : posts){
            if(post.contains(hashtag)){
                result.add(post);
            }
        }

        return result;
    }


public static void main(String[] args){
    SocialMedia jayden = new SocialMedia(filename: "sample1.txt");
    // SocialMedia x = new SocialMedia(filename: "sample2.txt");
    System.out.println(jayden.postsWithHashtag("Java"));
    // jayden.postsWithHashtag("Java").stream().forEach(System.out.println());
}
}

