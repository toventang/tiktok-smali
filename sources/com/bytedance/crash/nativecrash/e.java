package com.bytedance.crash.nativecrash;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.q;
import com.bytedance.crash.util.r;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e {
    static {
        Covode.recordClassIndex(16278);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.nativecrash.e$e  reason: collision with other inner class name */
    public static class C0591e {

        /* renamed from: a  reason: collision with root package name */
        File f27794a;

        /* renamed from: b  reason: collision with root package name */
        String f27795b;

        /* renamed from: c  reason: collision with root package name */
        String f27796c;

        /* renamed from: d  reason: collision with root package name */
        int f27797d;

        static {
            Covode.recordClassIndex(16283);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0045  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int a() {
            /*
                r6 = this;
                r5 = 11449(0x2cb9, float:1.6043E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
                java.io.File r0 = r6.f27794a
                boolean r0 = r0.exists()
                r4 = -1
                if (r0 == 0) goto L_0x0016
                java.io.File r0 = r6.f27794a
                boolean r0 = r0.isFile()
                if (r0 != 0) goto L_0x001a
            L_0x0016:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
                return r4
            L_0x001a:
                r3 = 0
                java.io.FileReader r1 = new java.io.FileReader     // Catch:{ all -> 0x003c }
                java.io.File r0 = r6.f27794a     // Catch:{ all -> 0x003c }
                r1.<init>(r0)     // Catch:{ all -> 0x003c }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x003c }
                r2.<init>(r1)     // Catch:{ all -> 0x003c }
                r1 = -1
            L_0x0028:
                java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0038 }
                if (r0 == 0) goto L_0x0034
                int r1 = r6.a(r0)     // Catch:{ all -> 0x0038 }
                if (r1 == r4) goto L_0x0028
            L_0x0034:
                com.bytedance.crash.util.m.a(r2)
                goto L_0x0049
            L_0x0038:
                r1 = move-exception
                r0 = -1
                r3 = r2
                goto L_0x003e
            L_0x003c:
                r1 = move-exception
                r0 = -1
            L_0x003e:
                java.lang.String r0 = "NPTH_CATCH"
                com.bytedance.crash.d.a(r0, r1)     // Catch:{ all -> 0x004d }
                if (r3 == 0) goto L_0x0048
                com.bytedance.crash.util.m.a(r3)
            L_0x0048:
                r1 = -1
            L_0x0049:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
                return r1
            L_0x004d:
                r0 = move-exception
                if (r3 == 0) goto L_0x0053
                com.bytedance.crash.util.m.a(r3)
            L_0x0053:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.e.C0591e.a():int");
        }

        C0591e(File file) {
            this.f27794a = file;
        }

        private int a(String str) {
            int i2 = this.f27797d;
            if (!str.startsWith(this.f27795b)) {
                return i2;
            }
            try {
                i2 = Integer.parseInt(str.split(this.f27796c)[1].trim());
            } catch (NumberFormatException e2) {
                com.bytedance.crash.d.a("NPTH_CATCH", e2);
            }
            if (i2 < 0) {
                return -2;
            }
            return i2;
        }
    }

    /* access modifiers changed from: package-private */
    public static class f extends C0591e {
        static {
            Covode.recordClassIndex(16284);
        }

        /* access modifiers changed from: package-private */
        public final HashMap<String, List<String>> b() {
            String str;
            q qVar = new q();
            try {
                JSONArray a2 = j.a(this.f27794a.getAbsolutePath());
                if (a2 == null) {
                    return qVar;
                }
                for (int i2 = 0; i2 < a2.length(); i2++) {
                    String optString = a2.optString(i2);
                    if (!TextUtils.isEmpty(optString) && optString.startsWith("[tid:0") && optString.endsWith("sigstack:0x0]")) {
                        int indexOf = optString.indexOf("[routine:0x");
                        int i3 = indexOf + 11;
                        int indexOf2 = optString.indexOf(93, i3);
                        if (indexOf > 0) {
                            str = optString.substring(i3, indexOf2);
                        } else {
                            str = "unknown addr";
                        }
                        qVar.getList(str).add(optString);
                    }
                }
                return qVar;
            } catch (IOException unused) {
            } catch (Throwable th) {
                com.bytedance.crash.d.a("NPTH_CATCH", th);
            }
        }

        f(File file) {
            super(file);
        }
    }

    /* access modifiers changed from: package-private */
    public static class g extends C0591e {
        static {
            Covode.recordClassIndex(16285);
        }

        g(File file) {
            super(file);
        }

        /* access modifiers changed from: package-private */
        public final JSONArray a(HashMap<String, List<String>> hashMap) {
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (hashMap.isEmpty()) {
                return jSONArray;
            }
            try {
                JSONArray a2 = j.a(this.f27794a.getAbsolutePath());
                if (a2 == null) {
                    return jSONArray;
                }
                for (int i2 = 0; i2 < a2.length(); i2++) {
                    String optString = a2.optString(i2);
                    if (!TextUtils.isEmpty(optString)) {
                        String substring = optString.substring(2, optString.indexOf(":"));
                        if (hashMap.containsKey(substring) && (list = hashMap.get(substring)) != null) {
                            Iterator<String> it = list.iterator();
                            while (it.hasNext()) {
                                jSONArray.put(it.next() + " " + optString);
                            }
                            hashMap.remove(substring);
                        }
                    }
                }
                for (List<String> list2 : hashMap.values()) {
                    Iterator<String> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next() + "  0x000000:unknown");
                    }
                }
                return jSONArray;
            } catch (IOException unused) {
            } catch (Throwable th) {
                com.bytedance.crash.d.a("NPTH_CATCH", th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class a extends C0591e {
        static {
            Covode.recordClassIndex(16279);
        }

        a(File file) {
            super(file);
            this.f27795b = "Total FD Count:";
            this.f27796c = ":";
            this.f27797d = -2;
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends C0591e {
        static {
            Covode.recordClassIndex(16280);
        }

        b(File file) {
            super(file);
            this.f27795b = "VmSize:";
            this.f27796c = "\\s+";
            this.f27797d = -1;
        }
    }

    static class d extends C0591e {
        static {
            Covode.recordClassIndex(16282);
        }

        d(File file) {
            super(file);
            this.f27795b = "VmRSS:";
            this.f27796c = "\\s+";
            this.f27797d = -1;
        }
    }

    /* access modifiers changed from: package-private */
    public static class h extends C0591e {
        static {
            Covode.recordClassIndex(16286);
        }

        h(File file) {
            super(file);
            this.f27795b = "Total Threads Count:";
            this.f27796c = ":";
            this.f27797d = -2;
        }
    }

    public static int a(String str) {
        return new a(r.b(str)).a();
    }

    public static int b(String str) {
        return new h(r.c(str)).a();
    }

    public static int c(String str) {
        return new b(r.d(str)).a();
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f27785a;

        /* renamed from: b  reason: collision with root package name */
        public int f27786b;

        /* renamed from: c  reason: collision with root package name */
        public int f27787c;

        /* renamed from: d  reason: collision with root package name */
        public int f27788d;

        /* renamed from: e  reason: collision with root package name */
        public int f27789e;

        /* renamed from: f  reason: collision with root package name */
        public String f27790f;

        /* renamed from: g  reason: collision with root package name */
        public String f27791g;

        /* renamed from: h  reason: collision with root package name */
        public JSONArray f27792h = new JSONArray();

        /* renamed from: i  reason: collision with root package name */
        public final Map<String, String> f27793i = new HashMap();

        static {
            Covode.recordClassIndex(16281);
        }

        public final void a(JSONObject jSONObject) {
            boolean z;
            boolean z2;
            com.bytedance.crash.entity.b.a(jSONObject, "filters", "has_dump", "true");
            boolean z3 = true;
            if (((long) this.f27785a) > c.c()) {
                z = true;
            } else {
                z = false;
            }
            com.bytedance.crash.entity.b.a(jSONObject, "filters", "memory_leak", String.valueOf(z));
            if (this.f27787c > 960) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.bytedance.crash.entity.b.a(jSONObject, "filters", "fd_leak", String.valueOf(z2));
            if (this.f27788d <= 350) {
                z3 = false;
            }
            com.bytedance.crash.entity.b.a(jSONObject, "filters", "threads_leak", String.valueOf(z3));
            com.bytedance.crash.entity.b.a(jSONObject, "filters", "leak_threads_count", String.valueOf(this.f27789e));
            try {
                jSONObject.putOpt("memory_size", Integer.valueOf(this.f27785a));
                jSONObject.putOpt("rss", Integer.valueOf(this.f27786b));
            } catch (Throwable unused) {
            }
            com.bytedance.crash.entity.b.a(jSONObject, "filters", "native_oom_reason", this.f27790f);
            com.bytedance.crash.entity.b.a(jSONObject, "custom_long", "maps_size", this.f27792h);
            for (Map.Entry<String, String> entry : this.f27793i.entrySet()) {
                com.bytedance.crash.entity.b.a(jSONObject, "filters", entry.getKey(), entry.getValue());
            }
        }
    }

    public static JSONArray a(File file, File file2) {
        return new g(file2).a(new f(file).b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01fa A[SYNTHETIC, Splitter:B:103:0x01fa] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.crash.nativecrash.e.c a(java.lang.String r13, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 566
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.e.a(java.lang.String, java.lang.String):com.bytedance.crash.nativecrash.e$c");
    }
}
