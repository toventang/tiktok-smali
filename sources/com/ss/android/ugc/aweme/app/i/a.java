package com.ss.android.ugc.aweme.app.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tiktok.seclink.impl.SecLinkServiceImpl;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66806a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(41126);
    }

    public static String a(String str, String str2) {
        l.d(str, "");
        String a2 = SecLinkServiceImpl.b().a(str, str2);
        return a2 == null ? str : a2;
    }
}
