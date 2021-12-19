package com.ss.android.ugc.aweme.setting.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122186a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(80106);
    }

    public static final boolean a() {
        return SettingsManager.a().a("show_friend_suggestions", false);
    }
}
