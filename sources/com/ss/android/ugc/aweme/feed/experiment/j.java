package com.ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.g.a.a.b;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static b f93070a;

    /* renamed from: b  reason: collision with root package name */
    public static final j f93071b = new j();

    private j() {
    }

    static {
        Covode.recordClassIndex(59024);
    }

    public static final b a() {
        try {
            b bVar = (b) SettingsManager.a().a("network_monitor_config", b.class);
            if (bVar == null) {
                return new b(new String[]{"8.8.8.8:443", "35.244.141.111:443", "graph.facebook.com:443"});
            }
            return bVar;
        } catch (Throwable unused) {
        }
    }
}
