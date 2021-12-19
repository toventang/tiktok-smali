package androidx.h;

import androidx.h.h;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public abstract class b<Key, Value> extends d<Key, Value> {
    static {
        Covode.recordClassIndex(1096);
    }

    /* access modifiers changed from: package-private */
    public abstract Key a(Value value);

    /* access modifiers changed from: package-private */
    public abstract void a(Value value, int i2, Executor executor, h.a<Value> aVar);

    /* access modifiers changed from: package-private */
    public abstract void a(Key key, int i2, boolean z, Executor executor, h.a<Value> aVar);

    /* access modifiers changed from: package-private */
    public abstract void b(Value value, int i2, Executor executor, h.a<Value> aVar);

    b() {
    }
}
