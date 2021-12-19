package android.ss.com.vboost.d;

import android.ss.com.vboost.c.c;
import android.ss.com.vboost.d.f;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;

public final class h implements Callable<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public ScheduledFuture<Integer> f558a;

    /* renamed from: b  reason: collision with root package name */
    private final d f559b;

    static {
        Covode.recordClassIndex(59);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Integer call() {
        if (!(this.f559b.f534k == g.USER_CANCEL || this.f559b.f534k == g.USE_PROVIDERS)) {
            this.f559b.f532i = true;
            c.a().c(this.f559b);
        }
        f.a.f556a.a(this.f559b, true);
        return null;
    }

    h(d dVar) {
        this.f559b = dVar;
    }
}
