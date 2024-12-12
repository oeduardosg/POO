package simulado_q1;

public class User {
    
    private java.util.LinkedList<Tweet> tweets;
    private String name;

    public User(String name) {
        this.name = name;
        this.tweets = new java.util.LinkedList<Tweet>();
    }

    public java.util.LinkedList<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(java.util.LinkedList<Tweet> tweets) {
        this.tweets = tweets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTweet(Tweet t) {
        this.tweets.add(t);
    }

    public int getTweetsLenght() {
        int sum = 0;
        for(Tweet t: tweets) {
            sum += t.getLenght();
        }
        return sum;
    }

}
