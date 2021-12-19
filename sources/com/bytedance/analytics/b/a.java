package com.bytedance.analytics.b;

import com.bytedance.analytics.page.f;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.cw.g;
import h.a.ag;
import h.f.a.m;
import h.f.b.l;
import h.v;
import h.z;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6552a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static m<? super String, ? super Map<String, String>, z> f6553b;

    static {
        Covode.recordClassIndex(3151);
    }

    private a() {
    }

    public static final void a(f fVar) {
        l.d(fVar, "");
        g.a().submit(new b(fVar.a()));
    }

    public static void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        g.a().submit(new d("btmSDK", ag.b(v.a(StringSet.type, str), v.a("msg", str2))));
    }
}
