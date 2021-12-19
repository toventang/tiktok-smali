package com.bytedance.android.livesdk.qa;

import android.text.SpannableString;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.livesdk.model.message.bj;
import com.bytedance.android.livesdk.model.message.bl;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class al extends k<bl> {
    static {
        Covode.recordClassIndex(12020);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        bj bjVar = ((bl) this.f12190d).f19340a;
        l.b(bjVar, "");
        return bjVar.f19336e;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        bj bjVar = ((bl) this.f12190d).f19340a;
        l.b(bjVar, "");
        return new SpannableString(bjVar.f19333b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public al(bl blVar) {
        super(blVar);
        l.d(blVar, "");
    }
}
