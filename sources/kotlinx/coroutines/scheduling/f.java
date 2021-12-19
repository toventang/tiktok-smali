package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;

public final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    public static final f f159199a = new f();

    private f() {
    }

    @Override // kotlinx.coroutines.scheduling.l
    public final long a() {
        return System.nanoTime();
    }

    static {
        Covode.recordClassIndex(105702);
    }
}
