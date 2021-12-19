package com.bytedance.im.core.g;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.am;
import com.bytedance.im.core.internal.a;
import com.bytedance.im.core.proto.ClientMetricType;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class c implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f38104a;

    /* renamed from: d  reason: collision with root package name */
    private static int f38105d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile c f38106e;

    /* renamed from: b  reason: collision with root package name */
    public Handler f38107b;

    /* renamed from: c  reason: collision with root package name */
    public List<am> f38108c = new CopyOnWriteArrayList();

    /* renamed from: f  reason: collision with root package name */
    private a f38109f = new a();

    static {
        Covode.recordClassIndex(22824);
    }

    private void d() {
        if (!this.f38107b.hasMessages(0)) {
            this.f38107b.sendEmptyMessageDelayed(0, Math.max(d.a().b().aa, 1000L));
        }
    }

    private static double e() {
        if (d.a().b().R) {
            return 0.0d;
        }
        return a.h();
    }

    public final void b() {
        if (!d.a().b().aq) {
            a(ClientMetricType.COUNTER, "db_op_start", 1, null, e());
        }
    }

    private c() {
        HandlerThread handlerThread = new HandlerThread("ReportManager-Thread");
        handlerThread.start();
        this.f38107b = new Handler(handlerThread.getLooper(), this);
        f38104a = true;
    }

    public static c a() {
        MethodCollector.i(12497);
        if (f38106e == null) {
            synchronized (c.class) {
                try {
                    if (f38106e == null) {
                        f38106e = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12497);
                    throw th;
                }
            }
        }
        c cVar = f38106e;
        MethodCollector.o(12497);
        return cVar;
    }

    private void c() {
        Integer valueOf;
        StringBuilder sb = new StringBuilder("ReportManager reportBatch:");
        List<am> list = this.f38108c;
        if (list == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.size());
        }
        f.b("imsdk", sb.append(valueOf).toString(), (Throwable) null);
        List<am> list2 = this.f38108c;
        if (list2 != null && !list2.isEmpty()) {
            this.f38109f.a(f38105d, this.f38108c);
            this.f38108c.clear();
        }
    }

    public boolean handleMessage(Message message) {
        if (message == null || message.what != 0) {
            return true;
        }
        c();
        return true;
    }

    public static void a(String str) {
        if (d.a().b().aq) {
            b.a(str, true, -1, (Throwable) null);
        }
    }

    private static boolean a(double d2) {
        if (d2 == 1.0d || Math.random() < d2) {
            return true;
        }
        return false;
    }

    public final void a(List<am> list) {
        if (list != null && !list.isEmpty() && a(1.0d)) {
            this.f38108c.addAll(list);
            if (this.f38108c.size() >= 100) {
                c();
                this.f38107b.removeMessages(0);
                return;
            }
            d();
        }
    }

    public final void a(String str, long j2) {
        long j3 = 0;
        if (j2 > 0) {
            j3 = System.currentTimeMillis() - j2;
        }
        HashMap hashMap = null;
        if (j3 > 1000) {
            f.b("ReportManager ", str + " cost " + j3 + "ms", (Throwable) null);
        }
        if (d.a().b().aq) {
            b.a(str, j3);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap = new HashMap();
            hashMap.put("db_op_method", str);
        }
        a(ClientMetricType.TIMER, "db_op_cost", j3, hashMap, e());
    }

    public final void a(ClientMetricType clientMetricType, String str, Map<String, String> map) {
        a(clientMetricType, str, 1, map, 1.0d);
    }

    public final void a(String str, int i2, Throwable th) {
        if (d.a().b().aq) {
            b.a(str, false, i2, th);
        } else {
            a(ClientMetricType.COUNTER, "db_op_fail", 1, null, e());
        }
    }

    private void a(ClientMetricType clientMetricType, String str, long j2, Map<String, String> map, double d2) {
        if (a(d2)) {
            am amVar = new am(clientMetricType, str, j2, map);
            if (!d.a().f37562b.m()) {
                a(Collections.singletonList(amVar));
            }
        }
    }
}
