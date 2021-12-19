package com.ss.android.account.share.data.read;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashSet;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static Context f58220a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f58221b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static Handler f58222c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private static boolean f58223d;

    /* renamed from: e  reason: collision with root package name */
    private static HashSet<String> f58224e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private static Runnable f58225f = a.f58226a;

    private b() {
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f58226a = new a();

        static {
            Covode.recordClassIndex(36182);
        }

        a() {
        }

        public final void run() {
            com.ss.android.account.share.data.a.a().a("share_sdk_read_time_out").b();
            b.a(new a("", false, "time out", 8, (byte) 0));
        }
    }

    static {
        Covode.recordClassIndex(36181);
    }

    public static void a(a aVar) {
        l.c(aVar, "");
        if (!f58223d) {
            f58224e.remove(aVar.f58216c);
            if (aVar.f58217d && !TextUtils.isEmpty(aVar.f58215b)) {
                b(aVar);
            } else if (TextUtils.isEmpty(aVar.f58216c)) {
                b(aVar);
            } else if (f58224e.isEmpty()) {
                b(aVar);
            }
        }
    }

    private static void b(a aVar) {
        l.c(aVar, "");
        f58223d = true;
        f58222c.removeCallbacks(f58225f);
        com.ss.android.account.share.data.a.a().a("share_sdk_read_result").a("is_succ", Boolean.valueOf(aVar.f58217d)).a("err_msg", aVar.f58218e).a("query_type", Integer.valueOf(aVar.f58219f)).a("pkg_name", aVar.f58216c).b();
    }
}
