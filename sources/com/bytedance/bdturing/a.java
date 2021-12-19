package com.bytedance.bdturing;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.HandlerThread;
import com.bytedance.bdturing.a.a;
import com.bytedance.bdturing.e.g;
import com.bytedance.bdturing.j;
import com.bytedance.bdturing.m;
import com.bytedance.bdturing.twiceverify.c;
import com.bytedance.bdturing.verify.RiskControlService;
import com.bytedance.bdturing.verify.TwiceVerifyService;
import com.bytedance.bdturing.verify.a.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public c f26393a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26394b;

    /* renamed from: c  reason: collision with root package name */
    private RiskControlService f26395c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, com.bytedance.bdturing.verify.a> f26396d;

    /* renamed from: e  reason: collision with root package name */
    private long f26397e;

    static {
        Covode.recordClassIndex(15527);
    }

    public static a a() {
        return C0562a.f26400a;
    }

    /* renamed from: com.bytedance.bdturing.a$a  reason: collision with other inner class name */
    public static class C0562a {

        /* renamed from: a  reason: collision with root package name */
        public static a f26400a = new a((byte) 0);

        static {
            Covode.recordClassIndex(15529);
        }
    }

    private a() {
        this.f26396d = new HashMap<>();
        this.f26397e = 0;
    }

    public final void b() {
        if (this.f26394b) {
            this.f26395c.dismissVerifyDialog();
        }
    }

    private boolean c() {
        boolean z;
        if (System.currentTimeMillis() - this.f26397e < 500) {
            z = true;
        } else {
            z = false;
        }
        this.f26397e = System.currentTimeMillis();
        return z;
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    private void a(com.bytedance.bdturing.verify.a aVar) {
        if (!this.f26396d.containsKey(aVar.getClass().getName())) {
            this.f26396d.put(aVar.getClass().getName(), aVar);
        }
    }

    public final synchronized a a(final c cVar) {
        MethodCollector.i(1290);
        if (this.f26394b) {
            MethodCollector.o(1290);
            return this;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f26393a = cVar;
        if (cVar == null || cVar.o == null) {
            RuntimeException runtimeException = new RuntimeException("config or applicationContext is null");
            MethodCollector.o(1290);
            throw runtimeException;
        }
        if (cVar.v == null) {
            try {
                cVar.v = (com.bytedance.bdturing.d.a) Class.forName("com.bytedance.bdturing.ttnet.TTNetHttpClient").getConstructor(Context.class).newInstance(cVar.o);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (cVar.v == null || cVar.u == null) {
            RuntimeException runtimeException2 = new RuntimeException("httpClient or eventClient is null");
            MethodCollector.o(1290);
            throw runtimeException2;
        }
        m mVar = m.a.f26544a;
        if (mVar.f26542a == null) {
            synchronized (m.class) {
                try {
                    if (mVar.f26542a == null) {
                        mVar.f26542a = new HandlerThread("TuringVerifyThread");
                        mVar.f26542a.start();
                        mVar.f26543b = new m.b(mVar, mVar.f26542a.getLooper(), (byte) 0);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1290);
                    throw th;
                }
            }
        }
        m.a.f26544a.a(new Runnable() {
            /* class com.bytedance.bdturing.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15528);
            }

            public final void run() {
                MethodCollector.i(1280);
                Context context = cVar.o;
                g gVar = g.f26485h;
                a.AnonymousClass2 r1 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000d: CONSTRUCTOR  (r1v0 'r1' com.bytedance.bdturing.a.a$2) =  call: com.bytedance.bdturing.a.a.2.<init>():void type: CONSTRUCTOR in method: com.bytedance.bdturing.a.1.run():void, file: classes9.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.bdturing.a.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 14 more
                    */
                /*
                // Method dump skipped, instructions count: 273
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.a.AnonymousClass1.run():void");
            }
        });
        RiskControlService riskControlService = new RiskControlService();
        this.f26395c = riskControlService;
        a(riskControlService);
        a(new TwiceVerifyService());
        try {
            a((com.bytedance.bdturing.verify.a) Class.forName("com.bytedance.bdturing.verify.IdentityService").newInstance());
        } catch (ClassNotFoundException e3) {
            g.a(e3);
        } catch (IllegalAccessException e4) {
            g.a(e4);
        } catch (InstantiationException e5) {
            g.a(e5);
        }
        c.a().f26560a = this.f26393a.w;
        this.f26394b = true;
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", currentTimeMillis2);
            jSONObject.put("key", "init");
            e.a("turing_verify_sdk", jSONObject);
        } catch (JSONException e6) {
            g.a(e6);
        }
        MethodCollector.o(1290);
        return this;
    }

    public final void a(Activity activity, b bVar) {
        if (b(activity, bVar)) {
            f fVar = new f(this.f26393a.B);
            fVar.f26575c = this.f26393a.q;
            b(activity, fVar, bVar);
        }
    }

    private boolean b(Activity activity, b bVar) {
        if (!this.f26394b || bVar == null || activity == null) {
            bVar.a(2);
            return false;
        } else if (c()) {
            g.a("invoke multi times, u should take a breath");
            bVar.a(1000);
            return false;
        } else {
            int i2 = Build.VERSION.SDK_INT;
            return true;
        }
    }

    private void b(Activity activity, com.bytedance.bdturing.verify.a.a aVar, b bVar) {
        g.a("BdTuring showVerifyDialog");
        aVar.f26573a = activity;
        for (com.bytedance.bdturing.verify.a aVar2 : this.f26396d.values()) {
            if (aVar2.isProcess(aVar.b())) {
                aVar2.execute(aVar, bVar);
                return;
            }
        }
        bVar.a(996);
    }

    public final void a(Activity activity, com.bytedance.bdturing.verify.a.a aVar, b bVar) {
        aVar.b();
        if (b(activity, bVar)) {
            j jVar = j.a.f26515a;
            int b2 = aVar.b();
            if (jVar.f26511a != null) {
                l lVar = jVar.f26511a.get();
                if (jVar.f26514d && lVar != null && b2 == lVar.o.b()) {
                    jVar.f26514d = false;
                    jVar.f26513c = System.currentTimeMillis();
                    lVar.a(com.bytedance.bdturing.c.c.a("bytedcert.refreshVerifyView", "call", new JSONObject(), "bytedcert.refreshVerifyView"));
                    lVar.show();
                    return;
                }
            }
            b(activity, aVar, bVar);
        }
    }
}
