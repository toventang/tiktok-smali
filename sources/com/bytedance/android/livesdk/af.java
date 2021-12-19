package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.chatroom.c.e;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class af implements f {

    /* renamed from: a  reason: collision with root package name */
    private final ab f13690a;

    static {
        Covode.recordClassIndex(7598);
    }

    af(ab abVar) {
        this.f13690a = abVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        ab abVar = this.f13690a;
        e eVar = (e) obj;
        if (abVar.f13395d != null && abVar.f13396e != null) {
            abVar.f13396e.a(eVar.f15116a);
        }
    }
}
