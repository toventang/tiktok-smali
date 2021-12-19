package com.ss.android.ugc.aweme.ug.a;

import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ss.android.ugc.aweme.ug.c;
import h.f.b.l;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class b implements c {

    /* renamed from: b  reason: collision with root package name */
    public static final b f141712b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(92624);
    }

    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f141713a = new a();

        static {
            Covode.recordClassIndex(92625);
        }

        a() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            boolean z;
            if (a.c() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                a.b().putLong("active_time", System.currentTimeMillis()).apply();
                b.f141712b.b("fb_mobile_achievement_unlocked", null, null);
            } else if (!a.a().getBoolean("has_2d_rr_use", false)) {
                if (TimeUnit.MILLISECONDS.toDays(a.c()) + 1 == TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis())) {
                    b.f141712b.b("2d_rr_user", null, null);
                    b.f141712b.a("d2_rr_user", null, null);
                    a.a("has_2d_rr_use", true);
                }
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ug.c
    public final void a(String str) {
        b("Login", null, null);
        a("login", "product", str);
    }

    @Override // com.ss.android.ugc.aweme.ug.c
    public final void c(String str) {
        AppsFlyerLib.getInstance().trackEvent(d.a(), str, null);
    }

    @Override // com.ss.android.ugc.aweme.ug.c
    public final void b(String str) {
        AppsFlyerLib.getInstance().trackEvent(d.a(), "mus_af_post_video", null);
        a("UPV", "product", str);
        b("fb_mobile_purchase", "product", str);
    }

    @Override // com.ss.android.ugc.aweme.ug.c
    public final void d(String str) {
        l.d(str, "");
        AppsFlyerLib.getInstance().trackEvent(d.a(), str, null);
    }

    @Override // com.ss.android.ugc.aweme.ug.c
    public final void a(String str, Map<String, ? extends Object> map) {
        AppsFlyerLib.getInstance().trackEvent(d.a(), str, map);
    }

    @Override // com.ss.android.ugc.aweme.ug.c
    public final void a(String str, String str2) {
        l.d(str2, "");
        if (str != null) {
            int i2 = 0;
            switch (str.hashCode()) {
                case -2090153577:
                    if (str.equals("mus_af_follow")) {
                        b("Subscribe", "product", str2);
                        return;
                    }
                    return;
                case -1617792023:
                    if (str.equals("video_view")) {
                        a("Video_content", "product", str2);
                        b("fb_mobile_content_view", "product", str2);
                        return;
                    }
                    return;
                case -1101213402:
                    if (str.equals("collect_video")) {
                        b("fb_mobile_add_to_wishlist", "product", str2);
                        return;
                    }
                    return;
                case 70775934:
                    if (str.equals("start_upload")) {
                        b("fb_mobile_initiated_checkout", null, null);
                        return;
                    }
                    return;
                case 109413407:
                    if (str.equals("shoot")) {
                        b("fb_mobile_add_payment_info", null, null);
                        return;
                    }
                    return;
                case 1263148345:
                    if (str.equals("mus_af_comment")) {
                        b("fb_mobile_rate", "product", str2);
                        return;
                    }
                    return;
                case 2026292779:
                    if (str.equals("mus_af_like_video_1")) {
                        if (a.a().getBoolean("is_first_like_success", true)) {
                            a.a("is_first_like_success", false);
                        }
                        a("like", "product", str2);
                        b("fb_mobile_add_to_cart", "product", str2);
                        return;
                    }
                    return;
                case 2026292783:
                    if (str.equals("mus_af_like_video_5")) {
                        int i3 = a.a().getInt("like_success_count", 0) + 1;
                        if (i3 != 5) {
                            i2 = i3;
                        }
                        a.b().putInt("like_success_count", i2).apply();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ug.c
    public final void b(String str, String str2, String str3) {
        l.d(str, "");
        b(str, str2, str3, new Bundle());
    }

    @Override // com.ss.android.ugc.aweme.ug.c
    public final void a(String str, String str2, String str3) {
        l.d(str, "");
        a(str, str2, str3, new Bundle());
    }

    private static void a(String str, String str2, String str3, Bundle bundle) {
        l.d(str, "");
        l.d(bundle, "");
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("content_type", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (TextUtils.equals(str, "search")) {
                bundle.putString("search_term", str3);
            } else {
                bundle.putString("item_id", str3);
            }
        }
        FirebaseAnalytics.getInstance(d.a()).logEvent(str, bundle);
    }

    private static void b(String str, String str2, String str3, Bundle bundle) {
        l.d(bundle, "");
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("fb_content_type", str2);
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        if (TextUtils.equals(str, "fb_mobile_search")) {
            bundle.putString("fb_search_string", str3);
        } else {
            bundle.putString("fb_content_id", str3);
        }
    }
}
