package com.ss.android.ugc.aweme.sharedar.a.a;

import android.os.Looper;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;
import h.z;
import java.util.concurrent.Callable;

public abstract class a implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f124433a = {new y(a.class, "host", "getHost()Landroidx/fragment/app/FragmentActivity;", 0)};

    /* renamed from: b  reason: collision with root package name */
    private final d f124434b = com.bytedance.o.b.a.b(getDiContainer(), e.class);

    /* renamed from: c  reason: collision with root package name */
    private final f f124435c;

    static {
        Covode.recordClassIndex(81704);
    }

    public abstract long a();

    public abstract void a(int i2, long j2, String str);

    @Override // com.bytedance.o.a
    public f getDiContainer() {
        return this.f124435c;
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.a$a  reason: collision with other inner class name */
    static final class CallableC3247a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f124437a;

        static {
            Covode.recordClassIndex(81705);
        }

        CallableC3247a(h.f.a.a aVar) {
            this.f124437a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f124437a.invoke();
            return z.f158842a;
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f124438a;

        static {
            Covode.recordClassIndex(81706);
        }

        b(h.f.a.a aVar) {
            this.f124438a = aVar;
        }

        public final void run() {
            this.f124438a.invoke();
        }
    }

    public a(f fVar) {
        l.d(fVar, "");
        this.f124435c = fVar;
    }

    /* access modifiers changed from: protected */
    public final void b(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        e eVar = (e) this.f124434b.a(this, f124433a[0]);
        if (eVar != null) {
            eVar.runOnUiThread(new b(aVar));
        }
    }

    protected static void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        if (!l.a(Looper.myLooper(), Looper.getMainLooper())) {
            aVar.invoke();
        } else {
            b.i.b(new CallableC3247a(aVar), b.i.f4824a);
        }
    }
}
