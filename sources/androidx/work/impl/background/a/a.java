package androidx.work.impl.background.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import androidx.work.g;
import androidx.work.i;
import androidx.work.impl.a.c;
import androidx.work.impl.a.d;
import androidx.work.impl.f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class a implements androidx.work.impl.a, c, androidx.work.impl.c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4622a = g.a("GreedyScheduler");

    /* renamed from: b  reason: collision with root package name */
    private f f4623b;

    /* renamed from: c  reason: collision with root package name */
    private d f4624c;

    /* renamed from: d  reason: collision with root package name */
    private List<androidx.work.impl.b.g> f4625d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private boolean f4626e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f4627f;

    static {
        Covode.recordClassIndex(1818);
    }

    private void a() {
        if (!this.f4626e) {
            this.f4623b.f4704f.a(this);
            this.f4626e = true;
        }
    }

    @Override // androidx.work.impl.c
    public final void a(String str) {
        a();
        g.a();
        com.a.a("Cancelling work ID %s", new Object[]{str});
        this.f4623b.a(str);
    }

    @Override // androidx.work.impl.a.c
    public final void b(List<String> list) {
        for (String str : list) {
            g.a();
            com.a.a("Constraints not met: Cancelling work ID %s", new Object[]{str});
            this.f4623b.a(str);
        }
    }

    @Override // androidx.work.impl.a.c
    public final void a(List<String> list) {
        for (String str : list) {
            g.a();
            com.a.a("Constraints met: Scheduling work ID %s", new Object[]{str});
            this.f4623b.a(str, (WorkerParameters.a) null);
        }
    }

    @Override // androidx.work.impl.c
    public final void a(androidx.work.impl.b.g... gVarArr) {
        a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (androidx.work.impl.b.g gVar : gVarArr) {
            if (gVar.f4579b == i.a.ENQUEUED && !gVar.a() && gVar.f4584g == 0 && !gVar.b()) {
                if (!gVar.d()) {
                    g.a();
                    com.a.a("Starting work for %s", new Object[]{gVar.f4578a});
                    this.f4623b.a(gVar.f4578a, (WorkerParameters.a) null);
                } else if (Build.VERSION.SDK_INT < 24 || !gVar.f4587j.a()) {
                    arrayList.add(gVar);
                    arrayList2.add(gVar.f4578a);
                }
            }
        }
        synchronized (this.f4627f) {
            if (!arrayList.isEmpty()) {
                g.a();
                com.a.a("Starting tracking for [%s]", new Object[]{TextUtils.join(",", arrayList2)});
                this.f4625d.addAll(arrayList);
                this.f4624c.a(this.f4625d);
            }
        }
    }

    public a(Context context, f fVar) {
        this.f4623b = fVar;
        this.f4624c = new d(context, this);
        this.f4627f = new Object();
    }

    @Override // androidx.work.impl.a
    public final void a(String str, boolean z) {
        synchronized (this.f4627f) {
            int size = this.f4625d.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (this.f4625d.get(i2).f4578a.equals(str)) {
                    g.a();
                    com.a.a("Stopping tracking for %s", new Object[]{str});
                    this.f4625d.remove(i2);
                    this.f4624c.a(this.f4625d);
                    break;
                } else {
                    i2++;
                }
            }
        }
    }
}
