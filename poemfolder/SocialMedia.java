import java.util.*;

public class SocialMedia {
    private ArrayList<String> posts;

    public SocialMedia(String filename) {
        this.posts = FileOperator.getStringData(filename);

    }
    public int postsWithLength(int minLength) {
        int count = 0;
        for(String post : posts) {
            if (post.length() > minLength) {
                count++;
            }
        }
        return count;
    }
    public ArrayList<String> postsWithHashtag(String hashtag) {
        ArrayList<String> result = new ArrayList<>();

        for(String post : posts) {
            if (post.contains(hashtag)) {
                result.add(post);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        SocialMedia jayden = new SocialMedia("somple.txt");
        System.out.println(jayden.postsWithHashtag("Java"));
        System.out.println(jayden.postsWithLength(20));
        // jayden.postsWithHashtag("Java").forEach();
        // SocialMedia daniel = new SocialMedia("sample1.txt");
    }
}