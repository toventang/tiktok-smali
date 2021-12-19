package f.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.e.b.b;
import f.a.e.j.h;
import f.a.e.j.l;
import java.util.ArrayList;

public final class a implements b, f.a.e.a.a {

    /* renamed from: a  reason: collision with root package name */
    l<b> f157180a;

    /* renamed from: b  reason: collision with root package name */
    volatile boolean f157181b;

    static {
        Covode.recordClassIndex(104371);
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        return this.f157181b;
    }

    public final void a() {
        MethodCollector.i(12466);
        if (this.f157181b) {
            MethodCollector.o(12466);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f157181b) {
                    l<b> lVar = this.f157180a;
                    this.f157180a = null;
                    a(lVar);
                    MethodCollector.o(12466);
                }
            } finally {
                MethodCollector.o(12466);
            }
        }
    }

    @Override // f.a.b.b
    public final void dispose() {
        MethodCollector.i(12032);
        if (this.f157181b) {
            MethodCollector.o(12032);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f157181b) {
                    this.f157181b = true;
                    l<b> lVar = this.f157180a;
                    this.f157180a = null;
                    a(lVar);
                    MethodCollector.o(12032);
                }
            } finally {
                MethodCollector.o(12032);
            }
        }
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
    public final boolean c(b bVar) {
        MethodCollector.i(12328);
        b.a((Object) bVar, "Disposable item is null");
        if (this.f157181b) {
            MethodCollector.o(12328);
            return false;
        }
        synchronized (this) {
            try {
                if (this.f157181b) {
                    return false;
                }
                l<b> lVar = this.f157180a;
                if (lVar == null || !lVar.b(bVar)) {
                    MethodCollector.o(12328);
                    return false;
                }
                MethodCollector.o(12328);
                return true;
            } finally {
                MethodCollector.o(12328);
            }
        }
    }

    private static void a(l<b> lVar) {
        if (lVar != null) {
            ArrayList arrayList = null;
            T[] tArr = lVar.f157951e;
            for (T t : tArr) {
                if (t instanceof b) {
                    try {
                        t.dispose();
                    } catch (Throwable th) {
                        f.a.c.b.a(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw h.a((Throwable) arrayList.get(0));
            }
            throw new f.a.c.a(arrayList);
        }
    }

    @Override // f.a.e.a.a
    public final boolean a(b bVar) {
        MethodCollector.i(12193);
        b.a((Object) bVar, "d is null");
        if (!this.f157181b) {
            synchronized (this) {
                try {
                    if (!this.f157181b) {
                        l<b> lVar = this.f157180a;
                        if (lVar == null) {
                            lVar = new l<>();
                            this.f157180a = lVar;
                        }
                        lVar.a(bVar);
                        return true;
                    }
                } finally {
                    MethodCollector.o(12193);
                }
            }
        }
        bVar.dispose();
        MethodCollector.o(12193);
        return false;
    }
}
