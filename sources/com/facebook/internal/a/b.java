package com.facebook.internal.a;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.ad;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Long f48492a;

    /* renamed from: b  reason: collision with root package name */
    private String f48493b;

    /* renamed from: c  reason: collision with root package name */
    private EnumC1185b f48494c;

    /* renamed from: d  reason: collision with root package name */
    private JSONArray f48495d;

    /* renamed from: e  reason: collision with root package name */
    private String f48496e;

    /* renamed from: f  reason: collision with root package name */
    private String f48497f;

    /* renamed from: g  reason: collision with root package name */
    private String f48498g;

    static {
        Covode.recordClassIndex(29246);
    }

    public final void c() {
        d.b(this.f48493b);
    }

    private JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f48495d;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l2 = this.f48492a;
            if (l2 != null) {
                jSONObject.put("timestamp", l2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void b() {
        if (a()) {
            d.a(this.f48493b, toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.internal.a.b$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f48499a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 29247(0x723f, float:4.0984E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.internal.a.b$b[] r0 = com.facebook.internal.a.b.EnumC1185b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.internal.a.b.AnonymousClass1.f48499a = r2
                com.facebook.internal.a.b$b r0 = com.facebook.internal.a.b.EnumC1185b.Analysis     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.internal.a.b.AnonymousClass1.f48499a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.internal.a.b$b r0 = com.facebook.internal.a.b.EnumC1185b.CrashReport     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.internal.a.b.AnonymousClass1.f48499a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.internal.a.b$b r0 = com.facebook.internal.a.b.EnumC1185b.CrashShield     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.facebook.internal.a.b.AnonymousClass1.f48499a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.facebook.internal.a.b$b r0 = com.facebook.internal.a.b.EnumC1185b.ThreadCheck     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.a.b.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.internal.a.b$b  reason: collision with other inner class name */
    public enum EnumC1185b {
        Unknown,
        Analysis,
        CrashReport,
        CrashShield,
        ThreadCheck;

        public final String getLogPrefix() {
            int i2 = AnonymousClass1.f48499a[ordinal()];
            if (i2 == 1) {
                return "analysis_log_";
            }
            if (i2 == 2) {
                return "crash_log_";
            }
            if (i2 == 3) {
                return "shield_log_";
            }
            if (i2 != 4) {
                return "Unknown";
            }
            return "thread_check_log_";
        }

        public final String toString() {
            int i2 = AnonymousClass1.f48499a[ordinal()];
            if (i2 == 1) {
                return "Analysis";
            }
            if (i2 == 2) {
                return "CrashReport";
            }
            if (i2 == 3) {
                return "CrashShield";
            }
            if (i2 != 4) {
                return "Unknown";
            }
            return "ThreadCheck";
        }

        static {
            Covode.recordClassIndex(29249);
        }
    }

    public final boolean a() {
        int i2 = AnonymousClass1.f48499a[this.f48494c.ordinal()];
        if (i2 != 1) {
            if ((i2 != 2 && i2 != 3 && i2 != 4) || this.f48498g == null || this.f48492a == null) {
                return false;
            }
            return true;
        } else if (this.f48495d == null || this.f48492a == null) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r3 = this;
            int[] r1 = com.facebook.internal.a.b.AnonymousClass1.f48499a
            com.facebook.internal.a.b$b r0 = r3.f48494c
            int r0 = r0.ordinal()
            r2 = r1[r0]
            r0 = 1
            r1 = 0
            if (r2 == r0) goto L_0x001d
            r0 = 2
            if (r2 == r0) goto L_0x0018
            r0 = 3
            if (r2 == r0) goto L_0x0018
            r0 = 4
            if (r2 == r0) goto L_0x0018
        L_0x0017:
            return r1
        L_0x0018:
            org.json.JSONObject r0 = r3.e()
            goto L_0x0021
        L_0x001d:
            org.json.JSONObject r0 = r3.d()
        L_0x0021:
            if (r0 != 0) goto L_0x0024
            goto L_0x0017
        L_0x0024:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.a.b.toString():java.lang.String");
    }

    private JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f48496e;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l2 = this.f48492a;
            if (l2 != null) {
                jSONObject.put("timestamp", l2);
            }
            String str2 = this.f48497f;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f48498g;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            EnumC1185b bVar = this.f48494c;
            if (bVar != null) {
                jSONObject.put(StringSet.type, bVar);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static class a {
        static {
            Covode.recordClassIndex(29248);
        }

        public static b a(File file) {
            return new b(file, (byte) 0);
        }

        public static b a(Throwable th, EnumC1185b bVar) {
            return new b(th, bVar, (byte) 0);
        }
    }

    private b(JSONArray jSONArray) {
        this.f48494c = EnumC1185b.Analysis;
        this.f48492a = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f48495d = jSONArray;
        this.f48493b = new StringBuffer("analysis_log_").append(this.f48492a.toString()).append(".json").toString();
    }

    private b(File file) {
        EnumC1185b bVar;
        String name = file.getName();
        this.f48493b = name;
        if (name.startsWith("crash_log_")) {
            bVar = EnumC1185b.CrashReport;
        } else if (name.startsWith("shield_log_")) {
            bVar = EnumC1185b.CrashShield;
        } else if (name.startsWith("thread_check_log_")) {
            bVar = EnumC1185b.ThreadCheck;
        } else if (name.startsWith("analysis_log_")) {
            bVar = EnumC1185b.Analysis;
        } else {
            bVar = EnumC1185b.Unknown;
        }
        this.f48494c = bVar;
        JSONObject a2 = d.a(this.f48493b);
        if (a2 != null) {
            this.f48492a = Long.valueOf(a2.optLong("timestamp", 0));
            this.f48496e = a2.optString("app_version", null);
            this.f48497f = a2.optString("reason", null);
            this.f48498g = a2.optString("callstack", null);
            this.f48495d = a2.optJSONArray("feature_names");
        }
    }

    /* synthetic */ b(File file, byte b2) {
        this(file);
    }

    /* synthetic */ b(JSONArray jSONArray, byte b2) {
        this(jSONArray);
    }

    private b(Throwable th, EnumC1185b bVar) {
        String th2;
        this.f48494c = bVar;
        this.f48496e = ad.a();
        if (th == null) {
            th2 = null;
        } else if (th.getCause() == null) {
            th2 = th.toString();
        } else {
            th2 = th.getCause().toString();
        }
        this.f48497f = th2;
        this.f48498g = d.a(th);
        this.f48492a = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f48493b = new StringBuffer().append(bVar.getLogPrefix()).append(this.f48492a.toString()).append(".json").toString();
    }

    /* synthetic */ b(Throwable th, EnumC1185b bVar, byte b2) {
        this(th, bVar);
    }
}
