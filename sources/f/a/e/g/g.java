package f.a.e.g;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import java.util.concurrent.ThreadFactory;

public final class g extends aa {

    /* renamed from: c  reason: collision with root package name */
    private static final j f157891c = new j("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: a  reason: collision with root package name */
    final ThreadFactory f157892a;

    public g() {
        this(f157891c);
    }

    @Override // f.a.aa
    public final aa.c a() {
        return new h(this.f157892a);
    }

    static {
        Covode.recordClassIndex(104831);
    }

    private g(ThreadFactory threadFactory) {
        this.f157892a = threadFactory;
    }
}
