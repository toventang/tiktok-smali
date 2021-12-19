package com.facebook.drawee.b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import java.util.HashSet;
import java.util.Set;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static a f47285d;

    /* renamed from: a  reason: collision with root package name */
    public final Set<AbstractC1172a> f47286a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f47287b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f47288c = new Runnable() {
        /* class com.facebook.drawee.b.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(28741);
        }

        public final void run() {
            a.b();
            for (AbstractC1172a aVar : a.this.f47286a) {
                aVar.d();
            }
            a.this.f47286a.clear();
        }
    };

    /* renamed from: com.facebook.drawee.b.a$a  reason: collision with other inner class name */
    public interface AbstractC1172a {
        static {
            Covode.recordClassIndex(28742);
        }

        void d();
    }

    static {
        Covode.recordClassIndex(28740);
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            MethodCollector.i(1813);
            if (f47285d == null) {
                f47285d = new a();
            }
            aVar = f47285d;
            MethodCollector.o(1813);
        }
        return aVar;
    }

    public static void b() {
        boolean z;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        i.b(z);
    }

    public final void a(AbstractC1172a aVar) {
        b();
        this.f47286a.remove(aVar);
    }
}
