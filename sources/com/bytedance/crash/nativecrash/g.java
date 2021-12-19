package com.bytedance.crash.nativecrash;

import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.j.b;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.n;
import com.bytedance.crash.runtime.p;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.crash.util.b;
import com.bytedance.crash.util.d;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.r;
import com.bytedance.crash.util.v;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27801a;

    /* renamed from: b  reason: collision with root package name */
    public static File f27802b;

    /* renamed from: c  reason: collision with root package name */
    public static File f27803c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f27804d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f27805e;

    /* renamed from: f  reason: collision with root package name */
    private static File f27806f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f27807g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile boolean f27808h;

    /* renamed from: i  reason: collision with root package name */
    private static final Object f27809i = new Object();

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f27813a;

        /* renamed from: b  reason: collision with root package name */
        String f27814b;

        /* renamed from: c  reason: collision with root package name */
        ArrayList<C0592a> f27815c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        long f27816d;

        /* renamed from: e  reason: collision with root package name */
        long f27817e;

        /* renamed from: f  reason: collision with root package name */
        long f27818f;

        /* renamed from: g  reason: collision with root package name */
        String f27819g;

        /* renamed from: h  reason: collision with root package name */
        String f27820h = null;

        static {
            Covode.recordClassIndex(16296);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.crash.nativecrash.g$a$a  reason: collision with other inner class name */
        public static class C0592a {

            /* renamed from: a  reason: collision with root package name */
            long f27821a;

            /* renamed from: b  reason: collision with root package name */
            long f27822b;

            /* renamed from: c  reason: collision with root package name */
            long f27823c;

            /* renamed from: d  reason: collision with root package name */
            String f27824d;

            static {
                Covode.recordClassIndex(16297);
            }

            private C0592a() {
            }

            /* synthetic */ C0592a(byte b2) {
                this();
            }
        }

        a(File file, File file2, long j2) {
            this.f27813a = j2;
            JSONArray a2 = j.a(file2, -1);
            for (int i2 = 0; i2 < a2.length(); i2++) {
                String optString = a2.optString(i2);
                if (!TextUtils.isEmpty(optString)) {
                    String[] split = optString.split("\\s+");
                    if (split.length == 4) {
                        C0592a aVar = new C0592a((byte) 0);
                        this.f27815c.add(aVar);
                        aVar.f27821a = g.a(split[0], -1);
                        aVar.f27822b = g.a(split[1], -1);
                        aVar.f27823c = g.a(split[2], -1);
                        String str = split[3];
                        aVar.f27824d = str;
                        if (i2 == 0 || b.b(m.f27724a, str)) {
                            if (b.b(m.f27724a, str)) {
                                this.f27814b = str;
                            }
                            this.f27816d = aVar.f27821a;
                            this.f27817e = aVar.f27822b;
                            this.f27818f = aVar.f27823c;
                            this.f27819g = aVar.f27824d;
                        }
                    }
                }
            }
            if (file != null) {
                if (new File(file, "hasJavaCrash").exists()) {
                    this.f27820h = "java";
                }
                if (new File(file, "hasNativeCrash").exists()) {
                    String str2 = "native";
                    this.f27820h = this.f27820h != null ? this.f27820h + str2 : str2;
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(16289);
    }

    public static File b() {
        if (f27806f == null) {
            a();
        }
        return f27806f;
    }

    private static File[] g() {
        return new File(f27802b, "proc/").listFiles();
    }

    public static synchronized void c() {
        synchronized (g.class) {
            MethodCollector.i(12132);
            v.a("start child monitor");
            new Thread(new Runnable() {
                /* class com.bytedance.crash.nativecrash.g.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(16290);
                }

                public final void run() {
                    File file = g.f27802b;
                    file.mkdirs();
                    if (com.bytedance.crash.runtime.b.a("custom_event_settings", "npth_simple_setting", "enable_all_worker") == 1) {
                        g.d();
                        g.f27805e = true;
                    }
                    if (TextUtils.isEmpty(Build.BRAND) || !Build.BRAND.contains("aries")) {
                        NativeTools.a().a(System.currentTimeMillis(), file.getAbsolutePath(), new File(g.f27802b, "pid_tid").getAbsolutePath());
                    } else if (!g.f27805e) {
                        g.d();
                        g.f27805e = true;
                    }
                }
            }, "monitor-terminal").start();
            MethodCollector.o(12132);
        }
    }

    public static void d() {
        if (!f27804d) {
            f27804d = true;
            if (com.bytedance.crash.b.b.f27442d) {
                File file = f27802b;
                v.a("start new anrInfo Monitor");
                new Thread(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001f: INVOKE  
                      (wrap: java.lang.Thread : 0x001c: CONSTRUCTOR  (r2v0 java.lang.Thread) = 
                      (wrap: com.bytedance.crash.b.g$2 : 0x0017: CONSTRUCTOR  (r1v0 com.bytedance.crash.b.g$2) = (r3v0 'file' java.io.File) call: com.bytedance.crash.b.g.2.<init>(java.io.File):void type: CONSTRUCTOR)
                      ("worker_anr_monitor")
                     call: java.lang.Thread.<init>(java.lang.Runnable, java.lang.String):void type: CONSTRUCTOR)
                     type: VIRTUAL call: java.lang.Thread.start():void in method: com.bytedance.crash.nativecrash.g.d():void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001c: CONSTRUCTOR  (r2v0 java.lang.Thread) = 
                      (wrap: com.bytedance.crash.b.g$2 : 0x0017: CONSTRUCTOR  (r1v0 com.bytedance.crash.b.g$2) = (r3v0 'file' java.io.File) call: com.bytedance.crash.b.g.2.<init>(java.io.File):void type: CONSTRUCTOR)
                      ("worker_anr_monitor")
                     call: java.lang.Thread.<init>(java.lang.Runnable, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.crash.nativecrash.g.d():void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 28 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0017: CONSTRUCTOR  (r1v0 com.bytedance.crash.b.g$2) = (r3v0 'file' java.io.File) call: com.bytedance.crash.b.g.2.<init>(java.io.File):void type: CONSTRUCTOR in method: com.bytedance.crash.nativecrash.g.d():void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.crash.b.g, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 40 more
                    */
                /*
                    boolean r0 = com.bytedance.crash.nativecrash.g.f27804d
                    if (r0 == 0) goto L_0x0005
                    return
                L_0x0005:
                    r0 = 1
                    com.bytedance.crash.nativecrash.g.f27804d = r0
                    boolean r0 = com.bytedance.crash.b.b.f27442d
                    if (r0 == 0) goto L_0x0022
                    java.io.File r3 = com.bytedance.crash.nativecrash.g.f27802b
                    java.lang.String r0 = "start new anrInfo Monitor"
                    com.bytedance.crash.util.v.a(r0)
                    java.lang.Thread r2 = new java.lang.Thread
                    com.bytedance.crash.b.g$2 r1 = new com.bytedance.crash.b.g$2
                    r1.<init>(r3)
                    java.lang.String r0 = "worker_anr_monitor"
                    r2.<init>(r1, r0)
                    r2.start()
                L_0x0022:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.g.d():void");
            }

            public static void a() {
                File file = new File(r.j(m.f27724a), "npth/killHistory");
                f27802b = file;
                file.mkdirs();
                f27803c = new File(f27802b, "kill_info");
                File file2 = new File(f27802b, "proc/" + Process.myPid());
                f27806f = file2;
                file2.mkdirs();
                try {
                    j.a(new File(file2, "cmd"), b.c(m.f27724a), false);
                    j.a(new File(file2, "app_start_time"), String.valueOf(m.f27726c), false);
                } catch (IOException unused) {
                    m.f27730g.isDebugMode();
                } catch (Throwable unused2) {
                }
            }

            public static void e() {
                MethodCollector.i(12138);
                if (f27808h) {
                    MethodCollector.o(12138);
                    return;
                }
                synchronized (f27809i) {
                    try {
                        if (!f27808h) {
                            f27808h = true;
                            v.a("TermianteMonitor", "processStart try clear all");
                            File[] g2 = g();
                            if (g2 == null) {
                                MethodCollector.o(12138);
                                return;
                            }
                            for (File file : g2) {
                                long a2 = a(file.getName(), -1);
                                if (!(a2 == -1 || a2 == ((long) Process.myPid()))) {
                                    int i2 = (int) a2;
                                    if (!NativeTools.a().d(i2)) {
                                        a(i2, (String) null);
                                    }
                                }
                            }
                            n.b().a(new Runnable() {
                                /* class com.bytedance.crash.nativecrash.g.AnonymousClass6 */

                                static {
                                    Covode.recordClassIndex(16295);
                                }

                                public final void run() {
                                    com.bytedance.crash.b.g.b();
                                }
                            });
                            MethodCollector.o(12138);
                        }
                    } finally {
                        MethodCollector.o(12138);
                    }
                }
            }

            public static JSONArray f() {
                File[] g2 = g();
                if (g2 == null || g2.length == 0) {
                    return null;
                }
                JSONArray jSONArray = new JSONArray();
                for (File file : g2) {
                    long a2 = a(file.getName(), -1);
                    if (a2 >= 0 && NativeTools.a().d((int) a2)) {
                        JSONObject jSONObject = new JSONObject();
                        com.bytedance.crash.util.n.a(jSONObject, "pid", Long.valueOf(a2));
                        com.bytedance.crash.util.n.a(jSONObject, "start_time", Long.valueOf(a(file)));
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }

            private static long a(File file) {
                try {
                    return a(j.a(new File(file, "app_start_time"), "\n"), System.currentTimeMillis());
                } catch (IOException unused) {
                    return System.currentTimeMillis();
                }
            }

            public static void a(final boolean z) {
                if (!com.bytedance.crash.n.f27744h && !com.bytedance.crash.n.f27745i) {
                    if (!f27807g || z) {
                        f27807g = true;
                        n.b().a(new Runnable() {
                            /* class com.bytedance.crash.nativecrash.g.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(16291);
                            }

                            public final void run() {
                                String[] list;
                                int a2;
                                g.a();
                                long currentTimeMillis = System.currentTimeMillis();
                                File file = g.f27803c;
                                if (file.exists() && (list = file.list()) != null && list.length != 0) {
                                    Arrays.sort(list);
                                    int i2 = 0;
                                    if (list.length != 0 && list.length > (a2 = com.bytedance.crash.runtime.b.a(25, "custom_event_settings", "npth_simple_setting", "kill_history_limit"))) {
                                        Arrays.sort(list);
                                        while (i2 < list.length - a2) {
                                            j.a(new File(g.f27803c, list[i2]));
                                            i2++;
                                        }
                                        i2 = list.length - a2;
                                    }
                                    if (com.bytedance.crash.runtime.b.k() || z) {
                                        int i3 = i2;
                                        while (i3 < list.length && i3 < i2 + 5) {
                                            String str = list[i3];
                                            try {
                                                long longValue = Long.decode(str).longValue();
                                                if (currentTimeMillis - longValue >= 1000) {
                                                    File file2 = new File(file, str);
                                                    try {
                                                        g.a(new a(file2, new File(file2, "info.txt"), longValue), file2, longValue, (File) null);
                                                    } catch (Throwable unused) {
                                                        j.a(file2);
                                                    }
                                                }
                                            } catch (Throwable unused2) {
                                                j.a(new File(file, str));
                                            }
                                            i3++;
                                        }
                                    }
                                }
                            }
                        });
                    }
                }
            }

            public static j.b a(JSONArray jSONArray) {
                File file;
                if (jSONArray == null || jSONArray.length() == 0) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(jSONArray.length());
                e();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        int optInt = optJSONObject.optInt("pid");
                        long optLong = optJSONObject.optLong("start_time");
                        if (optInt > 0 && optLong > 0) {
                            File a2 = p.a(optLong);
                            String[] list = a2.list(new FilenameFilter(d.a().format(new Date(optLong)) + "_" + optInt) {
                                /* class com.bytedance.crash.runtime.p.AnonymousClass3 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ String f27939a;

                                static {
                                    Covode.recordClassIndex(16352);
                                }

                                {
                                    this.f27939a = r1;
                                }

                                public final boolean accept(File file, String str) {
                                    return str.equals(this.f27939a);
                                }
                            });
                            if (list == null || list.length == 0) {
                                file = new File(f27802b, "proc/".concat(String.valueOf(optInt)));
                                if (!file.exists()) {
                                }
                            } else {
                                file = new File(a2, list[0]);
                            }
                            arrayList.add(file);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                File[] fileArr = new File[arrayList.size()];
                arrayList.toArray(fileArr);
                return new j.b(fileArr, false);
            }

            public static long a(String str, long j2) {
                try {
                    return Long.decode(str).longValue();
                } catch (Throwable unused) {
                    return j2;
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:24:0x00b9  */
            /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static void a(int r12, java.lang.String r13) {
                /*
                // Method dump skipped, instructions count: 198
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.g.a(int, java.lang.String):void");
            }

            private static void a(int i2, File file, a aVar, File file2) {
                HashMap hashMap = new HashMap();
                final String concat = "-".concat(String.valueOf(i2));
                com.bytedance.crash.j.b.b(hashMap, new FilenameFilter() {
                    /* class com.bytedance.crash.nativecrash.g.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(16292);
                    }

                    public final boolean accept(File file, String str) {
                        return str.contains(concat);
                    }
                });
                com.bytedance.crash.j.b.a(hashMap, new FilenameFilter() {
                    /* class com.bytedance.crash.nativecrash.g.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(16293);
                    }

                    public final boolean accept(File file, String str) {
                        return str.contains(concat);
                    }
                });
                for (b.C0590b bVar : hashMap.values()) {
                    if (bVar.f27656j == i2) {
                        if (!bVar.f27648b.isEmpty()) {
                            j.f(new File(file, "hasJavaCrash"));
                            if (aVar != null) {
                                j.f(new File(file2.getParent(), "hasJavaCrash"));
                                for (b.a aVar2 : bVar.f27648b) {
                                    j.f(new File(aVar2.f27642a, "hasKillInfo"));
                                }
                            }
                        }
                        if (!bVar.f27649c.isEmpty()) {
                            j.f(new File(file, "hasNativeCrash"));
                            if (aVar != null) {
                                j.f(new File(file2.getParent(), "hasNativeCrash"));
                                for (b.a aVar3 : bVar.f27649c) {
                                    j.f(new File(aVar3.f27642a, "hasKillInfo"));
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:26:0x011f  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x0155 A[Catch:{ all -> 0x015a }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            static void a(com.bytedance.crash.nativecrash.g.a r14, java.io.File r15, long r16, java.io.File r18) {
                /*
                // Method dump skipped, instructions count: 350
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.g.a(com.bytedance.crash.nativecrash.g$a, java.io.File, long, java.io.File):void");
            }
        }
