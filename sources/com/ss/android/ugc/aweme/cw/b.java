package com.ss.android.ugc.aweme.cw;

import android.os.SystemClock;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.f;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class b implements Comparable, Runnable {

    /* renamed from: a  reason: collision with root package name */
    public Runnable f79098a;

    /* renamed from: b  reason: collision with root package name */
    public a f79099b;

    /* renamed from: c  reason: collision with root package name */
    public long f79100c = SystemClock.uptimeMillis();

    /* renamed from: d  reason: collision with root package name */
    public Thread f79101d;

    static {
        Covode.recordClassIndex(49109);
    }

    public final int hashCode() {
        return this.f79098a.hashCode();
    }

    public final void run() {
        int i2;
        Object obj;
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            this.f79101d = Thread.currentThread();
            Object obj2 = null;
            if ((this.f79098a instanceof FutureTask) && (g.f79145b.a() || g.f79145b.b())) {
                obj2 = (Callable) p.b(this.f79098a);
            }
            f fVar = f.a.f79142a;
            if (g.f79145b.c()) {
                fVar.f79125d.lock();
                try {
                    fVar.f79124c.put(this, fVar.f79123b);
                } finally {
                    fVar.f79125d.unlock();
                }
            }
            long j2 = uptimeMillis - this.f79100c;
            if (j2 < g.f79144a.f79154d || !g.f79145b.a()) {
                i2 = 3;
            } else {
                a.a("Task<%s> target=%s dispatch time cost: %d ms", new Object[]{Thread.currentThread().getName(), this.f79098a, Long.valueOf(j2)});
                f fVar2 = f.a.f79142a;
                if (obj2 != null) {
                    obj = obj2;
                } else {
                    obj = this.f79098a;
                }
                String name = this.f79099b.f79097a.name();
                int poolSize = this.f79099b.getPoolSize();
                int size = this.f79099b.getQueue().size();
                WeakReference weakReference = new WeakReference(obj);
                i2 = 3;
                f.f79122a.execute(new Runnable(weakReference, name, poolSize, size, j2) {
                    /* class com.ss.android.ugc.aweme.cw.f.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ WeakReference f79126a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ String f79127b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ int f79128c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ int f79129d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ long f79130e;

                    static {
                        Covode.recordClassIndex(49119);
                    }

                    public final void run() {
                        JSONObject a2 = f.a(this.f79126a, this.f79127b, this.f79128c, this.f79129d, this.f79130e);
                        if (a2 != null) {
                            g.f79145b.a(a2);
                        }
                    }

                    {
                        this.f79126a = r2;
                        this.f79127b = r3;
                        this.f79128c = r4;
                        this.f79129d = r5;
                        this.f79130e = r6;
                    }
                });
            }
            this.f79098a.run();
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 >= g.f79144a.f79155e && g.f79145b.b()) {
                Object[] objArr = new Object[i2];
                objArr[0] = Thread.currentThread().getName();
                objArr[1] = this.f79098a;
                objArr[2] = Long.valueOf(uptimeMillis2);
                a.a("Task<%s> target=%s execute cost %d ms !!!", objArr);
                f fVar3 = f.a.f79142a;
                if (obj2 == null) {
                    obj2 = this.f79098a;
                }
                String name2 = this.f79099b.f79097a.name();
                int poolSize2 = this.f79099b.getPoolSize();
                int size2 = this.f79099b.getQueue().size();
                f.f79122a.execute(new Runnable(new WeakReference(obj2), name2, poolSize2, size2, uptimeMillis2) {
                    /* class com.ss.android.ugc.aweme.cw.f.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ WeakReference f79132a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ String f79133b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ int f79134c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ int f79135d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ long f79136e;

                    static {
                        Covode.recordClassIndex(49120);
                    }

                    public final void run() {
                        JSONObject a2 = f.a(this.f79132a, this.f79133b, this.f79134c, this.f79135d, this.f79136e);
                        if (a2 != null) {
                            g.f79145b.b(a2);
                        }
                    }

                    {
                        this.f79132a = r2;
                        this.f79133b = r3;
                        this.f79134c = r4;
                        this.f79135d = r5;
                        this.f79136e = r6;
                    }
                });
            }
        } finally {
            f.a.f79142a.a(this);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Runnable runnable = this.f79098a;
        if (!(runnable instanceof Comparable) || !(obj instanceof b)) {
            return 0;
        }
        return ((Comparable) runnable).compareTo(((b) obj).f79098a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b) || !this.f79098a.equals(((b) obj).f79098a)) {
            return false;
        }
        return true;
    }

    b(Runnable runnable, a aVar) {
        this.f79098a = runnable;
        this.f79099b = aVar;
    }
}
