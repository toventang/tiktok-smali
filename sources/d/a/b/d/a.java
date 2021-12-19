package d.a.b.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final C4132a f156553a = new C4132a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final long f156554b;

    /* renamed from: c  reason: collision with root package name */
    private final ThreadFactory f156555c;

    static {
        Covode.recordClassIndex(103948);
    }

    /* renamed from: d.a.b.d.a$a  reason: collision with other inner class name */
    static final class C4132a {
        static {
            Covode.recordClassIndex(103949);
        }

        private C4132a() {
        }

        public /* synthetic */ C4132a(byte b2) {
            this();
        }
    }

    @Override // d.a.b.d.e
    public final ScheduledExecutorService a() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) g.a(l.a(o.SCHEDULED).a(5).a(this.f156555c).a());
        h.f.b.l.a((Object) scheduledExecutorService, "");
        return scheduledExecutorService;
    }

    public a(long j2, ThreadFactory threadFactory) {
        h.f.b.l.c(threadFactory, "");
        this.f156554b = j2;
        this.f156555c = threadFactory;
    }
}
