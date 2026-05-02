public class LeadershipProfile {

    protected int leadershipScore;
    protected int mentoringScore;

    public LeadershipProfile() {}

    public LeadershipProfile(int leadershipScore, int mentoringScore) {
    }

    public LeadershipProfile(LeadershipProfile other) {
        this.leadershipScore = other.leadershipScore;
        this.mentoringScore = other.mentoringScore;
    }
}