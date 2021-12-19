package com.bytedance.push;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.c.h;
import com.bytedance.push.i.g;
import com.bytedance.push.k.b;
import com.bytedance.push.third.PushManager;
import com.ss.android.message.d;
import com.ss.android.pushmanager.a;
import com.ss.android.pushmanager.a.b;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class e implements h {

    /* renamed from: a  reason: collision with root package name */
    private c f42091a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f42092b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    private AtomicBoolean f42093c = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(25735);
    }

    @Override // com.bytedance.push.c.h
    public final void a(c cVar) {
        if (!this.f42092b.getAndSet(true)) {
            this.f42091a = cVar;
            b.f42229a = cVar.f42062f;
            if (!TextUtils.isEmpty(cVar.n)) {
                a.f60092a = cVar.n;
            }
            com.ss.android.message.a.a.f59819a = this.f42091a.f42064h;
            com.ss.android.message.a.a(this.f42091a.f42057a);
            com.bytedance.push.h.a aVar = new com.bytedance.push.h.a(this.f42091a);
            f.f42099a.a(cVar, aVar);
            com.bytedance.push.d.a aVar2 = new com.bytedance.push.d.a(this.f42091a);
            com.ss.android.ug.bus.b.a(b.a.class, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: INVOKE  
                  (wrap: java.lang.Class : 0x003c: CONST_CLASS   com.ss.android.pushmanager.a.b$a.class)
                  (wrap: com.bytedance.push.d.b$1 : 0x0040: CONSTRUCTOR  (r0v12 com.bytedance.push.d.b$1) = (r5v0 'cVar' com.bytedance.push.c) call: com.bytedance.push.d.b.1.<init>(com.bytedance.push.c):void type: CONSTRUCTOR)
                 type: STATIC call: com.ss.android.ug.bus.b.a(java.lang.Class, com.ss.android.ug.bus.a):void in method: com.bytedance.push.e.a(com.bytedance.push.c):void, file: classes2.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0040: CONSTRUCTOR  (r0v12 com.bytedance.push.d.b$1) = (r5v0 'cVar' com.bytedance.push.c) call: com.bytedance.push.d.b.1.<init>(com.bytedance.push.c):void type: CONSTRUCTOR in method: com.bytedance.push.e.a(com.bytedance.push.c):void, file: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.push.d.b, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 198
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.e.a(com.bytedance.push.c):void");
        }

        @Override // com.bytedance.push.c.h
        public final void a(Map<String, String> map) {
            final Application application = this.f42091a.f42057a;
            if (com.ss.android.message.a.a.a(application)) {
                new StringBuilder("ssidsMap = [").append(map).append("] forceUpdate = false");
                if (map != null && !map.isEmpty()) {
                    String str = map.get("device_id");
                    String str2 = map.get("install_id");
                    if (!m.a(map.get("clientudid")) && !m.a(str) && !m.a(str2)) {
                        com.ss.android.pushmanager.setting.b.b();
                        com.ss.android.pushmanager.setting.a a2 = com.ss.android.pushmanager.setting.a.a();
                        Logger.debug();
                        try {
                            a2.f60125a.a().a("ssids", m.a(map)).a();
                        } catch (Exception unused) {
                        }
                        final f fVar = f.f42099a;
                        if (this.f42093c.compareAndSet(false, true)) {
                            com.bytedance.push.a.a.a(this.f42091a.f42057a).b();
                            if (com.bytedance.push.k.b.f42229a) {
                                if (!PushManager.inst().checkThirdPushConfig("BDPush", this.f42091a.f42057a)) {
                                    throw new IllegalArgumentException("configuration error，please filter \"BDPush\" in logcat to correct the error");
                                }
                            }
                            d.a().a(new Runnable() {
                                /* class com.bytedance.push.e.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(25737);
                                }

                                public final void run() {
                                    Context context = application;
                                    if (com.ss.android.message.a.a.a(context)) {
                                        com.ss.android.pushmanager.b.a.a(context);
                                    }
                                    try {
                                        com.ss.android.pushmanager.setting.b.b();
                                        String a2 = com.ss.android.pushmanager.setting.b.g().a();
                                        if (!m.a(a2)) {
                                            f.b();
                                            new JSONObject(a2);
                                            com.ss.android.pushmanager.setting.b.b();
                                            com.ss.android.pushmanager.setting.b.g().a("");
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }, TimeUnit.SECONDS.toMillis(15));
                            fVar.f().a(application, this.f42091a.f42066j);
                            d.a().a(new Runnable() {
                                /* class com.bytedance.push.e.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(25736);
                                }

                                public final void run() {
                                    fVar.f().a(application);
                                }
                            }, TimeUnit.SECONDS.toMillis(15));
                            com.bytedance.push.j.b bVar = new com.bytedance.push.j.b(fVar, this.f42091a.x);
                            bVar.f42215b.c(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d8: INVOKE  
                                  (wrap: com.bytedance.push.c.b : 0x00d1: IGET  (r1v5 com.bytedance.push.c.b) = (r3v3 'bVar' com.bytedance.push.j.b) com.bytedance.push.j.b.b com.bytedance.push.c.b)
                                  (wrap: com.bytedance.push.j.b$1 : 0x00d5: CONSTRUCTOR  (r0v29 com.bytedance.push.j.b$1) = (r3v3 'bVar' com.bytedance.push.j.b) call: com.bytedance.push.j.b.1.<init>(com.bytedance.push.j.b):void type: CONSTRUCTOR)
                                 type: INTERFACE call: com.bytedance.push.c.b.c(com.ss.android.ug.bus.c$a):void in method: com.bytedance.push.e.a(java.util.Map<java.lang.String, java.lang.String>):void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d5: CONSTRUCTOR  (r0v29 com.bytedance.push.j.b$1) = (r3v3 'bVar' com.bytedance.push.j.b) call: com.bytedance.push.j.b.1.<init>(com.bytedance.push.j.b):void type: CONSTRUCTOR in method: com.bytedance.push.e.a(java.util.Map<java.lang.String, java.lang.String>):void, file: classes2.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 40 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.push.j.b, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 46 more
                                */
                            /*
                            // Method dump skipped, instructions count: 270
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.e.a(java.util.Map):void");
                        }

                        @Override // com.bytedance.push.c.h
                        public final void a(Context context, JSONObject jSONObject) {
                            new g(context, jSONObject, this.f42091a.w).run();
                        }
                    }
