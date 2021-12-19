package com.ss.android.ad.splash.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.core.e.f;
import com.ss.android.ad.splash.core.e.p;
import com.ss.android.ad.splash.f.a;
import com.ss.android.ad.splash.f.b;
import com.ss.android.ad.splash.f.l;
import com.ss.android.ugc.aweme.bf.d;
import java.util.Calendar;

public class v {

    /* renamed from: a  reason: collision with root package name */
    static final String f58717a;

    /* renamed from: c  reason: collision with root package name */
    static Calendar f58718c = Calendar.getInstance();

    /* renamed from: d  reason: collision with root package name */
    private static volatile v f58719d;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f58720b = d.a(h.r, "splash_ad_sp", 0);

    /* renamed from: e  reason: collision with root package name */
    private long f58721e;

    /* renamed from: f  reason: collision with root package name */
    private long f58722f;

    /* renamed from: g  reason: collision with root package name */
    private SharedPreferences.Editor f58723g;

    public final void h() {
        this.f58723g.apply();
    }

    private v() {
    }

    private String A() {
        return this.f58720b.getString("key_last_show_sequence_day", "");
    }

    /* access modifiers changed from: package-private */
    public final v f() {
        u().putInt("key_splash_ad_show_sequence", p() + 1);
        return this;
    }

    public final String i() {
        return this.f58720b.getString("splash_ad_full_data", "");
    }

    public final long j() {
        return this.f58720b.getLong("splash_ad_leave_interval", 0);
    }

    public final long k() {
        return this.f58720b.getLong("splash_ad_splash_interval", 0);
    }

    public final int l() {
        return this.f58720b.getInt("show_splash_ad_day", 0);
    }

    public final int m() {
        return this.f58720b.getInt("splash_ad_show_limit", 0);
    }

    public final boolean n() {
        return this.f58720b.getBoolean("key_splash_ad_need_ack", false);
    }

    public final boolean q() {
        return this.f58720b.getBoolean("key_splash_ad_empty", false);
    }

    public final String r() {
        return this.f58720b.getString("key_splash_ad_rt_necessary_device_params", "");
    }

    public final String s() {
        return this.f58720b.getString("key_splash_ad_penalty_period", "");
    }

    public final String t() {
        return this.f58720b.getString("key_empty_log_extra_substitute", "");
    }

    public final SharedPreferences.Editor u() {
        if (this.f58723g == null) {
            this.f58723g = this.f58720b.edit();
        }
        return this.f58723g;
    }

    public final long v() {
        return this.f58720b.getLong("key_splash_ad_showed_time", -1);
    }

    public final int w() {
        return this.f58720b.getInt("key_exception_time", 0);
    }

    private void y() {
        u().putInt("splash_ad_show_count", 0);
        b(false).h();
    }

    private void z() {
        u().putString("key_last_show_sequence_day", B()).apply();
    }

    public final long b() {
        if (this.f58722f == 0) {
            this.f58722f = this.f58720b.getLong("key_pre_remote_time", 0);
        }
        return this.f58722f;
    }

    public final long c() {
        if (this.f58721e == 0) {
            this.f58721e = this.f58720b.getLong("key_pre_launch_time", 0);
        }
        return this.f58721e;
    }

    /* access modifiers changed from: package-private */
    public final v e() {
        int o = o() + 1;
        a.a(0, "show count: ".concat(String.valueOf(o)));
        u().putInt("splash_ad_show_count", o);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final String g() {
        return this.f58720b.getString("splash_ad_local_cache_data", "");
    }

    static {
        Covode.recordClassIndex(36383);
        StringBuilder sb = new StringBuilder();
        Context context = h.r;
        if (com.ss.android.ugc.aweme.lancet.d.f107195c == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
            com.ss.android.ugc.aweme.lancet.d.f107195c = context.getFilesDir();
        }
        f58717a = sb.append(com.ss.android.ugc.aweme.lancet.d.f107195c).append("/SplashData/").toString();
    }

    private static String B() {
        f58718c.setTimeInMillis(System.currentTimeMillis());
        return f58718c.get(1) + "/" + f58718c.get(2) + "/" + f58718c.get(5);
    }

    public static v a() {
        MethodCollector.i(4954);
        if (f58719d == null) {
            synchronized (v.class) {
                try {
                    if (f58719d == null) {
                        f58719d = new v();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4954);
                    throw th;
                }
            }
        }
        v vVar = f58719d;
        MethodCollector.o(4954);
        return vVar;
    }

    private void x() {
        f58718c.setTimeInMillis(System.currentTimeMillis());
        u().putInt("show_splash_ad_day", f58718c.get(5) + f58718c.get(2) + f58718c.get(1)).apply();
    }

    public final int o() {
        f58718c.setTimeInMillis(System.currentTimeMillis());
        if (f58718c.get(5) + f58718c.get(2) + f58718c.get(1) == l()) {
            return this.f58720b.getInt("splash_ad_show_count", 0);
        }
        y();
        x();
        return 0;
    }

    public final int p() {
        if (B().equals(A())) {
            return this.f58720b.getInt("key_splash_ad_show_sequence", 0);
        }
        u().putInt("key_splash_ad_show_sequence", 0).apply();
        z();
        return 0;
    }

    public final boolean d() {
        f58718c.setTimeInMillis(System.currentTimeMillis());
        if (f58718c.get(5) + f58718c.get(2) + f58718c.get(1) == l()) {
            return this.f58720b.getBoolean("splash_ad_has_first_refresh", false);
        }
        x();
        y();
        return false;
    }

    public final v a(int i2) {
        u().putInt("splash_ad_show_limit", i2);
        return this;
    }

    public final v b(long j2) {
        u().putLong("splash_ad_splash_interval", j2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final v c(long j2) {
        u().putLong("splash_ad_last_show_time", j2);
        return this;
    }

    public final v g(String str) {
        u().putString("key_splash_ad_penalty_period", str);
        return this;
    }

    public final v h(String str) {
        u().putString("key_empty_log_extra_substitute", str);
        return this;
    }

    public final v a(long j2) {
        u().putLong("splash_ad_leave_interval", j2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final v d(long j2) {
        this.f58721e = SystemClock.elapsedRealtime();
        this.f58722f = j2;
        u().putLong("key_pre_remote_time", j2).putLong("key_pre_launch_time", this.f58721e).apply();
        return this;
    }

    /* access modifiers changed from: package-private */
    public final v f(String str) {
        u().putString("splash_ad_local_cache_data", str);
        return this;
    }

    private synchronized void i(String str) {
        MethodCollector.i(5024);
        if (l.a(str)) {
            MethodCollector.o(5024);
            return;
        }
        u().putBoolean("splash_ad_url_has_download_" + b.a(str), true).apply();
        MethodCollector.o(5024);
    }

    public final v b(String str) {
        u().putString("splash_ad_did", str);
        return this;
    }

    public final v c(String str) {
        u().putString("splash_ad_first_show_data", str);
        return this;
    }

    public final synchronized void d(String str) {
        MethodCollector.i(5034);
        if (l.a(str)) {
            MethodCollector.o(5034);
            return;
        }
        u().remove("splash_ad_url_has_download_" + b.a(str)).apply();
        MethodCollector.o(5034);
    }

    public final synchronized boolean e(String str) {
        MethodCollector.i(5046);
        if (l.a(str)) {
            MethodCollector.o(5046);
            return false;
        }
        boolean z = this.f58720b.getBoolean("splash_ad_url_has_download_" + b.a(str), false);
        MethodCollector.o(5046);
        return z;
    }

    public final v a(String str) {
        if (h.ag) {
            com.ss.android.ad.splash.f.d.a(str, f58717a, "splash_ad_ordered_data");
        } else {
            u().putString("splash_ad_data", str);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final v b(boolean z) {
        u().putBoolean("splash_ad_has_first_refresh", z);
        return this;
    }

    public final v c(boolean z) {
        u().putBoolean("key_splash_ad_need_ack", z);
        return this;
    }

    public final v a(boolean z) {
        u().putBoolean("key_splash_ad_empty", z);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void a(f fVar) {
        if (fVar != null && !l.a(fVar.f58480d)) {
            i(fVar.f58480d);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(p pVar) {
        if (pVar != null && !l.a(pVar.f58525d)) {
            i(pVar.f58525d);
        }
    }
}
