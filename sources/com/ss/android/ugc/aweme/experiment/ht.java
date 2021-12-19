package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class ht {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f90231a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final ht f90232b = new ht();

    private ht() {
    }

    static {
        Covode.recordClassIndex(56602);
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("web_image_downloader_switch", false);
        } catch (Throwable unused) {
            return f90231a;
        }
    }
}
