package com.ss.android.ugc.asve.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f61975a = 10;

    /* renamed from: b  reason: collision with root package name */
    public static final a f61976b = new a();

    private a() {
    }

    public static int a() {
        return SettingsManager.a().a("open_camera_retry_count", 10);
    }

    static {
        Covode.recordClassIndex(38111);
    }
}
