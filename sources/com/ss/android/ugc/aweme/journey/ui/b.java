package com.ss.android.ugc.aweme.journey.ui;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f105199a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(67438);
    }

    public static a a(Context context) {
        l.d(context, "");
        return new a(n.b(context, 8.0f), BlurMaskFilter.Blur.NORMAL, n.b(context, 2.0f), Color.parseColor("#1f000000"), n.b(context, 24.0f));
    }
}
