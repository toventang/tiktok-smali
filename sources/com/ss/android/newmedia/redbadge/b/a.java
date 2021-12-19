package com.ss.android.newmedia.redbadge.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f60016b;

    /* renamed from: a  reason: collision with root package name */
    public PushMultiProcessSharedProvider.b f60017a;

    /* renamed from: c  reason: collision with root package name */
    private Context f60018c;

    static {
        Covode.recordClassIndex(37098);
    }

    public final String b() {
        return this.f60017a.a("desktop_red_badge_args", "");
    }

    public final long c() {
        return this.f60017a.a("red_badge_last_request_time");
    }

    public final int d() {
        return this.f60017a.a("red_badge_next_query_interval", 600);
    }

    public final String e() {
        return this.f60017a.a("red_badge_last_time_paras", "");
    }

    public final String f() {
        return this.f60017a.a("red_badge_last_last_time_paras", "");
    }

    public final int g() {
        return this.f60017a.a("red_badge_launch_times", 0);
    }

    public final int h() {
        return this.f60017a.a("red_badge_show_times", 0);
    }

    public final boolean a() {
        return this.f60017a.a("is_desktop_red_badge_show", false);
    }

    public final void a(int i2) {
        this.f60017a.a().a("red_badge_next_query_interval", i2).a();
    }

    private a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f60018c = applicationContext;
        this.f60017a = PushMultiProcessSharedProvider.a(applicationContext);
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            MethodCollector.i(111);
            if (f60016b == null) {
                f60016b = new a(context);
            }
            aVar = f60016b;
            MethodCollector.o(111);
        }
        return aVar;
    }

    public final void b(int i2) {
        this.f60017a.a().a("red_badge_launch_times", i2).a();
    }

    public final void c(int i2) {
        this.f60017a.a().a("red_badge_show_times", i2).a();
    }

    public final void d(String str) {
        this.f60017a.a().a("rom", str).a();
    }

    public final void e(String str) {
        this.f60017a.a().a("red_badge_last_valid_response", str).a();
    }

    public final void a(long j2) {
        this.f60017a.a().a("red_badge_last_request_time", j2).a();
    }

    public final void b(String str) {
        this.f60017a.a().a("red_badge_last_last_time_paras", str).a();
    }

    public final void c(String str) {
        this.f60017a.a().a("session_key", str).a();
    }

    public final void a(String str) {
        this.f60017a.a().a("red_badge_last_time_paras", str).a();
    }
}
