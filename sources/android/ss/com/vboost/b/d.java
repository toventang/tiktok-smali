package android.ss.com.vboost.b;

import android.content.Context;
import android.ss.com.vboost.b.e;
import android.ss.com.vboost.e.a;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static c f408a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f409b = d.class.getSimpleName();

    public static void a() {
        f408a.b();
    }

    static {
        Covode.recordClassIndex(16);
    }

    /* renamed from: android.ss.com.vboost.b.d$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f410a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 17
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                android.ss.com.vboost.b.e$a[] r0 = android.ss.com.vboost.b.e.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                android.ss.com.vboost.b.d.AnonymousClass1.f410a = r2
                android.ss.com.vboost.b.e$a r0 = android.ss.com.vboost.b.e.a.MTK     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = android.ss.com.vboost.b.d.AnonymousClass1.f410a     // Catch:{ NoSuchFieldError -> 0x0022 }
                android.ss.com.vboost.b.e$a r0 = android.ss.com.vboost.b.e.a.QCOM     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = android.ss.com.vboost.b.d.AnonymousClass1.f410a     // Catch:{ NoSuchFieldError -> 0x002d }
                android.ss.com.vboost.b.e$a r0 = android.ss.com.vboost.b.e.a.CHRY     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.ss.com.vboost.b.d.AnonymousClass1.<clinit>():void");
        }
    }

    public static boolean a(Context context) {
        e.a a2 = e.a();
        if (a.a()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vboostPlatform", a2.name());
                a.a("vboost_event_launch", jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        int i2 = AnonymousClass1.f410a[a2.ordinal()];
        if (i2 == 1) {
            f408a = new f();
        } else if (i2 == 2) {
            f408a = new i();
        } else if (i2 == 3) {
            f408a = new b();
        }
        c cVar = f408a;
        if (cVar == null || !cVar.a(context)) {
            return false;
        }
        if (a.a()) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vboostPlatform", a2.name());
                a.a("vboost_event_active", jSONObject2);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        return true;
    }
}
