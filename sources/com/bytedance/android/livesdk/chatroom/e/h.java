package com.bytedance.android.livesdk.chatroom.e;

import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.chatroom.c.ae;
import com.bytedance.android.livesdk.chatroom.c.af;
import com.bytedance.android.livesdk.chatroom.e.c;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final c f15355a;

    /* renamed from: b  reason: collision with root package name */
    private final ae f15356b;

    static {
        Covode.recordClassIndex(8487);
    }

    h(c cVar, ae aeVar) {
        this.f15355a = cVar;
        this.f15356b = aeVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        c cVar = this.f15355a;
        Throwable th = (Throwable) obj;
        a.a().a(new af(this.f15356b, false));
        cVar.f15339a = true;
        if (cVar.y != null && (th instanceof Exception)) {
            ((c.a) cVar.y).a((Exception) th);
        }
    }
}
