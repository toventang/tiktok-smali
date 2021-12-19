package com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f118714a = new l();

    private l() {
    }

    static {
        Covode.recordClassIndex(77126);
    }

    public static final int a() {
        return SettingsManager.a().a("tool_upload_speed_probe_single_host_total_timeout_s", 0);
    }
}
