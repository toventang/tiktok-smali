package ms.bd.o;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.k;
import com.ss.ugc.effectplatform.b.a.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class k extends j {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.framwork.core.sdkmonitor.k f159513a;

    class a implements k.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f159514a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f159515b;

        static {
            Covode.recordClassIndex(105919);
        }

        a(JSONObject jSONObject, String str) {
            this.f159514a = jSONObject;
            this.f159515b = str;
        }

        @Override // com.bytedance.framwork.core.sdkmonitor.k.a
        public final String a() {
            return null;
        }

        @Override // com.bytedance.framwork.core.sdkmonitor.k.a
        public final Map<String, String> b() {
            Object obj;
            MethodCollector.i(8739);
            HashMap hashMap = new HashMap();
            try {
                Object a2 = h.a(16777217, 0, 0, "c9c63f", new byte[]{125, 45, 21, 80, 31, 116, 97});
                if (this.f159514a.getBoolean((String) h.a(16777217, 0, 0, "c21dcc", new byte[]{125, 38, 71, 2, 79, 113, 97}))) {
                    obj = h.a(16777217, 0, 0, "bcdf0a", new byte[]{34});
                } else {
                    obj = h.a(16777217, 0, 0, "6d6527", new byte[]{119});
                }
                hashMap.put(a2, obj);
            } catch (JSONException unused) {
                h.a(16777217, 0, 0, "976f54", new byte[]{59, 48, 72, 45, e.f153515b, 48});
            }
            hashMap.put(h.a(16777217, 0, 0, "baada6", new byte[]{123, 108, 1, 4, 97, 32, 104, 68}), this.f159515b);
            MethodCollector.o(8739);
            return hashMap;
        }
    }

    static {
        Covode.recordClassIndex(105918);
    }

    @Override // ms.bd.o.j
    public final void a(long j2, long j3, String str, String str2, String str3, int i2) {
        com.bytedance.framwork.core.sdkmonitor.k kVar = this.f159513a;
        if (kVar != null) {
            kVar.a(j2, j3, str, str2, str3, i2, (JSONObject) null);
        }
    }

    @Override // ms.bd.o.j
    public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (this.f159513a != null) {
            if (jSONObject.length() > 0 || jSONObject2.length() > 0) {
                this.f159513a.a(str, jSONObject, jSONObject2, jSONObject3);
            }
        }
    }

    @Override // ms.bd.o.j
    public final void b(long j2, long j3, String str, String str2, String str3, int i2) {
        com.bytedance.framwork.core.sdkmonitor.k kVar = this.f159513a;
        if (kVar != null) {
            kVar.b(j2, j3, str, str2, str3, i2, (JSONObject) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    @Override // ms.bd.o.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r29) {
        /*
        // Method dump skipped, instructions count: 467
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.k.a(java.lang.String):boolean");
    }
}
