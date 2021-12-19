package com.bytedance.frameworks.baselib.network.b;

import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.b.c;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28850a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28851b;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f28852g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a f28853h;

    static {
        Covode.recordClassIndex(16958);
    }

    @Override // com.bytedance.frameworks.baselib.network.b.c
    public final int b() {
        return this.f28857f;
    }

    @Override // com.bytedance.frameworks.baselib.network.b.c
    public final c.a a() {
        return this.f28853h;
    }

    public final void run() {
        if (this.f28852g != null && !c()) {
            this.f28852g.run();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.b.b
    public final /* bridge */ /* synthetic */ b a(int i2) {
        this.f28857f = i2;
        return this;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(c cVar) {
        c cVar2 = cVar;
        c.a aVar = this.f28853h;
        c.a a2 = cVar2.a();
        if (aVar == null) {
            aVar = c.a.NORMAL;
        }
        if (a2 == null) {
            a2 = c.a.NORMAL;
        }
        if (aVar == a2) {
            return this.f28857f - cVar2.b();
        }
        return a2.ordinal() - aVar.ordinal();
    }

    public a(String str, c.a aVar, int i2, Runnable runnable, boolean z) {
        this.f28853h = aVar;
        str = m.a(str) ? getClass().getSimpleName() : str;
        this.f28856e = i2;
        this.f28851b = str;
        this.f28852g = runnable;
        this.f28850a = z;
    }
}
