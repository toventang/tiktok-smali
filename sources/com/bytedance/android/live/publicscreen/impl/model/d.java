package com.bytedance.android.live.publicscreen.impl.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.a.e;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.model.message.p;
import com.bytedance.android.livesdk.widget.f;
import com.bytedance.android.livesdk.widget.h;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class d extends k<p> {
    static {
        Covode.recordClassIndex(6848);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.f
    public final boolean k() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return ((p) this.f12190d).f19668h;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        String str;
        Bitmap a2 = h.a(y.e(), ((p) this.f12190d).f19669i);
        Context e2 = y.e();
        if (e2 != null) {
            str = e2.getResources().getString(R.string.gva);
        } else {
            str = "lit";
        }
        if (a2 != null) {
            str = str + "  ";
        }
        ((e) a.a(e.class)).getTextMessageConfig();
        Spannable b2 = k.b(((p) this.f12190d).f19668h, " ", str, R.color.y6, R.color.y8);
        if (!(a2 == null || a2.isRecycled() || b2 == null || b2.length() == 0)) {
            Context e3 = y.e();
            int b3 = (int) n.b(y.e(), 16.0f);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(e3.getResources(), a2);
            bitmapDrawable.setBounds(0, 0, b3, b3);
            b2.setSpan(new f(bitmapDrawable), b2.length() - 1, b2.length(), 33);
        }
        return b2;
    }

    public d(p pVar) {
        super(pVar);
    }
}
