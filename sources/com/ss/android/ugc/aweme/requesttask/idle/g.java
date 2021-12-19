package com.ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.experiment.ai;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import h.f.b.l;
import java.util.List;

public final class g implements r {
    static {
        Covode.recordClassIndex(78637);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return s.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "request_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        return aa.NORMAL;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f120706a = new a();

        static {
            Covode.recordClassIndex(78638);
        }

        a() {
        }

        public final void run() {
            b.g().queryUser();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        l.d(context, "");
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            if (((Boolean) ai.f89535a.getValue()).booleanValue()) {
                new Handler(Looper.getMainLooper()).postDelayed(a.f120706a, 5000);
            } else {
                b.g().queryUser();
            }
            b.g().refreshPassportUserInfo();
            n.a().a(null, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0042: INVOKE  
                  (wrap: com.ss.android.ugc.aweme.base.n : 0x0037: INVOKE  (r3v0 com.ss.android.ugc.aweme.base.n) =  type: STATIC call: com.ss.android.ugc.aweme.base.n.a():com.ss.android.ugc.aweme.base.n)
                  (null android.os.Handler)
                  (wrap: com.ss.android.ugc.aweme.app.h$1 : 0x003e: CONSTRUCTOR  (r1v1 com.ss.android.ugc.aweme.app.h$1) =  call: com.ss.android.ugc.aweme.app.h.1.<init>():void type: CONSTRUCTOR)
                  (0 int)
                 type: VIRTUAL call: com.ss.android.ugc.aweme.base.n.a(android.os.Handler, java.util.concurrent.Callable, int):void in method: com.ss.android.ugc.aweme.requesttask.idle.g.a(android.content.Context, boolean):void, file: classes2.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003e: CONSTRUCTOR  (r1v1 com.ss.android.ugc.aweme.app.h$1) =  call: com.ss.android.ugc.aweme.app.h.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.requesttask.idle.g.a(android.content.Context, boolean):void, file: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.app.h, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
                this = this;
                java.lang.String r1 = ""
                h.f.b.l.d(r5, r1)
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.b.g()
                h.f.b.l.b(r0, r1)
                boolean r0 = r0.isLogin()
                if (r0 == 0) goto L_0x0045
                h.h r0 = com.ss.android.ugc.aweme.experiment.ai.f89535a
                java.lang.Object r0 = r0.getValue()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x0046
                android.os.Handler r3 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r3.<init>(r0)
                com.ss.android.ugc.aweme.requesttask.idle.g$a r2 = com.ss.android.ugc.aweme.requesttask.idle.g.a.f120706a
                r0 = 5000(0x1388, double:2.4703E-320)
                r3.postDelayed(r2, r0)
            L_0x0030:
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.b.g()
                r0.refreshPassportUserInfo()
                com.ss.android.ugc.aweme.base.n r3 = com.ss.android.ugc.aweme.base.n.a()
                r2 = 0
                com.ss.android.ugc.aweme.app.h$1 r1 = new com.ss.android.ugc.aweme.app.h$1
                r1.<init>()
                r0 = 0
                r3.a(r2, r1, r0)
            L_0x0045:
                return
            L_0x0046:
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.b.g()
                r0.queryUser()
                goto L_0x0030
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.requesttask.idle.g.a(android.content.Context, boolean):void");
        }
    }
