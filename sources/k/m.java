package k;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public class m extends ab {

    /* renamed from: a  reason: collision with root package name */
    public ab f158879a;

    static {
        Covode.recordClassIndex(105436);
    }

    @Override // k.ab
    public ab clearDeadline() {
        return this.f158879a.clearDeadline();
    }

    @Override // k.ab
    public ab clearTimeout() {
        return this.f158879a.clearTimeout();
    }

    @Override // k.ab
    public long deadlineNanoTime() {
        return this.f158879a.deadlineNanoTime();
    }

    @Override // k.ab
    public boolean hasDeadline() {
        return this.f158879a.hasDeadline();
    }

    @Override // k.ab
    public void throwIfReached() {
        this.f158879a.throwIfReached();
    }

    @Override // k.ab
    public long timeoutNanos() {
        return this.f158879a.timeoutNanos();
    }

    public final m a(ab abVar) {
        l.c(abVar, "");
        this.f158879a = abVar;
        return this;
    }

    public m(ab abVar) {
        l.c(abVar, "");
        this.f158879a = abVar;
    }

    @Override // k.ab
    public ab deadlineNanoTime(long j2) {
        return this.f158879a.deadlineNanoTime(j2);
    }

    @Override // k.ab
    public ab timeout(long j2, TimeUnit timeUnit) {
        l.c(timeUnit, "");
        return this.f158879a.timeout(j2, timeUnit);
    }
}
