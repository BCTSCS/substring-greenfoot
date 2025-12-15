import java.util.ArrayList;
public class SocialMedia {
    private ArrayList<String> posts;

    public SocialMedia(String filename){
        this.posts = FileOperator.getStringData(filename);
    }
    public int postsWithLength(int minLength){
        int totalCount = 0;
        for(String post : posts){
            if(post.length()>= minLength){
                totalCount++;
            }
        }
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
    SocialMedia sample1 = new SocialMedia("sample1.txt");
    int countfifty = sample1.postsWithLength(50);
    System.out.println("Posts with 50+ length" + countfifty);
    int countseventy = sample1.postsWithLength(70);
    System.out.println("Posts with 70+ length" + countseventy);

    ArrayList<String> javaPosts = sample1.postsWithHashtag("Java");
    System.out.println("Posts with #Java: " + javaPosts.size());
    for(String post : javaPosts){
        System.out.println(" " + post);
    }
    System.out.println();

    SocialMedia sample2 = new SocialMedia("sample2.txt");
    int counteighty = sample2.postsWithLength(80);
    System.out.println("Posts with 80+ length" + counteighty);
    
    ArrayList<String> marvelPosts = sample2.postsWithHashtag("Marvel");
    System.out.println("Posts with #Marvel: " + marvelPosts.size());
    for(String post : marvelPosts){
        System.out.println(" " + post);
    }
    System.out.println();

    ArrayList<String> endgameHypePosts = sample2.postsWithHashtag("EndgameHype");
    System.out.println("Posts with #EndgameHype: " + endgameHypePosts.size());
    for(String post : endgameHypePosts) {
        System.out.println(" " + post);
    }
}
}

