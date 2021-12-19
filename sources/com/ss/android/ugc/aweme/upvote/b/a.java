package com.ss.android.ugc.aweme.upvote.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.im.service.c.k;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f142025a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final int f142026b = 1;

    /* renamed from: c  reason: collision with root package name */
    private static final int f142027c = 2;

    private a() {
    }

    public static boolean b() {
        if (d() == f142026b) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (d() == f142027c) {
            return true;
        }
        return false;
    }

    private static int d() {
        return b.a().a(true, "tt_upvote_experiment", 0);
    }

    static {
        Covode.recordClassIndex(92818);
    }

    public static boolean a() {
        int i2 = f142026b;
        int i3 = f142027c;
        int d2 = d();
        if (i2 <= d2 && i3 >= d2 && !k.c()) {
            return true;
        }
        return false;
    }
}
