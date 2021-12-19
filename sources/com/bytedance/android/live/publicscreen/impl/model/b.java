package com.bytedance.android.live.publicscreen.impl.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.a.e;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.model.message.j;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class b extends k<j> {
    static {
        Covode.recordClassIndex(6817);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return ((j) this.f12190d).f19635a;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        User user = ((j) this.f12190d).f19635a;
        ((e) a.a(e.class)).getTextMessageConfig();
        ((e) a.a(e.class)).getTextMessageConfig();
        return k.b(user, "", " ", R.color.y6, R.color.a0e);
    }

    public b(j jVar) {
        super(jVar);
    }
}
