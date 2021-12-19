package com.ss.android.ugc.aweme.commerce.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.v;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ac;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f73413a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(45194);
    }

    public static Long a(Integer num) {
        if (num == null || num.intValue() != 0) {
            return null;
        }
        v vVar = v.a.f66895a;
        l.b(vVar, "");
        return Long.valueOf(vVar.a());
    }

    public static String a(Aweme aweme, Integer num) {
        if (num != null && num.intValue() == 0) {
            return ac.b(aweme, num.intValue());
        }
        return null;
    }
}
