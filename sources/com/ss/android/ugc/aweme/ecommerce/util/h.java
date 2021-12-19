package com.ss.android.ugc.aweme.ecommerce.util;

import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.utils.gb;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final int f87567a = n.a(d.a());

    /* renamed from: b  reason: collision with root package name */
    public static final int f87568b;

    /* renamed from: c  reason: collision with root package name */
    public static float f87569c;

    /* renamed from: d  reason: collision with root package name */
    public static float f87570d = n.b(d.a(), 8.0f);

    /* renamed from: e  reason: collision with root package name */
    public static int f87571e = ((int) n.b(d.a(), 16.0f));

    /* renamed from: f  reason: collision with root package name */
    public static int f87572f = ((int) n.b(d.a(), 8.0f));

    /* renamed from: g  reason: collision with root package name */
    public static int f87573g = ((int) n.b(d.a(), 44.0f));

    /* renamed from: h  reason: collision with root package name */
    public static final h f87574h = new h();

    /* renamed from: i  reason: collision with root package name */
    private static float f87575i;

    /* renamed from: j  reason: collision with root package name */
    private static float f87576j;

    private h() {
    }

    public static final float a() {
        if (((float) f87567a) / ((float) f87568b) < 0.5f) {
            return f87569c;
        }
        return f87575i;
    }

    static {
        Covode.recordClassIndex(55046);
        int b2 = n.b(d.a());
        f87568b = b2;
        f87569c = ((float) b2) * 0.73f;
        f87575i = ((float) b2) * 0.86f;
        f87576j = ((float) b2) * 0.95f;
    }

    public static String a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (!gb.a()) {
            return str + '/' + str2;
        }
        return str2 + '/' + str;
    }
}
