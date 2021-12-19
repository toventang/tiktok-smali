package com.ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class d implements com.bytedance.ies.ugc.aweme.commercialize.splash.topview.d {

    /* renamed from: a  reason: collision with root package name */
    public static long f75283a;

    /* renamed from: b  reason: collision with root package name */
    public static long f75284b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f75285c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f75286d = true;

    /* renamed from: e  reason: collision with root package name */
    public static final d f75287e = new d();

    /* renamed from: f  reason: collision with root package name */
    private static final h f75288f = i.a((h.f.a.a) a.f75293a);

    /* renamed from: g  reason: collision with root package name */
    private static int f75289g;

    /* renamed from: h  reason: collision with root package name */
    private static long f75290h;

    /* renamed from: i  reason: collision with root package name */
    private static int f75291i;

    /* renamed from: j  reason: collision with root package name */
    private static long f75292j;

    public static long b() {
        return ((Number) f75288f.getValue()).longValue();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.d
    public final void a() {
        f75286d = false;
    }

    private d() {
    }

    static final class a extends m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f75293a = new a();

        static {
            Covode.recordClassIndex(46467);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(com.ss.android.ugc.aweme.feed.a.f91454c);
        }
    }

    static {
        Covode.recordClassIndex(46466);
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f75294a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f75295b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f75296c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f75297d;

        static {
            Covode.recordClassIndex(46468);
        }

        b(Context context, Aweme aweme, long j2, long j3) {
            this.f75294a = context;
            this.f75295b = aweme;
            this.f75296c = j2;
            this.f75297d = j3;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.HashMap */
        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.util.HashMap */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Context context = this.f75294a;
            Aweme aweme = this.f75295b;
            long j2 = this.f75296c;
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.B(aweme) && d.f75284b != 0) {
                int i2 = 1;
                if (!d.f75286d) {
                    i2 = 2;
                }
                d.f75284b = 0;
                HashMap hashMap = new HashMap();
                hashMap.put("splashduration", String.valueOf(j2));
                hashMap.put("awemelaunch", String.valueOf(i2));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("ad_extra_data", new f().b(hashMap));
                j.b(context, "splash_show", aweme, j.a(context, aweme, false, (Map<String, String>) hashMap2));
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "feed_show", aweme.getAwemeRawAd()).a("splashduration", Long.valueOf(j2)).a("awemelaunch", Integer.valueOf(i2)).c();
            }
            if (d.f75286d) {
                j.a(this.f75294a, this.f75295b, this.f75297d);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.d
    public final void a(Context context, Aweme aweme) {
        long currentTimeMillis = System.currentTimeMillis();
        f75283a = currentTimeMillis;
        b.i.b(new b(context, aweme, currentTimeMillis - f75284b, currentTimeMillis - b()), r.a());
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.d
    public final void a(Context context, Aweme aweme, long j2) {
        AwemeRawAd awemeRawAd;
        if (!f75286d) {
            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme)) {
                int i2 = f75289g;
                if (1 <= i2 && 9 >= i2) {
                    f75289g = i2 + 1;
                    return;
                }
                f75289g = 0;
                f75290h = 0;
            } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.B(aweme)) {
                f75289g = 1;
                f75290h = j2;
            } else {
                int i3 = f75289g;
                if (1 <= i3 && 9 >= i3) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("adsgap", String.valueOf(f75289g - 1));
                    hashMap.put("gaptime", String.valueOf(j2 - f75290h));
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("ad_extra_data", new f().b(hashMap));
                    j.b(context, "feed_firstshow", aweme, j.a(context, aweme, false, (Map<String, String>) hashMap2));
                    hashMap.get("adsgap");
                    hashMap.get("gaptime");
                    if (aweme != null) {
                        awemeRawAd = aweme.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "feed_firstshow", awemeRawAd).a("adsgap", String.valueOf(f75289g - 1)).a("gaptime", String.valueOf(j2 - f75290h)).c();
                }
                f75289g = 0;
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.d
    public final void b(Context context, Aweme aweme, long j2) {
        AwemeRawAd awemeRawAd;
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme) && !com.ss.android.ugc.aweme.commercialize.e.a.b.B(aweme)) {
            f75291i = 1;
            f75292j = j2;
        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.B(aweme)) {
            int i2 = f75291i;
            if (1 <= i2 && 9 >= i2) {
                HashMap hashMap = new HashMap();
                hashMap.put("adsgap", String.valueOf(f75291i - 1));
                hashMap.put("gaptime", String.valueOf(j2 - f75292j));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("ad_extra_data", new f().b(hashMap));
                j.b(context, "feed_lastshow", aweme, j.a(context, aweme, false, (Map<String, String>) hashMap2));
                hashMap.get("adsgap");
                hashMap.get("gaptime");
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "feed_lastshow", awemeRawAd).a("adsgap", String.valueOf(f75289g - 1)).a("gaptime", String.valueOf(j2 - f75292j)).c();
                f75291i = 0;
            }
        } else {
            int i3 = f75291i;
            if (1 <= i3 && 9 >= i3) {
                f75291i = i3 + 1;
                return;
            }
            f75291i = 0;
            f75292j = 0;
        }
    }
}
