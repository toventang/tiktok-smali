package com.bytedance.ies.ugc.statisticlogger;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.i.d;
import f.a.l.c;
import f.a.l.g;
import h.f.b.l;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final g<c> f35344a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile String f35345b;

    /* renamed from: c  reason: collision with root package name */
    static volatile long f35346c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f35347d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final e f35348e = new e();

    public static final class a implements AppLog.h {
        static {
            Covode.recordClassIndex(21165);
        }

        a() {
        }

        @Override // com.ss.android.common.applog.AppLog.h
        public final void a(long j2) {
            e.f35344a.onNext(new c(d.Start, j2));
            e.f35346c = j2;
        }

        @Override // com.ss.android.common.applog.AppLog.h
        public final void b(long j2, String str, JSONObject jSONObject) {
            e.f35344a.onNext(new c(d.End, j2, str, jSONObject));
        }

        @Override // com.ss.android.common.applog.AppLog.h
        public final void a(long j2, String str, JSONObject jSONObject) {
            e.f35345b = str;
            e.f35344a.onNext(new c(d.LogSessionBatch, j2, str, jSONObject));
        }
    }

    private e() {
    }

    static {
        Covode.recordClassIndex(21164);
        g<c> j2 = new c().j();
        l.b(j2, "");
        f35344a = j2;
    }

    public static void a(Activity activity) {
        l.d(activity, "");
        if (!f.f35349a) {
            f.f35350b = new WeakReference<>(activity);
        } else {
            d.a.f59589a.a(activity);
        }
    }

    public static void b(Activity activity) {
        l.d(activity, "");
        if (d.a.f59589a.f59582b.get()) {
            AppLog.onPause(activity);
        }
    }
}
