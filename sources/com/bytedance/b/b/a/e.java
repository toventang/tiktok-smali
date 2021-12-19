package com.bytedance.b.b.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.b.b.a.a.a;
import com.bytedance.b.b.a.b.b;
import com.bytedance.b.b.a.b.c;
import com.bytedance.b.b.a.c;
import com.bytedance.b.b.a.d;
import com.bytedance.b.b.a.d.c;
import com.bytedance.b.h.c;
import com.bytedance.b.k.g;
import com.bytedance.b.k.h;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.Locale;
import org.json.JSONObject;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public static volatile e f25965a = new e();

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.b.b.a.c.c f25966b;

    /* renamed from: c  reason: collision with root package name */
    private a f25967c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f25968d;

    private e() {
    }

    static {
        Covode.recordClassIndex(15134);
    }

    private synchronized void a() {
        String str;
        String str2;
        JSONObject a2;
        if (!this.f25968d) {
            b a3 = b.a();
            com.bytedance.b.b.a.b.a aVar = new com.bytedance.b.b.a.b.a();
            aVar.f25871j = "Android";
            aVar.f25872k = "android";
            aVar.f25873l = Build.VERSION.RELEASE;
            aVar.f25874m = Build.VERSION.SDK_INT;
            aVar.n = Build.MODEL;
            aVar.o = Build.BRAND;
            aVar.p = Build.MANUFACTURER;
            aVar.q = com.bytedance.b.e.a.a.d();
            aVar.r = com.bytedance.b.e.a.a.a();
            if (!h.f26335d || TextUtils.isEmpty(h.f26336e)) {
                if (h.c()) {
                    if (h.c()) {
                        str = "miui_" + h.a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
                    } else {
                        str = "";
                    }
                } else if (Build.DISPLAY.contains("Flyme") || "flyme".equals(Build.USER)) {
                    str = Build.DISPLAY;
                    if (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) {
                        str = "";
                    }
                } else if (!h.a()) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        str2 = h.a("ro.build.version.emui");
                    } else {
                        str2 = h.b();
                    }
                    if (str2 == null || !str2.toLowerCase(Locale.getDefault()).contains("emotionui")) {
                        str = "";
                    } else {
                        str = str2 + "_" + Build.DISPLAY;
                    }
                    if (TextUtils.isEmpty(str)) {
                        String a4 = h.a("ro.vivo.os.build.display.id");
                        if (!TextUtils.isEmpty(a4) && a4.toLowerCase(Locale.getDefault()).contains(h.f26333b)) {
                            str = h.a("ro.vivo.os.build.display.id") + "_" + h.a("ro.vivo.product.version");
                        } else if (TextUtils.isEmpty(Build.DISPLAY) || !Build.DISPLAY.toLowerCase(Locale.getDefault()).contains(h.f26332a)) {
                            String str3 = Build.MANUFACTURER + Build.BRAND;
                            if (!TextUtils.isEmpty(str3)) {
                                String lowerCase = str3.toLowerCase(Locale.getDefault());
                                if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
                                    str = h.a("ro.build.uiversion") + "_" + Build.DISPLAY;
                                }
                            }
                            if (!TextUtils.isEmpty(h.a("ro.letv.release.version"))) {
                                str = "eui_" + h.a("ro.letv.release.version") + "_" + Build.DISPLAY;
                            } else {
                                str = "";
                            }
                            if (TextUtils.isEmpty(str)) {
                                h.f26335d = true;
                                str = Build.DISPLAY;
                            }
                        } else {
                            str = Build.DISPLAY + "_" + h.a("ro.gn.sv.version");
                        }
                    }
                } else if (h.a()) {
                    str = "coloros_" + h.a("ro.build.version.opporom") + "_" + Build.DISPLAY;
                } else {
                    str = "";
                }
                h.f26336e = str;
            } else {
                str = h.f26336e;
            }
            aVar.s = str;
            aVar.x = String.valueOf(f.a("release_build"));
            aVar.w = com.bytedance.b.e.a.a.b();
            aVar.f25864c = com.bytedance.b.e.a.a.f();
            aVar.f25862a = com.bytedance.b.e.a.a.e();
            aVar.v = com.bytedance.b.e.a.a.p();
            aVar.f25865d = String.valueOf(com.bytedance.b.e.a.a.g());
            aVar.f25869h = com.bytedance.b.e.a.a.h();
            aVar.f25868g = String.valueOf(com.bytedance.b.e.a.a.i());
            aVar.f25866e = com.bytedance.b.e.a.a.j();
            aVar.f25870i = com.bytedance.b.e.a.a.k();
            aVar.t = com.bytedance.b.k.a.f26313g.getPackageName();
            aVar.B = aVar.f25865d;
            aVar.f25867f = com.bytedance.b.e.a.a.l();
            aVar.C = com.bytedance.b.e.a.a.f26193d;
            JSONObject jSONObject = new JSONObject();
            try {
                com.bytedance.b.k.e.a(jSONObject, com.bytedance.b.e.a.a.m());
                if (jSONObject.has("version_code")) {
                    jSONObject.remove("version_code");
                }
                if (jSONObject.has("app_version")) {
                    jSONObject.remove("app_version");
                }
                if (jSONObject.has("uid")) {
                    jSONObject.remove("uid");
                }
                if (jSONObject.has("update_version_code")) {
                    jSONObject.remove("update_version_code");
                }
                if (jSONObject.has("manifest_version_code")) {
                    jSONObject.remove("manifest_version_code");
                }
            } catch (Exception e2) {
                com.bytedance.b.k.b.b.a("APM", "header json exception" + e2.toString());
            }
            aVar.z = jSONObject;
            aVar.u = "5.0.19.3-rc.31";
            if (com.bytedance.b.e.a.a.c()) {
                com.bytedance.b.b.a.b.c cVar = c.a.f25881a;
                cVar.a();
                if (cVar.f25878a != null) {
                    cVar.f25878a.listFiles(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0316: INVOKE  
                          (wrap: java.io.File : 0x030f: IGET  (r1v46 java.io.File) = (r2v25 'cVar' com.bytedance.b.b.a.b.c) com.bytedance.b.b.a.b.c.a java.io.File)
                          (wrap: com.bytedance.b.b.a.b.c$1 : 0x0313: CONSTRUCTOR  (r0v138 com.bytedance.b.b.a.b.c$1) = (r2v25 'cVar' com.bytedance.b.b.a.b.c) call: com.bytedance.b.b.a.b.c.1.<init>(com.bytedance.b.b.a.b.c):void type: CONSTRUCTOR)
                         type: VIRTUAL call: java.io.File.listFiles(java.io.FileFilter):java.io.File[] in method: com.bytedance.b.b.a.e.a():void, file: classes.dex
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0313: CONSTRUCTOR  (r0v138 com.bytedance.b.b.a.b.c$1) = (r2v25 'cVar' com.bytedance.b.b.a.b.c) call: com.bytedance.b.b.a.b.c.1.<init>(com.bytedance.b.b.a.b.c):void type: CONSTRUCTOR in method: com.bytedance.b.b.a.e.a():void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 35 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.b.b.a.b.c, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 41 more
                        */
                    /*
                    // Method dump skipped, instructions count: 983
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.b.b.a.e.a():void");
                }

                private static l.a a(Context context) {
                    if (j.f107225d != l.a.UNKNOWN && j.b() && !j.c()) {
                        return j.f107225d;
                    }
                    l.a c2 = l.c(context);
                    j.f107225d = c2;
                    return c2;
                }

                public final synchronized void a(a aVar) {
                    this.f25967c = aVar;
                    if (aVar != null) {
                        c.a.f25941a.f25939l = aVar;
                        c.a.f25892a.a(aVar.f25855g);
                        c cVar = c.a.f25892a;
                        long j2 = aVar.f25849a;
                        if (j2 > 0) {
                            cVar.f25883a = j2;
                        }
                        com.bytedance.b.b.a.e.c cVar2 = com.bytedance.b.b.a.e.c.f25972a;
                        int i2 = aVar.f25856h;
                        int i3 = aVar.f25857i;
                        if (i2 > 0 && i3 > 0) {
                            cVar2.f25975d = i2;
                            cVar2.f25976e = i3;
                        }
                    }
                }

                @Override // com.bytedance.b.h.c
                public final void a(com.bytedance.b.h.b bVar) {
                    if (!this.f25968d) {
                        a();
                    }
                    JSONObject c2 = bVar.c();
                    if (a.f25848b.contains(bVar.a()) || "tracing".equals(bVar.a())) {
                        a(c2, false);
                    } else {
                        a(c2, true);
                    }
                    this.f25966b.a(c2);
                    if (com.bytedance.b.e.a.a.r()) {
                        com.bytedance.apm.d.a.a(bVar.a(), c2, true);
                    }
                }

                private static void a(JSONObject jSONObject, boolean z) {
                    int a2;
                    try {
                        if (!TextUtils.isEmpty(com.bytedance.b.e.a.a.o())) {
                            jSONObject.put("session_id", com.bytedance.b.e.a.a.o());
                        }
                        if (jSONObject.isNull("network_type")) {
                            l.a a3 = a(com.bytedance.b.k.a.f26313g);
                            jSONObject.put("network_type", a3.getValue());
                            if ((a3.is2G() || a3.is3GOrHigher()) && (a2 = g.a(com.bytedance.b.k.a.f26313g)) != -10000) {
                                jSONObject.put("network_type_code", a2);
                            }
                        }
                        if (jSONObject.isNull("timestamp") || jSONObject.optLong("timestamp") <= 0) {
                            jSONObject.put("timestamp", System.currentTimeMillis());
                        }
                        if (jSONObject.isNull("sid")) {
                            jSONObject.put("sid", com.bytedance.b.e.a.a.a());
                        }
                        jSONObject.put("process_name", com.bytedance.b.e.a.a.d());
                        if (z) {
                            jSONObject.put("seq_no", d.a.f25907a.a());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
