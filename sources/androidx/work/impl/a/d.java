package androidx.work.impl.a;

import android.content.Context;
import androidx.work.g;
import androidx.work.impl.a.a.b;
import androidx.work.impl.a.a.c;
import androidx.work.impl.a.a.e;
import androidx.work.impl.a.a.f;
import androidx.work.impl.a.a.h;
import com.a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class d implements c.a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4549a = g.a("WorkConstraintsTracker");

    /* renamed from: b  reason: collision with root package name */
    private final c f4550b;

    /* renamed from: c  reason: collision with root package name */
    private final c[] f4551c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f4552d;

    static {
        Covode.recordClassIndex(1786);
    }

    public final void a() {
        synchronized (this.f4552d) {
            c[] cVarArr = this.f4551c;
            for (c cVar : cVarArr) {
                if (!cVar.f4517a.isEmpty()) {
                    cVar.f4517a.clear();
                    cVar.f4519c.b(cVar);
                }
            }
        }
    }

    @Override // androidx.work.impl.a.a.c.a
    public final void c(List<String> list) {
        synchronized (this.f4552d) {
            c cVar = this.f4550b;
            if (cVar != null) {
                cVar.b(list);
            }
        }
    }

    @Override // androidx.work.impl.a.a.c.a
    public final void b(List<String> list) {
        synchronized (this.f4552d) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (a(str)) {
                    g.a();
                    a.a("Constraints met for %s", new Object[]{str});
                    arrayList.add(str);
                }
            }
            c cVar = this.f4550b;
            if (cVar != null) {
                cVar.a(arrayList);
            }
        }
    }

    public final void a(List<androidx.work.impl.b.g> list) {
        synchronized (this.f4552d) {
            for (c cVar : this.f4551c) {
                cVar.a((c.a) null);
            }
            for (c cVar2 : this.f4551c) {
                cVar2.a(list);
            }
            for (c cVar3 : this.f4551c) {
                cVar3.a((c.a) this);
            }
        }
    }

    public final boolean a(String str) {
        synchronized (this.f4552d) {
            c[] cVarArr = this.f4551c;
            for (c cVar : cVarArr) {
                if (cVar.f4518b != null && cVar.b(cVar.f4518b) && cVar.f4517a.contains(str)) {
                    g.a();
                    a.a("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()});
                    return false;
                }
            }
            return true;
        }
    }

    public d(Context context, c cVar) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f4550b = cVar;
        this.f4551c = new c[]{new androidx.work.impl.a.a.a(applicationContext), new b(applicationContext), new h(applicationContext), new androidx.work.impl.a.a.d(applicationContext), new androidx.work.impl.a.a.g(applicationContext), new f(applicationContext), new e(applicationContext)};
        this.f4552d = new Object();
    }
}
