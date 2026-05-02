public class PromotionBoard {
    PromotionEvaluator pme;

    public PromotionBoard() {}

    public PromotionBoard(PromotionEvaluator pme) {
        this.pme = pme;
    }

    public PromotionBoard(PromotionBoard other) {
        this.pme = other.pme;
    }
    
    public void approveSupervisorPromotion() {
        if (pme.isEligibleForPromotion())
            System.out.println("Promotion approved");
        else
            System.out.println("Promotion disapproved");
    }
}