package com.ss.android.ugc.aweme.device;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.m;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import f.a.h.a;
import h.f.b.l;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

public class DeviceInfoReportTask implements w {
    static {
        Covode.recordClassIndex(49811);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
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

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        if (((Boolean) m.f107604l.getValue()).booleanValue()) {
            return ae.APP_BACKGROUND;
        }
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        Context a2;
        if (!a.f80025a && (a2 = d.a()) != null) {
            l.d("KEVA_KEY_TIME_DeviceInfoReporter", "");
            long j2 = com.ss.android.ugc.aweme.player.d.f115086a.getLong("KEVA_KEY_TIME_DeviceInfoReporter", 0);
            if (j2 != 0) {
                Date date = new Date(j2);
                Date date2 = new Date();
                Calendar instance = Calendar.getInstance();
                Calendar instance2 = Calendar.getInstance();
                instance.setTime(date);
                instance2.setTime(date2);
                if (instance.get(6) == instance2.get(6) && instance.get(1) == instance2.get(1)) {
                    return;
                }
            }
            long time = new Date().getTime();
            l.d("KEVA_KEY_TIME_DeviceInfoReporter", "");
            com.ss.android.ugc.aweme.player.d.f115086a.storeLong("KEVA_KEY_TIME_DeviceInfoReporter", time);
            f.a.ab.a((Callable) new b(a2)).b(a.b(f.a.k.a.f158006c)).a(a.b(f.a.k.a.f158006c)).a_(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007f: INVOKE  
                  (wrap: f.a.ab : 0x0076: INVOKE  (r1v3 f.a.ab) = 
                  (wrap: f.a.ab : 0x006c: INVOKE  (r1v2 f.a.ab) = 
                  (wrap: f.a.ab : 0x0062: INVOKE  (r1v1 f.a.ab) = 
                  (wrap: java.util.concurrent.Callable : ?: CAST (java.util.concurrent.Callable) (wrap: com.ss.android.ugc.aweme.device.b : 0x005f: CONSTRUCTOR  (r0v5 com.ss.android.ugc.aweme.device.b) = (r4v0 'a2' android.content.Context) call: com.ss.android.ugc.aweme.device.b.<init>(android.content.Context):void type: CONSTRUCTOR))
                 type: STATIC call: f.a.ab.a(java.util.concurrent.Callable):f.a.ab)
                  (wrap: f.a.aa : 0x0068: INVOKE  (r0v7 f.a.aa) = (wrap: f.a.aa : 0x0066: SGET  (r0v6 f.a.aa) =  f.a.k.a.c f.a.aa) type: STATIC call: f.a.h.a.b(f.a.aa):f.a.aa)
                 type: VIRTUAL call: f.a.ab.b(f.a.aa):f.a.ab)
                  (wrap: f.a.aa : 0x0072: INVOKE  (r0v9 f.a.aa) = (wrap: f.a.aa : 0x0070: SGET  (r0v8 f.a.aa) =  f.a.k.a.c f.a.aa) type: STATIC call: f.a.h.a.b(f.a.aa):f.a.aa)
                 type: VIRTUAL call: f.a.ab.a(f.a.aa):f.a.ab)
                  (wrap: com.ss.android.ugc.aweme.device.a$1 : 0x007c: CONSTRUCTOR  (r0v10 com.ss.android.ugc.aweme.device.a$1) = (r4v0 'a2' android.content.Context) call: com.ss.android.ugc.aweme.device.a.1.<init>(android.content.Context):void type: CONSTRUCTOR)
                 type: VIRTUAL call: f.a.ab.a_(f.a.ae):void in method: com.ss.android.ugc.aweme.device.DeviceInfoReportTask.a(android.content.Context):void, file: classes.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007c: CONSTRUCTOR  (r0v10 com.ss.android.ugc.aweme.device.a$1) = (r4v0 'a2' android.content.Context) call: com.ss.android.ugc.aweme.device.a.1.<init>(android.content.Context):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.device.DeviceInfoReportTask.a(android.content.Context):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.device.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 133
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.device.DeviceInfoReportTask.a(android.content.Context):void");
        }
    }
