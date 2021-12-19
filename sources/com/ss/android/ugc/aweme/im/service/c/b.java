package com.ss.android.ugc.aweme.im.service.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.compliance.api.model.o;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f103834a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(66510);
    }

    public static boolean a() {
        Integer valueOf;
        o a2 = a.d().a(0, "group_chat");
        if (!(a2 == null || (valueOf = Integer.valueOf(a2.getShowType())) == null)) {
            if (valueOf.intValue() == 0 || valueOf.intValue() == 1) {
                return true;
            }
            valueOf.intValue();
        }
        return false;
    }
}
