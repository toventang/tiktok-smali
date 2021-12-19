package androidx.work.impl;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.g;
import androidx.work.impl.h;
import androidx.work.impl.utils.a.c;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4553a = g.a("Processor");

    /* renamed from: b  reason: collision with root package name */
    private Context f4554b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.work.b f4555c;

    /* renamed from: d  reason: collision with root package name */
    private androidx.work.impl.utils.b.a f4556d;

    /* renamed from: e  reason: collision with root package name */
    private WorkDatabase f4557e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, h> f4558f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private List<c> f4559g;

    /* renamed from: h  reason: collision with root package name */
    private Set<String> f4560h;

    /* renamed from: i  reason: collision with root package name */
    private final List<a> f4561i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f4562j;

    static {
        Covode.recordClassIndex(1787);
    }

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private a f4563a;

        /* renamed from: b  reason: collision with root package name */
        private String f4564b;

        /* renamed from: c  reason: collision with root package name */
        private q<Boolean> f4565c;

        static {
            Covode.recordClassIndex(1788);
        }

        public final void run() {
            boolean z;
            try {
                z = this.f4565c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f4563a.a(this.f4564b, z);
        }

        a(a aVar, String str, q<Boolean> qVar) {
            this.f4563a = aVar;
            this.f4564b = str;
            this.f4565c = qVar;
        }
    }

    public final void a(a aVar) {
        synchronized (this.f4562j) {
            this.f4561i.add(aVar);
        }
    }

    public final void b(a aVar) {
        synchronized (this.f4562j) {
            this.f4561i.remove(aVar);
        }
    }

    public final boolean c(String str) {
        boolean containsKey;
        synchronized (this.f4562j) {
            containsKey = this.f4558f.containsKey(str);
        }
        return containsKey;
    }

    public final boolean b(String str) {
        boolean contains;
        synchronized (this.f4562j) {
            contains = this.f4560h.contains(str);
        }
        return contains;
    }

    public final boolean a(String str) {
        synchronized (this.f4562j) {
            g.a();
            com.a.a("Processor stopping %s", new Object[]{str});
            h remove = this.f4558f.remove(str);
            if (remove != null) {
                remove.f4716g = true;
                remove.b();
                if (remove.f4715f != null) {
                    remove.f4715f.cancel(true);
                }
                if (remove.f4712c != null) {
                    remove.f4712c.b();
                }
                g.a();
                com.a.a("WorkerWrapper stopped for %s", new Object[]{str});
                return true;
            }
            g.a();
            com.a.a("WorkerWrapper could not be found for %s", new Object[]{str});
            return false;
        }
    }

    @Override // androidx.work.impl.a
    public final void a(String str, boolean z) {
        synchronized (this.f4562j) {
            this.f4558f.remove(str);
            g.a();
            com.a.a("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)});
            for (a aVar : this.f4561i) {
                aVar.a(str, z);
            }
        }
    }

    public final boolean a(String str, WorkerParameters.a aVar) {
        synchronized (this.f4562j) {
            if (this.f4558f.containsKey(str)) {
                g.a();
                com.a.a("Work %s is already enqueued for processing", new Object[]{str});
                return false;
            }
            h.a aVar2 = new h.a(this.f4554b, this.f4555c, this.f4556d, this.f4557e, str);
            aVar2.f4734g = this.f4559g;
            if (aVar != null) {
                aVar2.f4735h = aVar;
            }
            h hVar = new h(aVar2);
            c<Boolean> cVar = hVar.f4714e;
            cVar.a(new a(this, str, cVar), this.f4556d.a());
            this.f4558f.put(str, hVar);
            this.f4556d.c().execute(hVar);
            g.a();
            com.a.a("%s: processing %s", new Object[]{getClass().getSimpleName(), str});
            return true;
        }
    }

    public b(Context context, androidx.work.b bVar, androidx.work.impl.utils.b.a aVar, WorkDatabase workDatabase, List<c> list) {
        this.f4554b = context;
        this.f4555c = bVar;
        this.f4556d = aVar;
        this.f4557e = workDatabase;
        this.f4559g = list;
        this.f4560h = new HashSet();
        this.f4561i = new ArrayList();
        this.f4562j = new Object();
    }
}
