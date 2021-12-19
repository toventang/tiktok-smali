package com.ss.android.ugc.aweme.childhook.a.a;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;

public final class c implements d {
    static {
        Covode.recordClassIndex(43332);
    }

    @Override // com.ss.android.ugc.aweme.childhook.a.a.d
    public final boolean a(Intent intent) {
        l.d(intent, "");
        return TextUtils.equals(intent.getAction(), "android.intent.action.VIEW");
    }

    @Override // com.ss.android.ugc.aweme.childhook.a.a.d
    public final boolean b(Intent intent) {
        l.d(intent, "");
        if (!TextUtils.equals(intent.getPackage(), "com.google.android.gms") || intent.getData() == null || (!p.a((CharSequence) String.valueOf(intent.getData()), (CharSequence) "com.zhiliaoapp.musically", false) && !p.a((CharSequence) String.valueOf(intent.getData()), (CharSequence) "com.ss.android.ugc.trill", false))) {
            return false;
        }
        return true;
    }
}
