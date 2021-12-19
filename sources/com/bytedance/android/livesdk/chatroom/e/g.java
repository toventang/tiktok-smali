package com.bytedance.android.livesdk.chatroom.e;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.chatroom.c.ae;
import com.bytedance.android.livesdk.chatroom.c.af;
import com.bytedance.android.livesdk.chatroom.e.c;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final c f15353a;

    /* renamed from: b  reason: collision with root package name */
    private final ae f15354b;

    static {
        Covode.recordClassIndex(8486);
    }

    g(c cVar, ae aeVar) {
        this.f15353a = cVar;
        this.f15354b = aeVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        c cVar = this.f15353a;
        d dVar = (d) obj;
        a.a().a(new af(this.f15354b, true));
        cVar.f15339a = true;
        if (cVar.y != null) {
            ((c.a) cVar.y).a((Barrage) dVar.data);
        }
    }
}
