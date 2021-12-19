package f.a.e.c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

public interface g<T> extends Callable<T> {
    static {
        Covode.recordClassIndex(104434);
    }

    @Override // java.util.concurrent.Callable
    T call();
}
