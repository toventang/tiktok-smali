package com.bytedance.helios.sdk.d;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.api.b.n;
import com.bytedance.helios.api.b.o;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.f;
import com.bytedance.helios.sdk.utils.d;
import com.bytedance.helios.sdk.utils.g;
import com.bytedance.helios.sdk.utils.h;
import h.f.b.l;
import java.util.concurrent.atomic.AtomicInteger;

public final class i extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f30889c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    boolean f30890b;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f30891d;

    static {
        Covode.recordClassIndex(17927);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(17928);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.helios.sdk.d.b
    public final int[] a() {
        return h.f30886c;
    }

    private final void c() {
        int myPid = Process.myPid();
        this.f30891d.set(myPid);
        d.a("helios_pid", myPid);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f30892a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f30893b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Throwable f30894c;

        static {
            Covode.recordClassIndex(17929);
        }

        b(i iVar, d dVar, Throwable th) {
            this.f30892a = iVar;
            this.f30893b = dVar;
            this.f30894c = th;
        }

        public final void run() {
            i iVar = this.f30892a;
            d dVar = this.f30893b;
            Throwable th = this.f30894c;
            if (iVar.f30890b && iVar.b()) {
                n a2 = dVar.a(th);
                a2.t = 6;
                a2.i("AppAutoStartException");
                a2.n.put("ClassName", dVar.f30869h);
                o.a(a2, false);
            }
            iVar.f30890b = false;
        }
    }

    public i() {
        String str = h.f30884a;
        String str2 = h.f30885b;
        int[] iArr = h.f30886c;
        String[] strArr = h.f30887d;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            a(iArr[i2], new e(str, str2, iArr[i2], strArr[i2]));
        }
        this.f30891d = new AtomicInteger(-1);
        this.f30890b = true;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        Context baseContext;
        MethodCollector.i(3242);
        synchronized (this) {
            try {
                if (this.f30891d.get() == -1) {
                    AtomicInteger atomicInteger = this.f30891d;
                    l.c("helios_pid", "");
                    atomicInteger.set(d.f31001a.getInt("helios_pid", -1));
                }
                int i2 = this.f30891d.get();
                Application application = HeliosEnvImpl.INSTANCE.getApplication();
                if (!(application == null || (baseContext = application.getBaseContext()) == null)) {
                    if (h.a(baseContext)) {
                        if (i2 == -1) {
                            c();
                        } else if (i2 != Process.myPid()) {
                            c();
                            f a2 = f.a();
                            l.a((Object) a2, "");
                            boolean z = !a2.c();
                            MethodCollector.o(3242);
                            return z;
                        }
                        MethodCollector.o(3242);
                        return false;
                    }
                }
                return false;
            } finally {
                MethodCollector.o(3242);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.helios.sdk.d.b
    public final void a(d dVar, Throwable th) {
        l.c(dVar, "");
        g.b().post(new b(this, dVar, th));
    }
}
