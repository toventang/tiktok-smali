package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;

public final class j extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f159204a;

    static {
        Covode.recordClassIndex(105706);
    }

    public final void run() {
        try {
            this.f159204a.run();
        } finally {
            this.f159203h.b();
        }
    }

    public final String toString() {
        return "Task[" + this.f159204a.getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this.f159204a)) + ", " + this.f159202g + ", " + this.f159203h + ']';
    }

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f159204a = runnable;
    }
}
