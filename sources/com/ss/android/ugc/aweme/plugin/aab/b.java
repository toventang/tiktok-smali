package com.ss.android.ugc.aweme.plugin.aab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.a.b;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final AtomicInteger f115523a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    static com.bytedance.ies.ugc.aweme.plugin.a.b f115524b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f115525c = new b();

    private b() {
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f115526a = new a();

        static {
            Covode.recordClassIndex(74156);
        }

        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            b.a();
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(74155);
    }

    public static void a() {
        AtomicInteger atomicInteger = f115523a;
        if (atomicInteger.compareAndSet(1, 2)) {
            c.c();
            com.bytedance.ies.ugc.aweme.plugin.a.b bVar = f115524b;
            if (bVar == null) {
                bVar = new b.a().a();
            }
            l.b(bVar, "");
            if (bVar.f35076a) {
                com.bytedance.ies.ugc.aweme.plugin.b.a.f35118d = true;
            }
            atomicInteger.set(3);
        }
    }
}
