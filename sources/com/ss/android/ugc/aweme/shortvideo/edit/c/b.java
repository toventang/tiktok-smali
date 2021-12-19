package com.ss.android.ugc.aweme.shortvideo.edit.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.d;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f126997a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(83328);
    }

    public static boolean a() {
        cr a2 = cr.a();
        l.b(a2, "");
        if (a2.o.booleanValue() || !d.a()) {
            return false;
        }
        return true;
    }

    public static final void a(a aVar) {
        l.d(aVar, "");
        aVar.setMaxVideoLength(com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.d.a());
    }

    public static final String a(Context context) {
        l.d(context, "");
        String string = context.getResources().getString(R.string.d16, Long.valueOf(com.ss.android.ugc.aweme.setting.d.a() / 60000));
        l.b(string, "");
        return string;
    }
}
