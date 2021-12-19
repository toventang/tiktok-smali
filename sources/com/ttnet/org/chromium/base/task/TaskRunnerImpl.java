package com.ttnet.org.chromium.base.task;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.b;
import com.ttnet.org.chromium.base.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TaskRunnerImpl implements n {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ boolean f155292f = true;

    /* renamed from: a  reason: collision with root package name */
    protected final Object f155293a;

    /* renamed from: b  reason: collision with root package name */
    protected long f155294b;

    /* renamed from: c  reason: collision with root package name */
    protected final Runnable f155295c;

    /* renamed from: d  reason: collision with root package name */
    protected LinkedList<Runnable> f155296d;

    /* renamed from: e  reason: collision with root package name */
    protected List<Pair<Runnable, Long>> f155297e;

    /* renamed from: g  reason: collision with root package name */
    private final p f155298g;

    /* renamed from: h  reason: collision with root package name */
    private final String f155299h;

    /* renamed from: i  reason: collision with root package name */
    private final int f155300i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f155301j;

    /* renamed from: k  reason: collision with root package name */
    private final e f155302k;

    private native void nativeDestroy(long j2);

    private native long nativeInit(int i2, boolean z, int i3, boolean z2, boolean z3, byte b2, byte[] bArr);

    private native void nativePostDelayedTask(long j2, Runnable runnable, long j3);

    /* access modifiers changed from: protected */
    public native boolean nativeBelongsToCurrentThread(long j2);

    @Override // com.ttnet.org.chromium.base.task.n
    public final void b() {
        e.a(this.f155302k);
    }

    static {
        Covode.recordClassIndex(103336);
    }

    @Override // com.ttnet.org.chromium.base.task.n
    public final void c() {
        MethodCollector.i(13412);
        synchronized (this.f155293a) {
            try {
                e();
                f();
            } finally {
                MethodCollector.o(13412);
            }
        }
    }

    private void e() {
        MethodCollector.i(13501);
        if (this.f155294b == 0) {
            this.f155294b = nativeInit(this.f155300i, this.f155298g.f155345l, this.f155298g.f155346m, this.f155298g.n, this.f155298g.o, this.f155298g.p, this.f155298g.q);
        }
        MethodCollector.o(13501);
    }

    @Override // com.ttnet.org.chromium.base.task.n
    public final void a() {
        MethodCollector.i(13331);
        synchronized (this.f155293a) {
            try {
                e.a(this.f155302k);
                this.f155301j = true;
                long j2 = this.f155294b;
                if (j2 != 0) {
                    nativeDestroy(j2);
                }
                this.f155294b = 0;
            } finally {
                MethodCollector.o(13331);
            }
        }
    }

    private void f() {
        LinkedList<Runnable> linkedList = this.f155296d;
        if (linkedList != null) {
            Iterator<Runnable> it = linkedList.iterator();
            while (it.hasNext()) {
                b(it.next(), 0);
            }
            for (Pair<Runnable, Long> pair : this.f155297e) {
                b((Runnable) pair.first, ((Long) pair.second).longValue());
            }
            this.f155296d = null;
            this.f155297e = null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r3 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        r1 = r5.f155298g.f155346m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        if (r1 == 1) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 == 2) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        android.os.Process.setThreadPriority(10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        android.os.Process.setThreadPriority(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        android.os.Process.setThreadPriority(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        r2.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        if (r3 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        r3.close();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13411);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13411);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0058, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.task.TaskRunnerImpl.d():void");
    }

    TaskRunnerImpl(p pVar) {
        this(pVar, "TaskRunnerImpl");
    }

    private void b(Runnable runnable, long j2) {
        MethodCollector.i(13503);
        nativePostDelayedTask(this.f155294b, runnable, j2);
        MethodCollector.o(13503);
    }

    private TaskRunnerImpl(p pVar, String str) {
        e eVar;
        this.f155293a = new Object();
        this.f155295c = new o(this);
        if (!b.f155218a) {
            eVar = null;
        } else {
            eVar = new e(new e.d(this, new e.a()));
        }
        this.f155302k = eVar;
        this.f155296d = new LinkedList<>();
        this.f155297e = new ArrayList();
        this.f155298g = pVar;
        this.f155299h = str + ".PreNativeTask.run";
        this.f155300i = 0;
        if (PostTask.f155287b != null) {
            PostTask.f155287b.add(this);
        } else {
            c();
        }
    }

    @Override // com.ttnet.org.chromium.base.task.n
    public final void a(Runnable runnable, long j2) {
        MethodCollector.i(13333);
        synchronized (this.f155293a) {
            try {
                if (f155292f || !this.f155301j) {
                    LinkedList<Runnable> linkedList = this.f155296d;
                    if (linkedList == null) {
                        b(runnable, 0);
                        return;
                    }
                    linkedList.add(runnable);
                    PostTask.a().execute(this.f155295c);
                    MethodCollector.o(13333);
                    return;
                }
                AssertionError assertionError = new AssertionError();
                MethodCollector.o(13333);
                throw assertionError;
            } finally {
                MethodCollector.o(13333);
            }
        }
    }
}
