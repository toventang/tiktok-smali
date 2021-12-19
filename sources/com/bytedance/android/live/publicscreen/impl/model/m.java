package com.bytedance.android.live.publicscreen.impl.model;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.a.e;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.model.message.bx;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class m extends k<bx> {
    static {
        Covode.recordClassIndex(6861);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        ((e) a.a(e.class)).getTextMessageConfig();
        String str = ((bx) this.f12190d).f19385a;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(k.a((int) R.color.a0e)), 0, spannableString.length(), 18);
        return spannableString;
    }

    public m(bx bxVar) {
        super(bxVar);
    }
}
