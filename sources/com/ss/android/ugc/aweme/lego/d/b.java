package com.ss.android.ugc.aweme.lego.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.n;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f107492a;

    /* renamed from: b  reason: collision with root package name */
    public static Integer f107493b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f107494c = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(68792);
    }

    public static boolean a(n nVar) {
        l.d(nVar, "");
        Integer num = f107493b;
        int bK_ = nVar.bK_();
        Integer num2 = f107493b;
        if (num2 == null) {
            l.b();
        }
        int intValue = bK_ & num2.intValue();
        if (num != null && num.intValue() == intValue) {
            return true;
        }
        return false;
    }
}
