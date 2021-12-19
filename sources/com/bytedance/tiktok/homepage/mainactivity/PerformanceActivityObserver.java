package com.bytedance.tiktok.homepage.mainactivity;

import android.app.Activity;
import android.content.Context;
import android.view.Choreographer;
import androidx.fragment.app.e;
import com.a.b.c;
import com.bytedance.aweme.core.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.liko.leakdetector.LeakDetectorInstaller;
import com.bytedance.liko.leakdetector.b;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.q;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.v;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView;
import com.ss.android.ugc.aweme.ca.g;
import com.ss.android.ugc.aweme.ca.h;
import com.ss.android.ugc.aweme.commercialize.views.cards.X2CAdWebPage;
import com.ss.android.ugc.aweme.db.a;
import com.ss.android.ugc.aweme.experiment.aw;
import com.ss.android.ugc.aweme.experiment.cn;
import com.ss.android.ugc.aweme.experiment.cv;
import com.ss.android.ugc.aweme.experiment.cw;
import com.ss.android.ugc.aweme.experiment.de;
import com.ss.android.ugc.aweme.experiment.fe;
import com.ss.android.ugc.aweme.experiment.gx;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.net.monitor.n;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.MultipartBody;

public class PerformanceActivityObserver {

    /* renamed from: a  reason: collision with root package name */
    private boolean f44127a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f44128b;

    interface FileApi {
        static {
            Covode.recordClassIndex(27041);
        }

        @t
        @q
        b<String> upload(@ag String str, @v List<MultipartBody.Part> list);
    }

    static {
        Covode.recordClassIndex(27040);
    }

    /* access modifiers changed from: package-private */
    public class LikoInitTask implements w {
        static {
            Covode.recordClassIndex(27042);
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

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BACKGROUND;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        LikoInitTask() {
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            try {
                b.a.f40100a = new m(this);
                LeakDetectorInstaller.INSTANCE.tryInstall(context);
                if (d.n > 0) {
                    f.g().d(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0027: INVOKE  
                          (wrap: f.a.t<java.lang.Boolean> : 0x001e: INVOKE  (r1v0 f.a.t<java.lang.Boolean>) =  type: STATIC call: com.bytedance.ies.ugc.appcontext.f.g():f.a.t)
                          (wrap: com.bytedance.liko.a.b$1 : 0x0024: CONSTRUCTOR  (r0v5 com.bytedance.liko.a.b$1) = 
                          (wrap: android.os.Handler : 0x0016: CONSTRUCTOR  (r3v0 android.os.Handler) = 
                          (wrap: android.os.Looper : 0x0012: INVOKE  (r0v4 android.os.Looper) =  type: STATIC call: android.os.Looper.getMainLooper():android.os.Looper)
                         call: android.os.Handler.<init>(android.os.Looper):void type: CONSTRUCTOR)
                          (wrap: com.bytedance.liko.a.b$b : 0x001b: CONSTRUCTOR  (r2v0 com.bytedance.liko.a.b$b) =  call: com.bytedance.liko.a.b.b.<init>():void type: CONSTRUCTOR)
                         call: com.bytedance.liko.a.b.1.<init>(android.os.Handler, com.bytedance.liko.a.b$b):void type: CONSTRUCTOR)
                         type: VIRTUAL call: f.a.t.d(f.a.d.f):f.a.b.b in method: com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver.LikoInitTask.a(android.content.Context):void, file: classes2.dex
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
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: CONSTRUCTOR  (r0v5 com.bytedance.liko.a.b$1) = 
                          (wrap: android.os.Handler : 0x0016: CONSTRUCTOR  (r3v0 android.os.Handler) = 
                          (wrap: android.os.Looper : 0x0012: INVOKE  (r0v4 android.os.Looper) =  type: STATIC call: android.os.Looper.getMainLooper():android.os.Looper)
                         call: android.os.Handler.<init>(android.os.Looper):void type: CONSTRUCTOR)
                          (wrap: com.bytedance.liko.a.b$b : 0x001b: CONSTRUCTOR  (r2v0 com.bytedance.liko.a.b$b) =  call: com.bytedance.liko.a.b.b.<init>():void type: CONSTRUCTOR)
                         call: com.bytedance.liko.a.b.1.<init>(android.os.Handler, com.bytedance.liko.a.b$b):void type: CONSTRUCTOR in method: com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver.LikoInitTask.a(android.content.Context):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 24 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.liko.a.b, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 30 more
                        */
                    /*
                        this = this;
                        com.bytedance.tiktok.homepage.mainactivity.m r0 = new com.bytedance.tiktok.homepage.mainactivity.m     // Catch:{ all -> 0x004d }
                        r0.<init>(r4)     // Catch:{ all -> 0x004d }
                        com.bytedance.liko.leakdetector.b.a.f40100a = r0     // Catch:{ all -> 0x004d }
                        com.bytedance.liko.leakdetector.LeakDetectorInstaller r0 = com.bytedance.liko.leakdetector.LeakDetectorInstaller.INSTANCE     // Catch:{ all -> 0x004d }
                        r0.tryInstall(r5)     // Catch:{ all -> 0x004d }
                        int r0 = com.bytedance.ies.ugc.appcontext.d.n     // Catch:{ all -> 0x004d }
                        if (r0 <= 0) goto L_0x0046
                        android.os.Handler r3 = new android.os.Handler     // Catch:{ all -> 0x004d }
                        android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x004d }
                        r3.<init>(r0)     // Catch:{ all -> 0x004d }
                        com.bytedance.liko.a.b$b r2 = new com.bytedance.liko.a.b$b     // Catch:{ all -> 0x004d }
                        r2.<init>()     // Catch:{ all -> 0x004d }
                        f.a.t r1 = com.bytedance.ies.ugc.appcontext.f.g()     // Catch:{ all -> 0x004d }
                        com.bytedance.liko.a.b$1 r0 = new com.bytedance.liko.a.b$1     // Catch:{ all -> 0x004d }
                        r0.<init>(r3, r2)     // Catch:{ all -> 0x004d }
                        r1.d(r0)     // Catch:{ all -> 0x004d }
                        android.content.Context r1 = com.bytedance.ies.ugc.appcontext.d.a()     // Catch:{ all -> 0x004d }
                        android.content.res.Resources r0 = r1.getResources()     // Catch:{ all -> 0x004d }
                        android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ all -> 0x004d }
                        int r0 = r0.widthPixels     // Catch:{ all -> 0x004d }
                        com.bytedance.liko.b.c.f40066b = r0     // Catch:{ all -> 0x004d }
                        android.content.res.Resources r0 = r1.getResources()     // Catch:{ all -> 0x004d }
                        android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ all -> 0x004d }
                        int r0 = r0.heightPixels     // Catch:{ all -> 0x004d }
                        com.bytedance.liko.b.c.f40067c = r0     // Catch:{ all -> 0x004d }
                    L_0x0046:
                        com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask$2 r0 = new com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask$2     // Catch:{ all -> 0x004d }
                        r0.<init>()     // Catch:{ all -> 0x004d }
                        com.bytedance.liko.leakdetector.strategy.a.a.d.f40136a = r0     // Catch:{ all -> 0x004d }
                    L_0x004d:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver.LikoInitTask.a(android.content.Context):void");
                }
            }

            static void a(e eVar) {
                if (cw.f89734a || fe.b() || cv.f89733c || h.a()) {
                    a.f79357a.a();
                }
                if (com.ss.android.ugc.aweme.experiment.e.f89880b) {
                    ((X2CAdWebPage) com.ss.android.ugc.aweme.lego.f.b(X2CAdWebPage.class)).a((Activity) eVar);
                }
                n.f112472c = cn.f89703a;
                ((ILocationService) ServiceManager.get().getService(ILocationService.class)).setOpt(cn.f89703a);
            }

            public final void a(e eVar, Hox hox) {
                if (!aw.c()) {
                    com.ss.android.ugc.aweme.lego.f.e().a(new PreloadActicityTask()).a(com.ss.android.ugc.aweme.homepage.business.b.a(hox)).a();
                }
                b.a aVar = new b.a();
                aVar.f25815b = 30;
                aVar.f25814a = b.EnumC0550b.COMMIT;
                com.bytedance.aweme.core.b a2 = aVar.a();
                l.c(a2, "");
                l.c(a2, "");
                com.bytedance.aweme.core.a.f25798d = a2;
                if (!com.bytedance.aweme.core.a.f25797c) {
                    com.bytedance.aweme.core.a.f25796b = Choreographer.getInstance();
                    com.bytedance.aweme.core.a.f25801g = com.bytedance.aweme.core.a.a();
                    while (true) {
                        if (com.bytedance.aweme.core.a.f25795a < 0) {
                            break;
                        }
                        try {
                            Method method = com.bytedance.aweme.core.a.f25801g;
                            if (method == null) {
                                l.a();
                            }
                            com.bytedance.aweme.core.a.a(method, com.bytedance.aweme.core.a.f25796b, new Object[]{Integer.valueOf(com.bytedance.aweme.core.a.f25795a), com.bytedance.aweme.core.a.f25802h, null, 0});
                        } catch (Exception unused) {
                            if (com.bytedance.aweme.core.a.f25795a == 0) {
                                com.bytedance.aweme.core.a.f25801g = null;
                            }
                            com.bytedance.aweme.core.a.f25795a--;
                        }
                    }
                    com.bytedance.aweme.core.a.f25797c = true;
                }
                com.ss.android.ugc.aweme.lancet.d.f107197e = true;
                com.ss.android.j.a.f59594a = cn.f89703a;
                if (aw.b()) {
                    g.a(new k(this, eVar));
                } else {
                    a(eVar);
                }
            }

            public final void a(e eVar, boolean z) {
                if (z) {
                    if (com.ss.android.ugc.aweme.lego.a.b.a()) {
                        if (com.ss.android.ugc.aweme.at.a.f67047a.isEmpty()) {
                            com.ss.android.ugc.aweme.at.a.f67047a.put("system_launch", new AtomicBoolean(false));
                            com.ss.android.ugc.aweme.at.a.f67047a.put("system_launch_1_minute", new AtomicBoolean(false));
                            com.ss.android.ugc.aweme.at.a.f67047a.put("system_launch_1_minute_feed", new AtomicBoolean(false));
                            com.ss.android.ugc.aweme.at.a.f67047a.put("system_launch_2_minute", new AtomicBoolean(false));
                            com.ss.android.ugc.aweme.at.a.f67047a.put("system_launch_2_minute_feed", new AtomicBoolean(false));
                        }
                        Iterator<AtomicBoolean> it = com.ss.android.ugc.aweme.at.a.f67047a.values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().get()) {
                                    break;
                                }
                            } else {
                                da.a.a("system_launch").a();
                                if (gx.b()) {
                                    da.a.a("system_launch_1_minute").a();
                                }
                                if (gx.c()) {
                                    da.a.a("system_launch_1_minute_feed").a();
                                }
                                if (gx.d()) {
                                    da.a.a("system_launch_2_minute").a();
                                }
                                if (gx.e()) {
                                    da.a.a("system_launch_2_minute_feed").a();
                                }
                                f.g().d(com.ss.android.ugc.aweme.at.b.f67057a);
                            }
                        }
                        if (!this.f44127a) {
                            this.f44127a = true;
                            com.ss.android.ugc.aweme.lego.f.e().a(new LikoInitTask()).a();
                            if (!com.ss.android.ugc.aweme.s.e.f()) {
                                c.a((Context) eVar, (int) R.layout.ajc);
                                c.a((Context) eVar, (int) R.layout.le);
                            }
                        }
                    }
                    if (!this.f44128b) {
                        this.f44128b = true;
                        p.f107614a.postDelayed(l.f44174a, 10000);
                    }
                    SmartAvatarBorderView.setOpt(de.f89775a);
                }
            }
        }
