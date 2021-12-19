package com.ss.android.ugc.aweme.request_combine.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f120617a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(78531);
    }

    public static boolean a() {
        return SettingsManager.a().a("enable_upload_abmock_settings", false);
    }
}
