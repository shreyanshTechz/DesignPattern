package Template;

public class TransferMoney {
    private AuditTrail auditTrail;

    public TransferMoney(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void executeTransferMoney() {
        auditTrail.record();
        System.out.println("Transfer Money");
    }




    public AuditTrail getAuditTrail() {
        return auditTrail;
    }

    public void setAuditTrail(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }
}
