package com.bytedance.android.livesdk.util.rxutils.autodispose.a;

import com.bytedance.covode.number.Covode;
import f.a.d.e;
import f.a.e.j.h;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile e f22135a;

    static {
        Covode.recordClassIndex(13039);
    }

    public static boolean a(e eVar) {
        Objects.requireNonNull(eVar, "defaultChecker == null");
        e eVar2 = f22135a;
        if (eVar2 != null) {
            return eVar2.a();
        }
        try {
            return eVar.a();
        } catch (Exception e2) {
            throw h.a(e2);
        }
    }
}
