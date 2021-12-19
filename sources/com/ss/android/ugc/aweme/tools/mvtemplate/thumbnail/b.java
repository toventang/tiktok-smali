package com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f140920a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static int f140921b;

    private b() {
    }

    static {
        Covode.recordClassIndex(92022);
    }

    public static int a(Context context) {
        l.d(context, "");
        if (f140921b <= 0) {
            f140921b = (int) (context.getResources().getDimension(R.dimen.e0) + 0.5f);
        }
        return f140921b;
    }
}
