package com.bytedance.android.a.b.b.a;

import android.os.SystemClock;
import com.bytedance.android.a.b.a;
import com.bytedance.android.a.b.b;
import com.bytedance.android.a.b.b.a.e;
import com.bytedance.android.a.b.b.c;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class g extends a {
    static {
        Covode.recordClassIndex(3228);
    }

    g(a aVar) {
        super(aVar);
    }

    @Override // com.bytedance.android.a.b.b.a.e, com.bytedance.android.a.b.b.a.a
    public final c a(e.a aVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        c a2 = super.a(aVar);
        b.a().a(a2, SystemClock.uptimeMillis() - uptimeMillis);
        return a2;
    }

    private static JSONObject b(c cVar) {
        String str;
        Throwable th;
        JSONObject jSONObject = new JSONObject();
        if (cVar != null) {
            try {
                str = cVar.f6705b;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } else {
            str = "RESPONSE IS NULL";
        }
        jSONObject.putOpt("http_msg", str);
        if (!(cVar == null || (th = cVar.f6709f) == null)) {
            jSONObject.putOpt("http_err_class", th.getClass().getCanonicalName());
        }
        return jSONObject;
    }

    @Override // com.bytedance.android.a.b.b.a.a
    public final c a(c cVar) {
        if (!(cVar == null || cVar.f6708e == null)) {
            com.bytedance.android.a.b.b.b bVar = cVar.f6708e;
            com.bytedance.android.a.a.d.b bVar2 = bVar.f6699e;
            int i2 = cVar.f6704a;
            String str = bVar.f6696b;
            long j2 = cVar.f6707d;
            JSONObject b2 = b(cVar);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("track_url_list", str).put("track_status", i2).put("local_time_ms", j2).put("is_retry", bVar2.f6628j).putOpt("ad_extra_data", b2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            com.bytedance.android.a.a.h.b.a("track_url", bVar2, jSONObject);
        }
        return cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00eb A[Catch:{ all -> 0x013a }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f4 A[Catch:{ all -> 0x013a }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0105 A[Catch:{ all -> 0x013a }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x018f  */
    @Override // com.bytedance.android.a.b.b.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.a.b.b.b a(com.bytedance.android.a.b.b.b r12) {
        /*
        // Method dump skipped, instructions count: 412
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.a.b.b.a.g.a(com.bytedance.android.a.b.b.b):com.bytedance.android.a.b.b.b");
    }
}
