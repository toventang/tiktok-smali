package com.bytedance.android.live.publicscreen.impl.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.livesdk.model.message.c.d;
import com.bytedance.covode.number.Covode;

public final class a extends k<com.bytedance.android.livesdk.model.message.a> {
    static {
        Covode.recordClassIndex(6816);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        if (this.f12190d.O == null || this.f12190d.O.f23218j == null) {
            return null;
        }
        for (d dVar : this.f12190d.O.f23218j.f19424d) {
            if (dVar.f19433a == com.bytedance.android.livesdkapi.h.d.USER.getPieceType() && dVar.f19436d != null) {
                return dVar.f19436d.f19453a;
            }
        }
        return null;
    }

    public a(com.bytedance.android.livesdk.model.message.a aVar) {
        super(aVar);
    }
}
