package dmt.av.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import h.f.b.l;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f156976a = new x();

    private x() {
    }

    static {
        Covode.recordClassIndex(104254);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047 A[Catch:{ JSONException -> 0x0059 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String a(java.lang.String r9) {
        /*
            java.lang.String r0 = ""
            h.f.b.l.d(r9, r0)
            r8 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0059 }
            r1.<init>(r9)     // Catch:{ JSONException -> 0x0059 }
            java.lang.String r0 = "setting"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch:{ JSONException -> 0x0059 }
            if (r1 == 0) goto L_0x0059
            java.lang.String r0 = "effect_adjust_params"
            org.json.JSONArray r7 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x0059 }
            if (r7 != 0) goto L_0x001c
            goto L_0x0059
        L_0x001c:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0059 }
            r6.<init>()     // Catch:{ JSONException -> 0x0059 }
            int r5 = r7.length()     // Catch:{ JSONException -> 0x0059 }
            r0 = 0
            r4 = 0
        L_0x0027:
            if (r4 >= r5) goto L_0x0054
            org.json.JSONObject r1 = r7.getJSONObject(r4)     // Catch:{ JSONException -> 0x0059 }
            java.lang.String r0 = "effect_key"
            java.lang.String r3 = r1.optString(r0)     // Catch:{ JSONException -> 0x0059 }
            java.lang.String r0 = "default"
            double r1 = r1.optDouble(r0)     // Catch:{ JSONException -> 0x0059 }
            if (r3 == 0) goto L_0x0044
            int r0 = r3.length()     // Catch:{ JSONException -> 0x0059 }
            if (r0 != 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r0 = 0
            goto L_0x0045
        L_0x0044:
            r0 = 1
        L_0x0045:
            if (r0 != 0) goto L_0x0051
            boolean r0 = java.lang.Double.isNaN(r1)     // Catch:{ JSONException -> 0x0059 }
            if (r0 == 0) goto L_0x004e
            goto L_0x0051
        L_0x004e:
            r6.put(r3, r1)     // Catch:{ JSONException -> 0x0059 }
        L_0x0051:
            int r4 = r4 + 1
            goto L_0x0027
        L_0x0054:
            java.lang.String r0 = r6.toString()     // Catch:{ JSONException -> 0x0059 }
            return r0
        L_0x0059:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.x.a(java.lang.String):java.lang.String");
    }

    public static final void a(g gVar, p pVar) {
        l.d(gVar, "");
        l.d(pVar, "");
        pVar.f156925a = gVar.a(new int[]{(int) pVar.f156927c}, new int[]{(int) pVar.f156928d}, new String[]{pVar.f156934j}, new int[]{0}, new int[]{0}, new String[]{pVar.o});
    }

    public static final void a(g gVar, p pVar, VEBaseFilterParam vEBaseFilterParam) {
        l.d(gVar, "");
        l.d(pVar, "");
        l.d(vEBaseFilterParam, "");
        pVar.f156925a = new int[]{gVar.a(0, vEBaseFilterParam, (int) pVar.f156927c, (int) pVar.f156928d)};
        gVar.a(pVar.f156925a[0], vEBaseFilterParam);
        gVar.a(pVar.f156925a[0], (int) pVar.f156927c, (int) pVar.f156928d);
    }
}
