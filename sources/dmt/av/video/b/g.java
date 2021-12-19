package dmt.av.video.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.ScheduledExecutorService;

public final class g extends l {
    static {
        Covode.recordClassIndex(104131);
    }

    /* access modifiers changed from: protected */
    @Override // dmt.av.video.b.l
    public final e a() {
        e a2 = super.a();
        a2.a(new h(), 0);
        return a2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(s sVar, ScheduledExecutorService scheduledExecutorService) {
        super(sVar, scheduledExecutorService);
        l.d(sVar, "");
        l.d(scheduledExecutorService, "");
    }
}
