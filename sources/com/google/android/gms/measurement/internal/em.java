package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ss.android.ugc.aweme.bf.d;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* access modifiers changed from: package-private */
public final class em extends fy {

    /* renamed from: a  reason: collision with root package name */
    static final Pair<String, Long> f51519a = new Pair<>("", 0L);
    private String A;
    private boolean B;
    private long C;

    /* renamed from: b  reason: collision with root package name */
    SharedPreferences f51520b;

    /* renamed from: c  reason: collision with root package name */
    public ep f51521c;

    /* renamed from: d  reason: collision with root package name */
    public final eq f51522d = new eq(this, "last_upload", 0);

    /* renamed from: e  reason: collision with root package name */
    public final eq f51523e = new eq(this, "last_upload_attempt", 0);

    /* renamed from: f  reason: collision with root package name */
    public final eq f51524f = new eq(this, "backoff", 0);

    /* renamed from: g  reason: collision with root package name */
    public final eq f51525g = new eq(this, "last_delete_stale", 0);

    /* renamed from: h  reason: collision with root package name */
    public final eq f51526h = new eq(this, "midnight_offset", 0);

    /* renamed from: i  reason: collision with root package name */
    public final eq f51527i = new eq(this, "first_open_time", 0);

    /* renamed from: j  reason: collision with root package name */
    public final eq f51528j = new eq(this, "app_install_time", 0);

    /* renamed from: k  reason: collision with root package name */
    public final es f51529k = new es(this, "app_instance_id");

    /* renamed from: l  reason: collision with root package name */
    public final eq f51530l = new eq(this, "time_before_start", 10000);

    /* renamed from: m  reason: collision with root package name */
    public final eq f51531m = new eq(this, "session_timeout", 1800000);
    public final eo n = new eo(this, "start_new_session", true);
    public final es o = new es(this, "non_personalized_ads");
    public final eo p = new eo(this, "allow_remote_dynamite", false);
    public final eq q = new eq(this, "last_pause_time", 0);
    public boolean r;
    public eo s = new eo(this, "app_backgrounded", false);
    public eo t = new eo(this, "deep_link_retrieval_complete", false);
    public eq u = new eq(this, "deep_link_retrieval_attempts", 0);
    public final es v = new es(this, "firebase_feature_rollouts");
    public final es w = new es(this, "deferred_attribution_cache");
    public final eq x = new eq(this, "deferred_attribution_cache_timestamp", 0);
    public final en y = new en(this, "default_event_parameters");

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.fy
    public final boolean d() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final SharedPreferences f() {
        c();
        x();
        return this.f51520b;
    }

    /* access modifiers changed from: package-private */
    public final String g() {
        c();
        return f().getString("gmp_app_id", null);
    }

    /* access modifiers changed from: package-private */
    public final String h() {
        c();
        return f().getString("admob_app_id", null);
    }

    static {
        Covode.recordClassIndex(32207);
    }

    /* access modifiers changed from: package-private */
    public final Boolean i() {
        c();
        if (!f().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(f().getBoolean("use_service", false));
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        c();
        Boolean u2 = u();
        SharedPreferences.Editor edit = f().edit();
        edit.clear();
        edit.apply();
        if (u2 != null) {
            b(u2.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean u() {
        c();
        if (f().contains("measurement_enabled")) {
            return Boolean.valueOf(f().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String v() {
        c();
        String string = f().getString("previous_os_version", null);
        k().x();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = f().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.fy
    public final void M_() {
        SharedPreferences a2 = d.a(m(), "com.google.android.gms.measurement.prefs", 0);
        this.f51520b = a2;
        boolean z = a2.getBoolean("has_been_opened", false);
        this.r = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f51520b.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f51521c = new ep(this, "health_monitor", Math.max(0L, p.f52038c.a(null).longValue()), (byte) 0);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        c();
        SharedPreferences.Editor edit = f().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        c();
        SharedPreferences.Editor edit = f().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void c(String str) {
        c();
        SharedPreferences.Editor edit = f().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void d(String str) {
        c();
        SharedPreferences.Editor edit = f().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(long j2) {
        if (j2 - this.f51531m.a() > this.q.a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final String b(String str) {
        c();
        String str2 = (String) a(str).first;
        MessageDigest h2 = jz.h();
        if (h2 == null) {
            return null;
        }
        return a.a(Locale.US, "%032X", new Object[]{new BigInteger(1, h2.digest(str2.getBytes()))});
    }

    /* access modifiers changed from: package-private */
    public final void c(boolean z) {
        c();
        q().f51476k.a("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = f().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final Pair<String, Boolean> a(String str) {
        c();
        long b2 = l().b();
        if (this.A != null && b2 < this.C) {
            return new Pair<>(this.A, Boolean.valueOf(this.B));
        }
        this.C = b2 + s().a(str, p.f52037b);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(m());
            if (advertisingIdInfo != null) {
                this.A = advertisingIdInfo.getId();
                this.B = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.A == null) {
                this.A = "";
            }
        } catch (Exception e2) {
            q().f51475j.a("Unable to get advertising id", e2);
            this.A = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.A, Boolean.valueOf(this.B));
    }

    em(ff ffVar) {
        super(ffVar);
    }
}
