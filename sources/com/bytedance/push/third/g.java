package com.bytedance.push.third;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.message.b;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class g implements b {

    /* renamed from: b  reason: collision with root package name */
    private static volatile g f42364b;

    /* renamed from: a  reason: collision with root package name */
    public List<b> f42365a = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    private b.a f42366c;

    static {
        Covode.recordClassIndex(25881);
    }

    private g() {
    }

    @Override // com.ss.android.message.c
    public final void b() {
        List<b> list = this.f42365a;
        if (list != null) {
            for (b bVar : list) {
                try {
                    bVar.b();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static g a() {
        MethodCollector.i(6407);
        if (f42364b == null) {
            synchronized (g.class) {
                try {
                    if (f42364b == null) {
                        f42364b = new g();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6407);
                    throw th;
                }
            }
        }
        g gVar = f42364b;
        MethodCollector.o(6407);
        return gVar;
    }

    @Override // com.ss.android.message.c
    public final void a(Context context) {
        List<b> list = this.f42365a;
        if (list != null) {
            for (b bVar : list) {
                try {
                    bVar.a(context);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.ss.android.message.c
    public final void a(Intent intent) {
        List<b> list = this.f42365a;
        if (list != null) {
            for (b bVar : list) {
                try {
                    bVar.a(intent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.ss.android.message.b
    public final void a(Context context, com.ss.android.pushmanager.b bVar) {
        this.f42366c = new b.a() {
            /* class com.bytedance.push.third.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25882);
            }
        };
        List<b> list = this.f42365a;
        if (list != null) {
            for (b bVar2 : list) {
                try {
                    bVar2.a(context, bVar);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.ss.android.message.b
    public final void a(Context context, Map<String, String> map) {
        List<b> list = this.f42365a;
        if (list != null) {
            for (b bVar : list) {
                try {
                    bVar.a(context, map);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
