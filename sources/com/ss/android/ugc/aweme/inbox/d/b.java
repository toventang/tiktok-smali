package com.ss.android.ugc.aweme.inbox.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.q;
import h.r;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final i f104095a = i.f104179c;

    /* renamed from: b  reason: collision with root package name */
    public final i f104096b = i.f104179c;

    /* renamed from: c  reason: collision with root package name */
    public final i f104097c = i.f104179c;

    /* renamed from: d  reason: collision with root package name */
    public final i f104098d = i.f104179c;

    /* renamed from: e  reason: collision with root package name */
    public final i f104099e = i.f104179c;

    /* renamed from: f  reason: collision with root package name */
    public final i f104100f = i.f104179c;

    /* renamed from: g  reason: collision with root package name */
    public final i f104101g = i.f104179c;

    static {
        Covode.recordClassIndex(66662);
    }

    public final void a(JSONObject jSONObject) {
        l.d(jSONObject, "");
        try {
            jSONObject.put("life_attach", this.f104095a.a());
            jSONObject.put("life_create", this.f104096b.a());
            jSONObject.put("life_create_view", this.f104097c.a());
            jSONObject.put("life_view_created", this.f104098d.a());
            jSONObject.put("life_activity_created", this.f104099e.a());
            jSONObject.put("life_start", this.f104100f.a());
            q.m223constructorimpl(jSONObject.put("life_resume", this.f104101g.a()));
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T a(com.ss.android.ugc.aweme.inbox.d.a r5, h.f.a.a<? extends T> r6) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r5, r0)
            h.f.b.l.d(r6, r0)
            int[] r1 = com.ss.android.ugc.aweme.inbox.d.c.f104102a
            int r0 = r5.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x0033;
                case 2: goto L_0x0030;
                case 3: goto L_0x002d;
                case 4: goto L_0x002a;
                case 5: goto L_0x0027;
                case 6: goto L_0x0024;
                case 7: goto L_0x0021;
                default: goto L_0x0013;
            }
        L_0x0013:
            r3 = 0
        L_0x0014:
            java.lang.Object r2 = r6.invoke()
            if (r3 == 0) goto L_0x0020
            long r0 = android.os.SystemClock.uptimeMillis()
            r3.f104182b = r0
        L_0x0020:
            return r2
        L_0x0021:
            com.ss.android.ugc.aweme.inbox.d.i r3 = r4.f104101g
            goto L_0x0035
        L_0x0024:
            com.ss.android.ugc.aweme.inbox.d.i r3 = r4.f104100f
            goto L_0x0035
        L_0x0027:
            com.ss.android.ugc.aweme.inbox.d.i r3 = r4.f104099e
            goto L_0x0035
        L_0x002a:
            com.ss.android.ugc.aweme.inbox.d.i r3 = r4.f104098d
            goto L_0x0035
        L_0x002d:
            com.ss.android.ugc.aweme.inbox.d.i r3 = r4.f104097c
            goto L_0x0035
        L_0x0030:
            com.ss.android.ugc.aweme.inbox.d.i r3 = r4.f104096b
            goto L_0x0035
        L_0x0033:
            com.ss.android.ugc.aweme.inbox.d.i r3 = r4.f104095a
        L_0x0035:
            if (r3 == 0) goto L_0x0014
            long r0 = android.os.SystemClock.uptimeMillis()
            r3.f104181a = r0
            goto L_0x0014
            switch-data {1->0x0033, 2->0x0030, 3->0x002d, 4->0x002a, 5->0x0027, 6->0x0024, 7->0x0021, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.d.b.a(com.ss.android.ugc.aweme.inbox.d.a, h.f.a.a):java.lang.Object");
    }
}
