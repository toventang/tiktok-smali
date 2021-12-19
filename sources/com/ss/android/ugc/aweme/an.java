package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.f.g;
import com.bytedance.sdk.a.k.a.c;
import com.ss.android.account.f;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.AgeGateService;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.account.network.a.a;
import com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.services.BindService;
import com.ss.android.ugc.aweme.services.DataService;
import com.ss.android.ugc.aweme.services.InterceptorService;
import com.ss.android.ugc.aweme.services.LoginMethodService;
import com.ss.android.ugc.aweme.services.LoginService;
import com.ss.android.ugc.aweme.services.PasswordService;
import com.ss.android.ugc.aweme.services.ProAccountService;
import com.ss.android.ugc.aweme.services.RnAndH5Service;
import com.ss.android.ugc.aweme.services.TelecomCarrierService;
import com.ss.android.ugc.aweme.services.TwoStepVerificationService;
import com.ss.android.ugc.aweme.services.VerificationService;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class an implements IAccountService {

    /* renamed from: a  reason: collision with root package name */
    LoginService f66374a;

    /* renamed from: b  reason: collision with root package name */
    BindService f66375b;

    /* renamed from: c  reason: collision with root package name */
    VerificationService f66376c;

    /* renamed from: d  reason: collision with root package name */
    PasswordService f66377d;

    /* renamed from: e  reason: collision with root package name */
    ProAccountService f66378e;

    /* renamed from: f  reason: collision with root package name */
    bw f66379f;

    /* renamed from: g  reason: collision with root package name */
    private AgeGateService f66380g;

    /* renamed from: h  reason: collision with root package name */
    private g f66381h;

    /* renamed from: i  reason: collision with root package name */
    private RnAndH5Service f66382i;

    /* renamed from: j  reason: collision with root package name */
    private InterceptorService f66383j;

    /* renamed from: k  reason: collision with root package name */
    private DataService f66384k;

    /* renamed from: l  reason: collision with root package name */
    private LoginMethodService f66385l;

    /* renamed from: m  reason: collision with root package name */
    private ca f66386m;
    private cb n;
    private final AtomicBoolean o = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(40785);
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final boolean p() {
        return this.o.get();
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final String b() {
        return d.a().toUpperCase(Locale.ROOT);
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final IAgeGateService c() {
        o();
        if (this.f66380g == null) {
            this.f66380g = new AgeGateService();
        }
        return this.f66380g;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final bk d() {
        o();
        if (this.f66384k == null) {
            this.f66384k = new DataService();
        }
        return this.f66384k;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final IAccountUserService e() {
        o();
        if (this.f66381h == null) {
            this.f66381h = new g();
            dr.f83127b = NetworkProxyAccount.f65195b;
        }
        return this.f66381h;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final bv f() {
        o();
        if (this.f66382i == null) {
            this.f66382i = new RnAndH5Service();
        }
        return this.f66382i;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final bo g() {
        o();
        if (this.f66374a == null) {
            this.f66374a = new LoginService();
        }
        return this.f66374a;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final bj h() {
        o();
        if (this.f66375b == null) {
            this.f66375b = new BindService();
        }
        return this.f66375b;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final br i() {
        o();
        if (this.f66377d == null) {
            this.f66377d = new PasswordService();
        }
        return this.f66377d;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final bs j() {
        o();
        if (this.f66378e == null) {
            this.f66378e = new ProAccountService();
        }
        return this.f66378e;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final bn k() {
        o();
        if (this.f66385l == null) {
            this.f66385l = new LoginMethodService();
        }
        return this.f66385l;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final ca l() {
        o();
        if (this.f66386m == null) {
            this.f66386m = new TelecomCarrierService();
        }
        return this.f66386m;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final cb m() {
        o();
        if (this.n == null) {
            this.n = new TwoStepVerificationService();
        }
        return this.n;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final bm n() {
        o();
        if (this.f66383j == null) {
            this.f66383j = new InterceptorService();
        }
        return this.f66383j;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final void o() {
        if (!this.o.get()) {
            synchronized (this.o) {
                if (!this.o.get()) {
                    a();
                    this.o.set(true);
                }
            }
        }
    }

    private void a() {
        cj.f71084b = this;
        t.a("aweme://bind/mobile/", BindOrModifyPhoneActivity.class);
        a aVar = new a();
        f.f58194a = aVar;
        com.bytedance.sdk.a.k.c.d.a(com.bytedance.sdk.a.k.a.a.class, g.a(aVar.b()));
        if (com.bytedance.sdk.a.k.c.d.a(c.class) == null) {
            com.bytedance.sdk.a.k.c.d.a(c.class, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002c: INVOKE  
                  (wrap: java.lang.Class : 0x0025: CONST_CLASS   com.bytedance.sdk.a.k.a.c.class)
                  (wrap: com.ss.android.account.f$1 : 0x0029: CONSTRUCTOR  (r0v29 com.ss.android.account.f$1) =  call: com.ss.android.account.f.1.<init>():void type: CONSTRUCTOR)
                 type: STATIC call: com.bytedance.sdk.a.k.c.d.a(java.lang.Class, com.bytedance.sdk.a.k.a.d):void in method: com.ss.android.ugc.aweme.an.a():void, file: classes.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0029: CONSTRUCTOR  (r0v29 com.ss.android.account.f$1) =  call: com.ss.android.account.f.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.an.a():void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.account.f, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
            // Method dump skipped, instructions count: 208
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.an.a():void");
        }

        @Override // com.ss.android.ugc.aweme.IAccountService
        public final void a(IAccountService.b bVar) {
            cj.a(bVar);
        }

        @Override // com.ss.android.ugc.aweme.IAccountService
        public final void b(IAccountService.b bVar) {
            synchronized (cj.class) {
                cj.f71083a.remove(bVar);
            }
        }
    }
