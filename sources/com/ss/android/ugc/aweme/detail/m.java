package com.ss.android.ugc.aweme.detail;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.a;
import h.f.b.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f79784a = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(49596);
    }

    public static boolean a(float f2, boolean z, a aVar) {
        a helper;
        l.d(aVar, "");
        ScrollableLayout scrollableLayout = aVar.y;
        if ((scrollableLayout == null || (helper = scrollableLayout.getHelper()) == null || !helper.b()) && (!z || f2 >= 0.1f)) {
            return z;
        }
        aVar.L.d();
        return false;
    }

    public static boolean a(float f2, float f3, boolean z, a aVar) {
        boolean z2;
        a helper;
        l.d(aVar, "");
        aVar.p();
        ScrollableLayout scrollableLayout = aVar.y;
        if (scrollableLayout == null || (helper = scrollableLayout.getHelper()) == null) {
            z2 = false;
        } else {
            z2 = helper.b();
        }
        if (z2) {
            return true;
        }
        if (Math.abs(f2) >= Math.abs(f3)) {
            return z;
        }
        if (f3 > 30.0f) {
            aVar.L.e();
        } else if (f3 < -30.0f) {
            return true;
        }
        return z;
    }
}
