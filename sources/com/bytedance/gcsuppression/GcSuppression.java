package com.bytedance.gcsuppression;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Trace;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class GcSuppression {

    /* renamed from: d  reason: collision with root package name */
    private static volatile GcSuppression f29687d;

    /* renamed from: a  reason: collision with root package name */
    public AtomicInteger f29688a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public long f29689b = 60;

    /* renamed from: c  reason: collision with root package name */
    public ExecutorService f29690c;

    /* renamed from: e  reason: collision with root package name */
    private Context f29691e;

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f29692f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    private boolean f29693g = true;

    /* renamed from: h  reason: collision with root package name */
    private long f29694h = 0;

    /* renamed from: i  reason: collision with root package name */
    private long f29695i = 0;

    /* renamed from: j  reason: collision with root package name */
    private ScheduledFuture f29696j;

    /* renamed from: k  reason: collision with root package name */
    private a f29697k;

    /* renamed from: l  reason: collision with root package name */
    private Runnable f29698l = new Runnable() {
        /* class com.bytedance.gcsuppression.GcSuppression.AnonymousClass1 */

        static {
            Covode.recordClassIndex(17240);
        }

        public final void run() {
            GcSuppression.this.b();
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(17242);
        }
    }

    static {
        Covode.recordClassIndex(17239);
    }

    private native int startGcSuppression();

    private native int stopGcSuppression();

    private GcSuppression() {
    }

    public static GcSuppression a() {
        MethodCollector.i(13378);
        if (f29687d == null) {
            synchronized (GcSuppression.class) {
                try {
                    if (f29687d == null) {
                        f29687d = new GcSuppression();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13378);
                    throw th;
                }
            }
        }
        GcSuppression gcSuppression = f29687d;
        MethodCollector.o(13378);
        return gcSuppression;
    }

    public final int b() {
        boolean z;
        MethodCollector.i(13380);
        if (this.f29693g) {
            this.f29695i = System.currentTimeMillis();
            int i2 = Build.VERSION.SDK_INT;
            Trace.beginSection("GcSuppressionStop");
        }
        int i3 = -1;
        if (this.f29688a.get() == 2) {
            ScheduledFuture scheduledFuture = this.f29696j;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f29696j = null;
            }
            int stopGcSuppression = stopGcSuppression();
            if (stopGcSuppression > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f29688a.compareAndSet(2, 3);
                SharedPreferences.Editor edit = d.a(this.f29691e, "gcsuppress", 0).edit();
                edit.putInt("vc", 1029);
                edit.putInt("state", this.f29688a.get());
                edit.commit();
            } else {
                this.f29688a.compareAndSet(2, 1);
            }
            if (!(this.f29697k == null || stopGcSuppression == -1 || this.f29692f.get())) {
                this.f29692f.set(true);
                SharedPreferences.Editor edit2 = d.a(this.f29691e, "gcsuppress", 0).edit();
                edit2.putBoolean("hfs", true);
                edit2.commit();
            }
            i3 = stopGcSuppression;
        }
        if (this.f29693g) {
            System.currentTimeMillis();
            if (i3 == 0) {
                System.currentTimeMillis();
            }
            int i4 = Build.VERSION.SDK_INT;
            Trace.endSection();
        }
        MethodCollector.o(13380);
        return i3;
    }
}
