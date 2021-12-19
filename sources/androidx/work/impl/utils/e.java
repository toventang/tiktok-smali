package androidx.work.impl.utils;

import androidx.work.g;
import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b.h;
import androidx.work.impl.f;
import com.a;
import com.bytedance.covode.number.Covode;

public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4787a = g.a("StopWorkRunnable");

    /* renamed from: b  reason: collision with root package name */
    private f f4788b;

    /* renamed from: c  reason: collision with root package name */
    private String f4789c;

    static {
        Covode.recordClassIndex(1880);
    }

    public final void run() {
        WorkDatabase workDatabase = this.f4788b.f4701c;
        h i2 = workDatabase.i();
        workDatabase.e();
        try {
            if (i2.d(this.f4789c) == i.a.RUNNING) {
                i2.a(i.a.ENQUEUED, this.f4789c);
            }
            boolean a2 = this.f4788b.f4704f.a(this.f4789c);
            g.a();
            a.a("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f4789c, Boolean.valueOf(a2)});
            workDatabase.g();
        } finally {
            workDatabase.f();
        }
    }

    public e(f fVar, String str) {
        this.f4788b = fVar;
        this.f4789c = str;
    }
}
