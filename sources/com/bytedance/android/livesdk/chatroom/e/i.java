package com.bytedance.android.livesdk.chatroom.e;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.publicscreen.a.e;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.chatroom.b.b;
import com.bytedance.android.livesdk.chatroom.c.ag;
import com.bytedance.android.livesdk.chatroom.e.c;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

public final /* synthetic */ class i implements f {

    /* renamed from: a  reason: collision with root package name */
    private final c f15357a;

    /* renamed from: b  reason: collision with root package name */
    private final ag f15358b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15359c;

    static {
        Covode.recordClassIndex(8488);
    }

    public i(c cVar, ag agVar, long j2) {
        this.f15357a = cVar;
        this.f15358b = agVar;
        this.f15359c = j2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        c cVar = this.f15357a;
        ag agVar = this.f15358b;
        long j2 = this.f15359c;
        d dVar = (d) obj;
        if (cVar.y != null && dVar.data != null) {
            ((e) a.a(e.class)).updateMessage(cVar.f15340b.getId(), j2, b.a(cVar.f15340b.getId(), agVar.f15083a, ((com.bytedance.android.livesdk.chatroom.model.d) dVar.data).f15748a, u.a().b().a(), ((com.bytedance.android.livesdk.chatroom.model.d) dVar.data).f15749b));
            ((c.a) cVar.y).a((com.bytedance.android.livesdk.chatroom.model.d) dVar.data);
        }
    }
}
