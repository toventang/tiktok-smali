package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final String f122358a = "";

    /* renamed from: b  reason: collision with root package name */
    public static final p f122359b = new p();

    private p() {
    }

    static {
        Covode.recordClassIndex(80228);
    }

    public static final String a() {
        try {
            String a2 = SettingsManager.a().a("create_EOY_video_url", "");
            l.b(a2, "");
            return a2;
        } catch (Throwable unused) {
            return f122358a;
        }
    }
}
