package com.ss.android.ugc.aweme.sec.captcha;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.bdturing.a;
import com.bytedance.bdturing.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.e;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;
import h.h;
import h.i;
import h.n;
import java.lang.ref.WeakReference;

public final class SecCaptcha implements com.bytedance.bdturing.b, au {

    /* renamed from: i  reason: collision with root package name */
    public static final a f121785i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.bdturing.a f121786a = a.C0562a.f26400a.a(a());

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<Activity> f121787b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.secapi.a f121788c;

    /* renamed from: d  reason: collision with root package name */
    public String f121789d;

    /* renamed from: e  reason: collision with root package name */
    public String f121790e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f121791f;

    /* renamed from: g  reason: collision with root package name */
    public final a f121792g;

    /* renamed from: h  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.secapi.b f121793h;

    /* renamed from: j  reason: collision with root package name */
    private final h f121794j = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(79312);
    }

    public final com.bytedance.bdturing.c a() {
        return (com.bytedance.bdturing.c) this.f121794j.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            release();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79313);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SecCaptcha f121797a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f121798b;

        static {
            Covode.recordClassIndex(79317);
        }

        public c(SecCaptcha secCaptcha, Activity activity) {
            this.f121797a = secCaptcha;
            this.f121798b = activity;
        }

        public final void run() {
            Activity activity = this.f121798b;
            if (activity instanceof m) {
                ((m) activity).getLifecycle().a(this.f121797a);
            }
        }
    }

    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SecCaptcha f121799a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f121800b;

        static {
            Covode.recordClassIndex(79318);
        }

        public d(SecCaptcha secCaptcha, Activity activity) {
            this.f121799a = secCaptcha;
            this.f121800b = activity;
        }

        public final void run() {
            Activity activity = this.f121800b;
            if (activity instanceof m) {
                ((m) activity).getLifecycle().a(this.f121799a);
            }
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void release() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f121787b;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        if (activity instanceof m) {
            ((m) activity).getLifecycle().b(this);
        }
        com.bytedance.bdturing.a aVar = this.f121786a;
        if (aVar != null) {
            aVar.b();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.bdturing.c> {
        final /* synthetic */ SecCaptcha this$0;

        static {
            Covode.recordClassIndex(79314);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SecCaptcha secCaptcha) {
            super(0);
            this.this$0 = secCaptcha;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.bdturing.c invoke() {
            c.b bVar;
            c.a aVar = new c.a();
            aVar.f26431m = false;
            aVar.f26420b = String.valueOf(this.this$0.f121792g.f121802b);
            aVar.f26422d = this.this$0.f121792g.f121803c;
            aVar.f26425g = com.bytedance.ies.ugc.appcontext.d.i();
            aVar.f26421c = this.this$0.f121792g.f121801a;
            aVar.q = com.ss.android.ugc.aweme.i18n.language.a.b();
            aVar.f26423e = this.this$0.f121792g.f121806f;
            aVar.f26428j = this.this$0.f121792g.f121805e;
            aVar.f26427i = this.this$0.f121792g.f121804d;
            boolean equalsIgnoreCase = "IN".equalsIgnoreCase(com.ss.android.ugc.aweme.language.d.g());
            if (equalsIgnoreCase) {
                bVar = c.b.REGION_INDIA;
            } else if (equalsIgnoreCase) {
                throw new n();
            } else if (l.a((Object) true, (Object) true)) {
                bVar = c.b.REGION_USA_EAST;
            } else if (l.a((Object) true, (Object) false)) {
                bVar = c.b.REGION_SINGAPOER;
            } else {
                throw new n();
            }
            aVar.f26419a = bVar;
            aVar.n = AnonymousClass1.f121795a;
            aVar.s = AnonymousClass2.f121796a;
            aVar.p = new com.ss.android.ugc.aweme.sec.captcha.a.b();
            Context applicationContext = this.this$0.f121791f.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            aVar.f26426h = applicationContext;
            return new com.bytedance.bdturing.c(aVar, (byte) 0);
        }
    }

    @Override // com.bytedance.bdturing.b
    public final void b(int i2) {
        com.ss.android.ugc.aweme.framework.a.a.a(4, "Sec", "popCaptcha-onSuccess, code=".concat(String.valueOf(i2)));
        com.ss.android.ugc.aweme.secapi.a aVar = this.f121788c;
        if (aVar != null) {
            aVar.a(true, i2);
        }
    }

    @Override // com.bytedance.bdturing.b
    public final void a(int i2) {
        com.ss.android.ugc.aweme.framework.a.a.a(4, "Sec", "popCaptcha-onFail, code=".concat(String.valueOf(i2)));
        com.ss.android.ugc.aweme.secapi.a aVar = this.f121788c;
        if (aVar != null) {
            aVar.a(false, i2);
        }
        com.ss.android.ugc.aweme.secapi.a aVar2 = this.f121788c;
        if (aVar2 != null) {
            aVar2.a();
        }
    }

    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f121792g.b(str);
        this.f121792g.a(str2);
        a().f26413h = this.f121792g.f121804d;
        a().f26417l = this.f121792g.f121805e;
    }

    public SecCaptcha(Context context, a aVar, com.ss.android.ugc.aweme.secapi.b bVar) {
        l.d(context, "");
        l.d(aVar, "");
        l.d(bVar, "");
        this.f121791f = context;
        this.f121792g = aVar;
        this.f121793h = bVar;
        String a2 = bVar.a();
        this.f121789d = a2 == null ? "" : a2;
        String b2 = bVar.b();
        this.f121790e = b2 == null ? "" : b2;
        e.a((e.k) 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0042: INVOKE  
              (wrap: com.bytedance.frameworks.baselib.network.http.e$k : ?: CAST (com.bytedance.frameworks.baselib.network.http.e$k) (wrap: com.bytedance.bdturing.ttnet.a$2 : 0x003f: CONSTRUCTOR  (r0v8 com.bytedance.bdturing.ttnet.a$2) =  call: com.bytedance.bdturing.ttnet.a.2.<init>():void type: CONSTRUCTOR))
             type: STATIC call: com.bytedance.frameworks.baselib.network.http.e.a(com.bytedance.frameworks.baselib.network.http.e$k):void in method: com.ss.android.ugc.aweme.sec.captcha.SecCaptcha.<init>(android.content.Context, com.ss.android.ugc.aweme.sec.captcha.a, com.ss.android.ugc.aweme.secapi.b):void, file: classes.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: CAST (com.bytedance.frameworks.baselib.network.http.e$k) (wrap: com.bytedance.bdturing.ttnet.a$2 : 0x003f: CONSTRUCTOR  (r0v8 com.bytedance.bdturing.ttnet.a$2) =  call: com.bytedance.bdturing.ttnet.a.2.<init>():void type: CONSTRUCTOR) in method: com.ss.android.ugc.aweme.sec.captcha.SecCaptcha.<init>(android.content.Context, com.ss.android.ugc.aweme.sec.captcha.a, com.ss.android.ugc.aweme.secapi.b):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: CONSTRUCTOR  (r0v8 com.bytedance.bdturing.ttnet.a$2) =  call: com.bytedance.bdturing.ttnet.a.2.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.sec.captcha.SecCaptcha.<init>(android.content.Context, com.ss.android.ugc.aweme.sec.captcha.a, com.ss.android.ugc.aweme.secapi.b):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:290)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.bdturing.ttnet.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 24 more
            */
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sec.captcha.SecCaptcha.<init>(android.content.Context, com.ss.android.ugc.aweme.sec.captcha.a, com.ss.android.ugc.aweme.secapi.b):void");
    }
}
