package com.bytedance.crash.b;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.m;
import com.bytedance.crash.n;
import com.bytedance.crash.util.b;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.v;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {

    /* renamed from: d  reason: collision with root package name */
    public static long f27412d;

    /* renamed from: e  reason: collision with root package name */
    public static long f27413e;

    /* renamed from: h  reason: collision with root package name */
    static Pattern f27414h;
    private static volatile boolean p;

    /* renamed from: a  reason: collision with root package name */
    public b f27415a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f27416b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27417c = true;

    /* renamed from: f  reason: collision with root package name */
    public C0586a f27418f;

    /* renamed from: g  reason: collision with root package name */
    public int f27419g;

    /* renamed from: i  reason: collision with root package name */
    private final Context f27420i;

    /* renamed from: j  reason: collision with root package name */
    private long f27421j = -1;

    /* renamed from: k  reason: collision with root package name */
    private File f27422k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f27423l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private final f f27424m;
    private long n;
    private File o;

    static {
        Covode.recordClassIndex(16139);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|53|51|4|3) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002b, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(10260);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002e, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0009 */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0009 A[LOOP:0: B:3:0x0009->B:51:0x0009, LOOP_START, SYNTHETIC, Splitter:B:3:0x0009] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(org.json.JSONArray r6, long r7) {
        /*
            r5 = this;
            java.lang.Class<com.bytedance.crash.b.a> r4 = com.bytedance.crash.b.a.class
            r3 = 10260(0x2814, float:1.4377E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            r2 = 0
            monitor-enter(r4)     // Catch:{ all -> 0x002f }
        L_0x0009:
            boolean r0 = com.bytedance.crash.b.a.p     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0011
            r4.wait()     // Catch:{ all -> 0x0009 }
            goto L_0x0009
        L_0x0011:
            r0 = 1
            com.bytedance.crash.b.a.p = r0
            monitor-exit(r4)
            r5.b(r6, r7)
            monitor-enter(r4)
            com.bytedance.crash.b.a.p = r2     // Catch:{ all -> 0x0023 }
            r4.notifyAll()     // Catch:{ all -> 0x0023 }
            monitor-exit(r4)     // Catch:{ all -> 0x0023 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        L_0x002f:
            r1 = move-exception
            java.lang.String r0 = "NPTH_CATCH"
            com.bytedance.crash.d.a(r0, r1)     // Catch:{ all -> 0x0046 }
            monitor-enter(r4)
            com.bytedance.crash.b.a.p = r2     // Catch:{ all -> 0x0040 }
            r4.notifyAll()     // Catch:{ all -> 0x0040 }
            monitor-exit(r4)     // Catch:{ all -> 0x0040 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0040:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        L_0x0046:
            r0 = move-exception
            monitor-enter(r4)
            com.bytedance.crash.b.a.p = r2     // Catch:{ all -> 0x0052 }
            r4.notifyAll()     // Catch:{ all -> 0x0052 }
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        L_0x0052:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.b.a.a(org.json.JSONArray, long):void");
    }

    public final void a(long j2) {
        if (this.f27418f.f27434g == null) {
            this.f27418f.f27429b = i.e();
            this.f27418f.f27434g = i.b();
            this.f27418f.f27433f = i.a(j2);
        }
    }

    public static long[] a(JSONArray jSONArray) {
        long[] jArr = {0, 0};
        if (jSONArray == null) {
            return jArr;
        }
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            try {
                if (jSONArray.getJSONObject(i3).getInt(StringSet.type) == 8) {
                    j2 += (long) jSONArray.getJSONObject(i3).getInt("cpuDuration");
                    j3 += (long) jSONArray.getJSONObject(i3).getInt("duration");
                    i2++;
                }
            } catch (Throwable unused) {
            }
        }
        if (i2 > 0) {
            long j4 = (long) i2;
            jArr[0] = j2 / j4;
            jArr[1] = j3 / j4;
        }
        return jArr;
    }

    private void d() {
        File file = this.f27422k;
        if (file != null) {
            j.a(file);
            this.f27422k = null;
        }
    }

    /* renamed from: com.bytedance.crash.b.a$a  reason: collision with other inner class name */
    public class C0586a {

        /* renamed from: a  reason: collision with root package name */
        JSONObject f27428a;

        /* renamed from: b  reason: collision with root package name */
        JSONObject f27429b;

        /* renamed from: c  reason: collision with root package name */
        JSONArray f27430c;

        /* renamed from: d  reason: collision with root package name */
        JSONObject f27431d;

        /* renamed from: e  reason: collision with root package name */
        long f27432e = -1;

        /* renamed from: f  reason: collision with root package name */
        JSONArray f27433f;

        /* renamed from: g  reason: collision with root package name */
        JSONArray f27434g;

        /* renamed from: h  reason: collision with root package name */
        JSONObject f27435h;

        /* renamed from: i  reason: collision with root package name */
        boolean f27436i;

        /* renamed from: j  reason: collision with root package name */
        long f27437j = -1;

        /* renamed from: k  reason: collision with root package name */
        boolean f27438k;

        /* renamed from: l  reason: collision with root package name */
        boolean f27439l;

        static {
            Covode.recordClassIndex(16141);
        }

        public final void a() {
            this.f27428a = null;
            this.f27429b = null;
            this.f27430c = null;
            this.f27431d = null;
            this.f27432e = -1;
            this.f27433f = null;
            this.f27434g = null;
            this.f27435h = null;
            this.f27438k = false;
        }

        C0586a() {
        }
    }

    public static boolean b() {
        boolean a2 = b.a(m.f27724a);
        if (!a2 || com.bytedance.crash.runtime.a.a.a().b() > InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
            return a2;
        }
        return false;
    }

    public final void a() {
        if (!this.f27416b) {
            this.f27415a = new b(this);
            if (!i.f27499a) {
                i.f27499a = true;
            }
            this.f27421j = m.f27726c;
            this.f27416b = true;
        }
    }

    public final File c() {
        File file;
        if (this.o == null) {
            Context context = this.f27420i;
            if (d.f107195c == null || !d.f107197e) {
                file = context.getFilesDir();
                d.f107195c = file;
            } else {
                file = d.f107195c;
            }
            this.o = new File(file, "has_anr_signal_" + b.c(this.f27420i).replaceAll(":", "_"));
        }
        return this.o;
    }

    private static void a(String str) {
        for (ICrashCallback iCrashCallback : n.f27742f.f27896a.getList(CrashType.ANR)) {
            try {
                iCrashCallback.onCrash(CrashType.ANR, str, null);
            } catch (Throwable th) {
                com.bytedance.crash.d.a("NPTH_CATCH", th);
            }
        }
    }

    public a(Context context) {
        f fVar = new f();
        this.f27424m = fVar;
        this.n = -1;
        this.f27418f = new C0586a();
        this.f27420i = context;
        String c2 = b.c(context);
        context.getPackageName();
        fVar.c(c2);
        if (!i.f27499a) {
            i.f27499a = true;
            i.f27500b = 100;
            i.f27503e = 300;
            i.f27501c = new ArrayList();
            com.bytedance.crash.runtime.b.a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0047: INVOKE  
                  (wrap: com.bytedance.crash.b.i$1 : 0x0044: CONSTRUCTOR  (r0v7 com.bytedance.crash.b.i$1) =  call: com.bytedance.crash.b.i.1.<init>():void type: CONSTRUCTOR)
                 type: STATIC call: com.bytedance.crash.runtime.b.a(com.bytedance.crash.runtime.b$a):void in method: com.bytedance.crash.b.a.<init>(android.content.Context):void, file: classes.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0044: CONSTRUCTOR  (r0v7 com.bytedance.crash.b.i$1) =  call: com.bytedance.crash.b.i.1.<init>():void type: CONSTRUCTOR in method: com.bytedance.crash.b.a.<init>(android.content.Context):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.crash.b.i, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
                this = this;
                r5.<init>()
                r3 = -1
                r5.f27421j = r3
                r2 = 1
                r5.f27417c = r2
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r5.f27423l = r0
                com.bytedance.crash.b.f r1 = new com.bytedance.crash.b.f
                r1.<init>()
                r5.f27424m = r1
                r5.n = r3
                com.bytedance.crash.b.a$a r0 = new com.bytedance.crash.b.a$a
                r0.<init>()
                r5.f27418f = r0
                r5.f27420i = r6
                java.lang.String r0 = com.bytedance.crash.util.b.c(r6)
                r6.getPackageName()
                r1.c(r0)
                boolean r0 = com.bytedance.crash.b.i.f27499a
                if (r0 != 0) goto L_0x0051
                com.bytedance.crash.b.i.f27499a = r2
                r0 = 100
                com.bytedance.crash.b.i.f27500b = r0
                r0 = 300(0x12c, double:1.48E-321)
                com.bytedance.crash.b.i.f27503e = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                com.bytedance.crash.b.i.f27501c = r0
                com.bytedance.crash.b.i$1 r0 = new com.bytedance.crash.b.i$1
                r0.<init>()
                com.bytedance.crash.runtime.b.a(r0)
                android.os.MessageQueue r0 = com.bytedance.crash.b.i.c()
                com.bytedance.crash.b.i.a(r0)
            L_0x0051:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.b.a.<init>(android.content.Context):void");
        }

        public static String b(long j2) {
            long j3 = j2 - m.f27726c;
            if (j3 < 30000) {
                return "0 - 30s";
            }
            if (j3 < 60000) {
                return "30s - 1min";
            }
            if (j3 < 120000) {
                return "1min - 2min";
            }
            if (j3 < 300000) {
                return "2min - 5min";
            }
            if (j3 < 600000) {
                return "5min - 10min";
            }
            if (j3 < 1800000) {
                return "10min - 30min";
            }
            if (j3 < 3600000) {
                return "30min - 1h";
            }
            return "1h - ";
        }

        private static int[] b(JSONArray jSONArray) {
            int i2;
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                String optString = jSONArray.optString(i3);
                if (optString == null || optString.isEmpty()) {
                    i2 = -1;
                } else {
                    i2 = optString.indexOf("utm=");
                }
                if (i2 > 0) {
                    if (f27414h == null) {
                        f27414h = Pattern.compile("[^0-9]+");
                    }
                    String[] split = f27414h.split(optString.substring(i2));
                    if (split == null || split.length < 2) {
                        return null;
                    }
                    try {
                        int intValue = Integer.decode(split[1]).intValue();
                        int intValue2 = Integer.decode(split[2]).intValue();
                        return new int[]{intValue, intValue2, intValue + intValue2};
                    } catch (Throwable unused) {
                        throw new IllegalArgumentException("Err stack line: ".concat(String.valueOf(optString)));
                    }
                }
            }
            return null;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(12:18|19|(1:21)(1:22)|23|24|25|26|(1:29)|30|(1:32)|33|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00a8 */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00d6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void a(long r7, org.json.JSONArray r9) {
            /*
            // Method dump skipped, instructions count: 227
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.b.a.a(long, org.json.JSONArray):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:110:0x020b  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x02d1  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00e6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void a(java.lang.String r34, com.bytedance.crash.b.f r35) {
            /*
            // Method dump skipped, instructions count: 1886
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.b.a.a(java.lang.String, com.bytedance.crash.b.f):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bc, code lost:
            if (r19 == false) goto L_0x0069;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x04d7 */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x04fe A[Catch:{ all -> 0x0509 }] */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x0543  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x0550  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00f1 A[SYNTHETIC, Splitter:B:50:0x00f1] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean b(org.json.JSONArray r21, long r22) {
            /*
            // Method dump skipped, instructions count: 1389
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.b.a.b(org.json.JSONArray, long):boolean");
        }

        private boolean a(long j2, JSONArray jSONArray, long j3) {
            if (jSONArray != null) {
                this.f27418f.f27439l = true;
                if (j3 >= 0) {
                    this.f27418f.f27437j = j3;
                }
                a(j2, jSONArray);
                if (com.bytedance.crash.runtime.b.a("custom_event_settings", "npth_simple_setting", "enable_background_killed_anr") != 1 && (!com.bytedance.crash.runtime.a.a.a().v) && com.bytedance.crash.runtime.a.a.a().b() > InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public static Pair<JSONObject, JSONObject> a(JSONArray jSONArray, f fVar, boolean z) {
            JSONObject jSONObject;
            String str = null;
            if (jSONArray == null) {
                return new Pair<>(null, null);
            }
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            String str2 = null;
            JSONObject jSONObject2 = null;
            int i2 = 0;
            boolean z2 = false;
            while (i2 < jSONArray.length()) {
                String optString = jSONArray.optString(i2);
                if (TextUtils.isEmpty(optString)) {
                    JSONObject a2 = a(jSONArray4, str2, jSONArray2, fVar, z);
                    if (a2 != null) {
                        jSONObject2 = a2;
                    }
                    if (jSONArray4.length() > 0) {
                        jSONArray4 = new JSONArray();
                    }
                    str2 = str;
                } else {
                    if (z2) {
                        if (!z2) {
                        }
                    } else if (optString.startsWith("DALVIK THREADS") || optString.startsWith("suspend") || optString.startsWith("\"")) {
                        z2 = true;
                    } else {
                        jSONArray3.put(optString);
                    }
                    if (optString.contains(" prio=")) {
                        JSONObject a3 = a(jSONArray4, str2, jSONArray2, fVar, z);
                        if (a3 != null) {
                            jSONObject2 = a3;
                        }
                        str2 = optString.substring(1, optString.indexOf(34, 1));
                        if (!z || !"main".equals(str2)) {
                            str2 = str2 + "  (" + optString.substring(optString.indexOf(34, 2) + 1) + " )";
                        }
                        if (jSONArray4.length() > 0) {
                            jSONArray4 = new JSONArray();
                        }
                        jSONArray4.put(optString);
                    } else if (TextUtils.isEmpty(str2)) {
                        jSONArray3.put(optString);
                    } else {
                        jSONArray4.put(optString);
                    }
                }
                i2++;
                str = null;
            }
            if (fVar != null) {
                fVar.f27474g.a("max_utm_thread", fVar.f27476i);
                fVar.f27474g.a("max_stm_thread", fVar.f27477j);
                fVar.f27474g.a("max_utm_stm_thread", fVar.f27478k);
                v.a("AnrDataCallback", "end trace: " + fVar.f27478k);
                int[] iArr = fVar.f27475h;
                int[] iArr2 = fVar.f27475h;
                fVar.f27475h[2] = 0;
                iArr2[1] = 0;
                iArr[0] = 0;
                fVar.f27476i = "unknown";
                fVar.f27477j = "unknown";
                fVar.f27478k = "unknown";
            }
            if (jSONArray2.length() > 0) {
                jSONObject = new JSONObject();
                com.bytedance.crash.util.n.a(jSONObject, "thread_all_count", Integer.valueOf(jSONArray2.length()));
                com.bytedance.crash.util.n.a(jSONObject, "thread_stacks", jSONArray2);
                f27412d = (long) jSONArray2.length();
            } else {
                jSONObject = null;
            }
            return new Pair<>(jSONObject2, jSONObject);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x014f A[Catch:{ all -> 0x015d }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x015f  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x00cd A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static org.json.JSONObject a(org.json.JSONArray r23, java.lang.String r24, org.json.JSONArray r25, com.bytedance.crash.b.f r26, boolean r27) {
            /*
            // Method dump skipped, instructions count: 406
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.b.a.a(org.json.JSONArray, java.lang.String, org.json.JSONArray, com.bytedance.crash.b.f, boolean):org.json.JSONObject");
        }
    }
