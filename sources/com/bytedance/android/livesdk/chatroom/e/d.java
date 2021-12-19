package com.bytedance.android.livesdk.chatroom.e;

import com.bytedance.android.livesdk.chatroom.c.ae;
import com.bytedance.android.livesdk.chatroom.c.ah;
import com.bytedance.android.livesdk.chatroom.c.m;
import com.bytedance.android.livesdk.j.cc;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final c f15344a;

    static {
        Covode.recordClassIndex(8483);
    }

    d(c cVar) {
        this.f15344a = cVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        c cVar = this.f15344a;
        m mVar = (m) obj;
        if (cVar.w != null && cc.a(cVar.w) && cVar.y != null && mVar != null) {
            if (mVar instanceof ah) {
                cVar.a((ah) mVar);
            } else if (mVar instanceof ae) {
                cVar.a((ae) mVar);
            }
        }
    }
}
