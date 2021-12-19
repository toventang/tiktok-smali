package androidx.room;

import androidx.i.a.f;
import com.bytedance.covode.number.Covode;

public abstract class c<T> extends n {
    static {
        Covode.recordClassIndex(1650);
    }

    /* access modifiers changed from: protected */
    public abstract void a(f fVar, T t);

    public c(j jVar) {
        super(jVar);
    }

    public final void a(T t) {
        f b2 = b();
        try {
            a(b2, t);
            b2.b();
        } finally {
            a(b2);
        }
    }

    public final void a(Iterable<T> iterable) {
        f b2 = b();
        try {
            for (T t : iterable) {
                a(b2, t);
                b2.b();
            }
        } finally {
            a(b2);
        }
    }
}
