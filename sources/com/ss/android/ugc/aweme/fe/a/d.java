package com.ss.android.ugc.aweme.fe.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.web.jsbridge2.ai;
import h.a.i;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f91016a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(57235);
    }

    public static final Map<String, String> a(String str) {
        List list = null;
        if (l.a((Object) ai.PUBLIC.toString(), (Object) str)) {
            Object a2 = SettingsManager.a().a("aweme_appinfo_safehost_fields", String[].class);
            if (!(a2 instanceof String[])) {
                a2 = null;
            }
            Object[] objArr = (Object[]) a2;
            if (objArr != null) {
                list = i.j(objArr);
            }
        }
        Map<String, String> a3 = c.a(list);
        l.b(a3, "");
        return a3;
    }
}
