package com.ss.android.ugc.aweme.im.sdk.common.controller.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f102202a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final j f102203b = new j();

    private d() {
    }

    static {
        Covode.recordClassIndex(65399);
    }

    public static j a() {
        try {
            Object a2 = SettingsManager.a().a("im_contact_update_freq", j.class);
            l.b(a2, "");
            return (j) a2;
        } catch (Throwable unused) {
            return f102203b;
        }
    }
}
