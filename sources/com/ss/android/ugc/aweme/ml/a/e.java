package com.ss.android.ugc.aweme.ml.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.b.f;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.lancet.j;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static String f110306a;

    /* renamed from: b  reason: collision with root package name */
    public static int f110307b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static long f110308c;

    /* renamed from: d  reason: collision with root package name */
    public static int f110309d = -1;

    /* renamed from: e  reason: collision with root package name */
    public static long f110310e;

    /* renamed from: f  reason: collision with root package name */
    public static int f110311f;

    /* renamed from: g  reason: collision with root package name */
    public static long f110312g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f110313h;

    /* renamed from: i  reason: collision with root package name */
    public static long f110314i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static int f110315j;

    /* renamed from: k  reason: collision with root package name */
    public static long f110316k = 0;

    /* renamed from: l  reason: collision with root package name */
    private static String f110317l = "";

    /* renamed from: m  reason: collision with root package name */
    private static long f110318m;
    private static f n;
    private static f o;
    private static long p = 0;

    static {
        Covode.recordClassIndex(70820);
        f fVar = new f();
        n = fVar;
        o = fVar;
        fVar.f29067c = 0;
        n.f29066b = 0;
        n.f29065a = 0;
    }

    public static int a(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("duration")) {
            return 0;
        }
        try {
            return jSONObject.optInt("duration");
        } catch (Exception unused) {
            return 0;
        }
    }

    public static f b(long j2) {
        if (j2 - p > 30000) {
            try {
                f networkQuality = TTNetInit.getNetworkQuality();
                if (networkQuality != null) {
                    o = networkQuality;
                }
            } catch (Exception unused) {
            }
            p = j2;
        }
        return o;
    }

    public static String a(long j2) {
        if (j2 - f110318m > 30000) {
            Context a2 = d.a();
            if (TextUtils.isEmpty(j.f107222a) || !j.b() || j.c()) {
                j.f107222a = l.a(l.a(a2));
            }
            f110317l = j.f107222a;
            f110318m = j2;
        }
        return f110317l;
    }
}
