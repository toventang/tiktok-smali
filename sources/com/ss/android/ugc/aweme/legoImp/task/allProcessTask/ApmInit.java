package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.view.Choreographer;
import com.bytedance.apm.a;
import com.bytedance.apm.c;
import com.bytedance.apm.config.a;
import com.bytedance.apm.config.b;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.k.b.b;
import com.bytedance.apm.trace.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.monitor.collector.d;
import com.bytedance.monitor.collector.o;
import com.ss.android.ugc.aweme.experiment.en;
import com.ss.android.ugc.aweme.experiment.eo;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.logger.a;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.List;

public final class ApmInit implements w {
    static {
        Covode.recordClassIndex(69189);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048573;
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

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107961a = new a();

        static {
            Covode.recordClassIndex(69190);
        }

        a() {
        }

        @Override // com.bytedance.apm.k.b.b
        public final void a(Activity activity) {
            l.b(activity, "");
            activity.getLocalClassName();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        long j2;
        a.b.f109011a.a("method_init_apm_duration", false);
        if (((Boolean) en.f89940a.getValue()).booleanValue()) {
            o.f41576a = true;
        }
        if (((Boolean) en.f89941b.getValue()).booleanValue()) {
            MainLooperOptService.f107697h = false;
        }
        Application a2 = g.a();
        d dVar = new d();
        dVar.f25363b = true;
        dVar.f25362a = 50000;
        b.a a3 = com.bytedance.apm.config.b.a();
        a.C0528a aVar = new a.C0528a((byte) 0);
        aVar.f24763a = false;
        aVar.f24765c = true;
        aVar.f24764b = 60000;
        aVar.f24766d = true;
        aVar.f24767e = a.f107961a;
        a3.r = new com.bytedance.apm.config.a(aVar);
        try {
            com.bytedance.monitor.collector.d.f41457a = (Handler) com.bytedance.monitor.collector.a.a.a(Choreographer.getInstance(), "mHandler");
            com.bytedance.monitor.collector.d.f41459c = com.bytedance.monitor.collector.a.a.a(Choreographer.getInstance(), "mDisplayEventReceiver");
            Field a4 = com.bytedance.monitor.collector.a.a.a((Class<?>) Choreographer.class, "mHandler");
            Object a5 = com.bytedance.monitor.a.c.a.a(com.bytedance.monitor.a.c.a.a(com.bytedance.monitor.a.c.b.f41398a, "objectFieldOffset", Field.class), com.bytedance.monitor.a.c.b.f41399b, a4);
            if (a5 == null) {
                j2 = 0;
            } else {
                j2 = ((Long) a5).longValue();
            }
            Choreographer instance = Choreographer.getInstance();
            d.a aVar2 = com.bytedance.monitor.collector.d.f41458b;
            Object a6 = com.bytedance.monitor.a.c.a.a(com.bytedance.monitor.a.c.a.a(com.bytedance.monitor.a.c.b.f41398a, "putObject", Object.class, Long.TYPE, Object.class), com.bytedance.monitor.a.c.b.f41399b, instance, Long.valueOf(j2), aVar2);
            if (a6 != null) {
                ((Long) a6).longValue();
            }
        } catch (Exception unused) {
        }
        a3.f24789i = eo.f89952b;
        com.bytedance.apm.a aVar3 = a.C0521a.f24346a;
        ApmDelegate.a.f25042a.f25009c = dVar;
        ApmDelegate.a.f25042a.a(a2, a3.a());
        if (c.f24687c) {
            com.bytedance.apm.p.c.a().a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00f2: INVOKE  
                  (wrap: com.bytedance.apm.p.c : 0x00e9: INVOKE  (r1v1 com.bytedance.apm.p.c) =  type: STATIC call: com.bytedance.apm.p.c.a():com.bytedance.apm.p.c)
                  (wrap: com.bytedance.apm.a$2 : 0x00ef: CONSTRUCTOR  (r0v18 com.bytedance.apm.a$2) = (r2v1 'aVar3' com.bytedance.apm.a) call: com.bytedance.apm.a.2.<init>(com.bytedance.apm.a):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.bytedance.apm.p.c.a(java.lang.Runnable):void in method: com.ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit.a(android.content.Context):void, file: classes.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ef: CONSTRUCTOR  (r0v18 com.bytedance.apm.a$2) = (r2v1 'aVar3' com.bytedance.apm.a) call: com.bytedance.apm.a.2.<init>(com.bytedance.apm.a):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit.a(android.content.Context):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
            // Method dump skipped, instructions count: 251
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit.a(android.content.Context):void");
        }
    }
