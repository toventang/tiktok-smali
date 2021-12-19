package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class dg {

    /* renamed from: a  reason: collision with root package name */
    public static final long f118444a = 60000;

    /* renamed from: b  reason: collision with root package name */
    public static final dg f118445b = new dg();

    private dg() {
    }

    public static final long a() {
        return SettingsManager.a().a("tool_recognize_caption_limit_time", 60000L);
    }

    static {
        Covode.recordClassIndex(76934);
    }
}
