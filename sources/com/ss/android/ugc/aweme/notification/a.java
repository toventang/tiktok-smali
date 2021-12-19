package com.ss.android.ugc.aweme.notification;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f113041a = "";

    /* renamed from: b  reason: collision with root package name */
    public static final a f113042b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(72681);
    }

    public static final String a() {
        try {
            String a2 = SettingsManager.a().a("cla_crowdsourcing_entry_image", "");
            l.b(a2, "");
            return a2;
        } catch (Throwable unused) {
            return "";
        }
    }
}
