package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.b.a;
import org.greenrobot.eventbus.EventBus;

public final class cg {
    static {
        Covode.recordClassIndex(93388);
    }

    public static void a(Object obj) {
        a.a(new ch(obj));
        if (!EventBus.a().a(obj)) {
            a.a(new ci(obj));
            EventBus.a(EventBus.a(), obj);
        }
    }

    public static void b(Object obj) {
        a.a(new cj(obj));
        if (EventBus.a().a(obj)) {
            a.a(new ck(obj));
            EventBus.a().b(obj);
        }
    }
}
