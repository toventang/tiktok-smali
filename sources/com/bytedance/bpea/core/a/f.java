package com.bytedance.bpea.core.a;

import com.bytedance.bpea.core.b.a;
import com.bytedance.bpea.core.c.b;
import com.bytedance.bpea.core.checker.a.d;
import com.bytedance.bpea.core.checker.a.g;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f26625a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final e f26626b = new e();

    /* renamed from: c  reason: collision with root package name */
    private static final e f26627c = new e();

    private f() {
    }

    static {
        Covode.recordClassIndex(15679);
    }

    public static void a(String str) {
        l.c(str, "");
        e eVar = f26626b;
        l.c(str, "");
        try {
            JSONObject jSONObject = new JSONObject(str);
            eVar.f26620a = jSONObject.optString("limitVersion");
            eVar.f26621b = jSONObject.optString("maxAppVersion");
            eVar.f26622c = jSONObject.optJSONObject("certToLimit");
            eVar.f26623d = jSONObject.optJSONObject("limitToCondition");
            eVar.f26624e = jSONObject.optJSONObject("conditions");
        } catch (Throwable unused) {
        }
    }

    public static a<List<com.bytedance.bpea.core.checker.a.a>> b(String str) {
        String str2 = "";
        l.c(str, str2);
        try {
            e eVar = f26626b;
            String a2 = eVar.a(str);
            boolean z = true;
            if (a2 == null || a2.length() == 0) {
                a2 = f26627c.a(str);
            }
            if (a2 != null) {
                if (a2.length() != 0) {
                    z = false;
                }
            }
            if (z) {
                return new a<>(-2101, null, null, 6);
            }
            if (l.a((Object) "-1", (Object) a2)) {
                l.c("current cert mapped downgrade limit named -1", str2);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new g());
                return new a<>(0, null, arrayList, 3);
            }
            JSONArray b2 = eVar.b(a2);
            if (b2 == null && (b2 = f26627c.b(a2)) == null) {
                return new a<>(-2102, null, null, 6);
            }
            ArrayList arrayList2 = new ArrayList();
            int length = b2.length();
            for (int i2 = 0; i2 < length; i2++) {
                String optString = b2.optString(i2);
                e eVar2 = f26626b;
                l.a((Object) optString, str2);
                JSONObject c2 = eVar2.c(optString);
                if (c2 == null && (c2 = f26627c.c(optString)) == null) {
                    return new a<>(-2103, null, null, 6);
                }
                com.bytedance.bpea.core.checker.a.a a3 = d.a(c2);
                if (a3 == null) {
                    return new a<>(-2104, null, null, 6);
                }
                arrayList2.add(a3);
            }
            return new a<>(0, null, arrayList2, 3);
        } catch (Throwable th) {
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage != null) {
                str2 = localizedMessage;
            }
            System.currentTimeMillis();
            b.a(str2);
            return new a<>(-1, th.getLocalizedMessage(), null, 4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c A[Catch:{ all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024 A[Catch:{ all -> 0x0091 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.bpea.core.b.a<java.util.List<com.bytedance.bpea.core.checker.a.a>> c(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bpea.core.a.f.c(java.lang.String):com.bytedance.bpea.core.b.a");
    }
}
