package com.ss.android.ugc.aweme.utils.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f142656a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(93323);
    }

    public static final z a(h.f.a.a<String> aVar) {
        l.d(aVar, "");
        return b(aVar);
    }

    private static z b(h.f.a.a<String> aVar) {
        String str;
        if (!((Boolean) b.f142657a.getValue()).booleanValue()) {
            return null;
        }
        try {
            str = aVar.invoke();
        } catch (Throwable th) {
            str = "error:".concat(String.valueOf(th));
        }
        com.ss.android.ugc.aweme.framework.a.a.a(4, "EventbusIssueLogger", str);
        return null;
    }
}
