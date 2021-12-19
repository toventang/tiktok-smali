package com.ss.android.ad.splash.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.core.e.b;
import com.ss.android.ad.splash.core.e.h;
import com.ss.android.ad.splash.core.e.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class k {

    /* renamed from: m  reason: collision with root package name */
    private static volatile k f58655m;

    /* renamed from: a  reason: collision with root package name */
    public volatile List<b> f58656a;

    /* renamed from: b  reason: collision with root package name */
    public volatile List<b> f58657b;

    /* renamed from: c  reason: collision with root package name */
    public volatile h f58658c;

    /* renamed from: d  reason: collision with root package name */
    public long f58659d = 1800000;

    /* renamed from: e  reason: collision with root package name */
    public long f58660e = 300000;

    /* renamed from: f  reason: collision with root package name */
    public volatile long f58661f = -1;

    /* renamed from: g  reason: collision with root package name */
    public volatile long f58662g = -1;

    /* renamed from: h  reason: collision with root package name */
    public boolean f58663h;

    /* renamed from: i  reason: collision with root package name */
    public long f58664i;

    /* renamed from: j  reason: collision with root package name */
    public int f58665j;

    /* renamed from: k  reason: collision with root package name */
    public volatile s f58666k;

    /* renamed from: l  reason: collision with root package name */
    public String f58667l = "{}";
    private List<String> n = new ArrayList();

    static {
        Covode.recordClassIndex(36362);
    }

    public final void c() {
        this.n.clear();
    }

    private k() {
    }

    public static k a() {
        MethodCollector.i(4905);
        if (f58655m == null) {
            synchronized (k.class) {
                try {
                    if (f58655m == null) {
                        f58655m = new k();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4905);
                    throw th;
                }
            }
        }
        k kVar = f58655m;
        MethodCollector.o(4905);
        return kVar;
    }

    public final List<String> b() {
        if (this.f58656a == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar : new ArrayList(this.f58656a)) {
            if (bVar != null) {
                arrayList.add(String.valueOf(bVar.f58441d));
            }
        }
        return arrayList;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.n) {
            sb.append(str);
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public final void a(long j2) {
        if (j2 > 0) {
            this.f58661f = j2;
        }
    }

    public final void b(long j2) {
        if (j2 > 0) {
            this.f58662g = j2;
        }
    }

    public static void a(String str, String str2) {
        m a2 = m.a();
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            a2.f58669a.put(str2, str);
        }
    }

    public final void a(long j2, int i2) {
        if (h.a().s) {
            this.n.add(j2 + ":" + i2);
        }
    }
}
