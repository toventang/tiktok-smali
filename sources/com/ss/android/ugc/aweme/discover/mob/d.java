package com.ss.android.ugc.aweme.discover.mob;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.search.k.ad;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.k.r;
import java.util.Map;

public final class d implements c {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f81883b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f81884c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f81885d;

    /* renamed from: e  reason: collision with root package name */
    public static String f81886e = "";

    /* renamed from: f  reason: collision with root package name */
    static String f81887f = "";

    /* renamed from: g  reason: collision with root package name */
    static int f81888g = -1;

    /* renamed from: h  reason: collision with root package name */
    static Map<String, String> f81889h;

    /* renamed from: i  reason: collision with root package name */
    static r f81890i;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f81891j;

    /* renamed from: k  reason: collision with root package name */
    public static int f81892k;

    /* renamed from: l  reason: collision with root package name */
    public static int f81893l;

    /* renamed from: m  reason: collision with root package name */
    public static final d f81894m = new d();
    private static int n;

    private d() {
    }

    static {
        Covode.recordClassIndex(50846);
    }

    public static String a() {
        ad c2;
        String str;
        q a2 = am.a();
        if (a2 == null || (c2 = a2.c()) == null || (str = c2.f121172a) == null) {
            return "";
        }
        return str;
    }

    public static void a(View view, String str, int i2) {
        a(view, str, i2, null);
    }

    public static void a(View view, String str, int i2, Map<String, String> map) {
        if (view != null) {
            r a2 = j.a.a(view);
            f81890i = a2;
            n = a2.f121268c;
            f81887f = a2.f121270e;
            if (str == null) {
                str = "";
            }
            f81886e = str;
            f81888g = i2;
            f81889h = map;
        }
    }
}
