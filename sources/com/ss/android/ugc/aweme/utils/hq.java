package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class hq {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f143069a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final hq f143070b = new hq();

    private hq() {
    }

    static {
        Covode.recordClassIndex(93640);
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("tcm_self_apply_entry", false);
        } catch (Throwable unused) {
            return f143069a;
        }
    }
}
