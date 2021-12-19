package com.bytedance.im.core.internal.utils;

import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.internal.utils.x;
import java.util.Arrays;
import java.util.List;

public class u implements x.a {

    /* renamed from: a  reason: collision with root package name */
    private static u f38870a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f38871b;

    /* renamed from: c  reason: collision with root package name */
    private x f38872c;

    /* renamed from: d  reason: collision with root package name */
    private long f38873d;

    static {
        Covode.recordClassIndex(23171);
    }

    private u() {
        HandlerThread handlerThread = new HandlerThread("IM-CORE-SNAPSHOT");
        handlerThread.start();
        this.f38872c = new x(handlerThread.getLooper(), this);
    }

    public static u a() {
        MethodCollector.i(10577);
        if (f38870a == null) {
            synchronized (u.class) {
                try {
                    if (f38870a == null) {
                        f38870a = new u();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10577);
                    throw th;
                }
            }
        }
        u uVar = f38870a;
        MethodCollector.o(10577);
        return uVar;
    }

    public static List<h> b() {
        s.a();
        try {
            return Arrays.asList((h[]) h.f38770a.a(s.f38859a.b(s.a("im_snapshot"), ""), h[].class));
        } catch (Exception unused) {
            return null;
        }
    }

    public final void c() {
        if (!this.f38872c.hasMessages(1001) && !this.f38871b) {
            if (SystemClock.uptimeMillis() - this.f38873d <= d.a().b().K) {
                this.f38872c.sendEmptyMessageDelayed(1001, (this.f38873d + d.a().b().K) - SystemClock.uptimeMillis());
            } else {
                d();
            }
        }
    }

    private synchronized void d() {
        MethodCollector.i(10733);
        this.f38871b = true;
        try {
            this.f38873d = SystemClock.uptimeMillis();
            List<h> b2 = j.a().b();
            if (b2.size() > d.a().b().J) {
                b2 = b2.subList(0, d.a().b().J);
            }
            try {
                String b3 = h.f38770a.b(b2.toArray(new h[0]));
                s.a();
                s.f38859a.a(s.a("im_snapshot"), b3);
            } catch (Exception unused) {
                this.f38871b = false;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            this.f38871b = false;
        } finally {
            this.f38871b = false;
            MethodCollector.o(10733);
        }
    }

    @Override // com.bytedance.im.core.internal.utils.x.a
    public final void a(Message message) {
        if (message.what == 1001) {
            d();
        }
    }
}
