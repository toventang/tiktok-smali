package com.bytedance.push;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.c.d;
import com.bytedance.push.c.e;
import com.bytedance.push.c.g;
import com.bytedance.push.c.i;
import com.bytedance.push.c.k;
import com.bytedance.push.c.l;
import com.bytedance.push.e.b;
import com.bytedance.push.h.a;
import java.util.Map;
import org.json.JSONObject;

public final class f implements k {

    /* renamed from: a  reason: collision with root package name */
    public static f f42099a = new f();

    /* renamed from: b  reason: collision with root package name */
    private b f42100b = new b();

    /* renamed from: c  reason: collision with root package name */
    private c f42101c;

    /* renamed from: d  reason: collision with root package name */
    private a f42102d;

    /* renamed from: e  reason: collision with root package name */
    private volatile com.bytedance.push.c.f f42103e;

    /* renamed from: f  reason: collision with root package name */
    private volatile g f42104f;

    /* renamed from: g  reason: collision with root package name */
    private volatile h f42105g;

    /* renamed from: h  reason: collision with root package name */
    private volatile g f42106h;

    /* renamed from: i  reason: collision with root package name */
    private volatile e f42107i;

    /* renamed from: j  reason: collision with root package name */
    private volatile JSONObject f42108j;

    @Override // com.bytedance.push.c.k
    public final c h() {
        return this.f42101c;
    }

    @Override // com.bytedance.push.c.k
    public final com.bytedance.push.e.a j() {
        return this.f42100b;
    }

    public static com.bytedance.push.e.a a() {
        return f42099a.j();
    }

    public static l b() {
        return f42099a.i();
    }

    public static g c() {
        return f42099a.k();
    }

    public static e d() {
        return f42099a.m();
    }

    @Override // com.bytedance.push.c.k
    public final Map<String, String> e() {
        return this.f42102d.a();
    }

    @Override // com.bytedance.push.c.k
    public final d l() {
        return this.f42101c.f42068l;
    }

    static {
        Covode.recordClassIndex(25740);
    }

    @Override // com.bytedance.push.c.k
    public final com.bytedance.push.c.f f() {
        MethodCollector.i(7371);
        if (this.f42103e == null) {
            synchronized (this) {
                try {
                    if (this.f42103e == null) {
                        this.f42103e = new com.bytedance.push.notification.f(this);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7371);
                    throw th;
                }
            }
        }
        com.bytedance.push.c.f fVar = this.f42103e;
        MethodCollector.o(7371);
        return fVar;
    }

    @Override // com.bytedance.push.c.k
    public final i g() {
        MethodCollector.i(7436);
        if (this.f42104f == null) {
            synchronized (this) {
                try {
                    if (this.f42104f == null) {
                        this.f42104f = new g();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7436);
                    throw th;
                }
            }
        }
        g gVar = this.f42104f;
        MethodCollector.o(7436);
        return gVar;
    }

    @Override // com.bytedance.push.c.k
    public final l i() {
        MethodCollector.i(7503);
        if (this.f42105g == null) {
            synchronized (this) {
                try {
                    if (this.f42105g == null) {
                        this.f42105g = new h(g(), k(), this.f42101c);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7503);
                    throw th;
                }
            }
        }
        h hVar = this.f42105g;
        MethodCollector.o(7503);
        return hVar;
    }

    @Override // com.bytedance.push.c.k
    public final g k() {
        MethodCollector.i(7506);
        if (this.f42106h == null) {
            synchronized (this) {
                try {
                    if (this.f42106h == null) {
                        this.f42106h = new com.bytedance.push.notification.g(this.f42101c);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7506);
                    throw th;
                }
            }
        }
        g gVar = this.f42106h;
        MethodCollector.o(7506);
        return gVar;
    }

    @Override // com.bytedance.push.c.k
    public final e m() {
        MethodCollector.i(7510);
        if (this.f42107i == null) {
            synchronized (this) {
                try {
                    if (this.f42107i == null) {
                        if (com.ss.android.message.a.a.a(this.f42101c.f42057a)) {
                            this.f42107i = new com.bytedance.push.g.d(this.f42101c);
                        } else {
                            this.f42107i = new com.bytedance.push.g.e();
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7510);
                    throw th;
                }
            }
        }
        e eVar = this.f42107i;
        MethodCollector.o(7510);
        return eVar;
    }

    @Override // com.bytedance.push.c.k
    public final void a(JSONObject jSONObject) {
        this.f42108j = jSONObject;
    }

    @Override // com.bytedance.push.c.k
    public final void a(c cVar, a aVar) {
        this.f42101c = cVar;
        this.f42102d = aVar;
    }
}
