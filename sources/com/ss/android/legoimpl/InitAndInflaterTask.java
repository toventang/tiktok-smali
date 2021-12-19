package com.ss.android.legoimpl;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.a.b.a;
import com.a.b.c;
import com.a.b.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.api.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.k;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Random;

public class InitAndInflaterTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final Random f59617a = new Random();

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

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    static {
        Covode.recordClassIndex(36806);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static boolean c() {
        if (c.f4932b.f4939g || f59617a.nextFloat() < 0.005f) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        System.currentTimeMillis();
        d.a aVar = new d.a();
        aVar.f4946f = true;
        aVar.f4944d = true;
        a.f4925b = true;
        aVar.f4945e = false;
        aVar.f4942b = k.f90256e;
        if (aVar.f4942b <= 0 || aVar.f4942b > 8) {
            aVar.f4942b = 1;
        }
        if (Build.VERSION.SDK_INT >= 24 && Build.VERSION.SDK_INT <= 27) {
            aVar.f4942b = 1;
        }
        aVar.f4947g = com.ss.android.ugc.aweme.s.d.a();
        aVar.f4948h = false;
        aVar.f4943c = R.style.o1;
        AnonymousClass1 r1 = new b() {
            /* class com.ss.android.legoimpl.InitAndInflaterTask.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36807);
            }

            @Override // com.bytedance.nita.api.b
            public final void a(Throwable th) {
                if (!c.f4932b.f4939g) {
                    com.bytedance.ies.ugc.appcontext.c.f34591a.getValue();
                    if (InitAndInflaterTask.c()) {
                        com.bytedance.c.a.a.a.b.a(th, "x2c");
                        return;
                    }
                    return;
                }
                throw new IllegalStateException(th);
            }

            @Override // com.bytedance.nita.api.b
            public final void a(long j2, com.bytedance.nita.api.c cVar) {
                boolean z;
                if (InitAndInflaterTask.c()) {
                    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c.f4932b.f4939g) {
                        cVar.a();
                    }
                    r.a().execute(new c(j2, cVar, z));
                }
            }

            @Override // com.bytedance.nita.api.b
            public final void a(long j2, com.bytedance.nita.api.c cVar, boolean z) {
                boolean z2;
                if (InitAndInflaterTask.c()) {
                    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (c.f4932b.f4939g) {
                        cVar.a();
                    }
                    r.a().execute(new d(j2, cVar, z, z2));
                }
            }
        };
        aVar.f4941a = r1;
        a.f4924a = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0049: SPUT  
              (wrap: com.a.b.d$a$1 : 0x0046: CONSTRUCTOR  (r0v5 com.a.b.d$a$1) = (r3v0 'aVar' com.a.b.d$a), (r1v1 'r1' com.ss.android.legoimpl.InitAndInflaterTask$1) call: com.a.b.d.a.1.<init>(com.a.b.d$a, com.bytedance.nita.api.b):void type: CONSTRUCTOR)
             com.a.b.a.a com.a.b.c.a in method: com.ss.android.legoimpl.InitAndInflaterTask.a(android.content.Context):void, file: classes4.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0046: CONSTRUCTOR  (r0v5 com.a.b.d$a$1) = (r3v0 'aVar' com.a.b.d$a), (r1v1 'r1' com.ss.android.legoimpl.InitAndInflaterTask$1) call: com.a.b.d.a.1.<init>(com.a.b.d$a, com.bytedance.nita.api.b):void type: CONSTRUCTOR in method: com.ss.android.legoimpl.InitAndInflaterTask.a(android.content.Context):void, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:439)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.a.b.d, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 18 more
            */
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.legoimpl.InitAndInflaterTask.a(android.content.Context):void");
    }
}
