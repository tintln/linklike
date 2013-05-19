package linklike

class Link {
    String title
    String url
    Integer votes = 0

    static constraints = {
    }

    void increaseVotes(){
    	votes += 1
    }
}
