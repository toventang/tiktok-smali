package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class bi<T> implements bg, bk {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f53131a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private volatile bk<T> f53132b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Object f53133c = f53131a;

    static {
        Covode.recordClassIndex(32817);
    }

    private bi(bk<T> bkVar) {
        this.f53132b = bkVar;
    }

    public static <P extends bk<T>, T> bk<T> a(P p) {
        return p instanceof bi ? p : new bi(p);
    }

    public static <P extends bk<T>, T> bg<T> b(P p) {
        return p instanceof bg ? (bg) p : new bi(p);
    }

    @Override // com.google.android.play.core.b.bg, com.google.android.play.core.b.bk
    public final T a() {
        MethodCollector.i(6425);
        T t = (T) this.f53133c;
        Object obj = f53131a;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = this.f53133c;
                    if (t == obj) {
                        t = this.f53132b.a();
                        Object obj2 = this.f53133c;
                        if (obj2 == obj || (obj2 instanceof bj) || obj2 == t) {
                            this.f53133c = t;
                            this.f53132b = null;
                        } else {
                            String valueOf = String.valueOf(obj2);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
                            MethodCollector.o(6425);
                            throw illegalStateException;
                        }
                    }
                } finally {
                    MethodCollector.o(6425);
                }
            }
        }
        return t;
    }
}
