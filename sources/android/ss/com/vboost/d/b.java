package android.ss.com.vboost.d;

import android.ss.com.vboost.c.c;
import android.ss.com.vboost.d.f;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

public class b implements Callable<Integer> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f519a = b.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final d f520b;

    static {
        Covode.recordClassIndex(49);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Integer call() {
        if (c.a().a(this.f520b)) {
            if (!this.f520b.f532i) {
                c.a().b(this.f520b);
            } else {
                c.a().c(this.f520b);
            }
        }
        f.a.f556a.a(this.f520b, false);
        return null;
    }

    public b(d dVar) {
        this.f520b = dVar;
    }
}
