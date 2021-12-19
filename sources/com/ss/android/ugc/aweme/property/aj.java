package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.port.in.g;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public static final aj f118334a = new aj();

    private aj() {
    }

    static {
        Covode.recordClassIndex(76850);
    }

    public static final boolean a() {
        if (!b.a().a(true, "enable_upload_opt", false) || g.a().A().a()) {
            return false;
        }
        return true;
    }
}
