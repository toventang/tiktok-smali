package com.ss.android.ugc.aweme.im.service.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f103832a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final a f103833b = new a();

    private a() {
    }

    public static final boolean a() {
        return SettingsManager.a().a("social_should_mention_check_when_cold_start", true);
    }

    static {
        Covode.recordClassIndex(66509);
    }
}
