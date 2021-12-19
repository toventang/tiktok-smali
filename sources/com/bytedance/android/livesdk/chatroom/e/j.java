package com.bytedance.android.livesdk.chatroom.e;

import com.bytedance.android.live.publicscreen.a.e;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.chatroom.e.c;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

public final /* synthetic */ class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final c f15360a;

    /* renamed from: b  reason: collision with root package name */
    private final long f15361b;

    static {
        Covode.recordClassIndex(8489);
    }

    public j(c cVar, long j2) {
        this.f15360a = cVar;
        this.f15361b = j2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        c cVar = this.f15360a;
        long j2 = this.f15361b;
        Throwable th = (Throwable) obj;
        if (cVar.y != null) {
            ((e) a.a(e.class)).removeModelByToken(cVar.f15340b.getId(), j2);
            if (th instanceof Exception) {
                ((c.a) cVar.y).b((Exception) th);
            }
        }
    }
}
