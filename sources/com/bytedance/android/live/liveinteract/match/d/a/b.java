package com.bytedance.android.live.liveinteract.match.d.a;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.android.livesdk.model.message.ao;
import com.bytedance.covode.number.Covode;

public final class b extends k<ao> {
    static {
        Covode.recordClassIndex(5778);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        return ((ao) this.f12190d).f19178i.f19256a.f19264a;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final int h_() {
        if (EnableBattleUiNewStyleSetting.INSTANCE.getValue() > 0) {
            return 2131234627;
        }
        return 2131234646;
    }

    public b(ao aoVar) {
        super(aoVar);
    }
}
