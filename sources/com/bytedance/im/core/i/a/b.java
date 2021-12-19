package com.bytedance.im.core.i.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.internal.b.a.w;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.proto.IMCMD;

public final class b extends w<Boolean> {
    static {
        Covode.recordClassIndex(22837);
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        return true;
    }

    public b() {
        this((byte) 0);
    }

    private b(byte b2) {
        super(IMCMD.MARK_STRANGER_CONVERSATION_READ.getValue(), null);
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        if (kVar.l()) {
            a((Object) true);
            e.a(kVar, true).a();
            return;
        }
        b(kVar);
        e.a(kVar, false).a();
    }
}
