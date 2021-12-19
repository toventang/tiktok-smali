package com.bytedance.android.live.publicscreen.impl.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.livesdk.model.message.ai;
import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.android.livesdk.model.message.c.c;
import com.bytedance.android.livesdk.model.message.c.d;
import com.bytedance.android.livesdk.model.message.c.i;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.Collections;

public final class g extends k<ai> {
    static {
        Covode.recordClassIndex(6852);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final int h_() {
        return 2131234674;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.f
    public final boolean k() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return ((ai) this.f12190d).f19136h;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        String a2;
        if (C()) {
            a2 = y.a((int) R.string.eg1);
        } else {
            a2 = y.a((int) R.string.eg2);
        }
        b bVar = new b();
        bVar.f19422b = a2;
        c cVar = new c();
        cVar.f19425a = "#ffffff";
        bVar.f19423c = cVar;
        i iVar = new i();
        iVar.f19453a = ((ai) this.f12190d).f19136h;
        d dVar = new d();
        dVar.f19436d = iVar;
        c cVar2 = new c();
        cVar2.f19425a = "#80FFFFFF";
        dVar.f19434b = cVar2;
        dVar.f19433a = com.bytedance.android.livesdkapi.h.d.USER.getPieceType();
        bVar.f19424d = Collections.singletonList(dVar);
        return com.bytedance.android.livesdk.chatroom.f.c.a(a2, bVar, this);
    }

    public g(ai aiVar) {
        super(aiVar);
    }
}
