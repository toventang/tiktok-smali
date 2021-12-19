package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.q;
import h.r;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    public static final ag f123090a = new ag();

    private ag() {
    }

    static {
        Covode.recordClassIndex(80844);
    }

    public static final String[] a() {
        Object obj;
        try {
            obj = q.m223constructorimpl((String[]) SettingsManager.a().a("ttnet_intercept_webview_allow_list", String[].class));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        if (q.m228isFailureimpl(obj)) {
            obj = null;
        }
        return (String[]) obj;
    }
}
