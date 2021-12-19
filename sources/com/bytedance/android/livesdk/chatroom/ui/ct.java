package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class ct implements b {

    /* renamed from: a  reason: collision with root package name */
    private final br f16078a;

    static {
        Covode.recordClassIndex(8899);
    }

    ct(br brVar) {
        this.f16078a = brVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        br brVar = this.f16078a;
        if (((Boolean) obj).booleanValue()) {
            brVar.U = System.currentTimeMillis();
        } else if (brVar.U > 0) {
            brVar.T += System.currentTimeMillis() - brVar.U;
            brVar.U = 0;
        }
        return z.f158842a;
    }
}
