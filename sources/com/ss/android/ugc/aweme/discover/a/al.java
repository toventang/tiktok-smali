package com.ss.android.ugc.aweme.discover.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class al {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f80155a;

    /* renamed from: b  reason: collision with root package name */
    public static final al f80156b = new al();

    private al() {
    }

    static {
        Covode.recordClassIndex(49889);
        boolean z = true;
        if (b.a().a(true, "show_suggest_search_words", 0) == 0) {
            z = false;
        }
        f80155a = z;
    }

    public static final int a() {
        if (f80155a) {
            if (!aj.f80151a) {
                return 1;
            }
            if (aj.f80151a) {
                return 3;
            }
            return 0;
        } else if (aj.f80151a) {
            return 2;
        } else {
            return 0;
        }
    }
}
