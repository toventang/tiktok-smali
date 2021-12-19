package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f118479a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(76954);
    }

    public static final int a() {
        return b.a().a(true, "auto_play_sound_before_recording", 0);
    }

    public static final boolean b() {
        if (a() > 0) {
            return true;
        }
        return false;
    }
}
