package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final CaptionConfig f122188a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final f f122189b = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(80107);
    }

    public static final CaptionConfig a() {
        return (CaptionConfig) SettingsManager.a().a("tool_caption_config", CaptionConfig.class, f122188a);
    }
}
