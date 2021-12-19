package com.ss.android.ugc.aweme.shortvideo.edit;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.setting.j;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.c;
import h.f.b.ad;
import h.f.b.l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final int f128050a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f128051b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f128052c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f128053d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f128054e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f128055f;

    /* renamed from: g  reason: collision with root package name */
    public static final int f128056g;

    /* renamed from: h  reason: collision with root package name */
    public static final int f128057h;

    /* renamed from: i  reason: collision with root package name */
    public static final int f128058i;

    /* renamed from: j  reason: collision with root package name */
    static final HashMap<String, Integer> f128059j = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    static SharedPreferences f128060k = d.a(i.f115645a, "av_settings.xml", 0);

    /* renamed from: l  reason: collision with root package name */
    public static boolean f128061l;

    /* renamed from: m  reason: collision with root package name */
    public static final w f128062m = new w();
    private static final String[] n;

    public interface a {
        static {
            Covode.recordClassIndex(83924);
        }

        void a();

        void b();

        void c();

        void d();

        void e();

        void f();

        void g();
    }

    private w() {
    }

    public static final boolean c() {
        if (!c.a() || a("countdown_sticker")) {
            return false;
        }
        return true;
    }

    static Set<String> a() {
        String string = f128060k.getString("prompt_shown", "");
        HashSet hashSet = new HashSet();
        if (string == null || string.length() <= 0) {
            return hashSet;
        }
        Object a2 = g.a().G().a(string, Set.class);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
        return ad.f(a2);
    }

    public static final boolean b() {
        if (!j.a() || g.a().A().a() || a("custom_sticker")) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(83923);
        String[] strArr = {"cut_optimized", "canvas_gesture", "countdown_sticker", "custom_sticker", "music", "text", "sticker", "effect", "voice"};
        n = strArr;
        f128050a = h.a.i.b(strArr, "custom_sticker");
        f128051b = h.a.i.b(strArr, "countdown_sticker");
        f128052c = h.a.i.b(strArr, "music");
        f128053d = h.a.i.b(strArr, "text");
        f128054e = h.a.i.b(strArr, "sticker");
        f128055f = h.a.i.b(strArr, "effect");
        f128056g = h.a.i.b(strArr, "voice");
        f128057h = h.a.i.b(strArr, "canvas_gesture");
        f128058i = h.a.i.b(strArr, "cut_optimized");
    }

    public static final boolean a(String str) {
        l.d(str, "");
        return a().contains(str);
    }

    public static final void b(String str) {
        l.d(str, "");
        Set<String> a2 = a();
        if (a2.add(str)) {
            a(a2);
        }
    }

    static void a(Set<String> set) {
        l.d(set, "");
        if (!set.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(a());
            linkedHashSet.addAll(set);
            f128060k.edit().putString("prompt_shown", g.a().G().b(linkedHashSet)).commit();
        }
    }

    public static final void a(String str, int i2) {
        l.d(str, "");
        f128059j.put(str, Integer.valueOf(i2));
    }
}
