package com.ss.android.ugc.aweme.adaptation;

import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f66257a;

    /* renamed from: b  reason: collision with root package name */
    public static int f66258b;

    /* renamed from: c  reason: collision with root package name */
    public static int f66259c;

    static {
        Covode.recordClassIndex(40707);
    }

    public static boolean a() {
        if (!f66257a || f66258b <= 0 || f66259c <= 0) {
            return false;
        }
        return true;
    }

    public static int b() {
        return (int) n.b(d.a(), (float) f66259c);
    }

    public static int c() {
        return (int) n.b(d.a(), (float) f66258b);
    }
}
