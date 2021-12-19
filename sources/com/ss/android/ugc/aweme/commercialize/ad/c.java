package com.ss.android.ugc.aweme.commercialize.ad;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.al;
import java.util.HashMap;

public final class c implements al {

    /* renamed from: a  reason: collision with root package name */
    public static String f73645a = "no_ad";

    /* renamed from: b  reason: collision with root package name */
    public static final c f73646b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap<String, Integer> f73647c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private static int f73648d;

    /* renamed from: e  reason: collision with root package name */
    private static long f73649e;

    /* renamed from: f  reason: collision with root package name */
    private static int f73650f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f73651g;

    /* renamed from: h  reason: collision with root package name */
    private static long f73652h;

    /* renamed from: i  reason: collision with root package name */
    private static long f73653i;

    private c() {
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void a() {
        if (!f73651g) {
            f73649e = System.currentTimeMillis();
        }
    }

    static {
        Covode.recordClassIndex(45323);
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void b() {
        f73650f = 0;
        f73649e = 0;
        f73652h = 0;
        f73653i = 0;
        if (f73651g) {
            f73648d = 0;
            f73645a = "feedad";
        } else {
            f73648d = 1;
            f73645a = "no_ad";
        }
        f73647c.clear();
    }
}
