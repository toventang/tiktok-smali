package com.ss.android.ugc.aweme.im.sdk.common.ui.base.a;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Executor;

public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final j.e<T> f102518a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f102519b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f102520c;

    public static final class a<T> {

        /* renamed from: c  reason: collision with root package name */
        public static final C2578a f102521c = new C2578a((byte) 0);

        /* renamed from: e  reason: collision with root package name */
        private static final Object f102522e = new Object();

        /* renamed from: f  reason: collision with root package name */
        private static Executor f102523f;

        /* renamed from: a  reason: collision with root package name */
        Executor f102524a;

        /* renamed from: b  reason: collision with root package name */
        Executor f102525b;

        /* renamed from: d  reason: collision with root package name */
        private final j.e<T> f102526d;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.d$a$a  reason: collision with other inner class name */
        public static final class C2578a {
            static {
                Covode.recordClassIndex(65659);
            }

            private C2578a() {
            }

            public /* synthetic */ C2578a(byte b2) {
                this();
            }
        }

        static {
            Covode.recordClassIndex(65658);
        }

        public final d<T> a() {
            MethodCollector.i(6352);
            if (this.f102525b == null) {
                synchronized (f102522e) {
                    try {
                        if (f102523f == null) {
                            l.a a2 = l.a(o.FIXED);
                            a2.f79174c = 2;
                            f102523f = g.a(a2.a());
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(6352);
                        throw th;
                    }
                }
                this.f102525b = f102523f;
            }
            j.e<T> eVar = this.f102526d;
            Executor executor = this.f102525b;
            if (executor == null) {
                h.f.b.l.b();
            }
            d<T> dVar = new d<>(eVar, executor, this.f102524a, (byte) 0);
            MethodCollector.o(6352);
            return dVar;
        }

        public a(j.e<T> eVar) {
            h.f.b.l.d(eVar, "");
            this.f102526d = eVar;
        }
    }

    static {
        Covode.recordClassIndex(65657);
    }

    private d(j.e<T> eVar, Executor executor, Executor executor2) {
        this.f102518a = eVar;
        this.f102519b = executor;
        this.f102520c = executor2;
    }

    public /* synthetic */ d(j.e eVar, Executor executor, Executor executor2, byte b2) {
        this(eVar, executor, executor2);
    }
}
