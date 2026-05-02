public class PromotionEvaluator {
    LeadershipProfile lpf;

    public PromotionEvaluator(LeadershipProfile lpf) {
        this.lpf = lpf;
    }

    public boolean isEligibleForPromotion() {
        return (lpf.leadershipScore >= 50 && lpf.mentoringScore >= 30) ||
                (lpf.leadershipScore >= 30 && lpf.mentoringScore >= 50);
    }

}