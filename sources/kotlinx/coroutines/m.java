package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.f.a.b;
import h.z;

public interface m<T> extends d<T> {
    static {
        Covode.recordClassIndex(105686);
    }

    Object a(T t);

    Object a(Throwable th);

    void a(b<? super Throwable, z> bVar);

    void a(ah ahVar, T t);

    boolean a();

    void b(Object obj);

    boolean b();

    boolean b(Throwable th);

    boolean c();
}
