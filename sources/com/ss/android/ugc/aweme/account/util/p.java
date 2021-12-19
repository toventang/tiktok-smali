package com.ss.android.ugc.aweme.account.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import h.a.ag;
import h.a.n;
import h.v;
import java.util.List;
import java.util.Map;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static String f65498a;

    /* renamed from: b  reason: collision with root package name */
    public static final p f65499b = new p();

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f65500c = n.b("local_test", "local_dev", "test", "lark_inhouse", "inhouse");

    private p() {
    }

    public static final boolean a() {
        return f65500c.contains(d.s);
    }

    public static Map<String, String> b() {
        h.p[] pVarArr = new h.p[1];
        String str = f65498a;
        if (str == null) {
            str = com.ss.android.ugc.aweme.language.d.g();
        }
        pVarArr[0] = v.a("carrier_region", str);
        return ag.c(pVarArr);
    }

    static {
        Covode.recordClassIndex(40280);
    }
}
