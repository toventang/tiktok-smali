package androidx.work;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Executor;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f4467a;

    /* renamed from: b  reason: collision with root package name */
    public final k f4468b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4469c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4470d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4471e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4472f;

    static {
        Covode.recordClassIndex(1744);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        Executor f4473a;

        /* renamed from: b  reason: collision with root package name */
        k f4474b;

        /* renamed from: c  reason: collision with root package name */
        int f4475c = 4;

        /* renamed from: d  reason: collision with root package name */
        int f4476d;

        /* renamed from: e  reason: collision with root package name */
        int f4477e = Integer.MAX_VALUE;

        /* renamed from: f  reason: collision with root package name */
        int f4478f = 20;

        static {
            Covode.recordClassIndex(1745);
        }

        public final b a() {
            return new b(this);
        }
    }

    b(a aVar) {
        if (aVar.f4473a == null) {
            int max = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
            l.a a2 = l.a(o.FIXED);
            a2.f79174c = max;
            this.f4467a = g.a(a2.a());
        } else {
            this.f4467a = aVar.f4473a;
        }
        if (aVar.f4474b == null) {
            this.f4468b = new k() {
                /* class androidx.work.k.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1888);
                }
            };
        } else {
            this.f4468b = aVar.f4474b;
        }
        this.f4469c = aVar.f4475c;
        this.f4470d = aVar.f4476d;
        this.f4471e = aVar.f4477e;
        this.f4472f = aVar.f4478f;
    }
}
