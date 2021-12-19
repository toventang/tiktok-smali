package com.bytedance.android.live.publicscreen.impl.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.a.e;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.model.message.cc;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class o extends k<cc> {
    static {
        Covode.recordClassIndex(6863);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return ((cc) this.f12190d).f19464g;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        ((e) a.a(e.class)).getTextMessageConfig();
        ((e) a.a(e.class)).getTextMessageConfig();
        return k.b(((cc) this.f12190d).f19464g, "：", ((cc) this.f12190d).f19463f, R.color.y6, R.color.a0e);
    }

    public o(cc ccVar) {
        super(ccVar);
    }
}
