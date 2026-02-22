public abstract class NotificationSender {
    protected final AuditLog audit;

    protected NotificationSender(AuditLog audit) {
        this.audit = audit;
    }

    public final void send(Notification n) {
        validate(n);
        doSend(n);
    }

    protected abstract void validate(Notification n);
    protected abstract void doSend(Notification n);
}
