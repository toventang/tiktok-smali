package com.bytedance.android.monitorV2.h;

import android.content.Context;
import com.bytedance.android.monitorV2.h.a.a;
import com.bytedance.android.monitorV2.h.a.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f23979a;

    /* renamed from: b  reason: collision with root package name */
    private a f23980b;

    /* renamed from: c  reason: collision with root package name */
    private e f23981c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, Integer> f23982d;

    /* renamed from: e  reason: collision with root package name */
    private String f23983e = "";

    static {
        Covode.recordClassIndex(14136);
    }

    @Override // com.bytedance.android.monitorV2.h.f
    public final void a(Context context) {
    }

    @Override // com.bytedance.android.monitorV2.h.f
    public final List<com.bytedance.android.monitorV2.h.a.b> d() {
        return new ArrayList();
    }

    @Override // com.bytedance.android.monitorV2.h.f
    public final a b() {
        if (this.f23980b == null) {
            this.f23980b = new a();
        }
        return this.f23980b;
    }

    @Override // com.bytedance.android.monitorV2.h.f
    public final e c() {
        if (this.f23981c == null) {
            this.f23981c = new e();
        }
        return this.f23981c;
    }

    @Override // com.bytedance.android.monitorV2.h.f
    public final Map<String, Integer> e() {
        if (this.f23982d == null) {
            this.f23982d = new HashMap();
        }
        return this.f23982d;
    }

    public static b a() {
        MethodCollector.i(11493);
        if (f23979a == null) {
            synchronized (b.class) {
                try {
                    if (f23979a == null) {
                        f23979a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11493);
                    throw th;
                }
            }
        }
        b bVar = f23979a;
        MethodCollector.o(11493);
        return bVar;
    }
}
