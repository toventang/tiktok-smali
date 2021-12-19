package com.bytedance.android.live.publicscreen.impl.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.livesdk.model.message.bh;
import com.bytedance.covode.number.Covode;

public final class j extends k<bh> {
    static {
        Covode.recordClassIndex(6855);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        if (((bh) this.f12190d).f19323k instanceof bh.c) {
            return ((bh.c) ((bh) this.f12190d).f19323k).f19325a;
        }
        return null;
    }

    j(bh bhVar) {
        super(bhVar);
    }
}
