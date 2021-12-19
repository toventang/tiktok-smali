package com.ss.android.ugc.aweme.inbox.d;

import android.os.SystemClock;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.api.count.NoticeCountService;
import com.ss.android.ugc.aweme.notice.api.services.b;
import com.ss.android.ugc.aweme.notification.service.NoticeCountServiceImpl;
import h.a.ag;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static long f104103a;

    /* renamed from: b  reason: collision with root package name */
    public static long f104104b;

    /* renamed from: c  reason: collision with root package name */
    public static final d f104105c = new d();

    /* renamed from: d  reason: collision with root package name */
    private static int f104106d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f104107e;

    private d() {
    }

    static {
        Covode.recordClassIndex(66664);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f104108a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f104109b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f104110c;

        static {
            Covode.recordClassIndex(66665);
        }

        a(long j2, int i2, long j3) {
            this.f104108a = j2;
            this.f104109b = i2;
            this.f104110c = j3;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i2;
            if (f.a("inbox_badge_perf", 0.15f)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("latency", this.f104108a);
                    jSONObject.put("unread_count", this.f104109b);
                    jSONObject.put("popup_latency", this.f104110c);
                    NoticeCountService d2 = NoticeCountServiceImpl.d();
                    l.b(d2, "");
                    Map<Integer, Integer> c2 = d2.c();
                    jSONObject.put("unread_map", c2.toString());
                    boolean containsKey = c2.containsKey(99);
                    Map d3 = ag.d(c2);
                    d3.remove(99);
                    if (d3.size() > 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    if (containsKey) {
                        i2 |= 2;
                    }
                    q.m223constructorimpl(jSONObject.put("unread_type", i2));
                } catch (Throwable th) {
                    q.m223constructorimpl(r.a(th));
                }
                com.ss.android.ugc.aweme.common.r.a("inbox_badge_perf", jSONObject);
            }
            return z.f158842a;
        }
    }

    public static void a(int i2) {
        f104106d = i2;
        b.f112773a.a(i2);
        if (!f104107e) {
            f104107e = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            long j2 = f104103a;
            long j3 = uptimeMillis - j2;
            long j4 = f104104b;
            long j5 = 0;
            if (j4 != 0) {
                j5 = j4 - j2;
            }
            a(i2, j3, j5);
        }
    }

    private static i<z> a(int i2, long j2, long j3) {
        return i.b(new a(j2, i2, j3), i.f4824a);
    }
}
