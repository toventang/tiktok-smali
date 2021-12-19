package com.ss.android.ugc.aweme.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.al;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class a implements al, c {

    /* renamed from: b  reason: collision with root package name */
    private static a f99757b;

    /* renamed from: a  reason: collision with root package name */
    public List<al> f99758a = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f99759c;

    static {
        Covode.recordClassIndex(63602);
    }

    private a() {
    }

    public static a c() {
        MethodCollector.i(2956);
        if (f99757b == null) {
            synchronized (a.class) {
                try {
                    if (f99757b == null) {
                        f99757b = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2956);
                    throw th;
                }
            }
        }
        a aVar = f99757b;
        MethodCollector.o(2956);
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void a() {
        MethodCollector.i(2964);
        d();
        synchronized (a.class) {
            try {
                for (al alVar : this.f99758a) {
                    if (alVar != null) {
                        alVar.a();
                    }
                }
            } finally {
                MethodCollector.o(2964);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void b() {
        MethodCollector.i(2965);
        d();
        synchronized (a.class) {
            try {
                for (al alVar : this.f99758a) {
                    if (alVar != null) {
                        alVar.b();
                    }
                }
            } finally {
                MethodCollector.o(2965);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d() {
        MethodCollector.i(2960);
        if (this.f99759c) {
            MethodCollector.o(2960);
            return;
        }
        if (f.a(d.a())) {
            c().a(com.ss.android.ugc.aweme.compliance.api.a.b().g());
            c().a(new com.ss.android.ugc.aweme.newfollow.c.a());
        }
        this.f99759c = true;
        MethodCollector.o(2960);
    }

    @Override // com.ss.android.ugc.aweme.i.c
    public final void b(al alVar) {
        MethodCollector.i(2962);
        synchronized (a.class) {
            try {
                this.f99758a.remove(alVar);
            } finally {
                MethodCollector.o(2962);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.i.c
    public final void a(al alVar) {
        MethodCollector.i(2961);
        synchronized (a.class) {
            if (alVar != null) {
                try {
                    if (!this.f99758a.contains(alVar)) {
                        this.f99758a.add(alVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2961);
                    throw th;
                }
            }
        }
        MethodCollector.o(2961);
    }
}
