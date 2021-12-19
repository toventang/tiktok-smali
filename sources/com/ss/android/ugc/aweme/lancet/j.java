package com.ss.android.ugc.aweme.lancet;

import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.experiment.du;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static String f107222a = "";

    /* renamed from: b  reason: collision with root package name */
    public static String f107223b = "";

    /* renamed from: c  reason: collision with root package name */
    public static l.a f107224c = l.a.UNKNOWN;

    /* renamed from: d  reason: collision with root package name */
    public static l.a f107225d = l.a.UNKNOWN;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f107226e;

    /* renamed from: f  reason: collision with root package name */
    public static String f107227f = "";

    /* renamed from: g  reason: collision with root package name */
    public static NetworkUtils.h f107228g = NetworkUtils.h.NONE;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f107229h;

    /* renamed from: i  reason: collision with root package name */
    public static long f107230i = -1;

    /* renamed from: j  reason: collision with root package name */
    public static int f107231j = -1;

    /* renamed from: k  reason: collision with root package name */
    public static int f107232k = -1;

    /* renamed from: l  reason: collision with root package name */
    public static int f107233l = -1;

    public static boolean a() {
        if (f107233l < 0) {
            f107233l = du.f89847c;
        }
        if (f107233l == 1) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (f107231j < 0) {
            f107231j = du.f89845a;
        }
        if (f107231j == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(68584);
    }

    public static boolean c() {
        if (f107232k < 0) {
            f107232k = du.f89846b;
        }
        if (f107232k <= 0 || System.currentTimeMillis() - f107230i <= ((long) f107232k)) {
            return false;
        }
        f107230i = System.currentTimeMillis();
        return true;
    }
}
