package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.a.i;
import h.a.z;
import h.q;
import h.r;
import java.util.List;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f34843a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final k f34844b = new k();

    private k() {
    }

    static {
        Covode.recordClassIndex(20899);
    }

    public static final List<String> a() {
        Object obj;
        List<String> a2;
        try {
            obj = q.m223constructorimpl((String[]) SettingsManager.a().a("splash_switch_server_list", String[].class, f34843a));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        if (q.m228isFailureimpl(obj)) {
            obj = null;
        }
        Object[] objArr = (Object[]) obj;
        if (objArr == null || (a2 = i.a(objArr)) == null) {
            return z.INSTANCE;
        }
        return a2;
    }
}
