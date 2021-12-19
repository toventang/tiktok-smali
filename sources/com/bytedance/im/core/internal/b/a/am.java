package com.bytedance.im.core.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.proto.IMCMD;

public final class am extends w {
    static {
        Covode.recordClassIndex(22969);
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

    public am() {
        super(IMCMD.SEND_OFFLINE.getValue());
    }
}
