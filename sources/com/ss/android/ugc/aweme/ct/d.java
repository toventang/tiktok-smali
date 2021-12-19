package com.ss.android.ugc.aweme.ct;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.ct.c;
import java.util.ArrayList;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f79074a;

    /* renamed from: b  reason: collision with root package name */
    private List<a> f79075b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private Handler f79076c = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(49099);
    }

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public f f79077a;

        /* renamed from: b  reason: collision with root package name */
        private volatile boolean f79078b;

        static {
            Covode.recordClassIndex(49100);
        }

        public final void run() {
            i.b(new e(this), i.f4824a);
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ Object a() {
            if (this.f79078b) {
                return null;
            }
            f fVar = this.f79077a;
            try {
                fVar.a(1);
                fVar.f79083d.getPreloader().a(fVar.f79081b, fVar.f79082c);
                fVar.a(4);
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
                fVar.a(3);
                return null;
            }
        }

        a(f fVar) {
            this.f79077a = fVar;
        }
    }

    private d() {
    }

    public static d a() {
        MethodCollector.i(6599);
        if (f79074a == null) {
            synchronized (d.class) {
                try {
                    if (f79074a == null) {
                        f79074a = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6599);
                    throw th;
                }
            }
        }
        d dVar = f79074a;
        MethodCollector.o(6599);
        return dVar;
    }

    public final void a(f fVar) {
        if (fVar.f79081b != null && !TextUtils.isEmpty(fVar.f79081b.getAid()) && fVar.f79083d != null) {
            a aVar = new a(fVar);
            this.f79075b.add(aVar);
            this.f79076c.postDelayed(aVar, (long) fVar.f79080a);
        }
    }

    public final a a(String str, c.a aVar) {
        for (a aVar2 : this.f79075b) {
            if (!(aVar2 == null || aVar2.f79077a == null || aVar2.f79077a.f79081b == null || aVar2.f79077a.f79081b.getAid() == null || !aVar2.f79077a.f79081b.getAid().equals(str) || aVar2.f79077a.f79083d != aVar)) {
                return aVar2;
            }
        }
        return null;
    }
}
