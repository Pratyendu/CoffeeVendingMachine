package implementations;

public class AuditDetails {
    float totalPrice = 0f;
    float milkConsumed = 0f;
    float waterConsumed = 0f;
    float beansConsumed = 0f;

    public AuditDetails(float totalPrice, float milkConsumed, float waterConsumed, float beansConsumed) {
        this.totalPrice = totalPrice;
        this.milkConsumed = milkConsumed;
        this.waterConsumed = waterConsumed;
        this.beansConsumed = beansConsumed;
    }
}
