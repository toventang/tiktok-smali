package com.ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f69747a = new r();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f69748b = b.a().a(true, "enable_photo_lowfps", false);

    private r() {
    }

    public static int a() {
        if (f69748b) {
            return 10;
        }
        return 0;
    }

    public static int b() {
        if (f69748b) {
            return 30;
        }
        return 0;
    }

    static {
        Covode.recordClassIndex(43003);
    }
}
