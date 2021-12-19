package com.bytedance.c.a.a.a;

import android.text.TextUtils;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p.b;
import com.bytedance.apm.q.v;
import com.bytedance.c.a.a.a.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c implements b.AbstractC0531b {

    /* renamed from: a  reason: collision with root package name */
    public static String f26674a = "https://i.isnssdk.com/monitor/collect/c/exception";

    /* renamed from: d  reason: collision with root package name */
    public static final Object f26675d = new Object();

    /* renamed from: i  reason: collision with root package name */
    private static volatile c f26676i;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f26677b;

    /* renamed from: c  reason: collision with root package name */
    public volatile JSONObject f26678c;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedList<h> f26679e = new LinkedList<>();

    /* renamed from: f  reason: collision with root package name */
    private volatile long f26680f;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f26681g;

    /* renamed from: h  reason: collision with root package name */
    private volatile long f26682h;

    /* renamed from: j  reason: collision with root package name */
    private volatile a f26683j;

    static {
        Covode.recordClassIndex(15738);
    }

    private c() {
        b.a.f25210a.a(this);
        this.f26683j = new a();
    }

    public static boolean b() {
        if (!ApmDelegate.a.f25042a.f25014h || ApmDelegate.a.f25042a.a("exception_filter_network")) {
            return false;
        }
        return true;
    }

    private void c() {
        this.f26680f = System.currentTimeMillis();
        b.a.f25210a.b(new Runnable() {
            /* class com.bytedance.c.a.a.a.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15739);
            }

            public final void run() {
                MethodCollector.i(8278);
                try {
                    LinkedList linkedList = new LinkedList();
                    synchronized (c.f26675d) {
                        try {
                            linkedList.addAll(c.this.f26679e);
                            c.this.f26679e.clear();
                            c.this.f26677b = 0;
                        } catch (Throwable th) {
                            MethodCollector.o(8278);
                            throw th;
                        }
                    }
                    if (linkedList.isEmpty()) {
                        MethodCollector.o(8278);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    while (!linkedList.isEmpty()) {
                        h hVar = (h) linkedList.poll();
                        if (hVar != null) {
                            jSONArray.put(new JSONObject(hVar.f26687b));
                        }
                    }
                    jSONObject.put("data", jSONArray);
                    if (c.this.f26678c == null) {
                        c.this.f26678c = com.bytedance.apm.c.f24690f;
                    }
                    jSONObject.put("header", c.this.f26678c);
                    c.this.a(c.f26674a, jSONObject.toString());
                    MethodCollector.o(8278);
                } catch (Throwable unused) {
                    MethodCollector.o(8278);
                }
            }
        });
    }

    public static c a() {
        MethodCollector.i(8977);
        if (f26676i == null) {
            synchronized (f26675d) {
                try {
                    if (f26676i == null) {
                        f26676i = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8977);
                    throw th;
                }
            }
        }
        c cVar = f26676i;
        MethodCollector.o(8977);
        return cVar;
    }

    @Override // com.bytedance.apm.p.b.AbstractC0531b
    public final void a(long j2) {
        try {
            if (this.f26683j != null) {
                this.f26683j.a();
            }
            long currentTimeMillis = System.currentTimeMillis();
            if ((currentTimeMillis - this.f26680f > 1200000 && this.f26677b > 0) || this.f26677b > 20) {
                c();
            }
            if (this.f26681g && currentTimeMillis - this.f26682h > 1800000) {
                this.f26681g = false;
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(String str, String str2) {
        int statusCode;
        try {
            if (ApmDelegate.a.f25042a.f25014h) {
                f.a(v.a(str, com.bytedance.apm.c.h()), str2.getBytes(), f.a.GZIP, "application/json; charset=utf-8");
            }
        } catch (Throwable th) {
            if ((th instanceof e) && (statusCode = th.getStatusCode()) >= 500 && statusCode <= 600) {
                this.f26682h = System.currentTimeMillis();
                this.f26681g = true;
            }
        }
    }

    public final void a(String str, String str2, String str3, boolean z) {
        MethodCollector.i(9178);
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    boolean z2 = false;
                    if (z) {
                        JSONObject jSONObject = new JSONObject(str2);
                        jSONObject.put("log_type", "log_exception");
                        if (str3 != null) {
                            if (str3.length() > 10240) {
                                jSONObject.put("extraMessage", str3.substring(0, 10240));
                            } else {
                                jSONObject.put("extraMessage", str3);
                            }
                        }
                    }
                    if (!ApmDelegate.a.f25042a.f25014h) {
                        if (this.f26683j != null) {
                            this.f26683j.a(str, str2);
                        }
                        MethodCollector.o(9178);
                        return;
                    }
                    boolean a2 = ApmDelegate.a.f25042a.a(str);
                    boolean b2 = ApmDelegate.a.f25042a.b(str3);
                    if ((a2 || b2) && !this.f26681g) {
                        synchronized (f26675d) {
                            try {
                                int size = this.f26679e.size();
                                if (size >= 20) {
                                    z2 = true;
                                }
                                this.f26679e.add(new h(str, str2));
                                this.f26677b = size + 1;
                            } finally {
                                MethodCollector.o(9178);
                            }
                        }
                        if (z2) {
                            c();
                        }
                        return;
                    }
                    MethodCollector.o(9178);
                    return;
                }
            }
            MethodCollector.o(9178);
        } catch (Throwable unused) {
            MethodCollector.o(9178);
        }
    }
}
