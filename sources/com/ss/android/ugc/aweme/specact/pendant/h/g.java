package com.ss.android.ugc.aweme.specact.pendant.h;

import android.content.Context;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f134290a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(87825);
    }

    public static boolean a() {
        Context a2 = d.a();
        int a3 = n.a(a2);
        if (n.b(a2) <= 1280 || a3 <= 720) {
            return false;
        }
        return true;
    }
}
