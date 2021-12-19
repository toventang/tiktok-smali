package com.lynx.tasm.behavior.c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.q;
import com.lynx.tasm.behavior.v;
import java.util.Map;

public final class a extends l {

    /* renamed from: a  reason: collision with root package name */
    Map<String, com.lynx.tasm.c.a> f55817a;

    /* renamed from: c  reason: collision with root package name */
    private final String f55818c;

    /* renamed from: d  reason: collision with root package name */
    private final v f55819d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f55820e;

    static {
        Covode.recordClassIndex(34902);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.c.k
    public final void a(q qVar) {
        qVar.a(this.f55846b.f55847a, this.f55818c, this.f55819d, this.f55817a, this.f55820e);
    }

    public a(int i2, String str, v vVar, Map<String, com.lynx.tasm.c.a> map, boolean z) {
        super(i2, 0);
        this.f55819d = vVar;
        this.f55817a = map;
        this.f55818c = str;
        this.f55820e = z;
    }
}
