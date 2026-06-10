package br.edu.ifpb.ads.padroes.atv2.sdk.stripe;

public class StripeCharge {

    private final String chargeId;
    private final boolean paid;
    private final String receipt;

    public StripeCharge(String chargeId, boolean paid, String receipt) {
        this.chargeId = chargeId;
        this.paid = paid;
        this.receipt = receipt;
    }

    public String getChargeId() {
        return chargeId;
    }

    public boolean isPaid() {
        return paid;
    }

    public String getReceipt() {
        return receipt;
    }

}
