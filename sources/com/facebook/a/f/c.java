package com.facebook.a.f;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.GraphRequest;
import com.facebook.a.e.e;
import com.facebook.a.i.d;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.internal.o;
import com.facebook.internal.p;
import com.facebook.m;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, b> f46777a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Integer f46778b = 259200000;

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f46779c = Arrays.asList("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* renamed from: d  reason: collision with root package name */
    private static final List<String> f46780d = Arrays.asList("none", "address", "health");

    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        public final String toKey() {
            int i2 = AnonymousClass4.f46781a[ordinal()];
            if (i2 == 1) {
                return "integrity_detect";
            }
            if (i2 != 2) {
                return "Unknown";
            }
            return "app_event_pred";
        }

        public final String toUseCase() {
            int i2 = AnonymousClass4.f46781a[ordinal()];
            if (i2 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i2 != 2) {
                return null;
            }
            return "MTML_APP_EVENT_PRED";
        }

        static {
            Covode.recordClassIndex(28499);
        }
    }

    static /* synthetic */ JSONObject a() {
        if (com.facebook.internal.a.b.a.a(c.class)) {
            return null;
        }
        try {
            return c();
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, c.class);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.a.f.c$4  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f46781a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 28498(0x6f52, float:3.9934E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.a.f.c$a[] r0 = com.facebook.a.f.c.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.a.f.c.AnonymousClass4.f46781a = r2
                com.facebook.a.f.c$a r0 = com.facebook.a.f.c.a.MTML_INTEGRITY_DETECT     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.a.f.c.AnonymousClass4.f46781a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.a.f.c$a r0 = com.facebook.a.f.c.a.MTML_APP_EVENT_PREDICTION     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.a.f.c.AnonymousClass4.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(28494);
    }

    private static boolean d() {
        if (com.facebook.internal.a.b.a.a(c.class)) {
            return false;
        }
        try {
            Locale c2 = ad.c();
            if (c2 == null) {
                return true;
            }
            if (c2.getLanguage().contains("en")) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, c.class);
            return false;
        }
    }

    private static JSONObject c() {
        if (com.facebook.internal.a.b.a.a(c.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            ae.a();
            GraphRequest a2 = GraphRequest.a(com.a.a("%s/model_asset", new Object[]{m.f48915a}));
            a2.n = true;
            a2.f46548j = bundle;
            JSONObject jSONObject = GraphRequest.a(a2).f49017b;
            if (jSONObject == null) {
                return null;
            }
            return b(jSONObject);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, c.class);
            return null;
        }
    }

    static /* synthetic */ void b() {
        if (!com.facebook.internal.a.b.a.a(c.class)) {
            try {
                if (!com.facebook.internal.a.b.a.a(c.class)) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        String str = null;
                        int i2 = 0;
                        for (Map.Entry<String, b> entry : f46777a.entrySet()) {
                            String key = entry.getKey();
                            if (key.equals(a.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                                b value = entry.getValue();
                                str = value.f46784b;
                                i2 = Math.max(i2, value.f46786d);
                                if (o.a(o.b.SuggestedEvents) && d()) {
                                    value.f46790h = new Runnable() {
                                        /* class com.facebook.a.f.c.AnonymousClass2 */

                                        static {
                                            Covode.recordClassIndex(28496);
                                        }

                                        public final void run() {
                                            if (!com.facebook.internal.a.b.a.a(this)) {
                                                try {
                                                    d.a();
                                                } catch (Throwable th) {
                                                    com.facebook.internal.a.b.a.a(th, this);
                                                }
                                            }
                                        }
                                    };
                                    arrayList.add(value);
                                }
                            }
                            if (key.equals(a.MTML_INTEGRITY_DETECT.toUseCase())) {
                                b value2 = entry.getValue();
                                str = value2.f46784b;
                                i2 = Math.max(i2, value2.f46786d);
                                if (o.a(o.b.IntelligentIntegrity)) {
                                    value2.f46790h = new Runnable() {
                                        /* class com.facebook.a.f.c.AnonymousClass3 */

                                        static {
                                            Covode.recordClassIndex(28497);
                                        }

                                        public final void run() {
                                            if (!com.facebook.internal.a.b.a.a(this)) {
                                                try {
                                                    if (!com.facebook.internal.a.b.a.a(com.facebook.a.d.a.class)) {
                                                        try {
                                                            com.facebook.a.d.a.f46693a = true;
                                                            ae.a();
                                                            com.facebook.a.d.a.f46694b = p.a("FBSDKFeatureIntegritySample", m.f48915a, false);
                                                        } catch (Throwable th) {
                                                            com.facebook.internal.a.b.a.a(th, com.facebook.a.d.a.class);
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    com.facebook.internal.a.b.a.a(th2, this);
                                                }
                                            }
                                        }
                                    };
                                    arrayList.add(value2);
                                }
                            }
                        }
                        if (!(str == null || i2 <= 0 || arrayList.isEmpty())) {
                            b bVar = new b("MTML", str, null, i2, null);
                            b.a(bVar.f46783a, bVar.f46786d);
                            b.a(bVar.f46784b, bVar.f46783a + "_" + bVar.f46786d, new e.a(arrayList) {
                                /* class com.facebook.a.f.c.b.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ List f46791a;

                                static {
                                    Covode.recordClassIndex(28501);
                                }

                                {
                                    this.f46791a = r1;
                                }

                                @Override // com.facebook.a.e.e.a
                                public final void a(File file) {
                                    final b a2 = b.a(file);
                                    if (a2 != null) {
                                        for (final b bVar : this.f46791a) {
                                            b.a(bVar.f46785c, bVar.f46783a + "_" + bVar.f46786d + "_rule", new e.a() {
                                                /* class com.facebook.a.f.c.b.AnonymousClass1.AnonymousClass1 */

                                                static {
                                                    Covode.recordClassIndex(28502);
                                                }

                                                @Override // com.facebook.a.e.e.a
                                                public final void a(File file) {
                                                    bVar.f46789g = a2;
                                                    bVar.f46788f = file;
                                                    if (bVar.f46790h != null) {
                                                        bVar.f46790h.run();
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                            });
                        }
                    } catch (Throwable th) {
                        com.facebook.internal.a.b.a.a(th, c.class);
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.a.b.a.a(th2, c.class);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        String f46783a;

        /* renamed from: b  reason: collision with root package name */
        String f46784b;

        /* renamed from: c  reason: collision with root package name */
        String f46785c;

        /* renamed from: d  reason: collision with root package name */
        int f46786d;

        /* renamed from: e  reason: collision with root package name */
        float[] f46787e;

        /* renamed from: f  reason: collision with root package name */
        File f46788f;

        /* renamed from: g  reason: collision with root package name */
        b f46789g;

        /* renamed from: h  reason: collision with root package name */
        public Runnable f46790h;

        static {
            Covode.recordClassIndex(28500);
        }

        static b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                return new b(jSONObject.getString("use_case"), jSONObject.getString("asset_uri"), jSONObject.optString("rules_uri", null), jSONObject.getInt("version_id"), c.a(jSONObject.getJSONArray("thresholds")));
            } catch (Exception unused) {
                return null;
            }
        }

        private static boolean a(File file) {
            MethodCollector.i(41);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
                }
                if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                    MethodCollector.o(41);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(41);
            return delete;
        }

        static void a(String str, int i2) {
            File[] listFiles;
            File a2 = e.a();
            if (!(a2 == null || (listFiles = a2.listFiles()) == null || listFiles.length == 0)) {
                String str2 = str + "_" + i2;
                for (File file : listFiles) {
                    String name = file.getName();
                    if (name.startsWith(str) && !name.startsWith(str2)) {
                        a(file);
                    }
                }
            }
        }

        public static void a(String str, String str2, e.a aVar) {
            File file = new File(e.a(), str2);
            if (str == null || file.exists()) {
                aVar.a(file);
            } else {
                new com.facebook.a.e.e(str, file, aVar).execute(new String[0]);
            }
        }

        b(String str, String str2, String str3, int i2, float[] fArr) {
            this.f46783a = str;
            this.f46784b = str2;
            this.f46785c = str3;
            this.f46786d = i2;
            this.f46787e = fArr;
        }
    }

    public static File a(a aVar) {
        if (com.facebook.internal.a.b.a.a(c.class)) {
            return null;
        }
        try {
            b bVar = f46777a.get(aVar.toUseCase());
            if (bVar == null) {
                return null;
            }
            return bVar.f46788f;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, c.class);
            return null;
        }
    }

    private static boolean b(long j2) {
        if (com.facebook.internal.a.b.a.a(c.class) || j2 == 0) {
            return false;
        }
        try {
            if (System.currentTimeMillis() - j2 < ((long) f46778b.intValue())) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, c.class);
            return false;
        }
    }

    static /* synthetic */ void a(JSONObject jSONObject) {
        if (!com.facebook.internal.a.b.a.a(c.class)) {
            try {
                if (!com.facebook.internal.a.b.a.a(c.class)) {
                    try {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            try {
                                b a2 = b.a(jSONObject.getJSONObject(keys.next()));
                                if (a2 != null) {
                                    f46777a.put(a2.f46783a, a2);
                                }
                            } catch (JSONException unused) {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        com.facebook.internal.a.b.a.a(th, c.class);
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.a.b.a.a(th2, c.class);
            }
        }
    }

    private static JSONObject b(JSONObject jSONObject) {
        if (com.facebook.internal.a.b.a.a(c.class)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, c.class);
            return null;
        }
    }

    static /* synthetic */ boolean a(long j2) {
        if (com.facebook.internal.a.b.a.a(c.class)) {
            return false;
        }
        try {
            return b(j2);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, c.class);
            return false;
        }
    }

    static /* synthetic */ float[] a(JSONArray jSONArray) {
        if (com.facebook.internal.a.b.a.a(c.class)) {
            return null;
        }
        try {
            return b(jSONArray);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, c.class);
            return null;
        }
    }

    private static float[] b(JSONArray jSONArray) {
        if (com.facebook.internal.a.b.a.a(c.class) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    fArr[i2] = Float.parseFloat(jSONArray.getString(i2));
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, c.class);
            return null;
        }
    }

    private static String[] a(a aVar, float[] fArr) {
        if (com.facebook.internal.a.b.a.a(c.class)) {
            return null;
        }
        try {
            int i2 = aVar.f46763b[0];
            int i3 = aVar.f46763b[1];
            float[] fArr2 = aVar.f46762a;
            String[] strArr = new String[i2];
            if (i3 != fArr.length) {
                return null;
            }
            for (int i4 = 0; i4 < i2; i4++) {
                strArr[i4] = "other";
                for (int i5 = 0; i5 < fArr.length; i5++) {
                    if (fArr2[(i4 * i3) + i5] >= fArr[i5]) {
                        strArr[i4] = f46779c.get(i5);
                    }
                }
            }
            return strArr;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, c.class);
            return null;
        }
    }

    private static String[] b(a aVar, float[] fArr) {
        if (com.facebook.internal.a.b.a.a(c.class)) {
            return null;
        }
        try {
            int i2 = aVar.f46763b[0];
            int i3 = aVar.f46763b[1];
            float[] fArr2 = aVar.f46762a;
            String[] strArr = new String[i2];
            if (i3 != fArr.length) {
                return null;
            }
            for (int i4 = 0; i4 < i2; i4++) {
                strArr[i4] = "none";
                for (int i5 = 0; i5 < fArr.length; i5++) {
                    if (fArr2[(i4 * i3) + i5] >= fArr[i5]) {
                        strArr[i4] = f46780d.get(i5);
                    }
                }
            }
            return strArr;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, c.class);
            return null;
        }
    }

    public static String[] a(a aVar, float[][] fArr, String[] strArr) {
        if (com.facebook.internal.a.b.a.a(c.class)) {
            return null;
        }
        try {
            b bVar = f46777a.get(aVar.toUseCase());
            if (bVar != null) {
                if (bVar.f46789g != null) {
                    int length = fArr[0].length;
                    a aVar2 = new a(new int[]{1, length});
                    for (int i2 = 0; i2 <= 0; i2++) {
                        System.arraycopy(fArr[0], 0, aVar2.f46762a, length * 0, length);
                    }
                    a a2 = bVar.f46789g.a(aVar2, strArr, aVar.toKey());
                    float[] fArr2 = bVar.f46787e;
                    if (!(a2 == null || fArr2 == null || a2.f46762a.length == 0)) {
                        if (fArr2.length != 0) {
                            int i3 = AnonymousClass4.f46781a[aVar.ordinal()];
                            if (i3 == 1) {
                                return b(a2, fArr2);
                            }
                            if (i3 != 2) {
                                return null;
                            }
                            return a(a2, fArr2);
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, c.class);
            return null;
        }
    }
}
