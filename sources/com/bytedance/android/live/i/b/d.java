package com.bytedance.android.live.i.b;

import com.bytedance.android.live.i.a.a;
import com.bytedance.android.live.i.a.b;
import com.bytedance.android.live.n.f;
import com.bytedance.android.live.n.k;
import com.bytedance.android.live.n.m;
import com.bytedance.android.livesdk.aj.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f9915a;

    static {
        Covode.recordClassIndex(5116);
    }

    @Override // com.bytedance.android.live.i.b.a
    public final k a() {
        return (k) b.a().a(k.class);
    }

    @Override // com.bytedance.android.live.i.b.a
    public final n b() {
        return (n) b.a().a(n.class);
    }

    @Override // com.bytedance.android.live.i.b.a
    public final f c() {
        return (f) b.a().a(f.class);
    }

    @Override // com.bytedance.android.live.i.b.a
    public final m d() {
        return (m) b.a().a(m.class);
    }

    @Override // com.bytedance.android.live.i.b.a
    public final b e() {
        return (b) b.a().a(b.class);
    }

    @Override // com.bytedance.android.live.i.b.a
    public final a f() {
        return (a) b.a().a(a.class);
    }

    public static a g() {
        MethodCollector.i(3483);
        if (f9915a == null) {
            synchronized (d.class) {
                try {
                    if (f9915a == null) {
                        f9915a = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3483);
                    throw th;
                }
            }
        }
        d dVar = f9915a;
        MethodCollector.o(3483);
        return dVar;
    }
}
