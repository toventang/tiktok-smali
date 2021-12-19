package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.q;
import h.r;

public final class af {

    /* renamed from: a  reason: collision with root package name */
    public static final af f123089a = new af();

    private af() {
    }

    static {
        Covode.recordClassIndex(80843);
    }

    public static final String[] a() {
        Object obj;
        try {
            obj = q.m223constructorimpl((String[]) SettingsManager.a().a("share_h5_url_allowlist", String[].class));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        if (q.m228isFailureimpl(obj)) {
            obj = null;
        }
        return (String[]) obj;
    }
}
