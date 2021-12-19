package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.logger.a;
import h.f.b.l;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class an {

    /* renamed from: a  reason: collision with root package name */
    public static long f142638a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static int f142639b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static final an f142640c = new an();

    /* renamed from: d  reason: collision with root package name */
    private static long f142641d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static String f142642e = "";

    /* renamed from: f  reason: collision with root package name */
    private static int f142643f;

    private an() {
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f142644a;

        static {
            Covode.recordClassIndex(93309);
        }

        a(JSONObject jSONObject) {
            this.f142644a = jSONObject;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            com.ss.android.common.c.a.a("push_first_frame", this.f142644a);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(93308);
    }

    public static final void a() {
        if (f142639b >= 0 && f142641d >= 0 && f142638a >= 0 && !TextUtils.isEmpty(f142642e)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_status", String.valueOf(f142639b));
            jSONObject.put("push_label", f142642e);
            jSONObject.put("push_cold_boost_user_cache", f142643f);
            long j2 = f142638a;
            long j3 = f142641d;
            if (j2 - j3 > 0) {
                jSONObject.put("push_total", String.valueOf(j2 - j3));
            }
            i.b(new a(jSONObject), i.f4824a);
        }
    }

    public static final void b(long j2, String str, int i2) {
        l.d(str, "");
        f142641d = j2;
        f142642e = str;
        f142643f = i2;
    }

    public static final void a(long j2, String str, int i2) {
        l.d(str, "");
        f142638a = j2;
        f142642e = str;
        f142643f = i2;
        f142639b = 1;
        f142641d = a.b.f109011a.f109007h;
        a();
    }
}
