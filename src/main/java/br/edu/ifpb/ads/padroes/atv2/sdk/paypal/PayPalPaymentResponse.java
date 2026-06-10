package br.edu.ifpb.ads.padroes.atv2.sdk.paypal;

public class PayPalPaymentResponse {

    private final String id;
    private final String status;
    private final String detalhe;

    public PayPalPaymentResponse(String id, String status, String detalhe) {
        this.id = id;
        this.status = status;
        this.detalhe = detalhe;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getDetalhe() {
        return detalhe;
    }

}
