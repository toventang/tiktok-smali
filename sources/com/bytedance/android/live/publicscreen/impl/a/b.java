package com.bytedance.android.live.publicscreen.impl.a;

import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.e;
import com.bytedance.android.live.publicscreen.impl.model.k;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ac.g;
import com.bytedance.android.livesdk.chatroom.f.c;
import com.bytedance.android.livesdk.chatroom.ui.an;
import com.bytedance.android.livesdk.model.message.i;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class b extends com.bytedance.android.live.publicscreen.impl.model.chat.b {
    static {
        Covode.recordClassIndex(6726);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.h
    public final boolean o() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.impl.model.chat.b
    public final CharSequence a() {
        ((e) a.a(e.class)).getTextMessageConfig();
        User user = ((i) this.f12190d).f19630g;
        String a2 = com.bytedance.android.live.design.a.a.a(((i) this.f12190d).f19629f);
        if (user == null || TextUtils.isEmpty(g.a(user)) || TextUtils.isEmpty(g.a(user)) || TextUtils.isEmpty(a2)) {
            return c.f15496a;
        }
        an anVar = new an(user, k.a((int) R.color.a0d));
        SpannableString spannableString = new SpannableString(a2);
        spannableString.setSpan(anVar, 0, a2.length(), 33);
        return spannableString;
    }

    public b(i iVar) {
        super(iVar);
    }
}
