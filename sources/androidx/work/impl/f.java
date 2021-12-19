package androidx.work.impl;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.room.i;
import androidx.room.j;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.b.a;
import androidx.work.impl.utils.c;
import androidx.work.impl.utils.e;
import androidx.work.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.d;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class f extends j {

    /* renamed from: j  reason: collision with root package name */
    public static f f4696j;

    /* renamed from: k  reason: collision with root package name */
    public static f f4697k;

    /* renamed from: l  reason: collision with root package name */
    public static final Object f4698l = new Object();

    /* renamed from: a  reason: collision with root package name */
    public Context f4699a;

    /* renamed from: b  reason: collision with root package name */
    public b f4700b;

    /* renamed from: c  reason: collision with root package name */
    public WorkDatabase f4701c;

    /* renamed from: d  reason: collision with root package name */
    public a f4702d;

    /* renamed from: e  reason: collision with root package name */
    public List<c> f4703e;

    /* renamed from: f  reason: collision with root package name */
    public b f4704f;

    /* renamed from: g  reason: collision with root package name */
    public c f4705g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4706h;

    /* renamed from: i  reason: collision with root package name */
    public BroadcastReceiver.PendingResult f4707i;

    /* renamed from: m  reason: collision with root package name */
    private final g f4708m;

    public static f b() {
        d.a();
        return e();
    }

    static {
        Covode.recordClassIndex(1852);
    }

    private static f e() {
        synchronized (f4698l) {
            f fVar = f4696j;
            if (fVar != null) {
                return fVar;
            }
            return f4697k;
        }
    }

    public final void d() {
        synchronized (f4698l) {
            this.f4706h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f4707i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f4707i = null;
            }
        }
    }

    public final void c() {
        JobScheduler jobScheduler;
        List<JobInfo> allPendingJobs;
        if (!(Build.VERSION.SDK_INT < 23 || (jobScheduler = (JobScheduler) androidx.work.impl.background.systemjob.b.a(this.f4699a, "jobscheduler")) == null || (allPendingJobs = jobScheduler.getAllPendingJobs()) == null)) {
            for (JobInfo jobInfo : allPendingJobs) {
                if (jobInfo.getExtras().containsKey("EXTRA_WORK_SPEC_ID")) {
                    jobScheduler.cancel(jobInfo.getId());
                }
            }
        }
        this.f4701c.i().b();
        d.a(this.f4700b, this.f4701c, this.f4703e);
    }

    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public final void a(String str) {
        this.f4702d.a(new e(this, str));
    }

    public final void a(String str, WorkerParameters.a aVar) {
        this.f4702d.a(new androidx.work.impl.utils.d(this, str, aVar));
    }

    public f(Context context, b bVar, a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(R.bool.n));
    }

    private f(Context context, b bVar, a aVar, boolean z) {
        j.a a2;
        this.f4708m = new g();
        Context a3 = a(context);
        if (z) {
            a2 = new j.a(a3, WorkDatabase.class, null);
            a2.f4332b = true;
        } else {
            a2 = i.a(a3, WorkDatabase.class, "androidx.work.workdb");
        }
        WorkDatabase.AnonymousClass1 r1 = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001e: CONSTRUCTOR  (r1v1 'r1' androidx.work.impl.WorkDatabase$1) =  call: androidx.work.impl.WorkDatabase.1.<init>():void type: CONSTRUCTOR in method: androidx.work.impl.f.<init>(android.content.Context, androidx.work.b, androidx.work.impl.utils.b.a, boolean):void, file: classes.dex
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.work.impl.WorkDatabase, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            */
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.f.<init>(android.content.Context, androidx.work.b, androidx.work.impl.utils.b.a, boolean):void");
    }
}
