package com.ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    static int f81851a;

    /* renamed from: b  reason: collision with root package name */
    static int f81852b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f81853c;

    static {
        Covode.recordClassIndex(50826);
        int i2 = 10;
        Integer valueOf = Integer.valueOf(SettingsManager.a().a("general_search_refresh_count", 10));
        if (!(valueOf.intValue() == 0 || valueOf == null)) {
            i2 = valueOf.intValue();
        }
        f81853c = i2;
    }
}
