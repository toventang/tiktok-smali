package kotlinx.coroutines.android;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.ax;
import kotlinx.coroutines.bh;
import kotlinx.coroutines.ci;

public abstract class b extends ci implements ax {
    static {
        Covode.recordClassIndex(105535);
    }

    private b() {
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    @Override // kotlinx.coroutines.ax
    public bh invokeOnTimeout(long j2, Runnable runnable) {
        return ax.a.a(j2, runnable);
    }
}
