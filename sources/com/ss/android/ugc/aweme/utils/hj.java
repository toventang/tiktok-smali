package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class hj {

    /* renamed from: a  reason: collision with root package name */
    public static final hj f143066a = new hj();

    private hj() {
    }

    static {
        Covode.recordClassIndex(93631);
    }

    public static hi a() {
        try {
            hi hiVar = (hi) SettingsManager.a().a("disk_space_threshold", hi.class);
            if (hiVar != null) {
                return hiVar;
            }
            hi hiVar2 = new hi();
            hiVar2.f143064a = 440;
            hiVar2.f143065b = 1370;
            return hiVar2;
        } catch (Throwable unused) {
        }
    }
}
