package com.bytedance.im.core.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.proto.IMCMD;

public final class g extends w {
    static {
        Covode.recordClassIndex(22994);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final int b() {
        return 1;
    }

    public g() {
        super(IMCMD.CLIENT_ACK.getValue());
    }
}
