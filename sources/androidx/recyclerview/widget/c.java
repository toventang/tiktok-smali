package androidx.recyclerview.widget;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Executor;

public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f3990a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f3991b;

    /* renamed from: c  reason: collision with root package name */
    public final j.e<T> f3992c;

    static {
        Covode.recordClassIndex(1554);
    }

    public static final class a<T> {

        /* renamed from: d  reason: collision with root package name */
        private static final Object f3993d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private static Executor f3994e = null;

        /* renamed from: a  reason: collision with root package name */
        private Executor f3995a;

        /* renamed from: b  reason: collision with root package name */
        private Executor f3996b;

        /* renamed from: c  reason: collision with root package name */
        private final j.e<T> f3997c;

        static {
            Covode.recordClassIndex(1555);
        }

        public final c<T> a() {
            if (this.f3996b == null) {
                synchronized (f3993d) {
                    if (f3994e == null) {
                        l.a a2 = l.a(o.FIXED);
                        a2.f79174c = 2;
                        f3994e = g.a(a2.a());
                    }
                }
                this.f3996b = f3994e;
            }
            return new c<>(this.f3995a, this.f3996b, this.f3997c);
        }

        public a(j.e<T> eVar) {
            this.f3997c = eVar;
        }
    }

    c(Executor executor, Executor executor2, j.e<T> eVar) {
        this.f3990a = executor;
        this.f3991b = executor2;
        this.f3992c = eVar;
    }
}
