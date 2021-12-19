package com.lynx.tasm.behavior.c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.q;

public final class e extends l {

    /* renamed from: a  reason: collision with root package name */
    private final int f55842a;

    /* renamed from: c  reason: collision with root package name */
    private final int f55843c;

    static {
        Covode.recordClassIndex(34911);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.c.k
    public final void a(q qVar) {
        qVar.a(this.f55842a, this.f55846b.f55847a, this.f55843c);
    }

    public e(int i2, int i3, int i4) {
        super(i3, 2);
        this.f55842a = i2;
        this.f55843c = i4;
    }
}
