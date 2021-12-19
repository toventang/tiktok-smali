package androidx.work.impl.a.b;

import android.content.Context;
import androidx.work.g;
import androidx.work.impl.a.a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class d<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final String f4532b = g.a("ConstraintTracker");

    /* renamed from: a  reason: collision with root package name */
    protected final Context f4533a;

    /* renamed from: c  reason: collision with root package name */
    private final Object f4534c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Set<a<T>> f4535d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    private T f4536e;

    public abstract T b();

    public abstract void c();

    public abstract void d();

    static {
        Covode.recordClassIndex(1779);
    }

    public final void b(a<T> aVar) {
        synchronized (this.f4534c) {
            if (this.f4535d.remove(aVar) && this.f4535d.isEmpty()) {
                d();
            }
        }
    }

    d(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f4533a = applicationContext;
    }

    public final void a(T t) {
        synchronized (this.f4534c) {
            T t2 = this.f4536e;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.f4536e = t;
                for (a aVar : new ArrayList(this.f4535d)) {
                    aVar.a(this.f4536e);
                }
            }
        }
    }

    public final void a(a<T> aVar) {
        synchronized (this.f4534c) {
            if (this.f4535d.add(aVar)) {
                if (this.f4535d.size() == 1) {
                    this.f4536e = b();
                    g.a();
                    com.a.a("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f4536e});
                    c();
                }
                aVar.a(this.f4536e);
            }
        }
    }
}
