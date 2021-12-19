package com.bytedance.android.a.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.bytedance.android.a.a.b.b;
import com.bytedance.android.a.a.e.c;
import com.bytedance.android.a.a.f.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public final class e extends d {

    /* renamed from: j  reason: collision with root package name */
    private static volatile e f6642j;

    /* renamed from: a  reason: collision with root package name */
    public boolean f6643a;

    /* renamed from: b  reason: collision with root package name */
    public Context f6644b;

    /* renamed from: c  reason: collision with root package name */
    public a f6645c;

    /* renamed from: d  reason: collision with root package name */
    public a f6646d = new a();

    /* renamed from: e  reason: collision with root package name */
    public b f6647e = new b();

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.a.a.b.a f6648f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.android.a.a.a.a f6649g;

    /* renamed from: h  reason: collision with root package name */
    public f f6650h;

    /* renamed from: i  reason: collision with root package name */
    public g f6651i;

    /* renamed from: k  reason: collision with root package name */
    private List<Pair<View, com.bytedance.android.a.a.d.a>> f6652k = Collections.synchronizedList(new ArrayList());

    static {
        Covode.recordClassIndex(3192);
    }

    @Override // com.bytedance.android.a.a.d
    public final boolean b() {
        if (!this.f6643a || !this.f6645c.f6670i) {
            return false;
        }
        return true;
    }

    private e() {
    }

    @Override // com.bytedance.android.a.a.d
    public final boolean a() {
        if (!this.f6643a) {
            com.bytedance.android.a.a.h.a.a("AdTrackerSDK not initialized correctly, make sure AdTrackerSDK.init(Context,AdTrackerSetting) has yet been called");
        }
        return this.f6643a;
    }

    public static e d() {
        MethodCollector.i(5109);
        if (f6642j == null) {
            synchronized (e.class) {
                try {
                    if (f6642j == null) {
                        f6642j = new e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5109);
                    throw th;
                }
            }
        }
        e eVar = f6642j;
        MethodCollector.o(5109);
        return eVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.a.a.d
    public final void c() {
        List<Pair<View, com.bytedance.android.a.a.d.a>> list = this.f6652k;
        if (list != null && !list.isEmpty()) {
            for (Pair<View, com.bytedance.android.a.a.d.a> pair : this.f6652k) {
                this.f6647e.a((View) pair.first, (com.bytedance.android.a.a.d.a) pair.second);
            }
            this.f6652k.clear();
        }
        if (c.f6655a.compareAndSet(false, true)) {
            e d2 = d();
            l.a((Object) d2, "");
            f fVar = d2.f6650h;
            Object obj = null;
            JSONObject putOpt = new JSONObject().putOpt("sdk_aid", 2705).putOpt("sdk_version", "1.6.0-i18n").putOpt("app_version", fVar != null ? "" : null);
            if (fVar != null) {
                obj = "";
            }
            JSONObject putOpt2 = putOpt.putOpt("update_version_code", obj).putOpt("os_version", Build.VERSION.RELEASE);
            e d3 = d();
            l.a((Object) d3, "");
            com.bytedance.android.a.a.a.a aVar = d3.f6649g;
            if (aVar != null) {
                aVar.a("sdk_session_launch", putOpt2);
            }
        }
    }

    @Override // com.bytedance.android.a.a.d
    public final void a(com.bytedance.android.a.a.a.a aVar) {
        this.f6649g = aVar;
    }

    @Override // com.bytedance.android.a.a.d
    public final void a(f fVar) {
        this.f6650h = fVar;
    }

    @Override // com.bytedance.android.a.a.d
    public final void a(ExecutorService executorService) {
        if (!(executorService == com.bytedance.android.a.a.c.a.f6610a || com.bytedance.android.a.a.c.a.f6610a == null)) {
            com.bytedance.android.a.a.c.a.f6610a.shutdown();
        }
        com.bytedance.android.a.a.c.a.f6610a = executorService;
    }

    @Override // com.bytedance.android.a.a.d
    public final void a(a aVar) {
        com.bytedance.android.a.a.h.a.a("updating setting");
        if (a()) {
            this.f6645c = aVar;
            b bVar = this.f6647e;
            if (!d().b()) {
                com.bytedance.android.a.a.h.a.a("ByteAdTracker is not available now");
            } else {
                com.bytedance.android.a.a.c.a.a(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0025: INVOKE  
                      (wrap: com.bytedance.android.a.a.b$3 : 0x0022: CONSTRUCTOR  (r0v4 com.bytedance.android.a.a.b$3) = (r1v0 'bVar' com.bytedance.android.a.a.b) call: com.bytedance.android.a.a.b.3.<init>(com.bytedance.android.a.a.b):void type: CONSTRUCTOR)
                     type: STATIC call: com.bytedance.android.a.a.c.a.a(com.bytedance.android.a.a.c.c):void in method: com.bytedance.android.a.a.e.a(com.bytedance.android.a.a.f.a):void, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0022: CONSTRUCTOR  (r0v4 com.bytedance.android.a.a.b$3) = (r1v0 'bVar' com.bytedance.android.a.a.b) call: com.bytedance.android.a.a.b.3.<init>(com.bytedance.android.a.a.b):void type: CONSTRUCTOR in method: com.bytedance.android.a.a.e.a(com.bytedance.android.a.a.f.a):void, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.a.a.b, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    */
                /*
                    this = this;
                    java.lang.String r0 = "updating setting"
                    com.bytedance.android.a.a.h.a.a(r0)
                    boolean r0 = r2.a()
                    if (r0 != 0) goto L_0x000c
                    return
                L_0x000c:
                    r2.f6645c = r3
                    com.bytedance.android.a.a.b r1 = r2.f6647e
                    com.bytedance.android.a.a.e r0 = d()
                    boolean r0 = r0.b()
                    if (r0 != 0) goto L_0x0020
                    java.lang.String r0 = "ByteAdTracker is not available now"
                    com.bytedance.android.a.a.h.a.a(r0)
                    return
                L_0x0020:
                    com.bytedance.android.a.a.b$3 r0 = new com.bytedance.android.a.a.b$3
                    r0.<init>()
                    com.bytedance.android.a.a.c.a.a(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.a.a.e.a(com.bytedance.android.a.a.f.a):void");
            }

            @Override // com.bytedance.android.a.a.d
            public final void a(com.bytedance.android.a.a.g.a aVar) {
                if (a()) {
                    b bVar = this.f6647e;
                    if (aVar == null || TextUtils.isEmpty(aVar.b())) {
                        com.bytedance.android.a.a.h.a.a("invalid tracker: null or empty key");
                    } else {
                        com.bytedance.android.a.a.c.a.a(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0020: INVOKE  
                              (wrap: com.bytedance.android.a.a.b$2 : 0x001d: CONSTRUCTOR  (r0v4 com.bytedance.android.a.a.b$2) = (r1v0 'bVar' com.bytedance.android.a.a.b), (r3v0 'aVar' com.bytedance.android.a.a.g.a) call: com.bytedance.android.a.a.b.2.<init>(com.bytedance.android.a.a.b, com.bytedance.android.a.a.g.a):void type: CONSTRUCTOR)
                             type: STATIC call: com.bytedance.android.a.a.c.a.a(com.bytedance.android.a.a.c.c):void in method: com.bytedance.android.a.a.e.a(com.bytedance.android.a.a.g.a):void, file: classes2.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: CONSTRUCTOR  (r0v4 com.bytedance.android.a.a.b$2) = (r1v0 'bVar' com.bytedance.android.a.a.b), (r3v0 'aVar' com.bytedance.android.a.a.g.a) call: com.bytedance.android.a.a.b.2.<init>(com.bytedance.android.a.a.b, com.bytedance.android.a.a.g.a):void type: CONSTRUCTOR in method: com.bytedance.android.a.a.e.a(com.bytedance.android.a.a.g.a):void, file: classes2.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 24 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.a.a.b, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 30 more
                            */
                        /*
                            this = this;
                            boolean r0 = r2.a()
                            if (r0 != 0) goto L_0x0007
                            return
                        L_0x0007:
                            com.bytedance.android.a.a.b r1 = r2.f6647e
                            if (r3 == 0) goto L_0x0015
                            java.lang.String r0 = r3.b()
                            boolean r0 = android.text.TextUtils.isEmpty(r0)
                            if (r0 == 0) goto L_0x001b
                        L_0x0015:
                            java.lang.String r0 = "invalid tracker: null or empty key"
                            com.bytedance.android.a.a.h.a.a(r0)
                            return
                        L_0x001b:
                            com.bytedance.android.a.a.b$2 r0 = new com.bytedance.android.a.a.b$2
                            r0.<init>(r3)
                            com.bytedance.android.a.a.c.a.a(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.a.a.e.a(com.bytedance.android.a.a.g.a):void");
                    }

                    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
                        if (r1.equals("cpv_6s") == false) goto L_0x001f;
                     */
                    @Override // com.bytedance.android.a.a.g.b
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void a(com.bytedance.android.a.a.d.b r8) {
                        /*
                        // Method dump skipped, instructions count: 314
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.a.a.e.a(com.bytedance.android.a.a.d.b):void");
                    }

                    @Override // com.bytedance.android.a.a.d
                    public final void a(Context context, a aVar) {
                        if (!this.f6643a) {
                            com.bytedance.android.a.a.h.a.a("1.6.0-i18n/106000");
                            if (context == null || aVar == null) {
                                com.bytedance.android.a.a.h.a.a("ByteAdTracker init incorrectly, context or setting is null");
                                return;
                            }
                            Context applicationContext = context.getApplicationContext();
                            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                            }
                            this.f6644b = applicationContext;
                            this.f6648f = new b(context, "byte_ad_tracker_preferences");
                            this.f6645c = aVar;
                            this.f6643a = true;
                        }
                    }
                }
