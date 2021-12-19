package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import b.i;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.f;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.launcher.LauncherServiceImpl;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import h.m.p;
import h.z;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class RheaTraceUploadTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final a f107872a = new a((byte) 0);

    static {
        Covode.recordClassIndex(69112);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(69113);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    public static final class d implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ File f107877a;

        static {
            Covode.recordClassIndex(69116);
        }

        @Override // com.bytedance.services.apm.api.f
        public final void a(String str) {
            l.d(str, "");
        }

        @Override // com.bytedance.services.apm.api.f
        public final void a() {
            a(this.f107877a);
        }

        d(File file) {
            this.f107877a = file;
        }

        private static boolean a(File file) {
            MethodCollector.i(3856);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (e.a(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                }
                if (e.c(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                    MethodCollector.o(3856);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(3856);
            return delete;
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RheaTraceUploadTask f107873a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f107874b;

        static {
            Covode.recordClassIndex(69114);
        }

        b(RheaTraceUploadTask rheaTraceUploadTask, File file) {
            this.f107873a = rheaTraceUploadTask;
            this.f107874b = file;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                RheaTraceUploadTask.a(this.f107874b, "_atrace");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return z.f158842a;
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RheaTraceUploadTask f107875a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f107876b;

        static {
            Covode.recordClassIndex(69115);
        }

        c(RheaTraceUploadTask rheaTraceUploadTask, File file) {
            this.f107875a = rheaTraceUploadTask;
            this.f107876b = file;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                RheaTraceUploadTask.a(this.f107876b, "_fake_trace");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    private static JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> h2 = com.bytedance.apm.c.h();
        l.b(h2, "");
        for (Map.Entry<String, String> entry : h2.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    private static File b(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.d(context, "");
        try {
            if (p.a("ATrace", com.ss.android.ugc.aweme.app.k.a.f66814a, true) || p.a("MTrace", com.ss.android.ugc.aweme.app.k.a.f66814a, true)) {
                String a2 = LauncherServiceImpl.b().a();
                int hashCode = a2.hashCode();
                if (hashCode != -2009454344) {
                    if (hashCode == 1941963140 && a2.equals("ATrace")) {
                        File a3 = a("ATrace", context);
                        if (a3.exists() && NetworkUtils.isWifi(context) && ApmDelegate.a.f25042a.b("upload_rhea_atrace_file")) {
                            i.b(new b(this, a3), i.f4824a);
                        }
                    }
                } else if (a2.equals("MTrace")) {
                    File a4 = a("MTrace", context);
                    if (a4.exists() && NetworkUtils.isWifi(context) && ApmDelegate.a.f25042a.b("upload_rhea_fake_trace_file")) {
                        i.b(new c(this, a4), i.f4824a);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static File a(String str, Context context) {
        StringBuilder sb = new StringBuilder();
        File b2 = b(context);
        l.b(b2, "");
        String sb2 = sb.append(b2.getAbsolutePath()).append("/rhea").toString();
        if (l.a((Object) str, (Object) "ATrace")) {
            return new File(sb2, "rhea_startup.trace");
        }
        return new File(sb2, "rhea_startup.fake");
    }

    public static void a(File file, String str) {
        b.a.f25210a.b(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0049: INVOKE  
              (wrap: com.bytedance.apm.p.b : 0x003e: SGET  (r0v7 com.bytedance.apm.p.b) =  com.bytedance.apm.p.b.a.a com.bytedance.apm.p.b)
              (wrap: com.bytedance.apm.l.a$1 : 0x0046: CONSTRUCTOR  (r2v1 com.bytedance.apm.l.a$1) = 
              (wrap: com.bytedance.apm.l.a : 0x0002: CONSTRUCTOR  (r3v0 com.bytedance.apm.l.a) =  call: com.bytedance.apm.l.a.<init>():void type: CONSTRUCTOR)
              (wrap: java.lang.String : ?: STR_CONCAT  
              (wrap: java.lang.String : 0x0021: INVOKE  (wrap: int : 0x001f: SGET   com.ss.android.deviceregister.a.d.e int) type: STATIC call: java.lang.String.valueOf(int):java.lang.String)
            )
              ("66812471934")
              (wrap: java.lang.String : ?: STR_CONCAT  (r6v0 java.lang.String) = 
              (wrap: long : 0x000a: INVOKE   type: STATIC call: com.bytedance.ies.ugc.appcontext.d.d():long)
              (r12v0 'str' java.lang.String)
            )
              (wrap: java.util.List : 0x0031: INVOKE  (r7v0 java.util.List) = 
              (wrap: java.lang.String : 0x002d: INVOKE  (r0v6 java.lang.String) = (r11v0 'file' java.io.File) type: VIRTUAL call: java.io.File.getAbsolutePath():java.lang.String)
             type: STATIC call: h.a.n.a(java.lang.Object):java.util.List)
              ("rhea_trace_upload")
              (wrap: org.json.JSONObject : 0x0035: INVOKE  (r9v0 org.json.JSONObject) =  type: STATIC call: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask.c():org.json.JSONObject)
              (wrap: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$d : 0x003b: CONSTRUCTOR  (r10v0 com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$d) = (r11v0 'file' java.io.File) call: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask.d.<init>(java.io.File):void type: CONSTRUCTOR)
             call: com.bytedance.apm.l.a.1.<init>(com.bytedance.apm.l.a, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, org.json.JSONObject, com.bytedance.services.apm.api.f):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.bytedance.apm.p.b.b(java.lang.Runnable):void in method: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask.a(java.io.File, java.lang.String):void, file: classes2.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0046: CONSTRUCTOR  (r2v1 com.bytedance.apm.l.a$1) = 
              (wrap: com.bytedance.apm.l.a : 0x0002: CONSTRUCTOR  (r3v0 com.bytedance.apm.l.a) =  call: com.bytedance.apm.l.a.<init>():void type: CONSTRUCTOR)
              (wrap: java.lang.String : ?: STR_CONCAT  
              (wrap: java.lang.String : 0x0021: INVOKE  (wrap: int : 0x001f: SGET   com.ss.android.deviceregister.a.d.e int) type: STATIC call: java.lang.String.valueOf(int):java.lang.String)
            )
              ("66812471934")
              (wrap: java.lang.String : ?: STR_CONCAT  (r6v0 java.lang.String) = 
              (wrap: long : 0x000a: INVOKE   type: STATIC call: com.bytedance.ies.ugc.appcontext.d.d():long)
              (r12v0 'str' java.lang.String)
            )
              (wrap: java.util.List : 0x0031: INVOKE  (r7v0 java.util.List) = 
              (wrap: java.lang.String : 0x002d: INVOKE  (r0v6 java.lang.String) = (r11v0 'file' java.io.File) type: VIRTUAL call: java.io.File.getAbsolutePath():java.lang.String)
             type: STATIC call: h.a.n.a(java.lang.Object):java.util.List)
              ("rhea_trace_upload")
              (wrap: org.json.JSONObject : 0x0035: INVOKE  (r9v0 org.json.JSONObject) =  type: STATIC call: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask.c():org.json.JSONObject)
              (wrap: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$d : 0x003b: CONSTRUCTOR  (r10v0 com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$d) = (r11v0 'file' java.io.File) call: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask.d.<init>(java.io.File):void type: CONSTRUCTOR)
             call: com.bytedance.apm.l.a.1.<init>(com.bytedance.apm.l.a, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, org.json.JSONObject, com.bytedance.services.apm.api.f):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask.a(java.io.File, java.lang.String):void, file: classes2.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.l.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            com.bytedance.apm.l.a r3 = new com.bytedance.apm.l.a
            r3.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r0 = com.bytedance.ies.ugc.appcontext.d.d()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.String r6 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r0 = com.ss.android.deviceregister.a.d.f59409e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = r11.getAbsolutePath()
            java.util.List r7 = h.a.n.a(r0)
            org.json.JSONObject r9 = c()
            com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$d r10 = new com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$d
            r10.<init>(r11)
            com.bytedance.apm.p.b r0 = com.bytedance.apm.p.b.a.f25210a
            com.bytedance.apm.l.a$1 r2 = new com.bytedance.apm.l.a$1
            java.lang.String r5 = "66812471934"
            java.lang.String r8 = "rhea_trace_upload"
            r2.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask.a(java.io.File, java.lang.String):void");
    }
}
