package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class bw {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f122121a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f122122b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f122123c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f122124d;

    /* renamed from: e  reason: collision with root package name */
    public static final bw f122125e = new bw();

    /* renamed from: f  reason: collision with root package name */
    private static final int f122126f;

    private bw() {
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        Covode.recordClassIndex(80070);
        boolean z4 = true;
        int a2 = b.a().a(true, "creative_restore_work", 0);
        f122126f = a2;
        if (a2 == 0 || a2 == 2) {
            z = false;
        } else {
            z = true;
        }
        f122121a = z;
        if (a2 == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        f122122b = z2;
        if (a2 >= 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        f122123c = z3;
        if (a2 != 2) {
            z4 = false;
        }
        f122124d = z4;
    }
}
