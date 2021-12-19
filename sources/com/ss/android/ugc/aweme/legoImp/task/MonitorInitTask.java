package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm.a;
import com.bytedance.apm.config.c;
import com.bytedance.apm.g.b;
import com.bytedance.apm.impl.DefaultTTNetImpl;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class MonitorInitTask implements w {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f107840a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f107841b = {"https://mon-va.tiktokv.com/monitor/collect/c/exception"};

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f107842c;

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
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static {
        String str;
        Covode.recordClassIndex(69064);
        String[] strArr = new String[3];
        String str2 = "https://mon.tiktokv.com/monitor/collect/";
        if (d.c()) {
            str = str2;
        } else {
            str = "https://mon-va.tiktokv.com/monitor/collect/";
        }
        strArr[0] = str;
        if (d.c()) {
            str2 = "https://mon-va.tiktokv.com/monitor/collect/";
        }
        strArr[1] = str2;
        strArr[2] = "https://mon-sg.tiktokv.com/monitor/collect/";
        f107842c = new ArrayList(Arrays.asList(strArr));
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        String str;
        boolean z = false;
        if (f107840a.compareAndSet(false, true)) {
            a.C0521a.f24346a.a(com.bytedance.ies.ugc.appcontext.d.a());
            c.a aVar = new c.a();
            JSONObject headerCopy = AppLog.getHeaderCopy();
            if (headerCopy != null) {
                aVar.a(headerCopy);
            }
            String[] strArr = new String[3];
            String str2 = "https://mon.tiktokv.com/monitor/appmonitor/v2/settings";
            if (d.c()) {
                str = str2;
            } else {
                str = "https://mon-va.tiktokv.com/monitor/appmonitor/v2/settings";
            }
            strArr[0] = str;
            if (d.c()) {
                str2 = "https://mon-va.tiktokv.com/monitor/appmonitor/v2/settings";
            }
            strArr[1] = str2;
            strArr[2] = "https://mon-sg.tiktokv.com/monitor/appmonitor/v2/settings";
            aVar.f24819m = Arrays.asList(strArr);
            aVar.t = Math.min(60L, 30L);
            aVar.o = Arrays.asList(f107841b);
            aVar.n = f107842c;
            aVar.a("aid", com.bytedance.ies.ugc.appcontext.d.n).a("device_id", AppLog.getServerDeviceId()).a("app_version", com.bytedance.ies.ugc.appcontext.d.f()).a("update_version_code", String.valueOf(com.bytedance.ies.ugc.appcontext.d.d())).a("channel", com.bytedance.ies.ugc.appcontext.d.s).u = new b() {
                /* class com.ss.android.ugc.aweme.legoImp.task.MonitorInitTask.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(69065);
                }

                @Override // com.bytedance.apm.g.b
                public final void a() {
                    new f.c().b((w) new RheaTraceUploadTask()).a();
                }
            };
            if (TextUtils.equals(com.bytedance.ies.ugc.appcontext.d.s, "local_test")) {
                aVar.v = new r(context);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                z = true;
            }
            aVar.f24818l = z;
            Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
            aVar.r = new DefaultTTNetImpl();
            aVar.q = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00be: IPUT  
                  (wrap: com.ss.android.ugc.aweme.app.n$1 : 0x00bb: CONSTRUCTOR  (r0v27 com.ss.android.ugc.aweme.app.n$1) =  call: com.ss.android.ugc.aweme.app.n.1.<init>():void type: CONSTRUCTOR)
                  (r2v0 'aVar' com.bytedance.apm.config.c$a)
                 com.bytedance.apm.config.c.a.q com.bytedance.apm.core.b in method: com.ss.android.ugc.aweme.legoImp.task.MonitorInitTask.a(android.content.Context):void, file: classes2.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00bb: CONSTRUCTOR  (r0v27 com.ss.android.ugc.aweme.app.n$1) =  call: com.ss.android.ugc.aweme.app.n.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.legoImp.task.MonitorInitTask.a(android.content.Context):void, file: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.app.n, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
            // Method dump skipped, instructions count: 212
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.MonitorInitTask.a(android.content.Context):void");
        }
    }
