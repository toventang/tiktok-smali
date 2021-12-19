package f.a.e.j;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public enum b implements g<Object, List<Object>>, Callable<List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> g<O, List<T>> asFunction() {
        return INSTANCE;
    }

    @Override // java.util.concurrent.Callable
    public final List<Object> call() {
        return new ArrayList();
    }

    static {
        Covode.recordClassIndex(104861);
    }

    @Override // f.a.d.g
    public final List<Object> apply(Object obj) {
        return new ArrayList();
    }
}
