package com.ss.android.ugc.aweme.discover.b;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f80834a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f80835b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static int f80836c;

    private a() {
    }

    public static boolean a() {
        if (!i.a()) {
            if (f80836c == 1) {
                return true;
            }
            return false;
        } else if (f80834a == 1) {
            return true;
        } else {
            return false;
        }
    }

    static {
        int i2;
        Covode.recordClassIndex(50256);
        if (h.a() == 5) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        f80836c = i2;
        f80834a = i2;
        com.ss.android.ugc.aweme.bk.a aVar = com.ss.android.ugc.aweme.bk.a.f68724a;
        f80834a = aVar.f68725b.getInt("key_search_auto_play_sound", f80836c);
    }
}
