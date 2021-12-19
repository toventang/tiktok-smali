package com.ss.android.ugc.aweme.dmt_integration;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.ss.android.ugc.aweme.df.c;
import com.ss.android.ugc.aweme.port.in.aj;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.port.in.k;
import com.ss.android.ugc.aweme.property.as;
import com.ss.android.ugc.aweme.services.IAVInitializer;
import com.ss.android.ugc.aweme.services.RuntimeBehaviorServiceDiff;
import com.ss.android.ugc.aweme.services.storage.AVStorageManagerImpl;
import com.ss.android.ugc.aweme.setting.i.a;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.j;
import com.ss.android.ugc.aweme.sticker.p;
import com.ss.android.ugc.aweme.utils.ae;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.ugc.b;
import com.ss.android.ugc.tools.c;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.ugc.tools.view.widget.d;
import com.ss.android.ugc.tools.view.widget.j;
import h.f.b.l;
import h.z;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public class AVInitializerImpl implements IAVInitializer {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f82880a;

    static {
        Covode.recordClassIndex(51642);
    }

    public static IAVInitializer a() {
        MethodCollector.i(8959);
        Object a2 = b.a(IAVInitializer.class, false);
        if (a2 != null) {
            IAVInitializer iAVInitializer = (IAVInitializer) a2;
            MethodCollector.o(8959);
            return iAVInitializer;
        }
        if (b.bc == null) {
            synchronized (IAVInitializer.class) {
                try {
                    if (b.bc == null) {
                        b.bc = new AVInitializerImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8959);
                    throw th;
                }
            }
        }
        AVInitializerImpl aVInitializerImpl = (AVInitializerImpl) b.bc;
        MethodCollector.o(8959);
        return aVInitializerImpl;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVInitializer
    public void initMonitor(Application application) {
        k kVar = k.a.f115657a;
        Objects.requireNonNull(application, "CreativeActivityMonitor: can't init with null application!");
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("CreativeActivityMonitor: init must call in main thread!");
        } else if (!kVar.f115653f) {
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                /* class com.ss.android.ugc.aweme.port.in.k.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(74596);
                }

                public final void onActivityPaused(Activity activity) {
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public final void onActivityResumed(Activity activity) {
                    k kVar = k.this;
                    new h(activity, (byte) 5);
                    kVar.b();
                }

                public final void onActivityStarted(Activity activity) {
                    k.this.f115652e++;
                    if (k.this.f115652e == 1) {
                        k.this.a(1);
                    }
                    k kVar = k.this;
                    new h(activity, (byte) 3);
                    kVar.b();
                }

                public final void onActivityStopped(Activity activity) {
                    k kVar = k.this;
                    kVar.f115652e--;
                    if (k.this.f115652e == 0) {
                        k.this.a(2);
                    }
                }

                public final void onActivityDestroyed(Activity activity) {
                    k kVar = k.this;
                    kVar.f115651d--;
                    k kVar2 = k.this;
                    new h(activity, (byte) 2);
                    kVar2.b();
                    k.this.f115649b.remove(activity);
                    if (k.a(activity)) {
                        k.this.f115648a = false;
                    }
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    k.this.f115651d++;
                    k kVar = k.this;
                    new h(activity, (byte) 1);
                    kVar.b();
                    k.this.f115649b.add(activity);
                    if (k.a(activity)) {
                        k.this.f115648a = true;
                    }
                }
            });
            kVar.f115653f = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IAVInitializer
    public void initialize(Application application) {
        boolean z;
        i.f115645a = (Application) com.google.c.a.k.a(application);
        b bVar = new b(application);
        l.d(bVar, "");
        g.f115639a = bVar;
        com.ss.android.ugc.aweme.port.in.l.f115658a = (aj) com.google.c.a.k.a(new n());
        if (a.b() != 0) {
            z = true;
        } else {
            z = false;
        }
        com.ss.android.ugc.aweme.mediachoose.helper.a.f109402a = z;
        h.f149997b = as.a();
        h.f149998c = new h.a() {
            /* class com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(51643);
            }

            @Override // com.ss.android.ugc.tools.utils.h.a
            public final void a(int i2, String str) {
                q.b("FileAdapterAndroidR code:" + i2 + ", msg:" + str);
                com.bytedance.services.apm.api.a.a("FileAdapterAndroidR code:" + i2 + ", msg:" + str + ", trace:" + Log.getStackTraceString(new Throwable()));
            }
        };
        com.ss.android.ugc.aweme.bx.a aVar = new com.ss.android.ugc.aweme.bx.a();
        l.d(aVar, "");
        com.ss.android.ugc.aweme.shortvideo.r.a.f129964a = aVar;
        com.ss.android.ugc.aweme.bx.b bVar2 = new com.ss.android.ugc.aweme.bx.b();
        l.d(bVar2, "");
        p.f134987a = bVar2;
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.k kVar = new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.k();
        l.d(kVar, "");
        j.f125970a = kVar;
        if (!((Boolean) com.ss.android.ugc.aweme.lego.b.f107384a.getValue()).booleanValue()) {
            g.a().g().a(new AVStorageManagerImpl());
        }
        f82880a = true;
        d.f150417a = c.f82924a;
        d.f150418b = f.f82927a;
        g gVar = new g(g.a());
        l.d(gVar, "");
        gVar.invoke(com.ss.android.ugc.tools.e.b.f149181b);
        h hVar = new h(this);
        l.d(hVar, "");
        hVar.invoke(com.ss.android.ugc.tools.e.b.f149182c);
        h.f.a.b bVar3 = i.f82930a;
        l.d(bVar3, "");
        bVar3.invoke(com.ss.android.ugc.tools.e.b.f149183d);
        h.f.a.b bVar4 = j.f82931a;
        l.d(bVar4, "");
        bVar4.invoke(com.ss.android.ugc.tools.e.b.f149184e);
        if (com.ss.android.ugc.tools.e.b.f149180a.compareAndSet(false, true)) {
            com.ss.android.ugc.tools.e.a aVar2 = com.ss.android.ugc.tools.e.b.f149181b;
            Application application2 = aVar2.f149174a;
            if (application2 != null) {
                l.d(application2, "");
                c.f149146a = application2;
                h.f149996a = application2;
            }
            Boolean bool = aVar2.f149175b;
            if (bool != null) {
                c.f149147b = bool.booleanValue();
            }
            j.b bVar5 = aVar2.f149176c;
            if (bVar5 != null) {
                l.d(bVar5, "");
                com.ss.android.ugc.tools.view.widget.j.f150446a = bVar5;
            }
            f fVar = aVar2.f149177d;
            if (fVar != null) {
                l.d(fVar, "");
                c.f149148c = fVar;
            }
            com.ss.android.ugc.tools.f.c cVar = aVar2.f149178e;
            if (cVar != null) {
                l.d(cVar, "");
                c.f149149d = cVar;
            }
            com.ss.android.ugc.tools.g.b bVar6 = aVar2.f149179f;
            if (bVar6 != null) {
                l.d(bVar6, "");
                c.f149150e = bVar6;
            }
            com.ss.android.ugc.tools.e.i iVar = com.ss.android.ugc.tools.e.b.f149182c;
            h.f.a.a<? extends Typeface> aVar3 = iVar.f149191b;
            if (aVar3 != null) {
                l.d(aVar3, "");
                com.ss.android.ugc.tools.view.style.f.f150194b = aVar3;
            }
            com.ss.android.ugc.tools.view.style.c cVar2 = iVar.f149190a;
            if (cVar2 != null) {
                com.ss.android.ugc.tools.view.style.f.f150193a = cVar2;
            }
            h.f.a.b<? super com.ss.android.ugc.tools.a, z> bVar7 = iVar.f149192c;
            if (bVar7 != null) {
                bVar7.invoke(com.ss.android.ugc.tools.a.f149054l);
            }
            com.ss.android.ugc.tools.utils.j jVar = com.ss.android.ugc.tools.e.b.f149183d.f149186a;
            if (jVar != null) {
                l.d(jVar, "");
                c.f149151f = jVar;
            }
            com.ss.android.ugc.tools.e.h hVar2 = com.ss.android.ugc.tools.e.b.f149184e;
            h.f.a.b<? super com.bytedance.creativex.a.a.c, z> bVar8 = hVar2.f149187a;
            if (bVar8 != null) {
                bVar8.invoke(com.ss.android.ugc.aweme.shortvideo.mapping.b.f128768a);
            }
            h.f.a.b<? super com.bytedance.creativex.a.a.c, z> bVar9 = hVar2.f149188b;
            if (bVar9 != null) {
                bVar9.invoke(com.ss.android.ugc.aweme.shortvideo.mapping.a.f128766a);
            }
            h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.model.b, z> bVar10 = hVar2.f149189c;
            if (bVar10 != null) {
                bVar10.invoke(com.ss.android.ugc.aweme.editSticker.model.c.f88246a);
            }
        }
        gr.f143026d = new ae() {
            /* class com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl.AnonymousClass2 */

            static {
                Covode.recordClassIndex(51644);
            }

            @Override // com.ss.android.ugc.aweme.utils.ae
            public final void a(String str) {
                RuntimeBehaviorServiceDiff.INSTANCE.event(str);
            }

            @Override // com.ss.android.ugc.aweme.utils.ae
            public final void a(String str, String str2) {
                RuntimeBehaviorServiceDiff.INSTANCE.event(str, str2);
            }
        };
        l.d(application, "");
        com.ss.android.ugc.aweme.df.c cVar3 = c.C1870c.f80046a;
        if (!cVar3.f80041c) {
            cVar3.f80040b = new CopyOnWriteArrayList();
            Context applicationContext = application.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            ((Application) applicationContext).registerActivityLifecycleCallbacks(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x015c: INVOKE  
                  (wrap: android.app.Application : 0x0155: CHECK_CAST (r1v8 android.app.Application) = (android.app.Application) (r1v7 'applicationContext' android.content.Context))
                  (wrap: com.ss.android.ugc.aweme.df.c$1 : 0x0159: CONSTRUCTOR  (r0v36 com.ss.android.ugc.aweme.df.c$1) = (r2v0 'cVar3' com.ss.android.ugc.aweme.df.c) call: com.ss.android.ugc.aweme.df.c.1.<init>(com.ss.android.ugc.aweme.df.c):void type: CONSTRUCTOR)
                 type: VIRTUAL call: android.app.Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks):void in method: com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl.initialize(android.app.Application):void, file: classes4.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0159: CONSTRUCTOR  (r0v36 com.ss.android.ugc.aweme.df.c$1) = (r2v0 'cVar3' com.ss.android.ugc.aweme.df.c) call: com.ss.android.ugc.aweme.df.c.1.<init>(com.ss.android.ugc.aweme.df.c):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl.initialize(android.app.Application):void, file: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.df.c, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
            // Method dump skipped, instructions count: 400
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl.initialize(android.app.Application):void");
        }
    }
