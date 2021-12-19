package com.ss.android.ugc.aweme.notification.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.api.a;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f113873a = new f();

    public static final String a(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "new" : "earlier" : "this_month" : "this_week" : "yesterday" : "today";
    }

    private f() {
    }

    static {
        Covode.recordClassIndex(73229);
    }

    public static String a(Integer num) {
        int a2 = a.b.a();
        if (num == null || num.intValue() == a2) {
            return "all";
        }
        if (num.intValue() == 3) {
            return "likes";
        }
        if (num.intValue() == 44) {
            return "comments";
        }
        if (num.intValue() == 84) {
            return "qa";
        }
        if (num.intValue() == 7) {
            return "followers";
        }
        if (num.intValue() == 26) {
            return "mentions";
        }
        if (num.intValue() == 599) {
            return "shop";
        }
        if (num.intValue() == 37) {
            return "official";
        }
        return "all";
    }
}
