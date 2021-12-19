package com.bytedance.android.livesdk;

import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.f.c;
import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f22388a = new w();

    private w() {
    }

    static {
        Covode.recordClassIndex(13220);
    }

    public static CharSequence a(b bVar) {
        String str;
        if (bVar == null) {
            return "";
        }
        if (bVar.f19421a == null || TextUtils.isEmpty(com.bytedance.android.livesdk.i18n.b.a().a(bVar.f19421a))) {
            str = bVar.f19422b;
            if (str == null) {
                str = "";
            }
        } else {
            str = com.bytedance.android.livesdk.i18n.b.a().a(bVar.f19421a);
            l.b(str, "");
        }
        if (TextUtils.isEmpty(str) || c.a(str, bVar, null) == c.f15496a) {
            return "";
        }
        Spannable a2 = c.a(str, bVar, null);
        l.b(a2, "");
        return a2;
    }
}
