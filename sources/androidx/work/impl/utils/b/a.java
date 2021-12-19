package androidx.work.impl.utils.b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

public interface a {
    static {
        Covode.recordClassIndex(1874);
    }

    Executor a();

    void a(Runnable runnable);

    Thread b();

    Executor c();
}
