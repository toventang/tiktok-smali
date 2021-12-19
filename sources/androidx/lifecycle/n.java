package androidx.lifecycle;

import androidx.a.a.b.b;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

public class n extends i {

    /* renamed from: b  reason: collision with root package name */
    private androidx.a.a.b.a<l, a> f3530b;

    /* renamed from: c  reason: collision with root package name */
    private i.b f3531c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference<m> f3532d;

    /* renamed from: e  reason: collision with root package name */
    private int f3533e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3534f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3535g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<i.b> f3536h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f3537i;

    static {
        Covode.recordClassIndex(1329);
    }

    @Override // androidx.lifecycle.i
    public i.b a() {
        return this.f3531c;
    }

    private void c() {
        ArrayList<i.b> arrayList = this.f3536h;
        arrayList.remove(arrayList.size() - 1);
    }

    private boolean b() {
        if (this.f3530b.f798e == 0) {
            return true;
        }
        i.b bVar = this.f3530b.f795b.getValue().f3538a;
        i.b bVar2 = this.f3530b.f796c.getValue().f3538a;
        if (bVar == bVar2 && this.f3531c == bVar2) {
            return true;
        }
        return false;
    }

    private void d() {
        m mVar = this.f3532d.get();
        if (mVar != null) {
            while (!b()) {
                this.f3535g = false;
                if (this.f3531c.compareTo((Enum) this.f3530b.f795b.getValue().f3538a) < 0) {
                    b(mVar);
                }
                b.c<K, V> cVar = this.f3530b.f796c;
                if (!this.f3535g && cVar != null && this.f3531c.compareTo((Enum) cVar.getValue().f3538a) > 0) {
                    a(mVar);
                }
            }
            this.f3535g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    public n(m mVar) {
        this(mVar, true);
    }

    private void d(i.b bVar) {
        this.f3536h.add(bVar);
    }

    public final void b(i.b bVar) {
        a("setCurrentState");
        c(bVar);
    }

    private void c(i.b bVar) {
        if (this.f3531c != bVar) {
            this.f3531c = bVar;
            if (this.f3534f || this.f3533e != 0) {
                this.f3535g = true;
                return;
            }
            this.f3534f = true;
            d();
            this.f3534f = false;
        }
    }

    public final void a(i.a aVar) {
        a("handleLifecycleEvent");
        c(aVar.getTargetState());
    }

    @Override // androidx.lifecycle.i
    public void b(l lVar) {
        a("removeObserver");
        this.f3530b.b(lVar);
    }

    private void a(String str) {
        if (this.f3537i && !androidx.a.a.a.a.a().f787a.b()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    private i.b c(l lVar) {
        i.b bVar;
        b.c<K, V> cVar;
        androidx.a.a.b.a<l, a> aVar = this.f3530b;
        i.b bVar2 = null;
        if (!aVar.c(lVar) || (cVar = aVar.f794a.get(lVar).f802d) == null) {
            bVar = null;
        } else {
            bVar = cVar.getValue().f3538a;
        }
        if (!this.f3536h.isEmpty()) {
            ArrayList<i.b> arrayList = this.f3536h;
            bVar2 = arrayList.get(arrayList.size() - 1);
        }
        return a(a(this.f3531c, bVar), bVar2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: androidx.a.a.b.a<androidx.lifecycle.l, androidx.lifecycle.n$a> */
    /* JADX WARN: Multi-variable type inference failed */
    private void a(m mVar) {
        b<K, V>.d a2 = this.f3530b.a();
        while (a2.hasNext() && !this.f3535g) {
            Map.Entry entry = (Map.Entry) a2.next();
            a aVar = (a) entry.getValue();
            while (aVar.f3538a.compareTo((Enum) this.f3531c) < 0 && !this.f3535g && this.f3530b.c(entry.getKey())) {
                d(aVar.f3538a);
                i.a upFrom = i.a.upFrom(aVar.f3538a);
                if (upFrom != null) {
                    aVar.a(mVar, upFrom);
                    c();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f3538a);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: androidx.a.a.b.a<androidx.lifecycle.l, androidx.lifecycle.n$a> */
    /* JADX WARN: Multi-variable type inference failed */
    private void b(m mVar) {
        androidx.a.a.b.a<l, a> aVar = this.f3530b;
        b.C0016b bVar = new b.C0016b(aVar.f796c, aVar.f795b);
        aVar.f797d.put(bVar, false);
        while (bVar.hasNext() && !this.f3535g) {
            Map.Entry entry = (Map.Entry) bVar.next();
            a aVar2 = (a) entry.getValue();
            while (aVar2.f3538a.compareTo((Enum) this.f3531c) > 0 && !this.f3535g && this.f3530b.c(entry.getKey())) {
                i.a downFrom = i.a.downFrom(aVar2.f3538a);
                if (downFrom != null) {
                    d(downFrom.getTargetState());
                    aVar2.a(mVar, downFrom);
                    c();
                } else {
                    throw new IllegalStateException("no event down from " + aVar2.f3538a);
                }
            }
        }
    }

    public final void a(i.b bVar) {
        a("markState");
        b(bVar);
    }

    @Override // androidx.lifecycle.i
    public void a(l lVar) {
        i.b bVar;
        m mVar;
        boolean z;
        a("addObserver");
        if (this.f3531c == i.b.DESTROYED) {
            bVar = i.b.DESTROYED;
        } else {
            bVar = i.b.INITIALIZED;
        }
        a aVar = new a(lVar, bVar);
        if (this.f3530b.a(lVar, aVar) == null && (mVar = this.f3532d.get()) != null) {
            if (this.f3533e != 0 || this.f3534f) {
                z = true;
            } else {
                z = false;
            }
            i.b c2 = c(lVar);
            this.f3533e++;
            while (aVar.f3538a.compareTo((Enum) c2) < 0 && this.f3530b.c(lVar)) {
                d(aVar.f3538a);
                i.a upFrom = i.a.upFrom(aVar.f3538a);
                if (upFrom != null) {
                    aVar.a(mVar, upFrom);
                    c();
                    c2 = c(lVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f3538a);
                }
            }
            if (!z) {
                d();
            }
            this.f3533e--;
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        i.b f3538a;

        /* renamed from: b  reason: collision with root package name */
        k f3539b;

        static {
            Covode.recordClassIndex(1330);
        }

        a(l lVar, i.b bVar) {
            this.f3539b = q.a(lVar);
            this.f3538a = bVar;
        }

        /* access modifiers changed from: package-private */
        public final void a(m mVar, i.a aVar) {
            i.b targetState = aVar.getTargetState();
            this.f3538a = n.a(this.f3538a, targetState);
            this.f3539b.onStateChanged(mVar, aVar);
            this.f3538a = targetState;
        }
    }

    static i.b a(i.b bVar, i.b bVar2) {
        if (bVar2 == null || bVar2.compareTo((Enum) bVar) >= 0) {
            return bVar;
        }
        return bVar2;
    }

    public n(m mVar, boolean z) {
        this.f3530b = new androidx.a.a.b.a<>();
        this.f3533e = 0;
        this.f3534f = false;
        this.f3535g = false;
        this.f3536h = new ArrayList<>();
        this.f3532d = new WeakReference<>(mVar);
        this.f3531c = i.b.INITIALIZED;
        this.f3537i = z;
    }
}
