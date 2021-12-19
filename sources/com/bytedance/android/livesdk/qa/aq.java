package com.bytedance.android.livesdk.qa;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.livesdk.model.message.bo;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class aq extends k<bo> {
    static {
        Covode.recordClassIndex(12032);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        int i2;
        Boolean valueOf = Boolean.valueOf(((bo) this.f12190d).f19343a);
        l.b(valueOf, "");
        if (valueOf.booleanValue()) {
            i2 = R.string.ep7;
        } else {
            i2 = R.string.eo4;
        }
        return y.a(i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aq(bo boVar) {
        super(boVar);
        l.d(boVar, "");
    }
}
