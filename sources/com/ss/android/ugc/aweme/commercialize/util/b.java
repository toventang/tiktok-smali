package com.ss.android.ugc.aweme.commercialize.util;

import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f75463a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static long f75464b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static long f75465c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static long f75466d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static long f75467e = -1;

    /* renamed from: f  reason: collision with root package name */
    private static int f75468f = -1;

    /* renamed from: g  reason: collision with root package name */
    private static String f75469g = "";

    /* renamed from: h  reason: collision with root package name */
    private static AtomicBoolean f75470h = new AtomicBoolean(false);

    private b() {
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f75471a;

        static {
            Covode.recordClassIndex(46561);
        }

        a(JSONObject jSONObject) {
            this.f75471a = jSONObject;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            com.ss.android.common.c.a.a("adver_first_frame", this.f75471a);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(46560);
    }

    private static final void a() {
        if (!f75470h.getAndSet(true) && f75468f >= 0 && f75464b >= 0 && f75465c >= 0 && f75466d >= 0 && !TextUtils.isEmpty(f75469g)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adver_first_show_duration", String.valueOf(f75464b));
            long j2 = f75466d;
            long j3 = f75465c;
            if (j2 - j3 > 0) {
                jSONObject.put("adver_close_duration", String.valueOf(j2 - j3));
            }
            if (f75468f == 2) {
                long j4 = f75467e;
                long j5 = f75466d;
                if (j4 - j5 > 0 && j4 - j5 < 600000) {
                    jSONObject.put("feed_first_show_duration", String.valueOf(j4 - j5));
                }
            }
            jSONObject.put("adv_status", f75469g);
            jSONObject.put("adver_type", String.valueOf(f75468f));
            i.b(new a(jSONObject), i.f4824a);
        }
    }

    public static final void a(long j2) {
        if (f75468f == 2) {
            f75467e = j2;
            a();
        }
    }

    public static final void a(long j2, String str) {
        l.d(str, "");
        f75466d = j2;
        f75469g = str;
        if (f75468f == 1) {
            a();
        }
    }

    public static final void a(long j2, int i2, long j3) {
        f75464b = j2;
        f75468f = i2;
        f75465c = j3;
    }
}
