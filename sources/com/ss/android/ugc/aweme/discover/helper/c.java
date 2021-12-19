package com.ss.android.ugc.aweme.discover.helper;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.f.b;
import com.ss.android.ugc.aweme.discover.ui.a.b.a.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f81102a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(50405);
    }

    public static final boolean a(a aVar) {
        if (aVar == null || aVar.a()) {
            return false;
        }
        return true;
    }

    public static final int a(Activity activity, a aVar, boolean z) {
        double d2;
        double d3;
        if (activity == null) {
            return -2;
        }
        if (aVar == null || aVar.a()) {
            if (!z) {
                return -2;
            }
        } else if (!z) {
            d2 = (double) b.b(activity);
            d3 = 0.75d;
            Double.isNaN(d2);
            return (int) (d2 * d3);
        }
        d2 = (double) b.b(activity);
        d3 = 0.9d;
        Double.isNaN(d2);
        return (int) (d2 * d3);
    }
}
