package com.bytedance.m;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.m.b.a;
import com.bytedance.m.b.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class d {

    /* renamed from: c  reason: collision with root package name */
    private static volatile d f41340c;

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f41341a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f41342b = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Handler f41343d = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(25325);
    }

    private d() {
    }

    public static d a() {
        MethodCollector.i(9094);
        if (f41340c == null) {
            synchronized (d.class) {
                try {
                    if (f41340c == null) {
                        f41340c = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9094);
                    throw th;
                }
            }
        }
        d dVar = f41340c;
        MethodCollector.o(9094);
        return dVar;
    }

    public final void a(a aVar) {
        MethodCollector.i(9281);
        if (aVar == null || aVar.f41327a == null) {
            MethodCollector.o(9281);
            return;
        }
        synchronized (this.f41342b) {
            try {
                final a aVar2 = this.f41342b.get(aVar.f41327a);
                if (aVar2 != null) {
                    aVar2.f41329c = aVar.f41329c;
                    aVar2.f41328b = aVar.f41328b;
                    aVar2.f41333g = aVar.f41333g;
                    aVar2.f41335i = aVar.f41335i;
                    aVar2.f41334h = aVar.f41334h;
                    aVar2.f41331e = aVar.f41331e;
                    aVar2.f41330d = aVar.f41330d;
                    this.f41343d.post(new Runnable() {
                        /* class com.bytedance.m.d.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(25326);
                        }

                        public final void run() {
                            for (b bVar : d.this.f41341a) {
                                bVar.a(aVar2);
                            }
                        }
                    });
                }
            } finally {
                MethodCollector.o(9281);
            }
        }
    }
}
