package com.ss.android.ugc.aweme.emoji.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final EmojiApi f89446a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f89447b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final String f89448c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f89449d;

    private b() {
    }

    static {
        Covode.recordClassIndex(56210);
        String str = "https://" + d.f34604k.f34586a;
        f89448c = str;
        String str2 = str + "/aweme/v1/";
        f89449d = str2;
        Object a2 = RetrofitFactory.a().a(str2).a(EmojiApi.class);
        l.b(a2, "");
        f89446a = (EmojiApi) a2;
    }
}
