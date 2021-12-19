package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.Callable;

public final class MultiProcessMobEventTask implements w {
    static {
        Covode.recordClassIndex(69066);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107844a = new a();

        static {
            Covode.recordClassIndex(69067);
        }

        a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0040 A[Catch:{ Exception -> 0x0049 }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0046 A[SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r8 = this;
                java.lang.String r7 = "event_name"
                java.lang.String r6 = ""
                java.lang.String r3 = "[]"
                java.lang.String r2 = "event_list"
                com.bytedance.keva.Keva r0 = com.ss.android.ugc.aweme.feed.cache.k.a()     // Catch:{ Exception -> 0x0049 }
                java.lang.String r1 = r0.getString(r2, r3)     // Catch:{ Exception -> 0x0049 }
                h.f.b.l.b(r1, r6)     // Catch:{ Exception -> 0x0049 }
                com.bytedance.keva.Keva r0 = com.ss.android.ugc.aweme.feed.cache.k.a()     // Catch:{ Exception -> 0x0049 }
                r0.storeString(r2, r3)     // Catch:{ Exception -> 0x0049 }
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x0049 }
                r5.<init>(r1)     // Catch:{ Exception -> 0x0049 }
                int r4 = r5.length()     // Catch:{ Exception -> 0x0049 }
                r0 = 0
                r3 = 0
            L_0x0025:
                if (r3 >= r4) goto L_0x004d
                org.json.JSONObject r2 = r5.getJSONObject(r3)     // Catch:{ Exception -> 0x0049 }
                h.f.b.l.b(r2, r6)     // Catch:{ Exception -> 0x0049 }
                java.lang.String r1 = r2.optString(r7)     // Catch:{ Exception -> 0x0049 }
                if (r1 == 0) goto L_0x003d
                int r0 = r1.length()     // Catch:{ Exception -> 0x0049 }
                if (r0 != 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r0 = 0
                goto L_0x003e
            L_0x003d:
                r0 = 1
            L_0x003e:
                if (r0 != 0) goto L_0x0046
                r2.remove(r7)     // Catch:{ Exception -> 0x0049 }
                com.ss.android.ugc.aweme.common.r.a(r1, r2)     // Catch:{ Exception -> 0x0049 }
            L_0x0046:
                int r3 = r3 + 1
                goto L_0x0025
            L_0x0049:
                r0 = move-exception
                r0.printStackTrace()
            L_0x004d:
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.MultiProcessMobEventTask.a.call():java.lang.Object");
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.d(context, "");
        i.b(a.f107844a, i.f4824a);
    }
}
