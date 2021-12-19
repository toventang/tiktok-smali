package com.ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public static final ae f69673a = new ae();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f69674b = b.a().a(true, "enable_photo_lowfps_story", false);

    private ae() {
    }

    public static int a() {
        if (f69674b) {
            return 10;
        }
        return 0;
    }

    public static int b() {
        if (f69674b) {
            return 30;
        }
        return 0;
    }

    static {
        Covode.recordClassIndex(42963);
    }
}
