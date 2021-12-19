package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.d.a.b;
import com.ss.android.ugc.d.a.c;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f34874a;

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f34875b;

    static {
        Covode.recordClassIndex(20920);
    }

    public static String a(int i2) {
        return "S-".concat(String.valueOf(i2));
    }

    public a(int i2, Aweme aweme) {
        this.f34874a = i2;
        this.f34875b = aweme;
    }

    public static void a(int i2, Aweme aweme) {
        c.a(new a(i2, aweme));
        a(i2);
        aweme.getDesc();
    }
}
