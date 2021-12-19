package com.ss.android.ugc.aweme.feed.ui.foryoutab;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.dj;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f94767a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(60126);
    }

    public static dj a(Context context) {
        String string;
        l.d(context, "");
        if (b.a().a(true, "for_you_new_translations", false)) {
            string = context.getResources().getString(R.string.gk5);
        } else {
            string = context.getResources().getString(R.string.c0n);
        }
        l.b(string, "");
        return new dj(context, "For You", string);
    }
}
