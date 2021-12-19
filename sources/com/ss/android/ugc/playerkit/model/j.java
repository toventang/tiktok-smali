package com.ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f148736a;

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<String, Long> f148737b = new HashMap<>(1);

    /* renamed from: c  reason: collision with root package name */
    public static final j f148738c = new j();

    private j() {
    }

    static {
        Covode.recordClassIndex(97999);
    }

    public static boolean a(p pVar) {
        if (pVar != null && f148736a) {
            c cVar = c.f148702a;
            l.a((Object) cVar, "");
            if (cVar.getPlayerBackgroundSleepStrategy() != 2 || pVar.av) {
                return false;
            }
            return true;
        }
        return false;
    }
}
