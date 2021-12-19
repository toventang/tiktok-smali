package f.a.e.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.b.b;
import java.util.LinkedList;
import java.util.List;

public final class d implements b, a {

    /* renamed from: a  reason: collision with root package name */
    List<b> f157186a;

    /* renamed from: b  reason: collision with root package name */
    volatile boolean f157187b;

    static {
        Covode.recordClassIndex(104403);
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        return this.f157187b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r0 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r1 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r1.hasNext() == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.next().dispose();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        f.a.c.b.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r2 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        r2.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        if (r2 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (r2.size() != 1) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        r0 = f.a.e.j.h.a((java.lang.Throwable) r2.get(0));
        com.bytedance.frameworks.apm.trace.MethodCollector.o(12047);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        r0 = new f.a.c.a(r2);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(12047);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(12047);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0068, code lost:
        return;
     */
    @Override // f.a.b.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.e.a.d.dispose():void");
    }

    @Override // f.a.e.a.a
    public final boolean b(b bVar) {
        if (!c(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    @Override // f.a.e.a.a
    public final boolean a(b bVar) {
        MethodCollector.i(12048);
        f.a.e.b.b.a((Object) bVar, "d is null");
        if (!this.f157187b) {
            synchronized (this) {
                try {
                    if (!this.f157187b) {
                        List list = this.f157186a;
                        if (list == null) {
                            list = new LinkedList();
                            this.f157186a = list;
                        }
                        list.add(bVar);
                        return true;
                    }
                } finally {
                    MethodCollector.o(12048);
                }
            }
        }
        bVar.dispose();
        MethodCollector.o(12048);
        return false;
    }

    @Override // f.a.e.a.a
    public final boolean c(b bVar) {
        MethodCollector.i(12049);
        f.a.e.b.b.a((Object) bVar, "Disposable item is null");
        if (this.f157187b) {
            MethodCollector.o(12049);
            return false;
        }
        synchronized (this) {
            try {
                if (this.f157187b) {
                    return false;
                }
                List<b> list = this.f157186a;
                if (list == null || !list.remove(bVar)) {
                    MethodCollector.o(12049);
                    return false;
                }
                MethodCollector.o(12049);
                return true;
            } finally {
                MethodCollector.o(12049);
            }
        }
    }
}
