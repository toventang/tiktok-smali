package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.q;
import h.r;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static final aa f123079a = new aa();

    private aa() {
    }

    static {
        Covode.recordClassIndex(80838);
    }

    public static z a() {
        Object obj;
        try {
            obj = q.m223constructorimpl((z) SettingsManager.a().a("popup_block_list", z.class));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        if (q.m228isFailureimpl(obj)) {
            obj = null;
        }
        return (z) obj;
    }
}
